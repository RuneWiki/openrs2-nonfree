import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class4_Sub3_Sub3 extends Class4_Sub3 implements Interface18 {

	@OriginalMember(owner = "client!nea", name = "H", descriptor = "Lclient!qt;")
	private Class277 aClass277_7;

	@OriginalMember(owner = "client!nea", name = "u", descriptor = "Z")
	private boolean aBoolean430;

	@OriginalMember(owner = "client!nea", name = "B", descriptor = "Z")
	private final boolean aBoolean431;

	@OriginalMember(owner = "client!nea", name = "w", descriptor = "B")
	private final byte aByte50;

	@OriginalMember(owner = "client!nea", name = "G", descriptor = "S")
	private final short aShort77;

	@OriginalMember(owner = "client!nea", name = "N", descriptor = "Z")
	private final boolean aBoolean433;

	@OriginalMember(owner = "client!nea", name = "L", descriptor = "B")
	private final byte aByte51;

	@OriginalMember(owner = "client!nea", name = "I", descriptor = "Z")
	private final boolean aBoolean432;

	@OriginalMember(owner = "client!nea", name = "z", descriptor = "Lclient!w;")
	private Class6_Sub2_Sub14 aClass6_Sub2_Sub14_5;

	@OriginalMember(owner = "client!nea", name = "r", descriptor = "Lclient!ba;")
	private Class20 aClass20_5;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!oa;Lclient!pg;IIIIZIZ)V")
	public Class4_Sub3_Sub3(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class252 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt6932, arg1.lb, arg1.aBoolean483);
		this.aBoolean430 = arg8;
		this.aBoolean431 = arg6;
		super.anInt6071 = arg3;
		this.aByte50 = (byte) arg7;
		super.anInt6067 = arg5;
		this.aShort77 = (short) arg1.anInt6905;
		this.aBoolean433 = arg1.anInt6889 != 0 && !arg6;
		this.aByte51 = (byte) arg2;
		this.aBoolean432 = arg0.method6849() && arg1.aBoolean476 && !this.aBoolean431 && Static140.aClass6_Sub48_Sub1_1.method7374(Static560.anInt9242) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean430) {
			local69 |= 0x10000;
		}
		@Pc(84) Class202 local84 = this.method5224(arg0, local69, this.aBoolean432);
		if (local84 != null) {
			this.aClass6_Sub2_Sub14_5 = local84.aClass6_Sub2_Sub14_4;
			this.aClass20_5 = local84.aClass20_4;
			if (this.aBoolean430) {
				this.aClass20_5 = this.aClass20_5.method7264((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
	@Override
	public void method6266() {
		if (this.aClass20_5 != null) {
			this.aClass20_5.method7271();
		}
	}

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7785() {
		return this.aBoolean430;
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(B)I")
	@Override
	public int method6272() {
		return this.aByte50;
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		if (this.aClass277_7 == null) {
			this.aClass277_7 = Static323.method5117(this.method5225(0, arg0), super.anInt6067, super.anInt6066, super.anInt6071);
		}
		return this.aClass277_7;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!oa;BIZ)Lclient!m;")
	private Class202 method5224(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class252 local19 = Static412.aClass307_4.method6636(this.aShort77 & 0xFFFF);
		@Pc(31) Class59 local31;
		@Pc(26) Class59 local26;
		if (this.aBoolean431) {
			local26 = Static273.aClass59Array4[0];
			local31 = Static49.aClass59Array2[this.aByte51];
		} else {
			local31 = Static273.aClass59Array4[this.aByte51];
			if (this.aByte51 >= 3) {
				local26 = null;
			} else {
				local26 = Static273.aClass59Array4[this.aByte51 + 1];
			}
		}
		return local19.method5785(local26, super.anInt6067, this.aByte50, super.anInt6071, arg1, local31, super.anInt6066, 22, arg2, arg0);
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)I")
	@Override
	public int method6268() {
		return 22;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6271() {
		return this.aBoolean432;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method6270(@OriginalArg(0) Class14 arg0) {
		@Pc(14) Class6_Sub2_Sub14 local14;
		if (this.aClass6_Sub2_Sub14_5 == null && this.aBoolean432) {
			@Pc(25) Class202 local25 = this.method5224(arg0, 262144, true);
			local14 = local25 == null ? null : local25.aClass6_Sub2_Sub14_4;
		} else {
			local14 = this.aClass6_Sub2_Sub14_5;
			this.aClass6_Sub2_Sub14_5 = null;
		}
		if (local14 != null) {
			Static60.method1249(local14, this.aByte51, super.anInt6071, super.anInt6067, null);
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	@Override
	public void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 instanceof Class4_Sub3_Sub3) {
			@Pc(9) Class4_Sub3_Sub3 local9 = (Class4_Sub3_Sub3) arg2;
			if (this.aClass20_5 != null && local9.aClass20_5 != null) {
				this.aClass20_5.method7258(local9.aClass20_5, arg5, arg3, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class20 local17 = this.method5225(131072, arg1);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class54 local22 = arg1.method6851();
			local22.GA(super.anInt6071, super.anInt6066, super.anInt6067);
			return local17.method7266(arg2, arg0, local22, false);
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILclient!oa;I)Lclient!ba;")
	private Class20 method5225(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1) {
		if (this.aClass20_5 != null && arg1.method6884(this.aClass20_5.h(), arg0) == 0) {
			return this.aClass20_5;
		} else {
			@Pc(31) Class202 local31 = this.method5224(arg1, arg0, false);
			return local31 == null ? null : local31.aClass20_4;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method6267(@OriginalArg(0) Class14 arg0) {
		@Pc(22) Class6_Sub2_Sub14 local22;
		if (this.aClass6_Sub2_Sub14_5 == null && this.aBoolean432) {
			@Pc(33) Class202 local33 = this.method5224(arg0, 262144, true);
			local22 = local33 == null ? null : local33.aClass6_Sub2_Sub14_4;
		} else {
			local22 = this.aClass6_Sub2_Sub14_5;
			this.aClass6_Sub2_Sub14_5 = null;
		}
		if (local22 != null) {
			Static272.method4497(local22, this.aByte51, super.anInt6071, super.anInt6067, null);
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		if (this.aClass20_5 == null) {
			return null;
		}
		@Pc(17) Class54 local17 = arg0.method6851();
		local17.GA(super.anInt6071, super.anInt6066, super.anInt6067);
		@Pc(27) Class98_Sub8 local27 = null;
		if (this.aBoolean433) {
			local27 = Static348.method5326(1);
		}
		this.aClass20_5.method7256(local17, local27 == null ? null : local27.aClass98_Sub5Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "(B)V")
	@Override
	public void method7782() {
		this.aBoolean430 = false;
		if (this.aClass20_5 != null) {
			this.aClass20_5.ia(this.aClass20_5.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class20 method6269(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1) {
		return this.method5225(arg1, arg0);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)I")
	@Override
	public int method6265() {
		return this.aShort77 & 0xFFFF;
	}
}
