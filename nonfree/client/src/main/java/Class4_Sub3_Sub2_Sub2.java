import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class4_Sub3_Sub2_Sub2 extends Class4_Sub3_Sub2 implements Interface16 {

	@OriginalMember(owner = "client!ww", name = "db", descriptor = "Lclient!th;")
	private Class348 aClass348_8;

	@OriginalMember(owner = "client!ww", name = "nb", descriptor = "Z")
	private boolean aBoolean783;

	@OriginalMember(owner = "client!ww", name = "bb", descriptor = "B")
	private final byte aByte148;

	@OriginalMember(owner = "client!ww", name = "K", descriptor = "Z")
	private final boolean aBoolean782;

	@OriginalMember(owner = "client!ww", name = "O", descriptor = "S")
	private final short aShort124;

	@OriginalMember(owner = "client!ww", name = "ib", descriptor = "Z")
	private final boolean aBoolean781;

	@OriginalMember(owner = "client!ww", name = "X", descriptor = "Z")
	private boolean aBoolean784;

	@OriginalMember(owner = "client!ww", name = "fb", descriptor = "Lclient!ka;")
	private Class129 aClass129_8;

	@OriginalMember(owner = "client!ww", name = "R", descriptor = "Lclient!r;")
	private Class14_Sub2_Sub5 aClass14_Sub2_Sub5_6;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!ha;Lclient!gba;IIIIIZIZ)V")
	public Class4_Sub3_Sub2_Sub2(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt2974);
		this.aBoolean783 = arg9;
		this.aByte148 = (byte) arg8;
		super.anInt11184 = arg4;
		this.aBoolean782 = arg7;
		this.aShort124 = (short) arg1.anInt2969;
		this.aBoolean781 = arg1.anInt2945 != 0 && !arg7;
		super.anInt11178 = arg6;
		this.aBoolean784 = arg0.method6955() && arg1.aBoolean210 && !this.aBoolean782 && Static181.aClass14_Sub26_9.aClass43_Sub8_1.method2751() != 0;
		@Pc(74) int local74 = 2048;
		if (this.aBoolean783) {
			local74 |= 0x10000;
		}
		@Pc(89) Class98 local89 = this.method9505(local74, this.aBoolean784, arg0);
		if (local89 != null) {
			this.aClass129_8 = local89.aClass129_2;
			this.aClass14_Sub2_Sub5_6 = local89.aClass14_Sub2_Sub5_2;
			if (this.aBoolean783) {
				this.aClass129_8 = this.aClass129_8.method5288((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9489() {
		if (this.aClass129_8 == null) {
			return true;
		} else {
			return !this.aClass129_8.r();
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class129 method9503(@OriginalArg(0) int arg0, @OriginalArg(1) Class144 arg1) {
		if (this.aClass129_8 != null && arg1.method6967(this.aClass129_8.ua(), arg0) == 0) {
			return this.aClass129_8;
		} else {
			@Pc(37) Class98 local37 = this.method9505(arg0, false, arg1);
			return local37 == null ? null : local37.aClass129_2;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)I")
	@Override
	public int method9502() {
		return this.aByte148;
	}

	@OriginalMember(owner = "client!ww", name = "i", descriptor = "(I)I")
	@Override
	public int method9479() {
		return this.aClass129_8 == null ? 0 : this.aClass129_8.fa();
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(B)I")
	@Override
	public int method9498() {
		return 22;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9496() {
		return this.aBoolean784;
	}

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9483() {
		return this.aBoolean783;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V")
	@Override
	public void method9500() {
		if (this.aClass129_8 != null) {
			this.aClass129_8.method5300();
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIZLclient!ha;)Lclient!ek;")
	private Class98 method9505(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class144 arg2) {
		@Pc(17) Class128 local17 = Static212.aClass249_4.method6119(this.aShort124 & 0xFFFF);
		@Pc(29) Class159 local29;
		@Pc(24) Class159 local24;
		if (this.aBoolean782) {
			local24 = Static445.aClass159Array3[0];
			local29 = Static346.aClass159Array2[super.aByte147];
		} else {
			if (super.aByte147 < 3) {
				local24 = Static445.aClass159Array3[super.aByte147 + 1];
			} else {
				local24 = null;
			}
			local29 = Static445.aClass159Array3[super.aByte147];
		}
		return local17.method2671(local24, super.anInt11184, 22, (Class328) null, arg0, arg2, local29, super.anInt11182, arg1, this.aByte148, super.anInt11178);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IZILclient!ha;)Z")
	@Override
	public boolean method9478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144 arg2) {
		@Pc(15) Class129 local15 = this.method9503(131072, arg2);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class263 local20 = arg2.method6907();
			local20.method8444(super.anInt11184, super.anInt11182, super.anInt11178);
			return Static6.aBoolean9 ? local15.method5302(arg1, arg0, local20, false, 0, Static481.anInt10749) : local15.method5296(arg1, arg0, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9497(@OriginalArg(0) Class144 arg0) {
		@Pc(38) Class14_Sub2_Sub5 local38;
		if (this.aClass14_Sub2_Sub5_6 == null && this.aBoolean784) {
			@Pc(30) Class98 local30 = this.method9505(262144, true, arg0);
			local38 = local30 == null ? null : local30.aClass14_Sub2_Sub5_2;
		} else {
			local38 = this.aClass14_Sub2_Sub5_6;
			this.aClass14_Sub2_Sub5_6 = null;
		}
		if (local38 != null) {
			Static474.method7103(local38, super.aByte147, super.anInt11184, super.anInt11178, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "(I)I")
	@Override
	public int method9485(@OriginalArg(0) int arg0) {
		if (arg0 != 14603) {
			this.aBoolean784 = true;
		}
		return this.aClass129_8 == null ? 0 : this.aClass129_8.ma();
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9490(@OriginalArg(0) Class144 arg0) {
	}

	@OriginalMember(owner = "client!ww", name = "k", descriptor = "(I)V")
	@Override
	public void method9482() {
		this.aBoolean783 = false;
		if (this.aClass129_8 != null) {
			this.aClass129_8.s(this.aClass129_8.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "(B)I")
	@Override
	public int method9501() {
		return this.aShort124 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(ILclient!ha;)Lclient!w;")
	@Override
	public Class4_Sub9 method9491(@OriginalArg(1) Class144 arg0) {
		if (this.aClass129_8 == null) {
			return null;
		}
		@Pc(12) Class263 local12 = arg0.method6907();
		local12.method8444(super.anInt11184, super.anInt11182, super.anInt11178);
		@Pc(28) Class4_Sub9 local28 = Static272.method7693(1, this.aBoolean781);
		if (Static6.aBoolean9) {
			this.aClass129_8.method5289(local12, local28.aClass4_Sub1Array1[0], Static481.anInt10749, 0);
		} else {
			this.aClass129_8.method5307(local12, local28.aClass4_Sub1Array1[0], 0);
		}
		return local28;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!ha;BIIZLclient!haa;I)V")
	@Override
	public void method9480(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class4_Sub3 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class4_Sub3_Sub2_Sub2) {
			@Pc(9) Class4_Sub3_Sub2_Sub2 local9 = (Class4_Sub3_Sub2_Sub2) arg4;
			if (this.aClass129_8 != null && local9.aClass129_8 != null) {
				this.aClass129_8.method5299(local9.aClass129_8, arg1, arg5, arg2, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9499(@OriginalArg(1) Class144 arg0) {
		@Pc(28) Class14_Sub2_Sub5 local28;
		if (this.aClass14_Sub2_Sub5_6 == null && this.aBoolean784) {
			@Pc(20) Class98 local20 = this.method9505(262144, true, arg0);
			local28 = local20 == null ? null : local20.aClass14_Sub2_Sub5_2;
		} else {
			local28 = this.aClass14_Sub2_Sub5_6;
			this.aClass14_Sub2_Sub5_6 = null;
		}
		if (local28 != null) {
			Static674.method9338(local28, super.aByte147, super.anInt11184, super.anInt11178, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method9476() {
		return this.aClass129_8 == null ? false : this.aClass129_8.F();
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(Lclient!ha;I)Lclient!th;")
	@Override
	public Class348 method9492(@OriginalArg(0) Class144 arg0) {
		if (this.aClass348_8 == null) {
			this.aClass348_8 = Static260.method4352(this.method9503(0, arg0), super.anInt11178, super.anInt11182, super.anInt11184);
		}
		return this.aClass348_8;
	}
}
