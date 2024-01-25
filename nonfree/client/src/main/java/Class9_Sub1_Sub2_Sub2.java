import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class9_Sub1_Sub2_Sub2 extends Class9_Sub1_Sub2 implements Interface22 {

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "Lclient!bm;")
	private Class29 aClass29_5;

	@OriginalMember(owner = "client!hc", name = "N", descriptor = "S")
	private final short aShort48;

	@OriginalMember(owner = "client!hc", name = "Z", descriptor = "B")
	private final byte aByte53;

	@OriginalMember(owner = "client!hc", name = "P", descriptor = "Z")
	private boolean aBoolean281;

	@OriginalMember(owner = "client!hc", name = "Y", descriptor = "B")
	private final byte aByte52;

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "Z")
	private final boolean aBoolean282;

	@OriginalMember(owner = "client!hc", name = "cb", descriptor = "Z")
	private final boolean aBoolean283;

	@OriginalMember(owner = "client!hc", name = "X", descriptor = "Lclient!da;")
	private Class57 aClass57_4;

	@OriginalMember(owner = "client!hc", name = "jb", descriptor = "Lclient!ha;")
	private Class3_Sub3_Sub10 aClass3_Sub3_Sub10_3;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!r;Lclient!bd;IIIIIZIIII)V")
	public Class9_Sub1_Sub2_Sub2(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aShort48 = (short) arg1.anInt764;
		this.aByte53 = (byte) arg10;
		this.aBoolean281 = arg7;
		super.anInt8980 = arg6;
		this.aByte52 = (byte) arg11;
		super.anInt8975 = arg4;
		this.aBoolean282 = arg1.anInt772 != 0 && !arg7;
		this.aBoolean283 = arg0.method7162() && arg1.aBoolean66 && !this.aBoolean281 && Static278.aClass3_Sub13_Sub1_1.method4464(Static260.anInt4932) != 0;
		@Pc(70) Class163 local70 = this.method3222(this.aBoolean283, 2048, arg0);
		if (local70 != null) {
			this.aClass57_4 = local70.aClass57_5;
			this.aClass3_Sub3_Sub10_3 = local70.aClass3_Sub3_Sub10_4;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!r;BII)Z")
	@Override
	public boolean method7474(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class57 local17 = this.method3223(arg0, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class109 local22 = arg0.method7142();
			local22.NA(super.anInt8975, super.anInt8977, super.anInt8980);
			return Static225.aBoolean335 ? local17.method7509(arg1, arg2, local22, false, Static354.anInt6136) : local17.method7507(arg1, arg2, local22, false);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZILclient!r;B)Lclient!je;")
	private Class163 method3222(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class43 arg2) {
		@Pc(13) Class23 local13 = Static476.aClass69_5.method2181(this.aShort48 & 0xFFFF);
		@Pc(26) Class139 local26;
		@Pc(32) Class139 local32;
		if (this.aBoolean281) {
			local32 = Static374.aClass139Array17[0];
			local26 = Static168.aClass139Array22[super.aByte125];
		} else {
			local26 = Static374.aClass139Array17[super.aByte125];
			if (super.aByte125 >= 3) {
				local32 = null;
			} else {
				local32 = Static374.aClass139Array17[super.aByte125 + 1];
			}
		}
		return local13.method580(arg0, local32, super.anInt8975, arg1, this.aByte52, this.aByte53, super.anInt8977, arg2, local26, super.anInt8980);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
	@Override
	public void method7090() {
		if (this.aClass57_4 != null) {
			this.aClass57_4.method7517();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7092() {
		return this.aBoolean283;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(Z)I")
	@Override
	public int method7482(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.aBoolean281 = true;
		}
		return this.aClass57_4 == null ? 0 : this.aClass57_4.RA();
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(ILclient!r;)Lclient!fe;")
	@Override
	public Class9_Sub2 method7480(@OriginalArg(1) Class43 arg0) {
		if (this.aClass57_4 == null) {
			return null;
		}
		@Pc(11) Class109 local11 = arg0.method7142();
		local11.NA(super.aShort47 + super.anInt8975, super.anInt8977, super.aShort46 + super.anInt8980);
		@Pc(27) Class9_Sub2 local27 = null;
		if (this.aBoolean282) {
			local27 = Static88.method1977(1);
		}
		if (Static225.aBoolean335) {
			this.aClass57_4.method7521(local11, local27 == null ? null : local27.aClass9_Sub9Array1[0], Static354.anInt6136, 0);
		} else {
			this.aClass57_4.method7501(local11, local27 == null ? null : local27.aClass9_Sub9Array1[0], 0);
		}
		return local27;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)I")
	@Override
	public int method7091() {
		return this.aByte53;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7089(@OriginalArg(1) Class43 arg0) {
		@Pc(14) Class3_Sub3_Sub10 local14;
		if (this.aClass3_Sub3_Sub10_3 == null && this.aBoolean283) {
			@Pc(25) Class163 local25 = this.method3222(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass3_Sub3_Sub10_4;
		} else {
			local14 = this.aClass3_Sub3_Sub10_3;
			this.aClass3_Sub3_Sub10_3 = null;
		}
		if (local14 != null) {
			Static94.method2077(local14, super.aByte125, super.anInt8975, super.anInt8980, null);
		}
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7473() {
		return this.aClass57_4 == null ? false : this.aClass57_4.LA();
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)I")
	@Override
	public int method7478() {
		return this.aClass57_4 == null ? 0 : this.aClass57_4.J();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7471(@OriginalArg(1) Class43 arg0) {
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!r;II)Lclient!da;")
	private Class57 method3223(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass57_4 != null && arg0.method7169(this.aClass57_4.PA(), arg1) == 0) {
			return this.aClass57_4;
		} else {
			@Pc(26) Class163 local26 = this.method3222(false, arg1, arg0);
			return local26 == null ? null : local26.aClass57_5;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)I")
	@Override
	public int method7088() {
		return this.aShort48 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7481() {
		return true;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!r;)Lclient!bm;")
	@Override
	public Class29 method7469(@OriginalArg(1) Class43 arg0) {
		if (this.aClass29_5 == null) {
			this.aClass29_5 = Static17.method292(super.anInt8980, super.anInt8977, this.method3223(arg0, 0), super.anInt8975);
		}
		return this.aClass29_5;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)I")
	@Override
	public int method7093() {
		return this.aByte52;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7087(@OriginalArg(0) Class43 arg0) {
		@Pc(21) Class3_Sub3_Sub10 local21;
		if (this.aClass3_Sub3_Sub10_3 == null && this.aBoolean283) {
			@Pc(32) Class163 local32 = this.method3222(true, 262144, arg0);
			local21 = local32 == null ? null : local32.aClass3_Sub3_Sub10_4;
		} else {
			local21 = this.aClass3_Sub3_Sub10_3;
			this.aClass3_Sub3_Sub10_3 = null;
		}
		if (local21 != null) {
			Static27.method527(local21, super.aByte125, super.anInt8975, super.anInt8980, null);
		}
	}
}
