import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class162 {

	@OriginalMember(owner = "client!il", name = "d", descriptor = "Lclient!d;")
	private Class2 aClass2_115;

	@OriginalMember(owner = "client!il", name = "g", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!il", name = "q", descriptor = "Lclient!d;")
	private Class2 aClass2_116;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "I")
	private int anInt4214 = 0;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "I")
	public final int anInt4211;

	@OriginalMember(owner = "client!il", name = "l", descriptor = "[Lclient!d;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(I)V")
	public Class162(@OriginalArg(0) int arg0) {
		this.anInt4211 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_286 = local23;
			local23.aClass2_285 = local23;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
	public void method3518() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt4211; local11++) {
			@Pc(18) Class2 local18 = this.aClass2Array1[local11];
			while (true) {
				@Pc(21) Class2 local21 = local18.aClass2_286;
				if (local18 == local21) {
					break;
				}
				local21.method7966();
			}
		}
		this.aClass2_115 = null;
		this.aClass2_116 = null;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IJ)Lclient!d;")
	public Class2 method3519(@OriginalArg(1) long arg0) {
		this.aLong109 = arg0;
		@Pc(25) Class2 local25 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt4211 - 1))];
		for (this.aClass2_115 = local25.aClass2_286; this.aClass2_115 != local25; this.aClass2_115 = this.aClass2_115.aClass2_286) {
			if (this.aClass2_115.aLong268 == arg0) {
				@Pc(40) Class2 local40 = this.aClass2_115;
				this.aClass2_115 = this.aClass2_115.aClass2_286;
				return local40;
			}
		}
		this.aClass2_115 = null;
		return null;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([Lclient!d;B)I")
	public int method3520(@OriginalArg(0) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt4211; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_286; local19 != local16; local19 = local19.aClass2_286) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!d;BJ)V")
	public void method3522(@OriginalArg(0) Class2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_285 != null) {
			arg0.method7966();
		}
		@Pc(28) Class2 local28 = this.aClass2Array1[(int) (arg1 & (long) (this.anInt4211 - 1))];
		arg0.aClass2_286 = local28;
		arg0.aClass2_285 = local28.aClass2_285;
		arg0.aClass2_285.aClass2_286 = arg0;
		arg0.aLong268 = arg1;
		arg0.aClass2_286.aClass2_285 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)Lclient!d;")
	public Class2 method3523() {
		@Pc(19) Class2 local19;
		if (this.anInt4214 > 0 && this.aClass2Array1[this.anInt4214 - 1] != this.aClass2_116) {
			local19 = this.aClass2_116;
			this.aClass2_116 = local19.aClass2_286;
			return local19;
		}
		while (this.anInt4214 < this.anInt4211) {
			local19 = this.aClass2Array1[this.anInt4214++].aClass2_286;
			if (this.aClass2Array1[this.anInt4214 - 1] != local19) {
				this.aClass2_116 = local19.aClass2_286;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)I")
	public int method3524() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt4211; local14++) {
			@Pc(21) Class2 local21 = this.aClass2Array1[local14];
			for (@Pc(24) Class2 local24 = local21.aClass2_286; local24 != local21; local24 = local24.aClass2_286) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)I")
	public int method3526() {
		return this.anInt4211;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)Lclient!d;")
	public Class2 method3527() {
		this.anInt4214 = 0;
		return this.method3523();
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(B)Lclient!d;")
	public Class2 method3528() {
		if (this.aClass2_115 == null) {
			return null;
		}
		@Pc(28) Class2 local28 = this.aClass2Array1[(int) ((long) (this.anInt4211 - 1) & this.aLong109)];
		while (this.aClass2_115 != local28) {
			if (this.aClass2_115.aLong268 == this.aLong109) {
				@Pc(44) Class2 local44 = this.aClass2_115;
				this.aClass2_115 = this.aClass2_115.aClass2_286;
				return local44;
			}
			this.aClass2_115 = this.aClass2_115.aClass2_286;
		}
		this.aClass2_115 = null;
		return null;
	}
}
