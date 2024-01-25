import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class20_Sub4_Sub1 extends Class20_Sub4 implements Interface9 {

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "S")
	private final short aShort19;

	@OriginalMember(owner = "client!fp", name = "X", descriptor = "Z")
	private final boolean aBoolean158;

	@OriginalMember(owner = "client!fp", name = "P", descriptor = "B")
	private final byte aByte24;

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "B")
	private final byte aByte23;

	@OriginalMember(owner = "client!fp", name = "S", descriptor = "B")
	private final byte aByte25;

	@OriginalMember(owner = "client!fp", name = "D", descriptor = "Z")
	private final boolean aBoolean157;

	@OriginalMember(owner = "client!fp", name = "z", descriptor = "Z")
	private final boolean aBoolean156;

	@OriginalMember(owner = "client!fp", name = "G", descriptor = "Lclient!c;")
	private Class33 aClass33_3;

	@OriginalMember(owner = "client!fp", name = "I", descriptor = "Lclient!j;")
	private Class1_Sub3_Sub10 aClass1_Sub3_Sub10_3;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!qa;Lclient!kn;IIIIZIIIII)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static417.method1206(arg11, arg10));
		this.aShort19 = (short) arg1.anInt3383;
		this.aBoolean158 = arg1.anInt3379 != 0 && !arg6;
		this.aByte24 = (byte) arg10;
		super.anInt6661 = arg5;
		this.aByte23 = (byte) arg11;
		this.aByte25 = (byte) arg2;
		this.aBoolean157 = arg6;
		super.anInt6658 = arg3;
		this.aBoolean156 = arg0.method3584() && arg1.aBoolean268 && !this.aBoolean157 && Static336.aClass106_Sub1_1.method4424(Static410.anInt6680) != 0;
		@Pc(77) Class150 local77 = this.method1691(2048, this.aBoolean156, arg0);
		if (local77 != null) {
			this.aClass33_3 = local77.aClass33_5;
			this.aClass1_Sub3_Sub10_3 = local77.aClass1_Sub3_Sub10_5;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5121(@OriginalArg(1) Class128 arg0) {
		@Pc(25) Class1_Sub3_Sub10 local25;
		if (this.aClass1_Sub3_Sub10_3 == null && this.aBoolean156) {
			@Pc(18) Class150 local18 = this.method1691(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass1_Sub3_Sub10_5;
		} else {
			local25 = this.aClass1_Sub3_Sub10_3;
			this.aClass1_Sub3_Sub10_3 = null;
		}
		if (local25 != null) {
			Static177.method2370(local25, this.aByte25, super.anInt6658, super.anInt6661, null);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIZLclient!qa;)Lclient!lp;")
	private Class150 method1691(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class128 arg2) {
		@Pc(13) Class141 local13 = Static259.aClass95_3.method1821(this.aShort19 & 0xFFFF);
		@Pc(27) Class163 local27;
		@Pc(31) Class163 local31;
		if (this.aBoolean157) {
			local27 = Static164.aClass163Array1[this.aByte25];
			local31 = Static240.aClass163Array3[0];
		} else {
			local27 = Static240.aClass163Array3[this.aByte25];
			if (this.aByte25 >= 3) {
				local31 = null;
			} else {
				local31 = Static240.aClass163Array3[this.aByte25 + 1];
			}
		}
		return local13.method2825(this.aByte24, this.aByte23, super.anInt6661, arg1, arg0, local27, super.anInt6664, arg2, super.anInt6658, local31);
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5128() {
		return this.aBoolean156;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)I")
	@Override
	public int method5122() {
		return this.aByte23;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		if (this.aClass33_3 == null) {
			return null;
		}
		@Pc(16) Class40 local16 = arg0.method3600();
		local16.R(super.anInt6658 + super.anInt6653, super.anInt6664, super.anInt6662 + super.anInt6661);
		@Pc(32) Class13_Sub4 local32 = null;
		if (this.aBoolean158) {
			local32 = Static192.method2550(1);
		}
		this.aClass33_3.method5391(local16, local32 == null ? null : local32.aClass13_Sub8Array1[0], 0);
		return local32;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	private Class33 method1692(@OriginalArg(0) int arg0, @OriginalArg(2) Class128 arg1) {
		if (this.aClass33_3 != null && arg1.method3605(this.aClass33_3.n(), arg0) == 0) {
			return this.aClass33_3;
		} else {
			@Pc(34) Class150 local34 = this.method1691(arg0, false, arg1);
			return local34 == null ? null : local34.aClass33_5;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	@Override
	public Class33 method5127(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1) {
		return this.method1692(arg0, arg1);
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)I")
	@Override
	public int method5125() {
		return this.aByte24;
	}

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "(B)I")
	@Override
	public int method5118() {
		return this.aClass33_3 == null ? 0 : this.aClass33_3.b();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5126(@OriginalArg(0) Class128 arg0) {
		@Pc(29) Class1_Sub3_Sub10 local29;
		if (this.aClass1_Sub3_Sub10_3 == null && this.aBoolean156) {
			@Pc(22) Class150 local22 = this.method1691(262144, true, arg0);
			local29 = local22 == null ? null : local22.aClass1_Sub3_Sub10_5;
		} else {
			local29 = this.aClass1_Sub3_Sub10_3;
			this.aClass1_Sub3_Sub10_3 = null;
		}
		if (local29 != null) {
			Static422.method5252(local29, this.aByte25, super.anInt6658, super.anInt6661, null);
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)I")
	@Override
	public int method5124() {
		return this.aShort19 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
	@Override
	public void method5123() {
		if (this.aClass33_3 != null) {
			this.aClass33_3.method5397();
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		@Pc(9) Class33 local9 = this.method1692(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(22) Class40 local22 = arg2.method3600();
			local22.R(super.anInt6658, super.anInt6664, super.anInt6661);
			return local9.method5395(arg0, arg1, local22, false);
		}
	}
}
