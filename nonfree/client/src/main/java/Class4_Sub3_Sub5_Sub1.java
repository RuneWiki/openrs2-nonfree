import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oja")
public final class Class4_Sub3_Sub5_Sub1 extends Class4_Sub3_Sub5 implements Interface16 {

	@OriginalMember(owner = "client!oja", name = "L", descriptor = "Lclient!th;")
	private Class348 aClass348_4;

	@OriginalMember(owner = "client!oja", name = "Z", descriptor = "Z")
	private final boolean aBoolean525;

	@OriginalMember(owner = "client!oja", name = "gb", descriptor = "B")
	private final byte aByte100;

	@OriginalMember(owner = "client!oja", name = "fb", descriptor = "Z")
	private boolean aBoolean527;

	@OriginalMember(owner = "client!oja", name = "P", descriptor = "S")
	private final short aShort81;

	@OriginalMember(owner = "client!oja", name = "ib", descriptor = "B")
	private final byte aByte101;

	@OriginalMember(owner = "client!oja", name = "cb", descriptor = "Z")
	private final boolean aBoolean526;

	@OriginalMember(owner = "client!oja", name = "V", descriptor = "Lclient!ka;")
	private Class129 aClass129_5;

	@OriginalMember(owner = "client!oja", name = "Y", descriptor = "Lclient!r;")
	private Class14_Sub2_Sub5 aClass14_Sub2_Sub5_4;

	@OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(Lclient!ha;Lclient!gba;IIIIIZIIII)V")
	public Class4_Sub3_Sub5_Sub1(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aBoolean525 = arg1.anInt2945 != 0 && !arg7;
		super.anInt11178 = arg6;
		super.anInt11184 = arg4;
		this.aByte100 = (byte) arg10;
		this.aBoolean527 = arg7;
		this.aShort81 = (short) arg1.anInt2969;
		this.aByte101 = (byte) arg11;
		this.aBoolean526 = arg0.method6955() && arg1.aBoolean210 && !this.aBoolean527 && Static181.aClass14_Sub26_9.aClass43_Sub8_1.method2751() != 0;
		@Pc(75) Class98 local75 = this.method6591(2048, this.aBoolean526, arg0);
		if (local75 != null) {
			this.aClass129_5 = local75.aClass129_2;
			this.aClass14_Sub2_Sub5_4 = local75.aClass14_Sub2_Sub5_2;
		}
	}

