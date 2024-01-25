import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class4_Sub5_Sub3 extends Class4_Sub5 implements Interface18 {

	@OriginalMember(owner = "client!raa", name = "w", descriptor = "[F")
	public static final float[] aFloatArray56 = new float[16384];

	@OriginalMember(owner = "client!raa", name = "P", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[16384];

	@OriginalMember(owner = "client!raa", name = "m", descriptor = "Lclient!qt;")
	private Class277 aClass277_8;

	@OriginalMember(owner = "client!raa", name = "n", descriptor = "B")
	private final byte aByte91;

	@OriginalMember(owner = "client!raa", name = "z", descriptor = "Z")
	private final boolean aBoolean531;

	@OriginalMember(owner = "client!raa", name = "l", descriptor = "B")
	private final byte aByte90;

	@OriginalMember(owner = "client!raa", name = "v", descriptor = "B")
	private final byte aByte92;

	@OriginalMember(owner = "client!raa", name = "L", descriptor = "S")
	private final short aShort100;

	@OriginalMember(owner = "client!raa", name = "B", descriptor = "Z")
	private final boolean aBoolean532;

	@OriginalMember(owner = "client!raa", name = "j", descriptor = "Z")
	private boolean aBoolean529;

	@OriginalMember(owner = "client!raa", name = "k", descriptor = "Z")
	private final boolean aBoolean530;

	@OriginalMember(owner = "client!raa", name = "J", descriptor = "Lclient!w;")
	private Class6_Sub2_Sub14 aClass6_Sub2_Sub14_6;

	@OriginalMember(owner = "client!raa", name = "F", descriptor = "Lclient!ba;")
	public Class20 aClass20_7;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray57[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray56[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lclient!oa;Lclient!pg;IIIIZIIZ)V")
	public Class4_Sub5_Sub3(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class252 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static44.method1054(arg7, arg8));
		this.aByte91 = (byte) arg8;
		this.aBoolean531 = arg1.anInt6889 != 0 && !arg6;
		this.aByte90 = (byte) arg2;
		this.aByte92 = (byte) arg7;
		this.aShort100 = (short) arg1.anInt6905;
		super.anInt7597 = arg3;
		this.aBoolean532 = arg6;
		this.aBoolean529 = arg9;
		super.anInt7599 = arg5;
		this.aBoolean530 = arg0.method6849() && arg1.aBoolean476 && !this.aBoolean532 && Static140.aClass6_Sub48_Sub1_1.method7374(Static560.anInt9242) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean529) {
			local71 |= 0x10000;
		}
		@Pc(86) Class202 local86 = this.method6278(this.aBoolean530, local71, arg0);
		if (local86 != null) {
			this.aClass6_Sub2_Sub14_6 = local86.aClass6_Sub2_Sub14_4;
			this.aClass20_7 = local86.aClass20_4;
			if (this.aBoolean529) {
				this.aClass20_7 = this.aClass20_7.method7264((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(B)I")
	@Override
	public int method6272() {
		return this.aByte91;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method6270(@OriginalArg(0) Class14 arg0) {
		@Pc(18) Class6_Sub2_Sub14 local18;
		if (this.aClass6_Sub2_Sub14_6 == null && this.aBoolean530) {
			@Pc(29) Class202 local29 = this.method6278(true, 262144, arg0);
			local18 = local29 == null ? null : local29.aClass6_Sub2_Sub14_4;
		} else {
			local18 = this.aClass6_Sub2_Sub14_6;
			this.aClass6_Sub2_Sub14_6 = null;
		}
		if (local18 != null) {
			Static60.method1249(local18, this.aByte90, super.anInt7597, super.anInt7599, null);
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)I")
	@Override
	public int method6265() {
		return this.aShort100 & 0xFFFF;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class20 method6269(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1) {
		return this.method6274(arg1, arg0);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class20 local9 = this.method6274(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class54 local14 = arg1.method6851();
			local14.GA(super.anInt7597, super.anInt7596, super.anInt7599);
			return local9.method7266(arg2, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	@Override
	public void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 instanceof Class4_Sub5_Sub3) {
			@Pc(28) Class4_Sub5_Sub3 local28 = (Class4_Sub5_Sub3) arg2;
			if (this.aClass20_7 != null && local28.aClass20_7 != null) {
				this.aClass20_7.method7258(local28.aClass20_7, arg5, arg3, arg4, arg0);
			}
		} else if (arg2 instanceof Class4_Sub1_Sub3) {
			@Pc(8) Class4_Sub1_Sub3 local8 = (Class4_Sub1_Sub3) arg2;
			if (this.aClass20_7 != null && local8.aClass20_2 != null) {
				this.aClass20_7.method7258(local8.aClass20_2, arg5, arg3, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6271() {
		return this.aBoolean530;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	private Class20 method6274(@OriginalArg(0) int arg0, @OriginalArg(2) Class14 arg1) {
		if (this.aClass20_7 != null && arg1.method6884(this.aClass20_7.h(), arg0) == 0) {
			return this.aClass20_7;
		} else {
			@Pc(23) Class202 local23 = this.method6278(false, arg0, arg1);
			return local23 == null ? null : local23.aClass20_4;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V")
	@Override
	public void method6266() {
		if (this.aClass20_7 != null) {
			this.aClass20_7.method7271();
		}
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		if (this.aClass20_7 == null) {
			return null;
		}
		@Pc(16) Class54 local16 = arg0.method6851();
		local16.GA(super.anInt7597, super.anInt7596, super.anInt7599);
		@Pc(26) Class98_Sub8 local26 = null;
		if (this.aBoolean531) {
			local26 = Static348.method5326(1);
		}
		this.aClass20_7.method7256(local16, local26 == null ? null : local26.aClass98_Sub5Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method6267(@OriginalArg(0) Class14 arg0) {
		@Pc(14) Class6_Sub2_Sub14 local14;
		if (this.aClass6_Sub2_Sub14_6 == null && this.aBoolean530) {
			@Pc(25) Class202 local25 = this.method6278(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass6_Sub2_Sub14_4;
		} else {
			local14 = this.aClass6_Sub2_Sub14_6;
			this.aClass6_Sub2_Sub14_6 = null;
		}
		if (local14 != null) {
			Static272.method4497(local14, this.aByte90, super.anInt7597, super.anInt7599, null);
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZILclient!oa;I)Lclient!m;")
	private Class202 method6278(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2) {
		@Pc(18) Class252 local18 = Static412.aClass307_4.method6636(this.aShort100 & 0xFFFF);
		@Pc(30) Class59 local30;
		@Pc(25) Class59 local25;
		if (this.aBoolean532) {
			local25 = Static273.aClass59Array4[0];
			local30 = Static49.aClass59Array2[this.aByte90];
		} else {
			if (this.aByte90 >= 3) {
				local25 = null;
			} else {
				local25 = Static273.aClass59Array4[this.aByte90 + 1];
			}
			local30 = Static273.aClass59Array4[this.aByte90];
		}
		return local18.method5785(local25, super.anInt7599, this.aByte91, super.anInt7597, arg1, local30, super.anInt7596, this.aByte92, arg0, arg2);
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)I")
	@Override
	public int method6268() {
		return this.aByte92;
	}

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7785() {
		return this.aBoolean529;
	}

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "(B)V")
	@Override
	public void method7782() {
		this.aBoolean529 = false;
		if (this.aClass20_7 != null) {
			this.aClass20_7.ia(this.aClass20_7.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		if (this.aClass277_8 == null) {
			this.aClass277_8 = Static323.method5117(this.method6274(0, arg0), super.anInt7599, super.anInt7596, super.anInt7597);
		}
		return this.aClass277_8;
	}
}
