import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class6_Sub1_Sub5_Sub2 extends Class6_Sub1_Sub5 implements Interface24 {

	@OriginalMember(owner = "client!kga", name = "lb", descriptor = "Lclient!rj;")
	public static Class287 lb;

	@OriginalMember(owner = "client!kga", name = "gb", descriptor = "Lclient!sd;")
	private Class297 aClass297_3;

	@OriginalMember(owner = "client!kga", name = "T", descriptor = "B")
	private final byte aByte70;

	@OriginalMember(owner = "client!kga", name = "eb", descriptor = "B")
	private final byte aByte71;

	@OriginalMember(owner = "client!kga", name = "ib", descriptor = "Z")
	private final boolean aBoolean398;

	@OriginalMember(owner = "client!kga", name = "O", descriptor = "Z")
	private final boolean aBoolean396;

	@OriginalMember(owner = "client!kga", name = "I", descriptor = "S")
	private final short aShort59;

	@OriginalMember(owner = "client!kga", name = "X", descriptor = "Z")
	private final boolean aBoolean397;

	@OriginalMember(owner = "client!kga", name = "hb", descriptor = "Lclient!ha;")
	private Class2_Sub3_Sub6 aClass2_Sub3_Sub6_2;

	@OriginalMember(owner = "client!kga", name = "V", descriptor = "Lclient!da;")
	private Class66 aClass66_2;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lclient!r;Lclient!bda;IIIIIZIIII)V")
	public Class6_Sub1_Sub5_Sub2(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aByte70 = (byte) arg10;
		this.aByte71 = (byte) arg11;
		super.anInt8764 = arg6;
		super.anInt8761 = arg4;
		this.aBoolean398 = arg7;
		this.aBoolean396 = arg1.anInt807 != 0 && !arg7;
		this.aShort59 = (short) arg1.anInt773;
		this.aBoolean397 = arg0.method6218() && arg1.aBoolean50 && !this.aBoolean398 && Static72.aClass2_Sub12_Sub1_1.method1411(Static391.anInt6846) != 0;
		@Pc(70) Class191 local70 = this.method4192(arg0, 2048, this.aBoolean397);
		if (local70 != null) {
			this.aClass2_Sub3_Sub6_2 = local70.aClass2_Sub3_Sub6_3;
			this.aClass66_2 = local70.aClass66_3;
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		@Pc(9) Class66 local9 = this.method4193(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class68 local19 = arg2.method6222();
			local19.NA(super.anInt8761, super.anInt8759, super.anInt8764);
			return Static338.aBoolean493 ? local9.method7547(arg0, arg1, local19, false, Static401.anInt6991) : local9.method7541(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)V")
	@Override
	public void method7334() {
		if (this.aClass66_2 != null) {
			this.aClass66_2.method7546();
		}
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)I")
	@Override
	public int method7337() {
		return this.aShort59 & 0xFFFF;
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(BLclient!r;)V")
	@Override
	public void method7338(@OriginalArg(1) Class100 arg0) {
		@Pc(31) Class2_Sub3_Sub6 local31;
		if (this.aClass2_Sub3_Sub6_2 == null && this.aBoolean397) {
			@Pc(24) Class191 local24 = this.method4192(arg0, 262144, true);
			local31 = local24 == null ? null : local24.aClass2_Sub3_Sub6_3;
		} else {
			local31 = this.aClass2_Sub3_Sub6_2;
			this.aClass2_Sub3_Sub6_2 = null;
		}
		if (local31 != null) {
			Static384.method7168(local31, super.aByte111, super.anInt8761, super.anInt8764, null);
		}
	}

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7329() {
		return true;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!r;I)Lclient!sd;")
	@Override
	public Class297 method7326(@OriginalArg(0) Class100 arg0) {
		if (this.aClass297_3 == null) {
			this.aClass297_3 = Static510.method7075(super.anInt8759, this.method4193(0, arg0), super.anInt8764, super.anInt8761);
		}
		return this.aClass297_3;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZLclient!r;)Lclient!og;")
	@Override
	public Class6_Sub5 method7317(@OriginalArg(1) Class100 arg0) {
		if (this.aClass66_2 == null) {
			return null;
		}
		@Pc(11) Class68 local11 = arg0.method6222();
		local11.NA(super.aShort58 + super.anInt8761, super.anInt8759, super.aShort57 + super.anInt8764);
		@Pc(34) Class6_Sub5 local34 = null;
		if (this.aBoolean396) {
			local34 = Static305.method4561(1);
		}
		if (Static338.aBoolean493) {
			this.aClass66_2.method7556(local11, local34 == null ? null : local34.aClass6_Sub6Array1[0], Static401.anInt6991, 0);
		} else {
			this.aClass66_2.method7558(local11, local34 == null ? null : local34.aClass6_Sub6Array1[0], 0);
		}
		return local34;
	}

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7318() {
		return this.aClass66_2 == null ? false : this.aClass66_2.LA();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7335(@OriginalArg(1) Class100 arg0) {
		@Pc(22) Class2_Sub3_Sub6 local22;
		if (this.aClass2_Sub3_Sub6_2 == null && this.aBoolean397) {
			@Pc(33) Class191 local33 = this.method4192(arg0, 262144, true);
			local22 = local33 == null ? null : local33.aClass2_Sub3_Sub6_3;
		} else {
			local22 = this.aClass2_Sub3_Sub6_2;
			this.aClass2_Sub3_Sub6_2 = null;
		}
		if (local22 != null) {
			Static65.method1052(local22, super.aByte111, super.anInt8761, super.anInt8764, null);
		}
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7323(@OriginalArg(1) Class100 arg0) {
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(B)I")
	@Override
	public int method7340() {
		return this.aByte71;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!r;IZI)Lclient!kj;")
	private Class191 method4192(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) Class32 local13 = Static541.aClass97_4.method1794(this.aShort59 & 0xFFFF);
		@Pc(43) Class67 local43;
		@Pc(29) Class67 local29;
		if (this.aBoolean398) {
			local29 = Static569.aClass67Array8[0];
			local43 = Static592.aClass67Array4[super.aByte111];
		} else {
			if (super.aByte111 >= 3) {
				local29 = null;
			} else {
				local29 = Static569.aClass67Array8[super.aByte111 + 1];
			}
			local43 = Static569.aClass67Array8[super.aByte111];
		}
		return local13.method559(arg1, arg0, super.anInt8759, local43, super.anInt8761, local29, super.anInt8764, arg2, this.aByte70, this.aByte71);
	}

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "(I)I")
	@Override
	public int method7328() {
		return this.aClass66_2 == null ? 0 : this.aClass66_2.J();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)I")
	@Override
	public int method7336() {
		return this.aByte70;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7339() {
		return this.aBoolean397;
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(I)I")
	@Override
	public int method7319(@OriginalArg(0) int arg0) {
		if (arg0 != -22496) {
			this.aClass297_3 = null;
		}
		return this.aClass66_2 == null ? 0 : this.aClass66_2.RA();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILclient!r;I)Lclient!da;")
	private Class66 method4193(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1) {
		if (this.aClass66_2 != null && arg1.method6216(this.aClass66_2.PA(), arg0) == 0) {
			return this.aClass66_2;
		} else {
			@Pc(36) Class191 local36 = this.method4192(arg1, arg0, false);
			return local36 == null ? null : local36.aClass66_3;
		}
	}
}