	@OriginalMember(owner = "client!oja", name = "i", descriptor = "(I)I")
	@Override
	public int method9479() {
		return this.aClass129_5 == null ? 0 : this.aClass129_5.fa();
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9496() {
		return this.aBoolean526;
	}

	@OriginalMember(owner = "client!oja", name = "b", descriptor = "(ILclient!ha;)Lclient!w;")
	@Override
	public Class4_Sub9 method9491(@OriginalArg(1) Class144 arg0) {
		if (this.aClass129_5 == null) {
			return null;
		}
		@Pc(12) Class263 local12 = arg0.method6907();
		local12.method8444(super.aShort113 + super.anInt11184, super.anInt11182, super.anInt11178 + super.aShort114);
		@Pc(41) Class4_Sub9 local41 = Static272.method7693(1, this.aBoolean525);
		if (Static6.aBoolean9) {
			this.aClass129_5.method5289(local12, local41.aClass4_Sub1Array1[0], Static481.anInt10749, 0);
		} else {
			this.aClass129_5.method5307(local12, local41.aClass4_Sub1Array1[0], 0);
		}
		return local41;
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9497(@OriginalArg(0) Class144 arg0) {
		@Pc(30) Class14_Sub2_Sub5 local30;
		if (this.aClass14_Sub2_Sub5_4 == null && this.aBoolean526) {
			@Pc(22) Class98 local22 = this.method6591(262144, true, arg0);
			local30 = local22 == null ? null : local22.aClass14_Sub2_Sub5_2;
		} else {
			local30 = this.aClass14_Sub2_Sub5_4;
			this.aClass14_Sub2_Sub5_4 = null;
		}
		if (local30 != null) {
			Static474.method7103(local30, super.aByte147, super.anInt11184, super.anInt11178, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!oja", name = "c", descriptor = "(B)I")
	@Override
	public int method9501() {
		return this.aShort81 & 0xFFFF;
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class129 method6590(@OriginalArg(1) int arg0, @OriginalArg(2) Class144 arg1) {
		if (this.aClass129_5 != null && arg1.method6967(this.aClass129_5.ua(), arg0) == 0) {
			return this.aClass129_5;
		} else {
			@Pc(31) Class98 local31 = this.method6591(arg0, false, arg1);
			return local31 == null ? null : local31.aClass129_2;
		}
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(IIZLclient!ha;)Lclient!ek;")
	private Class98 method6591(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class144 arg2) {
		@Pc(23) Class128 local23 = Static212.aClass249_4.method6119(this.aShort81 & 0xFFFF);
		@Pc(31) Class159 local31;
		@Pc(35) Class159 local35;
		if (this.aBoolean527) {
			local31 = Static346.aClass159Array2[super.aByte147];
			local35 = Static445.aClass159Array3[0];
		} else {
			if (super.aByte147 >= 3) {
				local35 = null;
			} else {
				local35 = Static445.aClass159Array3[super.aByte147 + 1];
			}
			local31 = Static445.aClass159Array3[super.aByte147];
		}
		return local23.method2671(local35, super.anInt11184, this.aByte100, (Class328) null, arg0, arg2, local31, super.anInt11182, arg1, this.aByte101, super.anInt11178);
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(B)V")
	@Override
	public void method9500() {
		if (this.aClass129_5 != null) {
			this.aClass129_5.method5300();
		}
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9499(@OriginalArg(1) Class144 arg0) {
		@Pc(25) Class14_Sub2_Sub5 local25;
		if (this.aClass14_Sub2_Sub5_4 == null && this.aBoolean526) {
			@Pc(38) Class98 local38 = this.method6591(262144, true, arg0);
			local25 = local38 == null ? null : local38.aClass14_Sub2_Sub5_2;
		} else {
			local25 = this.aClass14_Sub2_Sub5_4;
			this.aClass14_Sub2_Sub5_4 = null;
		}
		if (local25 != null) {
			Static674.method9338(local25, super.aByte147, super.anInt11184, super.anInt11178, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!oja", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9489() {
		if (this.aClass129_5 == null) {
			return true;
		} else {
			return !this.aClass129_5.r();
		}
	}

	@OriginalMember(owner = "client!oja", name = "b", descriptor = "(B)I")
	@Override
	public int method9498() {
		return this.aByte100;
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(I)I")
	@Override
	public int method9502() {
		return this.aByte101;
	}

	@OriginalMember(owner = "client!oja", name = "d", descriptor = "(I)I")
	@Override
	public int method9485(@OriginalArg(0) int arg0) {
		if (arg0 != 14603) {
			this.aBoolean527 = false;
		}
		return this.aClass129_5 == null ? 0 : this.aClass129_5.ma();
	}

	@OriginalMember(owner = "client!oja", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method9476() {
		return this.aClass129_5 == null ? false : this.aClass129_5.F();
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(IZILclient!ha;)Z")
	@Override
	public boolean method9478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144 arg2) {
		@Pc(9) Class129 local9 = this.method6590(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class263 local14 = arg2.method6907();
			local14.method8444(super.anInt11184, super.anInt11182, super.anInt11178);
			return Static6.aBoolean9 ? local9.method5302(arg1, arg0, local14, false, 0, Static481.anInt10749) : local9.method5296(arg1, arg0, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9490(@OriginalArg(0) Class144 arg0) {
	}

	@OriginalMember(owner = "client!oja", name = "b", descriptor = "(Lclient!ha;I)Lclient!th;")
	@Override
	public Class348 method9492(@OriginalArg(0) Class144 arg0) {
		if (this.aClass348_4 == null) {
			this.aClass348_4 = Static260.method4352(this.method6590(0, arg0), super.anInt11178, super.anInt11182, super.anInt11184);
		}
		return this.aClass348_4;
	}
}
