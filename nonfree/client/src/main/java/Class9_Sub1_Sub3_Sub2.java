import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class9_Sub1_Sub3_Sub2 extends Class9_Sub1_Sub3 implements Interface22 {

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "Lclient!bm;")
	private Class29 aClass29_4;

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "B")
	private final byte aByte44;

	@OriginalMember(owner = "client!fd", name = "ab", descriptor = "S")
	private final short aShort43;

	@OriginalMember(owner = "client!fd", name = "W", descriptor = "Z")
	private boolean aBoolean247;

	@OriginalMember(owner = "client!fd", name = "cb", descriptor = "Z")
	private final boolean aBoolean248;

	@OriginalMember(owner = "client!fd", name = "eb", descriptor = "Z")
	private boolean aBoolean249;

	@OriginalMember(owner = "client!fd", name = "O", descriptor = "Z")
	private final boolean aBoolean246;

	@OriginalMember(owner = "client!fd", name = "gb", descriptor = "Lclient!da;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!fd", name = "jb", descriptor = "Lclient!ha;")
	private Class3_Sub3_Sub10 aClass3_Sub3_Sub10_2;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!r;Lclient!bd;IIIIIZIZ)V")
	public Class9_Sub1_Sub3_Sub2(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt761);
		this.aByte44 = (byte) arg8;
		this.aShort43 = (short) arg1.anInt764;
		this.aBoolean247 = arg7;
		super.anInt8980 = arg6;
		this.aBoolean248 = arg1.anInt772 != 0 && !arg7;
		super.anInt8975 = arg4;
		this.aBoolean249 = arg9;
		this.aBoolean246 = arg0.method7162() && arg1.aBoolean66 && !this.aBoolean247 && Static278.aClass3_Sub13_Sub1_1.method4464(Static260.anInt4932) != 0;
		@Pc(60) int local60 = 2048;
		if (this.aBoolean249) {
			local60 |= 0x10000;
		}
		@Pc(75) Class163 local75 = this.method2647(this.aBoolean246, local60, arg0);
		if (local75 != null) {
			this.aClass57_3 = local75.aClass57_5;
			this.aClass3_Sub3_Sub10_2 = local75.aClass3_Sub3_Sub10_4;
			if (this.aBoolean249) {
				this.aClass57_3 = this.aClass57_3.method7522((byte) 0, local60, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7471(@OriginalArg(1) Class43 arg0) {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	@Override
	public void method7090() {
		if (this.aClass57_3 != null) {
			this.aClass57_3.method7517();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!r;)Lclient!bm;")
	@Override
	public Class29 method7469(@OriginalArg(1) Class43 arg0) {
		if (this.aClass29_4 == null) {
			this.aClass29_4 = Static17.method292(super.anInt8980, super.anInt8977, this.method2646(0, arg0), super.anInt8975);
		}
		return this.aClass29_4;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILclient!r;)Lclient!da;")
	private Class57 method2646(@OriginalArg(1) int arg0, @OriginalArg(2) Class43 arg1) {
		if (this.aClass57_3 != null && arg1.method7169(this.aClass57_3.PA(), arg0) == 0) {
			return this.aClass57_3;
		} else {
			@Pc(33) Class163 local33 = this.method2647(false, arg0, arg1);
			return local33 == null ? null : local33.aClass57_5;
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)I")
	@Override
	public int method7093() {
		return this.aByte44;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7092() {
		return this.aBoolean246;
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)I")
	@Override
	public int method7478() {
		return this.aClass57_3 == null ? 0 : this.aClass57_3.J();
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)I")
	@Override
	public int method7091() {
		return 22;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7089(@OriginalArg(1) Class43 arg0) {
		@Pc(14) Class3_Sub3_Sub10 local14;
		if (this.aClass3_Sub3_Sub10_2 == null && this.aBoolean246) {
			@Pc(25) Class163 local25 = this.method2647(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass3_Sub3_Sub10_4;
		} else {
			local14 = this.aClass3_Sub3_Sub10_2;
			this.aClass3_Sub3_Sub10_2 = null;
		}
		if (local14 != null) {
			Static94.method2077(local14, super.aByte125, super.anInt8975, super.anInt8980, null);
		}
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7481() {
		return true;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!r;BII)Z")
	@Override
	public boolean method7474(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class57 local17 = this.method2646(131072, arg0);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class109 local22 = arg0.method7142();
			local22.NA(super.anInt8975, super.anInt8977, super.anInt8980);
			return Static225.aBoolean335 ? local17.method7509(arg1, arg2, local22, false, Static354.anInt6136) : local17.method7507(arg1, arg2, local22, false);
		}
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7473() {
		return this.aClass57_3 == null ? false : this.aClass57_3.LA();
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7483() {
		return this.aBoolean249;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7087(@OriginalArg(0) Class43 arg0) {
		@Pc(29) Class3_Sub3_Sub10 local29;
		if (this.aClass3_Sub3_Sub10_2 == null && this.aBoolean246) {
			@Pc(22) Class163 local22 = this.method2647(true, 262144, arg0);
			local29 = local22 == null ? null : local22.aClass3_Sub3_Sub10_4;
		} else {
			local29 = this.aClass3_Sub3_Sub10_2;
			this.aClass3_Sub3_Sub10_2 = null;
		}
		if (local29 != null) {
			Static27.method527(local29, super.aByte125, super.anInt8975, super.anInt8980, null);
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(ILclient!r;)Lclient!fe;")
	@Override
	public Class9_Sub2 method7480(@OriginalArg(1) Class43 arg0) {
		if (this.aClass57_3 == null) {
			return null;
		}
		@Pc(18) Class109 local18 = arg0.method7142();
		local18.NA(super.anInt8975, super.anInt8977, super.anInt8980);
		@Pc(28) Class9_Sub2 local28 = null;
		if (this.aBoolean248) {
			local28 = Static88.method1977(1);
		}
		if (Static225.aBoolean335) {
			this.aClass57_3.method7521(local18, local28 == null ? null : local28.aClass9_Sub9Array1[0], Static354.anInt6136, 0);
		} else {
			this.aClass57_3.method7501(local18, local28 == null ? null : local28.aClass9_Sub9Array1[0], 0);
		}
		return local28;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I")
	@Override
	public int method7088() {
		return this.aShort43 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(Z)I")
	@Override
	public int method7482(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.aBoolean247 = false;
		}
		return this.aClass57_3 == null ? 0 : this.aClass57_3.RA();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZILclient!r;B)Lclient!je;")
	private Class163 method2647(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class43 arg2) {
		@Pc(21) Class23 local21 = Static476.aClass69_5.method2181(this.aShort43 & 0xFFFF);
		@Pc(29) Class139 local29;
		@Pc(42) Class139 local42;
		if (this.aBoolean247) {
			local29 = Static168.aClass139Array22[super.aByte125];
			local42 = Static374.aClass139Array17[0];
		} else {
			local29 = Static374.aClass139Array17[super.aByte125];
			if (super.aByte125 < 3) {
				local42 = Static374.aClass139Array17[super.aByte125 + 1];
			} else {
				local42 = null;
			}
		}
		return local21.method580(arg0, local42, super.anInt8975, arg1, this.aByte44, 22, super.anInt8977, arg2, local29, super.anInt8980);
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
	@Override
	public void method7477() {
		this.aBoolean249 = false;
		if (this.aClass57_3 != null) {
			this.aClass57_3.SA(this.aClass57_3.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILclient!gfa;IILclient!r;Z)V")
	@Override
	public void method7479(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class43 arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 instanceof Class9_Sub1_Sub3_Sub2) {
			@Pc(9) Class9_Sub1_Sub3_Sub2 local9 = (Class9_Sub1_Sub3_Sub2) arg1;
			if (this.aClass57_3 != null && local9.aClass57_3 != null) {
				this.aClass57_3.method7524(local9.aClass57_3, arg0, arg3, arg2, arg5);
			}
		}
	}
}
