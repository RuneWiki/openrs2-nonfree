import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class15_Sub3_Sub3_Sub5 extends Class15_Sub3_Sub3 {

	@OriginalMember(owner = "client!ko", name = "xb", descriptor = "Lclient!eea;")
	private Class15_Sub5 aClass15_Sub5_5;

	@OriginalMember(owner = "client!ko", name = "T", descriptor = "Z")
	public boolean aBoolean433 = false;

	@OriginalMember(owner = "client!ko", name = "gb", descriptor = "Z")
	private boolean aBoolean434 = true;

	@OriginalMember(owner = "client!ko", name = "Y", descriptor = "I")
	private int anInt5881 = 0;

	@OriginalMember(owner = "client!ko", name = "nb", descriptor = "I")
	private int anInt5893 = 0;

	@OriginalMember(owner = "client!ko", name = "jb", descriptor = "I")
	private final int anInt5891 = -1;

	@OriginalMember(owner = "client!ko", name = "ib", descriptor = "I")
	private int anInt5890 = 0;

	@OriginalMember(owner = "client!ko", name = "ub", descriptor = "I")
	private int anInt5900 = 0;

	@OriginalMember(owner = "client!ko", name = "wb", descriptor = "I")
	private int anInt5902 = 0;

	@OriginalMember(owner = "client!ko", name = "W", descriptor = "I")
	public final int anInt5879;

	@OriginalMember(owner = "client!ko", name = "eb", descriptor = "I")
	private final int anInt5887;

	@OriginalMember(owner = "client!ko", name = "mb", descriptor = "Lclient!je;")
	private Class178 aClass178_2;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class15_Sub3_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt5890 = arg12;
		this.anInt5879 = arg2 + arg1;
		this.anInt5887 = arg0;
		@Pc(54) Class336 local54 = Static391.aClass319_1.method8041(this.anInt5887);
		@Pc(57) int local57 = local54.anInt9651;
		if (local57 == -1) {
			this.aBoolean433 = true;
		} else {
			this.aClass178_2 = Static354.aClass40_2.method1123(local57);
			this.aBoolean433 = false;
		}
		if (arg2 == this.anInt5879) {
			Static509.method7938(this.aClass178_2, this, this.anInt5893);
		}
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)V")
	@Override
	public void method9429() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(Z)I")
	@Override
	public int method9436(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt5893 = -99;
		}
		return this.anInt5900;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIILclient!ha;Lclient!nfa;ZI)V")
	@Override
	public void method9426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) Class15_Sub3 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "(I)I")
	@Override
	public int method9430() {
		return this.anInt5881;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ha;Lclient!dm;Lclient!ka;Z)V")
	private void method5332(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) Class14 arg2) {
		arg2.method8632(arg1);
		@Pc(9) Class283[] local9 = arg2.method8630();
		@Pc(12) Class123[] local12 = arg2.method8634();
		if ((this.aClass15_Sub5_5 == null || this.aClass15_Sub5_5.aBoolean183) && (local9 != null || local12 != null)) {
			this.aClass15_Sub5_5 = Static128.method2303(Static62.anInt1184, true);
		}
		if (this.aClass15_Sub5_5 != null) {
			this.aClass15_Sub5_5.method2301(arg0, (long) Static62.anInt1184, local9, local12);
			this.aClass15_Sub5_5.method2309(super.aByte142, super.aShort62, super.aShort63, super.aShort64, super.aShort65);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	public void method5333() {
		if (this.aClass15_Sub5_5 != null) {
			this.aClass15_Sub5_5.method2298();
		}
	}

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method9434() {
		return this.aBoolean434;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ha;III)Lclient!ka;")
	private Class14 method5334(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class336 local10 = Static391.aClass319_1.method8041(arg1);
		@Pc(15) Class18 local15 = Static549.aClass18Array30[super.aByte142];
		@Pc(28) Class18 local28 = super.aByte141 >= 3 ? null : Static549.aClass18Array30[super.aByte141 + 1];
		return this.aBoolean433 ? local10.method8461(arg0, super.anInt11022, local15, super.anInt11024, arg2, Static354.aClass40_2, super.anInt11029, 0, local28, -1, -1) : local10.method8461(arg0, super.anInt11022, local15, super.anInt11024, arg2, Static354.aClass40_2, super.anInt11029, this.anInt5902, local28, this.anInt5893, this.anInt5891);
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(BLclient!ha;)Lclient!mg;")
	@Override
	public Class232 method9442(@OriginalArg(1) Class101 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ko", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass15_Sub5_5 != null) {
			this.aClass15_Sub5_5.method2298();
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BIILclient!ha;)Z")
	@Override
	public boolean method9431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)V")
	public void method5336(@OriginalArg(1) int arg0) {
		if (this.aBoolean433) {
			return;
		}
		this.anInt5902 += arg0;
		while (this.anInt5902 > this.aClass178_2.anIntArray257[this.anInt5893]) {
			this.anInt5902 -= this.aClass178_2.anIntArray257[this.anInt5893];
			this.anInt5893++;
			if (this.anInt5893 >= this.aClass178_2.anIntArray259.length) {
				this.aBoolean433 = true;
				break;
			}
		}
		if (!this.aBoolean433) {
			Static509.method7938(this.aClass178_2, this, this.anInt5893);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ha;I)Lclient!uh;")
	@Override
	public Class15_Sub9 method9427(@OriginalArg(0) Class101 arg0) {
		@Pc(20) Class14 local20 = this.method5334(arg0, this.anInt5887, (this.anInt5890 == 0 ? 0 : 5) | 0x800);
		if (local20 == null) {
			return null;
		}
		if (this.anInt5890 != 0) {
			local20.a(this.anInt5890 * 2048);
		}
		@Pc(39) Class76 local39 = arg0.method8085();
		local39.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
		this.method5332(arg0, local39, local20);
		@Pc(58) Class15_Sub9 local58 = Static401.method6614(1, false);
		if (Static110.aBoolean800) {
			local20.method8623(local39, local58.aClass15_Sub6Array1[0], Static165.anInt3552, 0);
		} else {
			local20.method8641(local39, local58.aClass15_Sub6Array1[0], 0);
		}
		if (this.aClass15_Sub5_5 != null) {
			@Pc(86) Class127 local86 = this.aClass15_Sub5_5.method2300();
			if (Static110.aBoolean800) {
				arg0.method8115(local86, Static165.anInt3552);
			} else {
				arg0.method8065(local86);
			}
		}
		this.aBoolean434 = local20.F();
		this.anInt5881 = local20.fa();
		this.anInt5900 = local20.ma();
		return local58;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9439() {
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9425() {
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9438(@OriginalArg(1) Class101 arg0) {
		@Pc(11) Class14 local11 = this.method5334(arg0, this.anInt5887, 0);
		if (local11 != null) {
			@Pc(22) Class76 local22 = arg0.method8085();
			local22.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
			this.method5332(arg0, local22, local11);
		}
	}
}
