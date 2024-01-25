import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class6_Sub1_Sub2_Sub2 extends Class6_Sub1_Sub2 implements Interface24 {

	@OriginalMember(owner = "client!ub", name = "V", descriptor = "[I")
	public static final int[] anIntArray631 = new int[256];

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "Lclient!sd;")
	private Class297 aClass297_7;

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "B")
	private final byte aByte110;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "S")
	private final short aShort97;

	@OriginalMember(owner = "client!ub", name = "hb", descriptor = "Z")
	private final boolean aBoolean673;

	@OriginalMember(owner = "client!ub", name = "gb", descriptor = "Z")
	private final boolean aBoolean672;

	@OriginalMember(owner = "client!ub", name = "ob", descriptor = "Z")
	private boolean aBoolean674;

	@OriginalMember(owner = "client!ub", name = "eb", descriptor = "Z")
	private final boolean aBoolean671;

	@OriginalMember(owner = "client!ub", name = "Y", descriptor = "Lclient!ha;")
	private Class2_Sub3_Sub6 aClass2_Sub3_Sub6_6;

	@OriginalMember(owner = "client!ub", name = "bb", descriptor = "Lclient!da;")
	private Class66 aClass66_7;

	static {
		for (@Pc(9) int local9 = 0; local9 < 256; local9++) {
			@Pc(12) int local12 = local9;
			for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
				if ((local12 & 0x1) == 1) {
					local12 = local12 >>> 1 ^ 0xEDB88320;
				} else {
					local12 >>>= 0x1;
				}
			}
			anIntArray631[local9] = local12;
		}
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!r;Lclient!bda;IIIIIZIZ)V")
	public Class6_Sub1_Sub2_Sub2(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt776);
		this.aByte110 = (byte) arg8;
		this.aShort97 = (short) arg1.anInt773;
		this.aBoolean673 = arg7;
		this.aBoolean672 = arg1.anInt807 != 0 && !arg7;
		this.aBoolean674 = arg9;
		super.anInt8761 = arg4;
		super.anInt8764 = arg6;
		this.aBoolean671 = arg0.method6218() && arg1.aBoolean50 && !this.aBoolean673 && Static72.aClass2_Sub12_Sub1_1.method1411(Static391.anInt6846) != 0;
		@Pc(60) int local60 = 2048;
		if (this.aBoolean674) {
			local60 |= 0x10000;
		}
		@Pc(75) Class191 local75 = this.method7267(local60, this.aBoolean671, arg0);
		if (local75 != null) {
			this.aClass2_Sub3_Sub6_6 = local75.aClass2_Sub3_Sub6_3;
			this.aClass66_7 = local75.aClass66_3;
			if (this.aBoolean674) {
				this.aClass66_7 = this.aClass66_7.method7551((byte) 0, local60, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)I")
	@Override
	public int method7337() {
		return this.aShort97 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	@Override
	public void method7334() {
		if (this.aClass66_7 != null) {
			this.aClass66_7.method7546();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZZLclient!r;)Lclient!kj;")
	private Class191 method7267(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(19) Class32 local19 = Static541.aClass97_4.method1794(this.aShort97 & 0xFFFF);
		@Pc(31) Class67 local31;
		@Pc(26) Class67 local26;
		if (this.aBoolean673) {
			local26 = Static569.aClass67Array8[0];
			local31 = Static592.aClass67Array4[super.aByte111];
		} else {
			local31 = Static569.aClass67Array8[super.aByte111];
			if (super.aByte111 < 3) {
				local26 = Static569.aClass67Array8[super.aByte111 + 1];
			} else {
				local26 = null;
			}
		}
		return local19.method559(arg0, arg2, super.anInt8759, local31, super.anInt8761, local26, super.anInt8764, arg1, 22, this.aByte110);
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)I")
	@Override
	public int method7328() {
		return this.aClass66_7 == null ? 0 : this.aClass66_7.J();
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)I")
	@Override
	public int method7319(@OriginalArg(0) int arg0) {
		if (arg0 != -22496) {
			this.aClass2_Sub3_Sub6_6 = null;
		}
		return this.aClass66_7 == null ? 0 : this.aClass66_7.RA();
	}

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method7330() {
		return this.aBoolean674;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		@Pc(14) Class66 local14 = this.method7269(131072, arg2);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class68 local19 = arg2.method6222();
			local19.NA(super.anInt8761, super.anInt8759, super.anInt8764);
			return Static338.aBoolean493 ? local14.method7547(arg0, arg1, local19, false, Static401.anInt6991) : local14.method7541(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIBLclient!r;Lclient!lo;II)V")
	@Override
	public void method7325(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) Class6_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class6_Sub1_Sub2_Sub2) {
			@Pc(5) Class6_Sub1_Sub2_Sub2 local5 = (Class6_Sub1_Sub2_Sub2) arg3;
			if (this.aClass66_7 != null && local5.aClass66_7 != null) {
				this.aClass66_7.method7553(local5.aClass66_7, arg1, arg4, arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!r;I)Lclient!sd;")
	@Override
	public Class297 method7326(@OriginalArg(0) Class100 arg0) {
		if (this.aClass297_7 == null) {
			this.aClass297_7 = Static510.method7075(super.anInt8759, this.method7269(0, arg0), super.anInt8764, super.anInt8761);
		}
		return this.aClass297_7;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	@Override
	public void method7322() {
		this.aBoolean674 = false;
		if (this.aClass66_7 != null) {
			this.aClass66_7.SA(this.aClass66_7.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZLclient!r;)Lclient!og;")
	@Override
	public Class6_Sub5 method7317(@OriginalArg(1) Class100 arg0) {
		if (this.aClass66_7 == null) {
			return null;
		}
		@Pc(17) Class68 local17 = arg0.method6222();
		local17.NA(super.anInt8761, super.anInt8759, super.anInt8764);
		@Pc(27) Class6_Sub5 local27 = null;
		if (this.aBoolean672) {
			local27 = Static305.method4561(1);
		}
		if (Static338.aBoolean493) {
			this.aClass66_7.method7556(local17, local27 == null ? null : local27.aClass6_Sub6Array1[0], Static401.anInt6991, 0);
		} else {
			this.aClass66_7.method7558(local17, local27 == null ? null : local27.aClass6_Sub6Array1[0], 0);
		}
		return local27;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I")
	@Override
	public int method7336() {
		return 22;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZLclient!r;)Lclient!da;")
	private Class66 method7269(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1) {
		if (this.aClass66_7 != null && arg1.method6216(this.aClass66_7.PA(), arg0) == 0) {
			return this.aClass66_7;
		} else {
			@Pc(32) Class191 local32 = this.method7267(arg0, false, arg1);
			return local32 == null ? null : local32.aClass66_3;
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)I")
	@Override
	public int method7340() {
		return this.aByte110;
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7329() {
		return true;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7339() {
		return this.aBoolean671;
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7318() {
		return this.aClass66_7 == null ? false : this.aClass66_7.LA();
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7323(@OriginalArg(1) Class100 arg0) {
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(BLclient!r;)V")
	@Override
	public void method7338(@OriginalArg(1) Class100 arg0) {
		@Pc(20) Class2_Sub3_Sub6 local20;
		if (this.aClass2_Sub3_Sub6_6 == null && this.aBoolean671) {
			@Pc(31) Class191 local31 = this.method7267(262144, true, arg0);
			local20 = local31 == null ? null : local31.aClass2_Sub3_Sub6_3;
		} else {
			local20 = this.aClass2_Sub3_Sub6_6;
			this.aClass2_Sub3_Sub6_6 = null;
		}
		if (local20 != null) {
			Static384.method7168(local20, super.aByte111, super.anInt8761, super.anInt8764, null);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7335(@OriginalArg(1) Class100 arg0) {
		@Pc(22) Class2_Sub3_Sub6 local22;
		if (this.aClass2_Sub3_Sub6_6 == null && this.aBoolean671) {
			@Pc(33) Class191 local33 = this.method7267(262144, true, arg0);
			local22 = local33 == null ? null : local33.aClass2_Sub3_Sub6_3;
		} else {
			local22 = this.aClass2_Sub3_Sub6_6;
			this.aClass2_Sub3_Sub6_6 = null;
		}
		if (local22 != null) {
			Static65.method1052(local22, super.aByte111, super.anInt8761, super.anInt8764, null);
		}
	}
}
