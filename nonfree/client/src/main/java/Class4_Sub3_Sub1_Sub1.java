import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class4_Sub3_Sub1_Sub1 extends Class4_Sub3_Sub1 implements Interface16 {

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "Lclient!th;")
	private Class348 aClass348_1;

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "Z")
	private final boolean aBoolean40;

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "B")
	private final byte aByte13;

	@OriginalMember(owner = "client!bb", name = "hb", descriptor = "S")
	private final short aShort4;

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "B")
	private final byte aByte12;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "Z")
	private final boolean aBoolean41;

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "Z")
	private boolean aBoolean43;

	@OriginalMember(owner = "client!bb", name = "kb", descriptor = "Z")
	private final boolean aBoolean42;

	@OriginalMember(owner = "client!bb", name = "ib", descriptor = "Lclient!ka;")
	public Class129 aClass129_1;

	@OriginalMember(owner = "client!bb", name = "cb", descriptor = "Lclient!r;")
	private Class14_Sub2_Sub5 aClass14_Sub2_Sub5_1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!ha;Lclient!gba;IIIIIZIIZ)V")
	public Class4_Sub3_Sub1_Sub1(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static286.method4784(arg8, arg9));
		this.aBoolean40 = arg7;
		this.aByte13 = (byte) arg9;
		this.aShort4 = (short) arg1.anInt2969;
		super.anInt11178 = arg6;
		this.aByte12 = (byte) arg8;
		this.aBoolean41 = arg1.anInt2945 != 0 && !arg7;
		this.aBoolean43 = arg10;
		super.anInt11184 = arg4;
		this.aBoolean42 = arg0.method6955() && arg1.aBoolean210 && !this.aBoolean40 && Static181.aClass14_Sub26_9.aClass43_Sub8_1.method2751() != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean43) {
			local77 |= 0x10000;
		}
		@Pc(92) Class98 local92 = this.method564(local77, arg0, this.aBoolean42);
		if (local92 != null) {
			this.aClass129_1 = local92.aClass129_2;
			this.aClass14_Sub2_Sub5_1 = local92.aClass14_Sub2_Sub5_2;
			if (this.aBoolean43) {
				this.aClass129_1 = this.aClass129_1.method5288((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILclient!ha;Z)Lclient!ek;")
	private Class98 method564(@OriginalArg(1) int arg0, @OriginalArg(2) Class144 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(11) Class128 local11 = Static212.aClass249_4.method6119(this.aShort4 & 0xFFFF);
		@Pc(29) Class159 local29;
		@Pc(24) Class159 local24;
		if (this.aBoolean40) {
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
		return local11.method2671(local24, super.anInt11184, this.aByte12, (Class328) null, arg0, arg1, local29, super.anInt11182, arg2, this.aByte13, super.anInt11178);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(ILclient!ha;)Lclient!w;")
	@Override
	public Class4_Sub9 method9491(@OriginalArg(1) Class144 arg0) {
		if (this.aClass129_1 == null) {
			return null;
		}
		@Pc(12) Class263 local12 = arg0.method6907();
		local12.method8444(super.anInt11184, super.anInt11182, super.anInt11178);
		@Pc(28) Class4_Sub9 local28 = Static272.method7693(1, this.aBoolean41);
		if (Static6.aBoolean9) {
			this.aClass129_1.method5289(local12, local28.aClass4_Sub1Array1[0], Static481.anInt10749, 0);
		} else {
			this.aClass129_1.method5307(local12, local28.aClass4_Sub1Array1[0], 0);
		}
		return local28;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)I")
	@Override
	public int method9501() {
		return this.aShort4 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ha;BIIZLclient!haa;I)V")
	@Override
	public void method9480(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class4_Sub3 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class4_Sub3_Sub1_Sub1) {
			@Pc(17) Class4_Sub3_Sub1_Sub1 local17 = (Class4_Sub3_Sub1_Sub1) arg4;
			if (this.aClass129_1 != null && local17.aClass129_1 != null) {
				this.aClass129_1.method5299(local17.aClass129_1, arg1, arg5, arg2, arg3);
			}
		} else if (arg4 instanceof Class4_Sub3_Sub3_Sub5) {
			@Pc(42) Class4_Sub3_Sub3_Sub5 local42 = (Class4_Sub3_Sub3_Sub5) arg4;
			if (this.aClass129_1 != null && local42.aClass129_7 != null) {
				this.aClass129_1.method5299(local42.aClass129_7, arg1, arg5, arg2, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I")
	@Override
	public int method9502() {
		return this.aByte13;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9499(@OriginalArg(1) Class144 arg0) {
		@Pc(37) Class14_Sub2_Sub5 local37;
		if (this.aClass14_Sub2_Sub5_1 == null && this.aBoolean42) {
			@Pc(29) Class98 local29 = this.method564(262144, arg0, true);
			local37 = local29 == null ? null : local29.aClass14_Sub2_Sub5_2;
		} else {
			local37 = this.aClass14_Sub2_Sub5_1;
			this.aClass14_Sub2_Sub5_1 = null;
		}
		if (local37 != null) {
			Static674.method9338(local37, super.aByte147, super.anInt11184, super.anInt11178, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9497(@OriginalArg(0) Class144 arg0) {
		@Pc(16) Class14_Sub2_Sub5 local16;
		if (this.aClass14_Sub2_Sub5_1 == null && this.aBoolean42) {
			@Pc(27) Class98 local27 = this.method564(262144, arg0, true);
			local16 = local27 == null ? null : local27.aClass14_Sub2_Sub5_2;
		} else {
			local16 = this.aClass14_Sub2_Sub5_1;
			this.aClass14_Sub2_Sub5_1 = null;
		}
		if (local16 != null) {
			Static474.method7103(local16, super.aByte147, super.anInt11184, super.anInt11178, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9483() {
		return this.aBoolean43;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class129 method567(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass129_1 != null && arg0.method6967(this.aClass129_1.ua(), arg1) == 0) {
			return this.aClass129_1;
		} else {
			@Pc(33) Class98 local33 = this.method564(arg1, arg0, false);
			return local33 == null ? null : local33.aClass129_2;
		}
	}

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "(I)I")
	@Override
	public int method9479() {
		return this.aClass129_1 == null ? 0 : this.aClass129_1.fa();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	@Override
	public void method9500() {
		if (this.aClass129_1 != null) {
			this.aClass129_1.method5300();
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lclient!ha;I)Lclient!th;")
	@Override
	public Class348 method9492(@OriginalArg(0) Class144 arg0) {
		if (this.aClass348_1 == null) {
			this.aClass348_1 = Static260.method4352(this.method567(arg0, 0), super.anInt11178, super.anInt11182, super.anInt11184);
		}
		return this.aClass348_1;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method9476() {
		return this.aClass129_1 == null ? false : this.aClass129_1.F();
	}

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "(I)V")
	@Override
	public void method9482() {
		this.aBoolean43 = false;
		if (this.aClass129_1 != null) {
			this.aClass129_1.s(this.aClass129_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)I")
	@Override
	public int method9498() {
		return this.aByte12;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZILclient!ha;)Z")
	@Override
	public boolean method9478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144 arg2) {
		@Pc(17) Class129 local17 = this.method567(arg2, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class263 local22 = arg2.method6907();
			local22.method8444(super.anInt11184, super.anInt11182, super.anInt11178);
			return Static6.aBoolean9 ? local17.method5302(arg1, arg0, local22, false, 0, Static481.anInt10749) : local17.method5296(arg1, arg0, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9490(@OriginalArg(0) Class144 arg0) {
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9496() {
		return this.aBoolean42;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)I")
	@Override
	public int method9485(@OriginalArg(0) int arg0) {
		if (arg0 != 14603) {
			this.aClass348_1 = null;
		}
		return this.aClass129_1 == null ? 0 : this.aClass129_1.ma();
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9489() {
		if (this.aClass129_1 == null) {
			return true;
		} else {
			return !this.aClass129_1.r();
		}
	}
}
