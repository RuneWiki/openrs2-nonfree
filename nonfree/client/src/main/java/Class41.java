import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class41 {

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "Lclient!nr;")
	private Class2 aClass2_29;

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "Lclient!nr;")
	private Class2 aClass2_30;

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
	private int anInt778 = 0;

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "[Lclient!nr;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
	public final int anInt766;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(I)V")
	public Class41(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt766 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_251 = local23;
			local23.aClass2_252 = local23;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Lclient!nr;")
	public Class2 method896() {
		this.anInt778 = 0;
		return this.method904();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)I")
	public int method897() {
		return this.anInt766;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Lclient!nr;")
	public Class2 method898() {
		if (this.aClass2_29 == null) {
			return null;
		}
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) (this.aLong29 & (long) (this.anInt766 - 1))];
		while (this.aClass2_29 != local23) {
			if (this.aLong29 == this.aClass2_29.aLong219) {
				@Pc(35) Class2 local35 = this.aClass2_29;
				this.aClass2_29 = this.aClass2_29.aClass2_251;
				return local35;
			}
			this.aClass2_29 = this.aClass2_29.aClass2_251;
		}
		this.aClass2_29 = null;
		return null;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "([Lclient!nr;Z)I")
	public int method900(@OriginalArg(0) Class2[] arg0) {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt766; local17++) {
			@Pc(24) Class2 local24 = this.aClass2Array1[local17];
			for (@Pc(27) Class2 local27 = local24.aClass2_251; local27 != local24; local27 = local27.aClass2_251) {
				arg0[local15++] = local27;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!nr;J)V")
	public void method901(@OriginalArg(1) Class2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_252 != null) {
			arg0.method5723();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt766 - 1) & arg1)];
		arg0.aClass2_252 = local21.aClass2_252;
		arg0.aClass2_251 = local21;
		arg0.aClass2_252.aClass2_251 = arg0;
		arg0.aClass2_251.aClass2_252 = arg0;
		arg0.aLong219 = arg1;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(JI)Lclient!nr;")
	public Class2 method902(@OriginalArg(0) long arg0) {
		this.aLong29 = arg0;
		@Pc(20) Class2 local20 = this.aClass2Array1[(int) ((long) (this.anInt766 - 1) & arg0)];
		for (this.aClass2_29 = local20.aClass2_251; this.aClass2_29 != local20; this.aClass2_29 = this.aClass2_29.aClass2_251) {
			if (arg0 == this.aClass2_29.aLong219) {
				@Pc(43) Class2 local43 = this.aClass2_29;
				this.aClass2_29 = this.aClass2_29.aClass2_251;
				return local43;
			}
		}
		this.aClass2_29 = null;
		return null;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)Lclient!nr;")
	public Class2 method904() {
		@Pc(22) Class2 local22;
		if (this.anInt778 > 0 && this.aClass2Array1[this.anInt778 - 1] != this.aClass2_30) {
			local22 = this.aClass2_30;
			this.aClass2_30 = local22.aClass2_251;
			return local22;
		}
		while (this.anInt778 < this.anInt766) {
			local22 = this.aClass2Array1[this.anInt778++].aClass2_251;
			if (local22 != this.aClass2Array1[this.anInt778 - 1]) {
				this.aClass2_30 = local22.aClass2_251;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)I")
	public int method905() {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt766; local17++) {
			@Pc(24) Class2 local24 = this.aClass2Array1[local17];
			@Pc(27) Class2 local27 = local24.aClass2_251;
			while (local24 != local27) {
				local27 = local27.aClass2_251;
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V")
	public void method907() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt766; local7++) {
			@Pc(14) Class2 local14 = this.aClass2Array1[local7];
			while (true) {
				@Pc(17) Class2 local17 = local14.aClass2_251;
				if (local17 == local14) {
					break;
				}
				local17.method5723();
			}
		}
		this.aClass2_29 = null;
		this.aClass2_30 = null;
	}
}
