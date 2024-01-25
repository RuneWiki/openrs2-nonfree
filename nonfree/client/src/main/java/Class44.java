import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class44 {

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "Lclient!ah;")
	private Class3 aClass3_28;

	@OriginalMember(owner = "client!cp", name = "s", descriptor = "Lclient!ah;")
	private Class3 aClass3_29;

	@OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
	private int anInt1100 = 0;

	@OriginalMember(owner = "client!cp", name = "p", descriptor = "[Lclient!ah;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
	public final int anInt1091;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(I)V")
	public Class44(@OriginalArg(0) int arg0) {
		this.aClass3Array1 = new Class3[arg0];
		this.anInt1091 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_244 = local23;
			local23.aClass3_243 = local23;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(JB)Lclient!ah;")
	public Class3 method942(@OriginalArg(0) long arg0) {
		this.aLong23 = arg0;
		@Pc(26) Class3 local26 = this.aClass3Array1[(int) ((long) (this.anInt1091 - 1) & arg0)];
		for (this.aClass3_28 = local26.aClass3_243; this.aClass3_28 != local26; this.aClass3_28 = this.aClass3_28.aClass3_243) {
			if (arg0 == this.aClass3_28.aLong240) {
				@Pc(45) Class3 local45 = this.aClass3_28;
				this.aClass3_28 = this.aClass3_28.aClass3_243;
				return local45;
			}
		}
		this.aClass3_28 = null;
		return null;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)I")
	public int method943() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt1091; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			@Pc(19) Class3 local19 = local16.aClass3_243;
			while (local16 != local19) {
				local19 = local19.aClass3_243;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "([Lclient!ah;B)I")
	public int method945(@OriginalArg(0) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt1091; local9++) {
			@Pc(19) Class3 local19 = this.aClass3Array1[local9];
			for (@Pc(22) Class3 local22 = local19.aClass3_243; local22 != local19; local22 = local22.aClass3_243) {
				arg0[local7++] = local22;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)Lclient!ah;")
	public Class3 method946() {
		if (this.aClass3_28 == null) {
			return null;
		}
		@Pc(23) Class3 local23 = this.aClass3Array1[(int) (this.aLong23 & (long) (this.anInt1091 - 1))];
		while (this.aClass3_28 != local23) {
			if (this.aLong23 == this.aClass3_28.aLong240) {
				@Pc(39) Class3 local39 = this.aClass3_28;
				this.aClass3_28 = this.aClass3_28.aClass3_243;
				return local39;
			}
			this.aClass3_28 = this.aClass3_28.aClass3_243;
		}
		this.aClass3_28 = null;
		return null;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IJLclient!ah;)V")
	public void method948(@OriginalArg(1) long arg0, @OriginalArg(2) Class3 arg1) {
		if (arg1.aClass3_244 != null) {
			arg1.method5700();
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt1091 - 1))];
		arg1.aClass3_243 = local21;
		arg1.aClass3_244 = local21.aClass3_244;
		arg1.aClass3_244.aClass3_243 = arg1;
		arg1.aLong240 = arg0;
		arg1.aClass3_243.aClass3_244 = arg1;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)Lclient!ah;")
	public Class3 method949() {
		@Pc(22) Class3 local22;
		if (this.anInt1100 > 0 && this.aClass3_29 != this.aClass3Array1[this.anInt1100 - 1]) {
			local22 = this.aClass3_29;
			this.aClass3_29 = local22.aClass3_243;
			return local22;
		}
		while (this.anInt1091 > this.anInt1100) {
			local22 = this.aClass3Array1[this.anInt1100++].aClass3_243;
			if (this.aClass3Array1[this.anInt1100 - 1] != local22) {
				this.aClass3_29 = local22.aClass3_243;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)Lclient!ah;")
	public Class3 method950() {
		this.anInt1100 = 0;
		return this.method949();
	}

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)I")
	public int method951() {
		return this.anInt1091;
	}

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "(I)V")
	public void method952() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt1091; local13++) {
			@Pc(20) Class3 local20 = this.aClass3Array1[local13];
			while (true) {
				@Pc(23) Class3 local23 = local20.aClass3_243;
				if (local20 == local23) {
					break;
				}
				local23.method5700();
			}
		}
		this.aClass3_29 = null;
		this.aClass3_28 = null;
	}
}
