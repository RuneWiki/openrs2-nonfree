import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class20_Sub2_Sub2 extends Class20_Sub2 implements Interface9 {

	@OriginalMember(owner = "client!jo", name = "M", descriptor = "B")
	private final byte aByte31;

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "S")
	private final short aShort33;

	@OriginalMember(owner = "client!jo", name = "S", descriptor = "B")
	private final byte aByte32;

	@OriginalMember(owner = "client!jo", name = "C", descriptor = "Z")
	private final boolean aBoolean236;

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "Z")
	private final boolean aBoolean237;

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "Z")
	private boolean aBoolean235;

	@OriginalMember(owner = "client!jo", name = "P", descriptor = "Z")
	private final boolean aBoolean238;

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "Lclient!c;")
	private Class33 aClass33_4;

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "Lclient!j;")
	private Class1_Sub3_Sub10 aClass1_Sub3_Sub10_4;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!qa;Lclient!kn;IIIIZIZ)V")
	public Class20_Sub2_Sub2(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean271, arg1.aBoolean269);
		super.anInt5039 = arg3;
		this.aByte31 = (byte) arg7;
		super.anInt5044 = arg5;
		this.aShort33 = (short) arg1.anInt3383;
		this.aByte32 = (byte) arg2;
		this.aBoolean236 = arg6;
		this.aBoolean237 = arg1.anInt3379 != 0 && !arg6;
		this.aBoolean235 = arg8;
		this.aBoolean238 = arg0.method3584() && arg1.aBoolean268 && !this.aBoolean236 && Static336.aClass106_Sub1_1.method4424(Static410.anInt6680) != 0;
		@Pc(64) int local64 = 2048;
		if (this.aBoolean235) {
			local64 |= 0x10000;
		}
		@Pc(79) Class150 local79 = this.method2616(this.aBoolean238, arg0, local64);
		if (local79 != null) {
			this.aClass33_4 = local79.aClass33_5;
			this.aClass1_Sub3_Sub10_4 = local79.aClass1_Sub3_Sub10_5;
			if (this.aBoolean235) {
				this.aClass33_4 = this.aClass33_4.method5383((byte) 0, local64, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZIILclient!er;Lclient!qa;IB)V")
	@Override
	public void method5116(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(5) int arg5) {
		if (arg3 instanceof Class20_Sub2_Sub2) {
			@Pc(5) Class20_Sub2_Sub2 local5 = (Class20_Sub2_Sub2) arg3;
			if (this.aClass33_4 != null && local5.aClass33_4 != null) {
				this.aClass33_4.method5384(local5.aClass33_4, arg1, arg2, arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5128() {
		return this.aBoolean238;
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5110() {
		return this.aBoolean235;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		@Pc(17) Class33 local17 = this.method2615(arg2, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class40 local22 = arg2.method3600();
			local22.R(super.anInt5039, super.anInt5040, super.anInt5044);
			return local17.method5395(arg0, arg1, local22, false);
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)I")
	@Override
	public int method5124() {
		return this.aShort33 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(ILclient!qa;I)Lclient!c;")
	private Class33 method2615(@OriginalArg(1) Class128 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass33_4 != null && arg0.method3605(this.aClass33_4.n(), arg1) == 0) {
			return this.aClass33_4;
		} else {
			@Pc(26) Class150 local26 = this.method2616(false, arg0, arg1);
			return local26 == null ? null : local26.aClass33_5;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5126(@OriginalArg(0) Class128 arg0) {
		@Pc(18) Class1_Sub3_Sub10 local18;
		if (this.aClass1_Sub3_Sub10_4 == null && this.aBoolean238) {
			@Pc(29) Class150 local29 = this.method2616(true, arg0, 262144);
			local18 = local29 == null ? null : local29.aClass1_Sub3_Sub10_5;
		} else {
			local18 = this.aClass1_Sub3_Sub10_4;
			this.aClass1_Sub3_Sub10_4 = null;
		}
		if (local18 != null) {
			Static422.method5252(local18, this.aByte32, super.anInt5039, super.anInt5044, null);
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)I")
	@Override
	public int method5125() {
		return 22;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5121(@OriginalArg(1) Class128 arg0) {
		@Pc(31) Class1_Sub3_Sub10 local31;
		if (this.aClass1_Sub3_Sub10_4 == null && this.aBoolean238) {
			@Pc(24) Class150 local24 = this.method2616(true, arg0, 262144);
			local31 = local24 == null ? null : local24.aClass1_Sub3_Sub10_5;
		} else {
			local31 = this.aClass1_Sub3_Sub10_4;
			this.aClass1_Sub3_Sub10_4 = null;
		}
		if (local31 != null) {
			Static177.method2370(local31, this.aByte32, super.anInt5039, super.anInt5044, null);
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		if (this.aClass33_4 == null) {
			return null;
		}
		@Pc(17) Class40 local17 = arg0.method3600();
		local17.R(super.anInt5039, super.anInt5040, super.anInt5044);
		@Pc(27) Class13_Sub4 local27 = null;
		if (this.aBoolean237) {
			local27 = Static192.method2550(1);
		}
		this.aClass33_4.method5391(local17, local27 == null ? null : local27.aClass13_Sub8Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	@Override
	public Class33 method5127(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1) {
		return this.method2615(arg1, arg0);
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(B)V")
	@Override
	public void method5111() {
		this.aBoolean235 = false;
		if (this.aClass33_4 != null) {
			this.aClass33_4.u(this.aClass33_4.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)I")
	@Override
	public int method5122() {
		return this.aByte31;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZLclient!qa;I)Lclient!lp;")
	private Class150 method2616(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class128 arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class141 local19 = Static259.aClass95_3.method1821(this.aShort33 & 0xFFFF);
		@Pc(44) Class163 local44;
		@Pc(30) Class163 local30;
		if (this.aBoolean236) {
			local30 = Static240.aClass163Array3[0];
			local44 = Static164.aClass163Array1[this.aByte32];
		} else {
			if (this.aByte32 >= 3) {
				local30 = null;
			} else {
				local30 = Static240.aClass163Array3[this.aByte32 + 1];
			}
			local44 = Static240.aClass163Array3[this.aByte32];
		}
		return local19.method2825(22, this.aByte31, super.anInt5044, arg0, arg2, local44, super.anInt5040, arg1, super.anInt5039, local30);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
	@Override
	public void method5123() {
		if (this.aClass33_4 != null) {
			this.aClass33_4.method5397();
		}
	}
}
