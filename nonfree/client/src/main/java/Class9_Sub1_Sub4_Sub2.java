import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class9_Sub1_Sub4_Sub2 extends Class9_Sub1_Sub4 implements Interface22 {

	@OriginalMember(owner = "client!rj", name = "Y", descriptor = "Lclient!bm;")
	private Class29 aClass29_7;

	@OriginalMember(owner = "client!rj", name = "ab", descriptor = "Z")
	private boolean aBoolean593;

	@OriginalMember(owner = "client!rj", name = "P", descriptor = "B")
	private final byte aByte105;

	@OriginalMember(owner = "client!rj", name = "H", descriptor = "Z")
	private final boolean aBoolean590;

	@OriginalMember(owner = "client!rj", name = "M", descriptor = "S")
	private final short aShort104;

	@OriginalMember(owner = "client!rj", name = "gb", descriptor = "B")
	private final byte aByte106;

	@OriginalMember(owner = "client!rj", name = "N", descriptor = "Z")
	private final boolean aBoolean591;

	@OriginalMember(owner = "client!rj", name = "Q", descriptor = "Z")
	private final boolean aBoolean592;

	@OriginalMember(owner = "client!rj", name = "ib", descriptor = "Lclient!da;")
	public Class57 aClass57_6;

	@OriginalMember(owner = "client!rj", name = "jb", descriptor = "Lclient!ha;")
	private Class3_Sub3_Sub10 aClass3_Sub3_Sub10_5;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!r;Lclient!bd;IIIIIZIIZ)V")
	public Class9_Sub1_Sub4_Sub2(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static385.method5696(arg8, arg9));
		super.anInt8980 = arg6;
		this.aBoolean593 = arg10;
		this.aByte105 = (byte) arg8;
		this.aBoolean590 = arg1.anInt772 != 0 && !arg7;
		this.aShort104 = (short) arg1.anInt764;
		this.aByte106 = (byte) arg9;
		this.aBoolean591 = arg7;
		super.anInt8975 = arg4;
		this.aBoolean592 = arg0.method7162() && arg1.aBoolean66 && !this.aBoolean591 && Static278.aClass3_Sub13_Sub1_1.method4464(Static260.anInt4932) != 0;
		@Pc(72) int local72 = 2048;
		if (this.aBoolean593) {
			local72 |= 0x10000;
		}
		@Pc(87) Class163 local87 = this.method6363(local72, this.aBoolean592, arg0);
		if (local87 != null) {
			this.aClass57_6 = local87.aClass57_5;
			this.aClass3_Sub3_Sub10_5 = local87.aClass3_Sub3_Sub10_4;
			if (this.aBoolean593) {
				this.aClass57_6 = this.aClass57_6.method7522((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)I")
	@Override
	public int method7091() {
		return this.aByte105;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!r;BII)Z")
	@Override
	public boolean method7474(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class57 local9 = this.method6364(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class109 local14 = arg0.method7142();
			local14.NA(super.anInt8975, super.anInt8977, super.anInt8980);
			return Static225.aBoolean335 ? local9.method7509(arg1, arg2, local14, false, Static354.anInt6136) : local9.method7507(arg1, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILclient!gfa;IILclient!r;Z)V")
	@Override
	public void method7479(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class43 arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 instanceof Class9_Sub1_Sub4_Sub2) {
			@Pc(15) Class9_Sub1_Sub4_Sub2 local15 = (Class9_Sub1_Sub4_Sub2) arg1;
			if (this.aClass57_6 != null && local15.aClass57_6 != null) {
				this.aClass57_6.method7524(local15.aClass57_6, arg0, arg3, arg2, arg5);
			}
		} else if (arg1 instanceof Class9_Sub1_Sub1_Sub1) {
			@Pc(37) Class9_Sub1_Sub1_Sub1 local37 = (Class9_Sub1_Sub1_Sub1) arg1;
			if (this.aClass57_6 != null && local37.aClass57_1 != null) {
				this.aClass57_6.method7524(local37.aClass57_1, arg0, arg3, arg2, arg5);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!r;)Lclient!bm;")
	@Override
	public Class29 method7469(@OriginalArg(1) Class43 arg0) {
		if (this.aClass29_7 == null) {
			this.aClass29_7 = Static17.method292(super.anInt8980, super.anInt8977, this.method6364(0, arg0), super.anInt8975);
		}
		return this.aClass29_7;
	}

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7481() {
		return true;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7087(@OriginalArg(0) Class43 arg0) {
		@Pc(29) Class3_Sub3_Sub10 local29;
		if (this.aClass3_Sub3_Sub10_5 == null && this.aBoolean592) {
			@Pc(22) Class163 local22 = this.method6363(262144, true, arg0);
			local29 = local22 == null ? null : local22.aClass3_Sub3_Sub10_4;
		} else {
			local29 = this.aClass3_Sub3_Sub10_5;
			this.aClass3_Sub3_Sub10_5 = null;
		}
		if (local29 != null) {
			Static27.method527(local29, super.aByte125, super.anInt8975, super.anInt8980, null);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
	@Override
	public void method7090() {
		if (this.aClass57_6 != null) {
			this.aClass57_6.method7517();
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7471(@OriginalArg(1) Class43 arg0) {
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)I")
	@Override
	public int method7093() {
		return this.aByte106;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZLclient!r;B)Lclient!je;")
	private Class163 method6363(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class43 arg2) {
		@Pc(20) Class23 local20 = Static476.aClass69_5.method2181(this.aShort104 & 0xFFFF);
		@Pc(32) Class139 local32;
		@Pc(27) Class139 local27;
		if (this.aBoolean591) {
			local27 = Static374.aClass139Array17[0];
			local32 = Static168.aClass139Array22[super.aByte125];
		} else {
			local32 = Static374.aClass139Array17[super.aByte125];
			if (super.aByte125 < 3) {
				local27 = Static374.aClass139Array17[super.aByte125 + 1];
			} else {
				local27 = null;
			}
		}
		return local20.method580(arg1, local27, super.anInt8975, arg0, this.aByte106, this.aByte105, super.anInt8977, arg2, local32, super.anInt8980);
	}

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)I")
	@Override
	public int method7478() {
		return this.aClass57_6 == null ? 0 : this.aClass57_6.J();
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(ILclient!r;)Lclient!fe;")
	@Override
	public Class9_Sub2 method7480(@OriginalArg(1) Class43 arg0) {
		if (this.aClass57_6 == null) {
			return null;
		}
		@Pc(17) Class109 local17 = arg0.method7142();
		local17.NA(super.anInt8975, super.anInt8977, super.anInt8980);
		@Pc(27) Class9_Sub2 local27 = null;
		if (this.aBoolean590) {
			local27 = Static88.method1977(1);
		}
		if (Static225.aBoolean335) {
			this.aClass57_6.method7521(local17, local27 == null ? null : local27.aClass9_Sub9Array1[0], Static354.anInt6136, 0);
		} else {
			this.aClass57_6.method7501(local17, local27 == null ? null : local27.aClass9_Sub9Array1[0], 0);
		}
		return local27;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(Z)I")
	@Override
	public int method7482(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aClass57_6 == null ? 0 : this.aClass57_6.RA();
		} else {
			return -36;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZLclient!r;)Lclient!da;")
	private Class57 method6364(@OriginalArg(0) int arg0, @OriginalArg(2) Class43 arg1) {
		if (this.aClass57_6 != null && arg1.method7169(this.aClass57_6.PA(), arg0) == 0) {
			return this.aClass57_6;
		} else {
			@Pc(26) Class163 local26 = this.method6363(arg0, false, arg1);
			return local26 == null ? null : local26.aClass57_5;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7089(@OriginalArg(1) Class43 arg0) {
		@Pc(25) Class3_Sub3_Sub10 local25;
		if (this.aClass3_Sub3_Sub10_5 == null && this.aBoolean592) {
			@Pc(18) Class163 local18 = this.method6363(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass3_Sub3_Sub10_4;
		} else {
			local25 = this.aClass3_Sub3_Sub10_5;
			this.aClass3_Sub3_Sub10_5 = null;
		}
		if (local25 != null) {
			Static94.method2077(local25, super.aByte125, super.anInt8975, super.anInt8980, null);
		}
	}

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V")
	@Override
	public void method7477() {
		this.aBoolean593 = false;
		if (this.aClass57_6 != null) {
			this.aClass57_6.SA(this.aClass57_6.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7483() {
		return this.aBoolean593;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7092() {
		return this.aBoolean592;
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7473() {
		return this.aClass57_6 == null ? false : this.aClass57_6.LA();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)I")
	@Override
	public int method7088() {
		return this.aShort104 & 0xFFFF;
	}
}
