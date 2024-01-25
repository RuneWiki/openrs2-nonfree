import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class6_Sub1_Sub1_Sub4 extends Class6_Sub1_Sub1 implements Interface24 {

	@OriginalMember(owner = "client!mb", name = "U", descriptor = "Lclient!sd;")
	private Class297 aClass297_5;

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "B")
	private final byte aByte83;

	@OriginalMember(owner = "client!mb", name = "pb", descriptor = "Z")
	private final boolean aBoolean481;

	@OriginalMember(owner = "client!mb", name = "rb", descriptor = "Z")
	private final boolean aBoolean482;

	@OriginalMember(owner = "client!mb", name = "bb", descriptor = "Z")
	private boolean aBoolean480;

	@OriginalMember(owner = "client!mb", name = "S", descriptor = "B")
	private final byte aByte82;

	@OriginalMember(owner = "client!mb", name = "cb", descriptor = "S")
	private final short aShort69;

	@OriginalMember(owner = "client!mb", name = "R", descriptor = "Z")
	private final boolean aBoolean479;

	@OriginalMember(owner = "client!mb", name = "O", descriptor = "Lclient!ha;")
	private Class2_Sub3_Sub6 aClass2_Sub3_Sub6_4;

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "Lclient!da;")
	public Class66 aClass66_4;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!r;Lclient!bda;IIIIIZIIIIIIZ)V")
	public Class6_Sub1_Sub1_Sub4(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt775 == 1, Static265.method4071(arg12, arg13));
		super.aByte111 = (byte) arg3;
		this.aByte83 = (byte) arg12;
		this.aBoolean481 = arg7;
		this.aBoolean482 = arg1.anInt807 != 0 && !arg7;
		this.aBoolean480 = arg14;
		this.aByte82 = (byte) arg13;
		this.aShort69 = (short) arg1.anInt773;
		this.aBoolean479 = arg0.method6218() && arg1.aBoolean50 && !this.aBoolean481 && Static72.aClass2_Sub12_Sub1_1.method1411(Static391.anInt6846) != 0;
		@Pc(81) int local81 = 2048;
		if (this.aBoolean480) {
			local81 |= 0x10000;
		}
		@Pc(96) Class191 local96 = this.method5002(local81, this.aBoolean479, arg0);
		if (local96 != null) {
			this.aClass2_Sub3_Sub6_4 = local96.aClass2_Sub3_Sub6_3;
			this.aClass66_4 = local96.aClass66_3;
			if (this.aBoolean480) {
				this.aClass66_4 = this.aClass66_4.method7551((byte) 0, local81, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)I")
	public int method4998() {
		return this.aClass66_4 == null ? 15 : this.aClass66_4.K() / 4;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		@Pc(14) Class66 local14 = this.method5001(131072, arg2);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class68 local19 = arg2.method6222();
			local19.NA(super.anInt8761, super.anInt8759, super.anInt8764);
			return Static338.aBoolean493 ? local14.method7547(arg0, arg1, local19, false, Static401.anInt6991) : local14.method7541(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7335(@OriginalArg(1) Class100 arg0) {
		@Pc(22) Class2_Sub3_Sub6 local22;
		if (this.aClass2_Sub3_Sub6_4 == null && this.aBoolean479) {
			@Pc(33) Class191 local33 = this.method5002(262144, true, arg0);
			local22 = local33 == null ? null : local33.aClass2_Sub3_Sub6_3;
		} else {
			local22 = this.aClass2_Sub3_Sub6_4;
			this.aClass2_Sub3_Sub6_4 = null;
		}
		if (local22 != null) {
			Static65.method1052(local22, super.aByte111, super.anInt8761, super.anInt8764, null);
		}
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method7330() {
		return this.aBoolean480;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)I")
	@Override
	public int method7328() {
		return this.aClass66_4 == null ? 0 : this.aClass66_4.J();
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(BLclient!r;)V")
	@Override
	public void method7338(@OriginalArg(1) Class100 arg0) {
		@Pc(14) Class2_Sub3_Sub6 local14;
		if (this.aClass2_Sub3_Sub6_4 == null && this.aBoolean479) {
			@Pc(27) Class191 local27 = this.method5002(262144, true, arg0);
			local14 = local27 == null ? null : local27.aClass2_Sub3_Sub6_3;
		} else {
			local14 = this.aClass2_Sub3_Sub6_4;
			this.aClass2_Sub3_Sub6_4 = null;
		}
		if (local14 != null) {
			Static384.method7168(local14, super.aByte111, super.anInt8761, super.anInt8764, null);
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7323(@OriginalArg(1) Class100 arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!r;)Lclient!da;")
	private Class66 method5001(@OriginalArg(1) int arg0, @OriginalArg(2) Class100 arg1) {
		if (this.aClass66_4 != null && arg1.method6216(this.aClass66_4.PA(), arg0) == 0) {
			return this.aClass66_4;
		} else {
			@Pc(28) Class191 local28 = this.method5002(arg0, false, arg1);
			return local28 == null ? null : local28.aClass66_3;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIBLclient!r;Lclient!lo;II)V")
	@Override
	public void method7325(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) Class6_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class6_Sub1_Sub3_Sub1) {
			@Pc(17) Class6_Sub1_Sub3_Sub1 local17 = (Class6_Sub1_Sub3_Sub1) arg3;
			if (this.aClass66_4 != null && local17.aClass66_1 != null) {
				this.aClass66_4.method7553(local17.aClass66_1, arg1, arg4, arg5, arg0);
			}
		} else if (arg3 instanceof Class6_Sub1_Sub1_Sub4) {
			@Pc(39) Class6_Sub1_Sub1_Sub4 local39 = (Class6_Sub1_Sub1_Sub4) arg3;
			if (this.aClass66_4 != null && local39.aClass66_4 != null) {
				this.aClass66_4.method7553(local39.aClass66_4, arg1, arg4, arg5, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)I")
	@Override
	public int method7337() {
		return this.aShort69 & 0xFFFF;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)I")
	@Override
	public int method7340() {
		return this.aByte82;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!r;I)Lclient!sd;")
	@Override
	public Class297 method7326(@OriginalArg(0) Class100 arg0) {
		if (this.aClass297_5 == null) {
			this.aClass297_5 = Static510.method7075(super.anInt8759, this.method5001(0, arg0), super.anInt8764, super.anInt8761);
		}
		return this.aClass297_5;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	@Override
	public void method7322() {
		this.aBoolean480 = false;
		if (this.aClass66_4 != null) {
			this.aClass66_4.SA(this.aClass66_4.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)I")
	@Override
	public int method7336() {
		return this.aByte83;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLclient!r;)Lclient!og;")
	@Override
	public Class6_Sub5 method7317(@OriginalArg(1) Class100 arg0) {
		if (this.aClass66_4 == null) {
			return null;
		}
		@Pc(11) Class68 local11 = arg0.method6222();
		local11.NA(super.anInt8761, super.anInt8759, super.anInt8764);
		@Pc(21) Class6_Sub5 local21 = null;
		if (this.aBoolean482) {
			local21 = Static305.method4561(1);
		}
		if (Static338.aBoolean493) {
			this.aClass66_4.method7556(local11, local21 == null ? null : local21.aClass6_Sub6Array1[0], Static401.anInt6991, 0);
		} else {
			this.aClass66_4.method7558(local11, local21 == null ? null : local21.aClass6_Sub6Array1[0], 0);
		}
		return local21;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)I")
	@Override
	public int method7319(@OriginalArg(0) int arg0) {
		if (arg0 != -22496) {
			this.method7337();
		}
		return this.aClass66_4 == null ? 0 : this.aClass66_4.RA();
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7329() {
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7339() {
		return this.aBoolean479;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZLclient!r;)Lclient!kj;")
	private Class191 method5002(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(13) Class32 local13 = Static541.aClass97_4.method1794(this.aShort69 & 0xFFFF);
		@Pc(26) Class67 local26;
		@Pc(32) Class67 local32;
		if (this.aBoolean481) {
			local26 = Static592.aClass67Array4[super.aByte111];
			local32 = Static569.aClass67Array8[0];
		} else {
			local26 = Static569.aClass67Array8[super.aByte111];
			if (super.aByte111 >= 3) {
				local32 = null;
			} else {
				local32 = Static569.aClass67Array8[super.aByte111 + 1];
			}
		}
		return local13.method559(arg0, arg2, super.anInt8759, local26, super.anInt8761, local32, super.anInt8764, arg1, this.aByte83 == 11 ? 10 : this.aByte83, this.aByte83 == 11 ? this.aByte82 + 4 : this.aByte82);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
	@Override
	public void method7334() {
		if (this.aClass66_4 != null) {
			this.aClass66_4.method7546();
		}
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7318() {
		return this.aClass66_4 == null ? false : this.aClass66_4.LA();
	}
}
