import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class6_Sub1_Sub3_Sub1 extends Class6_Sub1_Sub3 implements Interface24 {

	@OriginalMember(owner = "client!jc", name = "lb", descriptor = "[[[I")
	public static final int[][][] lb = new int[2][][];

	@OriginalMember(owner = "client!jc", name = "mb", descriptor = "Lclient!sd;")
	private Class297 aClass297_1;

	@OriginalMember(owner = "client!jc", name = "nb", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!jc", name = "gb", descriptor = "Z")
	private boolean aBoolean362;

	@OriginalMember(owner = "client!jc", name = "bb", descriptor = "B")
	private final byte aByte62;

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "Z")
	private final boolean aBoolean360;

	@OriginalMember(owner = "client!jc", name = "jb", descriptor = "Z")
	private final boolean aBoolean364;

	@OriginalMember(owner = "client!jc", name = "eb", descriptor = "S")
	private final short aShort51;

	@OriginalMember(owner = "client!jc", name = "V", descriptor = "Z")
	private final boolean aBoolean361;

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "Lclient!ha;")
	private Class2_Sub3_Sub6 aClass2_Sub3_Sub6_1;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "Lclient!da;")
	public Class66 aClass66_1;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!r;Lclient!bda;IIIIIZIIZ)V")
	public Class6_Sub1_Sub3_Sub1(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static74.method1181(arg9, arg8));
		super.anInt8764 = arg6;
		this.aByte63 = (byte) arg9;
		this.aBoolean362 = arg10;
		super.anInt8761 = arg4;
		this.aByte62 = (byte) arg8;
		this.aBoolean360 = arg1.anInt807 != 0 && !arg7;
		this.aBoolean364 = arg7;
		this.aShort51 = (short) arg1.anInt773;
		this.aBoolean361 = arg0.method6218() && arg1.aBoolean50 && !this.aBoolean364 && Static72.aClass2_Sub12_Sub1_1.method1411(Static391.anInt6846) != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean362) {
			local66 |= 0x10000;
		}
		@Pc(81) Class191 local81 = this.method3756(local66, arg0, this.aBoolean361);
		if (local81 != null) {
			this.aClass2_Sub3_Sub6_1 = local81.aClass2_Sub3_Sub6_3;
			this.aClass66_1 = local81.aClass66_3;
			if (this.aBoolean362) {
				this.aClass66_1 = this.aClass66_1.method7551((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	@Override
	public void method7334() {
		if (this.aClass66_1 != null) {
			this.aClass66_1.method7546();
		}
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method7330() {
		return this.aBoolean362;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7339() {
		return this.aBoolean361;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)I")
	@Override
	public int method7340() {
		return this.aByte63;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7323(@OriginalArg(1) Class100 arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)I")
	@Override
	public int method7328() {
		return this.aClass66_1 == null ? 0 : this.aClass66_1.J();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIBLclient!r;Lclient!lo;II)V")
	@Override
	public void method7325(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) Class6_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class6_Sub1_Sub3_Sub1) {
			@Pc(39) Class6_Sub1_Sub3_Sub1 local39 = (Class6_Sub1_Sub3_Sub1) arg3;
			if (this.aClass66_1 == null || local39.aClass66_1 == null) {
				return;
			}
			this.aClass66_1.method7553(local39.aClass66_1, arg1, arg4, arg5, arg0);
		} else if (arg3 instanceof Class6_Sub1_Sub1_Sub4) {
			@Pc(20) Class6_Sub1_Sub1_Sub4 local20 = (Class6_Sub1_Sub1_Sub4) arg3;
			if (this.aClass66_1 != null && local20.aClass66_4 != null) {
				this.aClass66_1.method7553(local20.aClass66_4, arg1, arg4, arg5, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)I")
	@Override
	public int method7336() {
		return this.aByte62;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BILclient!r;Z)Lclient!kj;")
	private Class191 method3756(@OriginalArg(1) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class32 local18 = Static541.aClass97_4.method1794(this.aShort51 & 0xFFFF);
		@Pc(41) Class67 local41;
		@Pc(27) Class67 local27;
		if (this.aBoolean364) {
			local41 = Static592.aClass67Array4[super.aByte111];
			local27 = Static569.aClass67Array8[0];
		} else {
			if (super.aByte111 >= 3) {
				local27 = null;
			} else {
				local27 = Static569.aClass67Array8[super.aByte111 + 1];
			}
			local41 = Static569.aClass67Array8[super.aByte111];
		}
		return local18.method559(arg0, arg1, super.anInt8759, local41, super.anInt8761, local27, super.anInt8764, arg2, this.aByte62, this.aByte63);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7335(@OriginalArg(1) Class100 arg0) {
		@Pc(14) Class2_Sub3_Sub6 local14;
		if (this.aClass2_Sub3_Sub6_1 == null && this.aBoolean361) {
			@Pc(25) Class191 local25 = this.method3756(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass2_Sub3_Sub6_3;
		} else {
			local14 = this.aClass2_Sub3_Sub6_1;
			this.aClass2_Sub3_Sub6_1 = null;
		}
		if (local14 != null) {
			Static65.method1052(local14, super.aByte111, super.anInt8761, super.anInt8764, null);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!r;I)Lclient!sd;")
	@Override
	public Class297 method7326(@OriginalArg(0) Class100 arg0) {
		if (this.aClass297_1 == null) {
			this.aClass297_1 = Static510.method7075(super.anInt8759, this.method3759(arg0, 0), super.anInt8764, super.anInt8761);
		}
		return this.aClass297_1;
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7318() {
		return this.aClass66_1 == null ? false : this.aClass66_1.LA();
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
	@Override
	public void method7322() {
		this.aBoolean362 = false;
		if (this.aClass66_1 != null) {
			this.aClass66_1.SA(this.aClass66_1.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLclient!r;)Lclient!og;")
	@Override
	public Class6_Sub5 method7317(@OriginalArg(1) Class100 arg0) {
		if (this.aClass66_1 == null) {
			return null;
		}
		@Pc(11) Class68 local11 = arg0.method6222();
		local11.NA(super.anInt8761, super.anInt8759, super.anInt8764);
		@Pc(26) Class6_Sub5 local26 = null;
		if (this.aBoolean360) {
			local26 = Static305.method4561(1);
		}
		if (Static338.aBoolean493) {
			this.aClass66_1.method7556(local11, local26 == null ? null : local26.aClass6_Sub6Array1[0], Static401.anInt6991, 0);
		} else {
			this.aClass66_1.method7558(local11, local26 == null ? null : local26.aClass6_Sub6Array1[0], 0);
		}
		return local26;
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7329() {
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!r;IB)Lclient!da;")
	private Class66 method3759(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass66_1 != null && arg0.method6216(this.aClass66_1.PA(), arg1) == 0) {
			return this.aClass66_1;
		} else {
			@Pc(32) Class191 local32 = this.method3756(arg1, arg0, false);
			return local32 == null ? null : local32.aClass66_3;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)I")
	@Override
	public int method7337() {
		return this.aShort51 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		@Pc(17) Class66 local17 = this.method3759(arg2, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class68 local22 = arg2.method6222();
			local22.NA(super.anInt8761, super.anInt8759, super.anInt8764);
			return Static338.aBoolean493 ? local17.method7547(arg0, arg1, local22, false, Static401.anInt6991) : local17.method7541(arg0, arg1, local22, false);
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)I")
	@Override
	public int method7319(@OriginalArg(0) int arg0) {
		if (arg0 != -22496) {
			Static242.aBoolean363 = false;
		}
		return this.aClass66_1 == null ? 0 : this.aClass66_1.RA();
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(BLclient!r;)V")
	@Override
	public void method7338(@OriginalArg(1) Class100 arg0) {
		@Pc(25) Class2_Sub3_Sub6 local25;
		if (this.aClass2_Sub3_Sub6_1 == null && this.aBoolean361) {
			@Pc(18) Class191 local18 = this.method3756(262144, arg0, true);
			local25 = local18 == null ? null : local18.aClass2_Sub3_Sub6_3;
		} else {
			local25 = this.aClass2_Sub3_Sub6_1;
			this.aClass2_Sub3_Sub6_1 = null;
		}
		if (local25 != null) {
			Static384.method7168(local25, super.aByte111, super.anInt8761, super.anInt8764, null);
		}
	}
}
