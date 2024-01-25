import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class9_Sub4_Sub2_Sub2 extends Class9_Sub4_Sub2 implements Interface22 {

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "Lclient!oia;")
	private Class243 aClass243_3;

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "Z")
	private boolean aBoolean536;

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "Z")
	private final boolean aBoolean537;

	@OriginalMember(owner = "client!mb", name = "P", descriptor = "B")
	private final byte aByte83;

	@OriginalMember(owner = "client!mb", name = "bb", descriptor = "S")
	private final short aShort81;

	@OriginalMember(owner = "client!mb", name = "V", descriptor = "Z")
	private final boolean aBoolean535;

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "B")
	private final byte aByte82;

	@OriginalMember(owner = "client!mb", name = "gb", descriptor = "Z")
	private final boolean aBoolean538;

	@OriginalMember(owner = "client!mb", name = "pb", descriptor = "Lclient!r;")
	private Class6_Sub5_Sub10 aClass6_Sub5_Sub10_2;

	@OriginalMember(owner = "client!mb", name = "sb", descriptor = "Lclient!ka;")
	public Class92 aClass92_3;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!ha;Lclient!vha;IIIIIZIIIIIIZ)V")
	public Class9_Sub4_Sub2_Sub2(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt10236 == 1, Static557.method7838(arg12, arg13));
		this.aBoolean536 = arg14;
		this.aBoolean537 = arg7;
		this.aByte83 = (byte) arg13;
		this.aShort81 = (short) arg1.anInt10211;
		this.aBoolean535 = arg1.anInt10253 != 0 && !arg7;
		super.aByte134 = (byte) arg3;
		this.aByte82 = (byte) arg12;
		this.aBoolean538 = arg0.method6134() && arg1.aBoolean793 && !this.aBoolean537 && Static87.aClass6_Sub33_6.aClass14_Sub7_1.method2504() != 0;
		@Pc(81) int local81 = 2048;
		if (this.aBoolean536) {
			local81 |= 0x10000;
		}
		@Pc(96) Class307 local96 = this.method5647(local81, arg0, this.aBoolean538);
		if (local96 != null) {
			this.aClass6_Sub5_Sub10_2 = local96.aClass6_Sub5_Sub10_3;
			this.aClass92_3 = local96.aClass92_4;
			if (this.aBoolean536) {
				this.aClass92_3 = this.aClass92_3.method7069((byte) 0, local81, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8422() {
		return this.aClass92_3 == null ? false : this.aClass92_3.F();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8439(@OriginalArg(1) Class5 arg0) {
		@Pc(25) Class6_Sub5_Sub10 local25;
		if (this.aClass6_Sub5_Sub10_2 == null && this.aBoolean538) {
			@Pc(18) Class307 local18 = this.method5647(262144, arg0, true);
			local25 = local18 == null ? null : local18.aClass6_Sub5_Sub10_3;
		} else {
			local25 = this.aClass6_Sub5_Sub10_2;
			this.aClass6_Sub5_Sub10_2 = null;
		}
		if (local25 != null) {
			Static471.method4227(local25, super.aByte134, super.anInt10360, super.anInt10357, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lclient!ha;I)Lclient!bd;")
	@Override
	public Class9_Sub2 method8410(@OriginalArg(0) Class5 arg0) {
		if (this.aClass92_3 == null) {
			return null;
		}
		@Pc(11) Class115 local11 = arg0.method6156();
		local11.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
		@Pc(31) Class9_Sub2 local31 = Static167.method3172(1, this.aBoolean535);
		if (Static423.aBoolean622) {
			this.aClass92_3.method7057(local11, local31.aClass9_Sub6Array1[0], Static32.anInt849, 0);
		} else {
			this.aClass92_3.method7053(local11, local31.aClass9_Sub6Array1[0], 0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
	@Override
	public int method8436() {
		return this.aShort81 & 0xFFFF;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class5 arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.aClass92_3 == null ? 0 : this.aClass92_3.fa();
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(B)V")
	@Override
	public void method8427() {
		this.aBoolean536 = false;
		if (this.aClass92_3 != null) {
			this.aClass92_3.s(this.aClass92_3.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class92 method5645(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1) {
		if (this.aClass92_3 != null && arg1.method6147(this.aClass92_3.ua(), arg0) == 0) {
			return this.aClass92_3;
		} else {
			@Pc(31) Class307 local31 = this.method5647(arg0, arg1, false);
			return local31 == null ? null : local31.aClass92_4;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!ha;)Lclient!oia;")
	@Override
	public Class243 method8409(@OriginalArg(1) Class5 arg0) {
		if (this.aClass243_3 == null) {
			this.aClass243_3 = Static126.method2627(super.anInt10365, super.anInt10360, this.method5645(0, arg0), super.anInt10357);
		}
		return this.aClass243_3;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!ha;BI)Z")
	@Override
	public boolean method8411(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class92 local15 = this.method5645(131072, arg1);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class115 local20 = arg1.method6156();
			local20.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
			return Static423.aBoolean622 ? local15.method7061(arg0, arg2, local20, false, 0, Static32.anInt849) : local15.method7067(arg0, arg2, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8413() {
		if (this.aClass92_3 == null) {
			return true;
		} else {
			return !this.aClass92_3.r();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8437() {
		return this.aBoolean538;
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "(I)I")
	public int method5646() {
		return this.aClass92_3 == null ? 15 : this.aClass92_3.na() / 4;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)I")
	@Override
	public int method8420(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return -120;
		} else if (this.aClass92_3 == null) {
			return 0;
		} else {
			return this.aClass92_3.ma();
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8417() {
		return this.aBoolean536;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBLclient!ha;Z)Lclient!sfa;")
	private Class307 method5647(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class356 local19 = Static249.aClass310_1.method7474(this.aShort81 & 0xFFFF);
		@Pc(44) Class245 local44;
		@Pc(30) Class245 local30;
		if (this.aBoolean537) {
			local30 = Static150.aClass245Array2[0];
			local44 = Static152.aClass245Array3[super.aByte134];
		} else {
			if (super.aByte134 >= 3) {
				local30 = null;
			} else {
				local30 = Static150.aClass245Array2[super.aByte134 + 1];
			}
			local44 = Static150.aClass245Array2[super.aByte134];
		}
		return local19.method8321(super.anInt10357, local30, this.aByte82 == 11 ? this.aByte83 + 4 : this.aByte83, super.anInt10365, arg2, super.anInt10360, arg0, (Class200) null, local44, arg1, this.aByte82 == 11 ? 10 : this.aByte82);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!gg;BZILclient!ha;II)V")
	@Override
	public void method8416(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 instanceof Class9_Sub4_Sub5_Sub2) {
			@Pc(5) Class9_Sub4_Sub5_Sub2 local5 = (Class9_Sub4_Sub5_Sub2) arg0;
			if (this.aClass92_3 != null && local5.aClass92_7 != null) {
				this.aClass92_3.method7060(local5.aClass92_7, arg2, arg4, arg5, arg1);
			}
		} else if (arg0 instanceof Class9_Sub4_Sub2_Sub2) {
			@Pc(28) Class9_Sub4_Sub2_Sub2 local28 = (Class9_Sub4_Sub2_Sub2) arg0;
			if (this.aClass92_3 != null && local28.aClass92_3 != null) {
				this.aClass92_3.method7060(local28.aClass92_3, arg2, arg4, arg5, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8434(@OriginalArg(0) Class5 arg0) {
		@Pc(14) Class6_Sub5_Sub10 local14;
		if (this.aClass6_Sub5_Sub10_2 == null && this.aBoolean538) {
			@Pc(25) Class307 local25 = this.method5647(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass6_Sub5_Sub10_3;
		} else {
			local14 = this.aClass6_Sub5_Sub10_2;
			this.aClass6_Sub5_Sub10_2 = null;
		}
		if (local14 != null) {
			Static346.method5709(local14, super.aByte134, super.anInt10360, super.anInt10357, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I")
	@Override
	public int method8438() {
		return this.aByte83;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)I")
	@Override
	public int method8435() {
		return this.aByte82;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	@Override
	public void method8433() {
		if (this.aClass92_3 != null) {
			this.aClass92_3.method7054();
		}
	}
}
