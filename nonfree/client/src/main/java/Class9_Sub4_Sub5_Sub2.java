import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class9_Sub4_Sub5_Sub2 extends Class9_Sub4_Sub5 implements Interface22 {

	@OriginalMember(owner = "client!vr", name = "S", descriptor = "Lclient!oia;")
	private Class243 aClass243_8;

	@OriginalMember(owner = "client!vr", name = "ob", descriptor = "B")
	private final byte aByte137;

	@OriginalMember(owner = "client!vr", name = "Z", descriptor = "Z")
	private boolean aBoolean819;

	@OriginalMember(owner = "client!vr", name = "I", descriptor = "B")
	private final byte aByte136;

	@OriginalMember(owner = "client!vr", name = "T", descriptor = "S")
	private final short aShort129;

	@OriginalMember(owner = "client!vr", name = "P", descriptor = "Z")
	private final boolean aBoolean817;

	@OriginalMember(owner = "client!vr", name = "nb", descriptor = "Z")
	private final boolean aBoolean820;

	@OriginalMember(owner = "client!vr", name = "R", descriptor = "Z")
	private final boolean aBoolean818;

	@OriginalMember(owner = "client!vr", name = "jb", descriptor = "Lclient!ka;")
	public Class92 aClass92_7;

	@OriginalMember(owner = "client!vr", name = "kb", descriptor = "Lclient!r;")
	private Class6_Sub5_Sub10 aClass6_Sub5_Sub10_6;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!ha;Lclient!vha;IIIIIZIIZ)V")
	public Class9_Sub4_Sub5_Sub2(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static146.method6225(arg8, arg9));
		this.aByte137 = (byte) arg9;
		this.aBoolean819 = arg10;
		this.aByte136 = (byte) arg8;
		this.aShort129 = (short) arg1.anInt10211;
		this.aBoolean817 = arg1.anInt10253 != 0 && !arg7;
		this.aBoolean820 = arg7;
		super.anInt10360 = arg4;
		super.anInt10357 = arg6;
		this.aBoolean818 = arg0.method6134() && arg1.aBoolean793 && !this.aBoolean820 && Static87.aClass6_Sub33_6.aClass14_Sub7_1.method2504() != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean819) {
			local66 |= 0x10000;
		}
		@Pc(81) Class307 local81 = this.method8440(arg0, local66, this.aBoolean818);
		if (local81 != null) {
			this.aClass92_7 = local81.aClass92_4;
			this.aClass6_Sub5_Sub10_6 = local81.aClass6_Sub5_Sub10_3;
			if (this.aBoolean819) {
				this.aClass92_7 = this.aClass92_7.method7069((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(Lclient!ha;I)Lclient!bd;")
	@Override
	public Class9_Sub2 method8410(@OriginalArg(0) Class5 arg0) {
		if (this.aClass92_7 == null) {
			return null;
		}
		@Pc(11) Class115 local11 = arg0.method6156();
		local11.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
		@Pc(25) Class9_Sub2 local25 = Static167.method3172(1, this.aBoolean817);
		if (Static423.aBoolean622) {
			this.aClass92_7.method7057(local11, local25.aClass9_Sub6Array1[0], Static32.anInt849, 0);
		} else {
			this.aClass92_7.method7053(local11, local25.aClass9_Sub6Array1[0], 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)I")
	@Override
	public int method8436() {
		return this.aShort129 & 0xFFFF;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLclient!ha;)Lclient!oia;")
	@Override
	public Class243 method8409(@OriginalArg(1) Class5 arg0) {
		if (this.aClass243_8 == null) {
			this.aClass243_8 = Static126.method2627(super.anInt10365, super.anInt10360, this.method8441(0, arg0), super.anInt10357);
		}
		return this.aClass243_8;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!ha;IIZ)Lclient!sfa;")
	private Class307 method8440(@OriginalArg(0) Class5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class356 local18 = Static249.aClass310_1.method7474(this.aShort129 & 0xFFFF);
		@Pc(43) Class245 local43;
		@Pc(34) Class245 local34;
		if (this.aBoolean820) {
			local43 = Static152.aClass245Array3[super.aByte134];
			local34 = Static150.aClass245Array2[0];
		} else {
			if (super.aByte134 < 3) {
				local34 = Static150.aClass245Array2[super.aByte134 + 1];
			} else {
				local34 = null;
			}
			local43 = Static150.aClass245Array2[super.aByte134];
		}
		return local18.method8321(super.anInt10357, local34, this.aByte137, super.anInt10365, arg2, super.anInt10360, arg1, (Class200) null, local43, arg0, this.aByte136);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!ha;BI)Z")
	@Override
	public boolean method8411(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class92 local9 = this.method8441(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class115 local14 = arg1.method6156();
			local14.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
			return Static423.aBoolean622 ? local9.method7061(arg0, arg2, local14, false, 0, Static32.anInt849) : local9.method7067(arg0, arg2, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8413() {
		if (this.aClass92_7 == null) {
			return true;
		} else {
			return !this.aClass92_7.r();
		}
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(Z)I")
	@Override
	public int method8420(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return 118;
		} else if (this.aClass92_7 == null) {
			return 0;
		} else {
			return this.aClass92_7.ma();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!gg;BZILclient!ha;II)V")
	@Override
	public void method8416(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 instanceof Class9_Sub4_Sub5_Sub2) {
			@Pc(39) Class9_Sub4_Sub5_Sub2 local39 = (Class9_Sub4_Sub5_Sub2) arg0;
			if (this.aClass92_7 == null || local39.aClass92_7 == null) {
				return;
			}
			this.aClass92_7.method7060(local39.aClass92_7, arg2, arg4, arg5, arg1);
		} else if (arg0 instanceof Class9_Sub4_Sub2_Sub2) {
			@Pc(20) Class9_Sub4_Sub2_Sub2 local20 = (Class9_Sub4_Sub2_Sub2) arg0;
			if (this.aClass92_7 != null && local20.aClass92_3 != null) {
				this.aClass92_7.method7060(local20.aClass92_3, arg2, arg4, arg5, arg1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
	@Override
	public void method8433() {
		if (this.aClass92_7 != null) {
			this.aClass92_7.method7054();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8437() {
		return this.aBoolean818;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)I")
	@Override
	public int method8435() {
		return this.aByte136;
	}

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8417() {
		return this.aBoolean819;
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class5 arg0) {
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)I")
	@Override
	public int method8438() {
		return this.aByte137;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IBLclient!ha;)Lclient!ka;")
	private Class92 method8441(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		if (this.aClass92_7 != null && arg1.method6147(this.aClass92_7.ua(), arg0) == 0) {
			return this.aClass92_7;
		} else {
			@Pc(29) Class307 local29 = this.method8440(arg1, arg0, false);
			return local29 == null ? null : local29.aClass92_4;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8434(@OriginalArg(0) Class5 arg0) {
		@Pc(31) Class6_Sub5_Sub10 local31;
		if (this.aClass6_Sub5_Sub10_6 == null && this.aBoolean818) {
			@Pc(24) Class307 local24 = this.method8440(arg0, 262144, true);
			local31 = local24 == null ? null : local24.aClass6_Sub5_Sub10_3;
		} else {
			local31 = this.aClass6_Sub5_Sub10_6;
			this.aClass6_Sub5_Sub10_6 = null;
		}
		if (local31 != null) {
			Static346.method5709(local31, super.aByte134, super.anInt10360, super.anInt10357, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "(B)V")
	@Override
	public void method8427() {
		this.aBoolean819 = false;
		if (this.aClass92_7 != null) {
			this.aClass92_7.s(this.aClass92_7.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.aClass92_7 == null ? 0 : this.aClass92_7.fa();
	}

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8422() {
		return this.aClass92_7 == null ? false : this.aClass92_7.F();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8439(@OriginalArg(1) Class5 arg0) {
		@Pc(31) Class6_Sub5_Sub10 local31;
		if (this.aClass6_Sub5_Sub10_6 == null && this.aBoolean818) {
			@Pc(24) Class307 local24 = this.method8440(arg0, 262144, true);
			local31 = local24 == null ? null : local24.aClass6_Sub5_Sub10_3;
		} else {
			local31 = this.aClass6_Sub5_Sub10_6;
			this.aClass6_Sub5_Sub10_6 = null;
		}
		if (local31 != null) {
			Static471.method4227(local31, super.aByte134, super.anInt10360, super.anInt10357, (boolean[]) null);
		}
	}
}
