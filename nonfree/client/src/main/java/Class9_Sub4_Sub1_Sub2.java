import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class9_Sub4_Sub1_Sub2 extends Class9_Sub4_Sub1 implements Interface22 {

	@OriginalMember(owner = "client!tv", name = "ab", descriptor = "Lclient!oia;")
	private Class243 aClass243_7;

	@OriginalMember(owner = "client!tv", name = "db", descriptor = "B")
	private byte aByte121;

	@OriginalMember(owner = "client!tv", name = "L", descriptor = "B")
	private final byte aByte120;

	@OriginalMember(owner = "client!tv", name = "kb", descriptor = "Z")
	private final boolean aBoolean766;

	@OriginalMember(owner = "client!tv", name = "eb", descriptor = "S")
	private final short aShort120;

	@OriginalMember(owner = "client!tv", name = "Q", descriptor = "Z")
	private final boolean aBoolean764;

	@OriginalMember(owner = "client!tv", name = "O", descriptor = "Z")
	private final boolean aBoolean763;

	@OriginalMember(owner = "client!tv", name = "ib", descriptor = "Lclient!ka;")
	private Class92 aClass92_5;

	@OriginalMember(owner = "client!tv", name = "K", descriptor = "Lclient!r;")
	private Class6_Sub5_Sub10 aClass6_Sub5_Sub10_4;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!ha;Lclient!vha;IIIIIZIIII)V")
	public Class9_Sub4_Sub1_Sub2(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		super.anInt10360 = arg4;
		super.anInt10357 = arg6;
		this.aByte121 = (byte) arg10;
		this.aByte120 = (byte) arg11;
		this.aBoolean766 = arg7;
		this.aShort120 = (short) arg1.anInt10211;
		this.aBoolean764 = arg1.anInt10253 != 0 && !arg7;
		this.aBoolean763 = arg0.method6134() && arg1.aBoolean793 && !this.aBoolean766 && Static87.aClass6_Sub33_6.aClass14_Sub7_1.method2504() != 0;
		@Pc(67) Class307 local67 = this.method7882(2048, this.aBoolean763, arg0);
		if (local67 != null) {
			this.aClass92_5 = local67.aClass92_4;
			this.aClass6_Sub5_Sub10_4 = local67.aClass6_Sub5_Sub10_3;
		}
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)I")
	@Override
	public int method8438() {
		return this.aByte120;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!ha;BI)Z")
	@Override
	public boolean method8411(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class92 local9 = this.method7883(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class115 local20 = arg1.method6156();
			local20.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
			return Static423.aBoolean622 ? local9.method7061(arg0, arg2, local20, false, 0, Static32.anInt849) : local9.method7067(arg0, arg2, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8434(@OriginalArg(0) Class5 arg0) {
		@Pc(14) Class6_Sub5_Sub10 local14;
		if (this.aClass6_Sub5_Sub10_4 == null && this.aBoolean763) {
			@Pc(25) Class307 local25 = this.method7882(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass6_Sub5_Sub10_3;
		} else {
			local14 = this.aClass6_Sub5_Sub10_4;
			this.aClass6_Sub5_Sub10_4 = null;
		}
		if (local14 != null) {
			Static346.method5709(local14, super.aByte134, super.anInt10360, super.anInt10357, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8437() {
		return this.aBoolean763;
	}

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8422() {
		return this.aClass92_5 == null ? false : this.aClass92_5.F();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
	@Override
	public void method8433() {
		if (this.aClass92_5 != null) {
			this.aClass92_5.method7054();
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIZLclient!ha;)Lclient!sfa;")
	private Class307 method7882(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(13) Class356 local13 = Static249.aClass310_1.method7474(this.aShort120 & 0xFFFF);
		@Pc(25) Class245 local25;
		@Pc(33) Class245 local33;
		if (this.aBoolean766) {
			local25 = Static152.aClass245Array3[super.aByte134];
			local33 = Static150.aClass245Array2[0];
		} else {
			local25 = Static150.aClass245Array2[super.aByte134];
			if (super.aByte134 >= 3) {
				local33 = null;
			} else {
				local33 = Static150.aClass245Array2[super.aByte134 + 1];
			}
		}
		return local13.method8321(super.anInt10357, local33, this.aByte120, super.anInt10365, arg1, super.anInt10360, arg0, (Class200) null, local25, arg2, this.aByte121);
	}

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8413() {
		if (this.aClass92_5 == null) {
			return true;
		} else {
			return !this.aClass92_5.r();
		}
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(Lclient!ha;I)Lclient!bd;")
	@Override
	public Class9_Sub2 method8410(@OriginalArg(0) Class5 arg0) {
		if (this.aClass92_5 == null) {
			return null;
		}
		@Pc(11) Class115 local11 = arg0.method6156();
		local11.method6290(super.anInt10360 + super.aShort119, super.anInt10365, super.aShort118 + super.anInt10357);
		@Pc(38) Class9_Sub2 local38 = Static167.method3172(1, this.aBoolean764);
		if (Static423.aBoolean622) {
			this.aClass92_5.method7057(local11, local38.aClass9_Sub6Array1[0], Static32.anInt849, 0);
		} else {
			this.aClass92_5.method7053(local11, local38.aClass9_Sub6Array1[0], 0);
		}
		return local38;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)I")
	@Override
	public int method8435() {
		return this.aByte121;
	}

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.aClass92_5 == null ? 0 : this.aClass92_5.fa();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BLclient!ha;)Lclient!oia;")
	@Override
	public Class243 method8409(@OriginalArg(1) Class5 arg0) {
		if (this.aClass243_7 == null) {
			this.aClass243_7 = Static126.method2627(super.anInt10365, super.anInt10360, this.method7883(0, arg0), super.anInt10357);
		}
		return this.aClass243_7;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I")
	@Override
	public int method8436() {
		return this.aShort120 & 0xFFFF;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8439(@OriginalArg(1) Class5 arg0) {
		@Pc(21) Class6_Sub5_Sub10 local21;
		if (this.aClass6_Sub5_Sub10_4 == null && this.aBoolean763) {
			@Pc(32) Class307 local32 = this.method7882(262144, true, arg0);
			local21 = local32 == null ? null : local32.aClass6_Sub5_Sub10_3;
		} else {
			local21 = this.aClass6_Sub5_Sub10_4;
			this.aClass6_Sub5_Sub10_4 = null;
		}
		if (local21 != null) {
			Static471.method4227(local21, super.aByte134, super.anInt10360, super.anInt10357, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class92 method7883(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1) {
		if (this.aClass92_5 != null && arg1.method6147(this.aClass92_5.ua(), arg0) == 0) {
			return this.aClass92_5;
		} else {
			@Pc(23) Class307 local23 = this.method7882(arg0, false, arg1);
			return local23 == null ? null : local23.aClass92_4;
		}
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class5 arg0) {
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(Z)I")
	@Override
	public int method8420(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aByte121 = 100;
		}
		return this.aClass92_5 == null ? 0 : this.aClass92_5.ma();
	}
}
