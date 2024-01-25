import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class4_Sub3_Sub3_Sub5 extends Class4_Sub3_Sub3 implements Interface16 {

	@OriginalMember(owner = "client!up", name = "bb", descriptor = "Lclient!th;")
	private Class348 aClass348_6;

	@OriginalMember(owner = "client!up", name = "P", descriptor = "Z")
	private final boolean aBoolean718;

	@OriginalMember(owner = "client!up", name = "ib", descriptor = "Z")
	private boolean aBoolean721;

	@OriginalMember(owner = "client!up", name = "T", descriptor = "B")
	private final byte aByte134;

	@OriginalMember(owner = "client!up", name = "lb", descriptor = "B")
	private final byte lb;

	@OriginalMember(owner = "client!up", name = "fb", descriptor = "S")
	private final short aShort112;

	@OriginalMember(owner = "client!up", name = "hb", descriptor = "Z")
	private final boolean aBoolean720;

	@OriginalMember(owner = "client!up", name = "N", descriptor = "Z")
	private final boolean aBoolean719;

	@OriginalMember(owner = "client!up", name = "ob", descriptor = "Lclient!r;")
	private Class14_Sub2_Sub5 aClass14_Sub2_Sub5_5;

	@OriginalMember(owner = "client!up", name = "Y", descriptor = "Lclient!ka;")
	public Class129 aClass129_7;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!ha;Lclient!gba;IIIIIZIIIIIIZ)V")
	public Class4_Sub3_Sub3_Sub5(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt2988 == 1, Static392.method5971(arg12, arg13));
		this.aBoolean718 = arg1.anInt2945 != 0 && !arg7;
		super.aByte147 = (byte) arg3;
		this.aBoolean721 = arg14;
		this.aByte134 = (byte) arg13;
		this.lb = (byte) arg12;
		this.aShort112 = (short) arg1.anInt2969;
		this.aBoolean720 = arg7;
		this.aBoolean719 = arg0.method6955() && arg1.aBoolean210 && !this.aBoolean720 && Static181.aClass14_Sub26_9.aClass43_Sub8_1.method2751() != 0;
		@Pc(86) int local86 = 2048;
		if (this.aBoolean721) {
			local86 |= 0x10000;
		}
		@Pc(101) Class98 local101 = this.method8791(arg0, this.aBoolean719, local86);
		if (local101 != null) {
			this.aClass14_Sub2_Sub5_5 = local101.aClass14_Sub2_Sub5_2;
			this.aClass129_7 = local101.aClass129_2;
			if (this.aBoolean721) {
				this.aClass129_7 = this.aClass129_7.method5288((byte) 0, local86, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!ha;ZI)Lclient!ek;")
	private Class98 method8791(@OriginalArg(1) Class144 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class128 local11 = Static212.aClass249_4.method6119(this.aShort112 & 0xFFFF);
		@Pc(19) Class159 local19;
		@Pc(27) Class159 local27;
		if (this.aBoolean720) {
			local27 = Static445.aClass159Array3[0];
			local19 = Static346.aClass159Array2[super.aByte147];
		} else {
			local19 = Static445.aClass159Array3[super.aByte147];
			if (super.aByte147 >= 3) {
				local27 = null;
			} else {
				local27 = Static445.aClass159Array3[super.aByte147 + 1];
			}
		}
		return local11.method2671(local27, super.anInt11184, this.lb == 11 ? 10 : this.lb, (Class328) null, arg2, arg0, local19, super.anInt11182, arg1, this.lb == 11 ? this.aByte134 + 4 : this.aByte134, super.anInt11178);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9490(@OriginalArg(0) Class144 arg0) {
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9496() {
		return this.aBoolean719;
	}

	@OriginalMember(owner = "client!up", name = "m", descriptor = "(I)I")
	public int method8792() {
		return this.aClass129_7 == null ? 15 : this.aClass129_7.na() / 4;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IZILclient!ha;)Z")
	@Override
	public boolean method9478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144 arg2) {
		@Pc(9) Class129 local9 = this.method8794(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class263 local14 = arg2.method6907();
			local14.method8444(super.anInt11184, super.anInt11182, super.anInt11178);
			return Static6.aBoolean9 ? local9.method5302(arg1, arg0, local14, false, 0, Static481.anInt10749) : local9.method5296(arg1, arg0, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!up", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9483() {
		return this.aBoolean721;
	}

	@OriginalMember(owner = "client!up", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9489() {
		if (this.aClass129_7 == null) {
			return true;
		} else {
			return !this.aClass129_7.r();
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
	@Override
	public void method9500() {
		if (this.aClass129_7 != null) {
			this.aClass129_7.method5300();
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(B)I")
	@Override
	public int method9498() {
		return this.lb;
	}

	@OriginalMember(owner = "client!up", name = "d", descriptor = "(I)I")
	@Override
	public int method9485(@OriginalArg(0) int arg0) {
		if (arg0 == 14603) {
			return this.aClass129_7 == null ? 0 : this.aClass129_7.ma();
		} else {
			return -58;
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(ILclient!ha;)Lclient!w;")
	@Override
	public Class4_Sub9 method9491(@OriginalArg(1) Class144 arg0) {
		if (this.aClass129_7 == null) {
			return null;
		}
		@Pc(20) Class263 local20 = arg0.method6907();
		local20.method8444(super.anInt11184, super.anInt11182, super.anInt11178);
		@Pc(34) Class4_Sub9 local34 = Static272.method7693(1, this.aBoolean718);
		if (Static6.aBoolean9) {
			this.aClass129_7.method5289(local20, local34.aClass4_Sub1Array1[0], Static481.anInt10749, 0);
		} else {
			this.aClass129_7.method5307(local20, local34.aClass4_Sub1Array1[0], 0);
		}
		return local34;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9497(@OriginalArg(0) Class144 arg0) {
		@Pc(28) Class14_Sub2_Sub5 local28;
		if (this.aClass14_Sub2_Sub5_5 == null && this.aBoolean719) {
			@Pc(41) Class98 local41 = this.method8791(arg0, true, 262144);
			local28 = local41 == null ? null : local41.aClass14_Sub2_Sub5_2;
		} else {
			local28 = this.aClass14_Sub2_Sub5_5;
			this.aClass14_Sub2_Sub5_5 = null;
		}
		if (local28 != null) {
			Static474.method7103(local28, super.aByte147, super.anInt11184, super.anInt11178, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!ha;BIIZLclient!haa;I)V")
	@Override
	public void method9480(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class4_Sub3 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class4_Sub3_Sub1_Sub1) {
			@Pc(17) Class4_Sub3_Sub1_Sub1 local17 = (Class4_Sub3_Sub1_Sub1) arg4;
			if (this.aClass129_7 != null && local17.aClass129_1 != null) {
				this.aClass129_7.method5299(local17.aClass129_1, arg1, arg5, arg2, arg3);
			}
		} else if (arg4 instanceof Class4_Sub3_Sub3_Sub5) {
			@Pc(42) Class4_Sub3_Sub3_Sub5 local42 = (Class4_Sub3_Sub3_Sub5) arg4;
			if (this.aClass129_7 != null && local42.aClass129_7 != null) {
				this.aClass129_7.method5299(local42.aClass129_7, arg1, arg5, arg2, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)I")
	@Override
	public int method9502() {
		return this.aByte134;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9499(@OriginalArg(1) Class144 arg0) {
		@Pc(28) Class14_Sub2_Sub5 local28;
		if (this.aClass14_Sub2_Sub5_5 == null && this.aBoolean719) {
			@Pc(20) Class98 local20 = this.method8791(arg0, true, 262144);
			local28 = local20 == null ? null : local20.aClass14_Sub2_Sub5_2;
		} else {
			local28 = this.aClass14_Sub2_Sub5_5;
			this.aClass14_Sub2_Sub5_5 = null;
		}
		if (local28 != null) {
			Static674.method9338(local28, super.aByte147, super.anInt11184, super.anInt11178, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!up", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method9476() {
		return this.aClass129_7 == null ? false : this.aClass129_7.F();
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(Lclient!ha;I)Lclient!th;")
	@Override
	public Class348 method9492(@OriginalArg(0) Class144 arg0) {
		if (this.aClass348_6 == null) {
			this.aClass348_6 = Static260.method4352(this.method8794(0, arg0), super.anInt11178, super.anInt11182, super.anInt11184);
		}
		return this.aClass348_6;
	}

	@OriginalMember(owner = "client!up", name = "k", descriptor = "(I)V")
	@Override
	public void method9482() {
		this.aBoolean721 = false;
		if (this.aClass129_7 != null) {
			this.aClass129_7.s(this.aClass129_7.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!up", name = "i", descriptor = "(I)I")
	@Override
	public int method9479() {
		return this.aClass129_7 == null ? 0 : this.aClass129_7.fa();
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(B)I")
	@Override
	public int method9501() {
		return this.aShort112 & 0xFFFF;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class129 method8794(@OriginalArg(0) int arg0, @OriginalArg(1) Class144 arg1) {
		if (this.aClass129_7 != null && arg1.method6967(this.aClass129_7.ua(), arg0) == 0) {
			return this.aClass129_7;
		} else {
			@Pc(37) Class98 local37 = this.method8791(arg1, false, arg0);
			return local37 == null ? null : local37.aClass129_2;
		}
	}
}
