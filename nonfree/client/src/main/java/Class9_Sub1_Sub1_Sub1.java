import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class9_Sub1_Sub1_Sub1 extends Class9_Sub1_Sub1 implements Interface22 {

	@OriginalMember(owner = "client!aga", name = "fb", descriptor = "Lclient!bm;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!aga", name = "cb", descriptor = "Z")
	private boolean aBoolean17;

	@OriginalMember(owner = "client!aga", name = "nb", descriptor = "Z")
	private final boolean aBoolean18;

	@OriginalMember(owner = "client!aga", name = "ob", descriptor = "S")
	private final short aShort9;

	@OriginalMember(owner = "client!aga", name = "rb", descriptor = "Z")
	private final boolean aBoolean19;

	@OriginalMember(owner = "client!aga", name = "X", descriptor = "B")
	private final byte aByte9;

	@OriginalMember(owner = "client!aga", name = "vb", descriptor = "B")
	private final byte aByte10;

	@OriginalMember(owner = "client!aga", name = "M", descriptor = "Z")
	private final boolean aBoolean15;

	@OriginalMember(owner = "client!aga", name = "V", descriptor = "Lclient!ha;")
	private Class3_Sub3_Sub10 aClass3_Sub3_Sub10_1;

	@OriginalMember(owner = "client!aga", name = "wb", descriptor = "Lclient!da;")
	public Class57 aClass57_1;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!r;Lclient!bd;IIIIIZIIIIIIZ)V")
	public Class9_Sub1_Sub1_Sub1(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt756 == 1, Static249.method4041(arg12, arg13));
		this.aBoolean17 = arg14;
		super.aByte125 = (byte) arg3;
		this.aBoolean18 = arg7;
		this.aShort9 = (short) arg1.anInt764;
		this.aBoolean19 = arg1.anInt772 != 0 && !arg7;
		this.aByte9 = (byte) arg13;
		this.aByte10 = (byte) arg12;
		this.aBoolean15 = arg0.method7162() && arg1.aBoolean66 && !this.aBoolean18 && Static278.aClass3_Sub13_Sub1_1.method4464(Static260.anInt4932) != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean17) {
			local77 |= 0x10000;
		}
		@Pc(92) Class163 local92 = this.method230(this.aBoolean15, local77, arg0);
		if (local92 != null) {
			this.aClass3_Sub3_Sub10_1 = local92.aClass3_Sub3_Sub10_4;
			this.aClass57_1 = local92.aClass57_5;
			if (this.aBoolean17) {
				this.aClass57_1 = this.aClass57_1.method7522((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(B)I")
	@Override
	public int method7093() {
		return this.aByte9;
	}

	@OriginalMember(owner = "client!aga", name = "f", descriptor = "(I)I")
	@Override
	public int method7478() {
		return this.aClass57_1 == null ? 0 : this.aClass57_1.J();
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ILclient!r;)Lclient!bm;")
	@Override
	public Class29 method7469(@OriginalArg(1) Class43 arg0) {
		if (this.aClass29_1 == null) {
			this.aClass29_1 = Static17.method292(super.anInt8980, super.anInt8977, this.method229(0, arg0), super.anInt8975);
		}
		return this.aClass29_1;
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(B)I")
	@Override
	public int method7091() {
		return this.aByte10;
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(Z)I")
	@Override
	public int method7482(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aClass57_1 == null ? 0 : this.aClass57_1.RA();
		} else {
			return 56;
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7087(@OriginalArg(0) Class43 arg0) {
		@Pc(29) Class3_Sub3_Sub10 local29;
		if (this.aClass3_Sub3_Sub10_1 == null && this.aBoolean15) {
			@Pc(22) Class163 local22 = this.method230(true, 262144, arg0);
			local29 = local22 == null ? null : local22.aClass3_Sub3_Sub10_4;
		} else {
			local29 = this.aClass3_Sub3_Sub10_1;
			this.aClass3_Sub3_Sub10_1 = null;
		}
		if (local29 != null) {
			Static27.method527(local29, super.aByte125, super.anInt8975, super.anInt8980, null);
		}
	}

	@OriginalMember(owner = "client!aga", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7483() {
		return this.aBoolean17;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IBLclient!r;)Lclient!da;")
	private Class57 method229(@OriginalArg(0) int arg0, @OriginalArg(2) Class43 arg1) {
		if (this.aClass57_1 != null && arg1.method7169(this.aClass57_1.PA(), arg0) == 0) {
			return this.aClass57_1;
		} else {
			@Pc(32) Class163 local32 = this.method230(false, arg0, arg1);
			return local32 == null ? null : local32.aClass57_5;
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)I")
	@Override
	public int method7088() {
		return this.aShort9 & 0xFFFF;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7092() {
		return this.aBoolean15;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IILclient!gfa;IILclient!r;Z)V")
	@Override
	public void method7479(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class43 arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 instanceof Class9_Sub1_Sub4_Sub2) {
			@Pc(9) Class9_Sub1_Sub4_Sub2 local9 = (Class9_Sub1_Sub4_Sub2) arg1;
			if (this.aClass57_1 != null && local9.aClass57_6 != null) {
				this.aClass57_1.method7524(local9.aClass57_6, arg0, arg3, arg2, arg5);
			}
		} else if (arg1 instanceof Class9_Sub1_Sub1_Sub1) {
			@Pc(32) Class9_Sub1_Sub1_Sub1 local32 = (Class9_Sub1_Sub1_Sub1) arg1;
			if (this.aClass57_1 != null && local32.aClass57_1 != null) {
				this.aClass57_1.method7524(local32.aClass57_1, arg0, arg3, arg2, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7473() {
		return this.aClass57_1 == null ? false : this.aClass57_1.LA();
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7471(@OriginalArg(1) Class43 arg0) {
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(ILclient!r;)Lclient!fe;")
	@Override
	public Class9_Sub2 method7480(@OriginalArg(1) Class43 arg0) {
		if (this.aClass57_1 == null) {
			return null;
		}
		@Pc(11) Class109 local11 = arg0.method7142();
		local11.NA(super.anInt8975, super.anInt8977, super.anInt8980);
		@Pc(21) Class9_Sub2 local21 = null;
		if (this.aBoolean19) {
			local21 = Static88.method1977(1);
		}
		if (Static225.aBoolean335) {
			this.aClass57_1.method7521(local11, local21 == null ? null : local21.aClass9_Sub9Array1[0], Static354.anInt6136, 0);
		} else {
			this.aClass57_1.method7501(local11, local21 == null ? null : local21.aClass9_Sub9Array1[0], 0);
		}
		return local21;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)V")
	@Override
	public void method7090() {
		if (this.aClass57_1 != null) {
			this.aClass57_1.method7517();
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZIILclient!r;)Lclient!je;")
	private Class163 method230(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class43 arg2) {
		@Pc(18) Class23 local18 = Static476.aClass69_5.method2181(this.aShort9 & 0xFFFF);
		@Pc(43) Class139 local43;
		@Pc(29) Class139 local29;
		if (this.aBoolean18) {
			local43 = Static168.aClass139Array22[super.aByte125];
			local29 = Static374.aClass139Array17[0];
		} else {
			if (super.aByte125 >= 3) {
				local29 = null;
			} else {
				local29 = Static374.aClass139Array17[super.aByte125 + 1];
			}
			local43 = Static374.aClass139Array17[super.aByte125];
		}
		return local18.method580(arg0, local29, super.anInt8975, arg1, this.aByte10 == 11 ? this.aByte9 + 4 : this.aByte9, this.aByte10 == 11 ? 10 : this.aByte10, super.anInt8977, arg2, local43, super.anInt8980);
	}

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7481() {
		return true;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!r;BII)Z")
	@Override
	public boolean method7474(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class57 local9 = this.method229(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class109 local14 = arg0.method7142();
			local14.NA(super.anInt8975, super.anInt8977, super.anInt8980);
			return Static225.aBoolean335 ? local9.method7509(arg1, arg2, local14, false, Static354.anInt6136) : local9.method7507(arg1, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!aga", name = "j", descriptor = "(I)I")
	public int method231() {
		return this.aClass57_1 == null ? 15 : this.aClass57_1.K() / 4;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7089(@OriginalArg(1) Class43 arg0) {
		@Pc(20) Class3_Sub3_Sub10 local20;
		if (this.aClass3_Sub3_Sub10_1 == null && this.aBoolean15) {
			@Pc(31) Class163 local31 = this.method230(true, 262144, arg0);
			local20 = local31 == null ? null : local31.aClass3_Sub3_Sub10_4;
		} else {
			local20 = this.aClass3_Sub3_Sub10_1;
			this.aClass3_Sub3_Sub10_1 = null;
		}
		if (local20 != null) {
			Static94.method2077(local20, super.aByte125, super.anInt8975, super.anInt8980, null);
		}
	}

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "(I)V")
	@Override
	public void method7477() {
		this.aBoolean17 = false;
		if (this.aClass57_1 != null) {
			this.aClass57_1.SA(this.aClass57_1.PA() & 0xFFFEFFFF);
		}
	}
}
