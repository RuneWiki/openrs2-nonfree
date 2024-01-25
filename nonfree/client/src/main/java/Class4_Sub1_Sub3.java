import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class4_Sub1_Sub3 extends Class4_Sub1 implements Interface18 {

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "Lclient!qt;")
	private Class277 aClass277_3;

	@OriginalMember(owner = "client!fi", name = "F", descriptor = "Z")
	private final boolean aBoolean224;

	@OriginalMember(owner = "client!fi", name = "H", descriptor = "Z")
	private boolean aBoolean225;

	@OriginalMember(owner = "client!fi", name = "cb", descriptor = "B")
	private final byte aByte31;

	@OriginalMember(owner = "client!fi", name = "X", descriptor = "S")
	private final short aShort33;

	@OriginalMember(owner = "client!fi", name = "ab", descriptor = "B")
	private final byte aByte30;

	@OriginalMember(owner = "client!fi", name = "P", descriptor = "Z")
	private final boolean aBoolean226;

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "B")
	private final byte aByte29;

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "Z")
	private final boolean aBoolean223;

	@OriginalMember(owner = "client!fi", name = "E", descriptor = "Lclient!ba;")
	public Class20 aClass20_2;

	@OriginalMember(owner = "client!fi", name = "eb", descriptor = "Lclient!w;")
	private Class6_Sub2_Sub14 aClass6_Sub2_Sub14_2;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!oa;Lclient!pg;IIIIIZIIIIIIZ)V")
	public Class4_Sub1_Sub3(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class252 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt6928 == 1, Static354.method6825(arg13, arg12));
		this.aBoolean224 = arg1.anInt6889 != 0 && !arg7;
		this.aBoolean225 = arg14;
		this.aByte31 = (byte) arg13;
		this.aShort33 = (short) arg1.anInt6905;
		this.aByte30 = (byte) arg12;
		this.aBoolean226 = arg7;
		this.aByte29 = (byte) arg3;
		this.aBoolean223 = arg0.method6849() && arg1.aBoolean476 && !this.aBoolean226 && Static140.aClass6_Sub48_Sub1_1.method7374(Static560.anInt9242) != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean225) {
			local80 |= 0x10000;
		}
		@Pc(95) Class202 local95 = this.method2736(local80, arg0, this.aBoolean223);
		if (local95 != null) {
			this.aClass20_2 = local95.aClass20_4;
			this.aClass6_Sub2_Sub14_2 = local95.aClass6_Sub2_Sub14_4;
			if (this.aBoolean225) {
				this.aClass20_2 = this.aClass20_2.method7264((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)I")
	@Override
	public int method6272() {
		return this.aByte31;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	@Override
	public void method6266() {
		if (this.aClass20_2 != null) {
			this.aClass20_2.method7271();
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7785() {
		return this.aBoolean225;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		if (this.aClass277_3 == null) {
			this.aClass277_3 = Static323.method5117(this.method2739(arg0, 0), super.anInt9540, super.anInt9541, super.anInt9542);
		}
		return this.aClass277_3;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	@Override
	public void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 instanceof Class4_Sub5_Sub3) {
			@Pc(13) Class4_Sub5_Sub3 local13 = (Class4_Sub5_Sub3) arg2;
			if (this.aClass20_2 != null && local13.aClass20_7 != null) {
				this.aClass20_2.method7258(local13.aClass20_7, arg5, arg3, arg4, arg0);
			}
		} else if (arg2 instanceof Class4_Sub1_Sub3) {
			@Pc(35) Class4_Sub1_Sub3 local35 = (Class4_Sub1_Sub3) arg2;
			if (this.aClass20_2 != null && local35.aClass20_2 != null) {
				this.aClass20_2.method7258(local35.aClass20_2, arg5, arg3, arg4, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6271() {
		return this.aBoolean223;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method6270(@OriginalArg(0) Class14 arg0) {
		@Pc(20) Class6_Sub2_Sub14 local20;
		if (this.aClass6_Sub2_Sub14_2 == null && this.aBoolean223) {
			@Pc(31) Class202 local31 = this.method2736(262144, arg0, true);
			local20 = local31 == null ? null : local31.aClass6_Sub2_Sub14_4;
		} else {
			local20 = this.aClass6_Sub2_Sub14_2;
			this.aClass6_Sub2_Sub14_2 = null;
		}
		if (local20 != null) {
			Static60.method1249(local20, this.aByte29, super.anInt9542, super.anInt9540, null);
		}
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)I")
	public int method2735() {
		return this.aClass20_2 == null ? 15 : this.aClass20_2.ZA() / 4;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class20 method6269(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1) {
		return this.method2739(arg0, arg1);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)I")
	@Override
	public int method6265() {
		return this.aShort33 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V")
	@Override
	public void method7782() {
		this.aBoolean225 = false;
		if (this.aClass20_2 != null) {
			this.aClass20_2.ia(this.aClass20_2.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
	@Override
	public int method6268() {
		return this.aByte30;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!oa;IZ)Lclient!m;")
	private Class202 method2736(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class252 local13 = Static412.aClass307_4.method6636(this.aShort33 & 0xFFFF);
		@Pc(21) Class59 local21;
		@Pc(25) Class59 local25;
		if (this.aBoolean226) {
			local21 = Static49.aClass59Array2[this.aByte29];
			local25 = Static273.aClass59Array4[0];
		} else {
			local21 = Static273.aClass59Array4[this.aByte29];
			if (this.aByte29 < 3) {
				local25 = Static273.aClass59Array4[this.aByte29 + 1];
			} else {
				local25 = null;
			}
		}
		return local13.method5785(local25, super.anInt9540, this.aByte30 == 11 ? this.aByte31 + 4 : this.aByte31, super.anInt9542, arg0, local21, super.anInt9541, this.aByte30 == 11 ? 10 : this.aByte30, arg2, arg1);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class20 local17 = this.method2739(arg1, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class54 local22 = arg1.method6851();
			local22.GA(super.anInt9542, super.anInt9541, super.anInt9540);
			return local17.method7266(arg2, arg0, local22, false);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method6267(@OriginalArg(0) Class14 arg0) {
		@Pc(14) Class6_Sub2_Sub14 local14;
		if (this.aClass6_Sub2_Sub14_2 == null && this.aBoolean223) {
			@Pc(25) Class202 local25 = this.method2736(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass6_Sub2_Sub14_4;
		} else {
			local14 = this.aClass6_Sub2_Sub14_2;
			this.aClass6_Sub2_Sub14_2 = null;
		}
		if (local14 != null) {
			Static272.method4497(local14, this.aByte29, super.anInt9542, super.anInt9540, null);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		if (this.aClass20_2 == null) {
			return null;
		}
		@Pc(11) Class54 local11 = arg0.method6851();
		local11.GA(super.anInt9542, super.anInt9541, super.anInt9540);
		@Pc(27) Class98_Sub8 local27 = null;
		if (this.aBoolean224) {
			local27 = Static348.method5326(1);
		}
		this.aClass20_2.method7256(local11, local27 == null ? null : local27.aClass98_Sub5Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	private Class20 method2739(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass20_2 != null && arg0.method6884(this.aClass20_2.h(), arg1) == 0) {
			return this.aClass20_2;
		} else {
			@Pc(33) Class202 local33 = this.method2736(arg1, arg0, false);
			return local33 == null ? null : local33.aClass20_4;
		}
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)I")
	@Override
	public int method7790() {
		return this.aClass20_2 == null ? 0 : this.aClass20_2.DA();
	}
}
