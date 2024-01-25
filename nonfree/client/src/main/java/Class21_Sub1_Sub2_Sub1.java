import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class21_Sub1_Sub2_Sub1 extends Class21_Sub1_Sub2 implements Interface21 {

	@OriginalMember(owner = "client!ie", name = "lb", descriptor = "Lclient!me;")
	public static Class212 lb;

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "Lclient!eh;")
	private Class93 aClass93_2;

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "B")
	private final byte aByte72;

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "Z")
	private boolean aBoolean308;

	@OriginalMember(owner = "client!ie", name = "K", descriptor = "B")
	private final byte aByte71;

	@OriginalMember(owner = "client!ie", name = "eb", descriptor = "Z")
	private final boolean aBoolean311;

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "Z")
	private final boolean aBoolean309;

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "S")
	private final short aShort46;

	@OriginalMember(owner = "client!ie", name = "G", descriptor = "Z")
	private final boolean aBoolean310;

	@OriginalMember(owner = "client!ie", name = "N", descriptor = "Lclient!da;")
	public Class65 aClass65_4;

	@OriginalMember(owner = "client!ie", name = "db", descriptor = "Lclient!ha;")
	private Class4_Sub6_Sub7 aClass4_Sub6_Sub7_4;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!r;Lclient!nf;IIIIIZIIZ)V")
	public Class21_Sub1_Sub2_Sub1(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class233 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static378.method5888(arg8, arg9));
		super.anInt10551 = arg4;
		this.aByte72 = (byte) arg8;
		this.aBoolean308 = arg10;
		this.aByte71 = (byte) arg9;
		this.aBoolean311 = arg1.anInt6681 != 0 && !arg7;
		super.anInt10550 = arg6;
		this.aBoolean309 = arg7;
		this.aShort46 = (short) arg1.anInt6713;
		this.aBoolean310 = arg0.method7782() && arg1.aBoolean466 && !this.aBoolean309 && Static455.aClass4_Sub35_Sub1_1.method7614(Static453.anInt8614) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean308) {
			local69 |= 0x10000;
		}
		@Pc(84) Class108 local84 = this.method3477(arg0, local69, this.aBoolean310);
		if (local84 != null) {
			this.aClass65_4 = local84.aClass65_2;
			this.aClass4_Sub6_Sub7_4 = local84.aClass4_Sub6_Sub7_2;
			if (this.aBoolean308) {
				this.aClass65_4 = this.aClass65_4.method7682((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)I")
	@Override
	public int method7280() {
		return this.aByte72;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILclient!r;B)Z")
	@Override
	public boolean method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2) {
		@Pc(9) Class65 local9 = this.method3479(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class81 local14 = arg2.method7812();
			local14.NA(super.anInt10551, super.anInt10554, super.anInt10550);
			return Static263.aBoolean371 ? local9.method7685(arg0, arg1, local14, false, Static18.anInt941) : local9.method7684(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!vj;IZLclient!r;IIB)V")
	@Override
	public void method8230(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 instanceof Class21_Sub1_Sub2_Sub1) {
			@Pc(37) Class21_Sub1_Sub2_Sub1 local37 = (Class21_Sub1_Sub2_Sub1) arg0;
			if (this.aClass65_4 == null || local37.aClass65_4 == null) {
				return;
			}
			this.aClass65_4.method7677(local37.aClass65_4, arg1, arg4, arg5, arg2);
		} else if (arg0 instanceof Class21_Sub1_Sub1_Sub4) {
			@Pc(18) Class21_Sub1_Sub1_Sub4 local18 = (Class21_Sub1_Sub1_Sub4) arg0;
			if (this.aClass65_4 != null && local18.aClass65_5 != null) {
				this.aClass65_4.method7677(local18.aClass65_5, arg1, arg4, arg5, arg2);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)I")
	@Override
	public int method7283() {
		return this.aByte71;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I")
	@Override
	public int method8224(@OriginalArg(0) byte arg0) {
		if (arg0 > -102) {
			return -9;
		} else if (this.aClass65_4 == null) {
			return 0;
		} else {
			return this.aClass65_4.RA();
		}
	}

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8225() {
		return this.aBoolean308;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
	@Override
	public void method7284() {
		if (this.aClass65_4 != null) {
			this.aClass65_4.method7676();
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7282() {
		return this.aBoolean310;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8235() {
		return true;
	}

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8229() {
		return this.aClass65_4 == null ? false : this.aClass65_4.LA();
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(ILclient!r;)Lclient!eh;")
	@Override
	public Class93 method8223(@OriginalArg(1) Class7 arg0) {
		if (this.aClass93_2 == null) {
			this.aClass93_2 = Static369.method7616(super.anInt10551, super.anInt10554, super.anInt10550, this.method3479(arg0, 0));
		}
		return this.aClass93_2;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(ILclient!r;)V")
	@Override
	public void method8233(@OriginalArg(1) Class7 arg0) {
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method7278(@OriginalArg(0) Class7 arg0) {
		@Pc(19) Class4_Sub6_Sub7 local19;
		if (this.aClass4_Sub6_Sub7_4 == null && this.aBoolean310) {
			@Pc(30) Class108 local30 = this.method3477(arg0, 262144, true);
			local19 = local30 == null ? null : local30.aClass4_Sub6_Sub7_2;
		} else {
			local19 = this.aClass4_Sub6_Sub7_4;
			this.aClass4_Sub6_Sub7_4 = null;
		}
		if (local19 != null) {
			Static4.method1519(local19, super.aByte128, super.anInt10551, super.anInt10550, null);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!r;IIZ)Lclient!fj;")
	private Class108 method3477(@OriginalArg(0) Class7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class233 local18 = Static103.aClass298_1.method6822(this.aShort46 & 0xFFFF);
		@Pc(26) Class115 local26;
		@Pc(30) Class115 local30;
		if (this.aBoolean309) {
			local26 = Static140.aClass115Array1[super.aByte128];
			local30 = Static432.aClass115Array3[0];
		} else {
			if (super.aByte128 >= 3) {
				local30 = null;
			} else {
				local30 = Static432.aClass115Array3[super.aByte128 + 1];
			}
			local26 = Static432.aClass115Array3[super.aByte128];
		}
		return local18.method5286(local30, super.anInt10554, this.aByte71, arg0, this.aByte72, super.anInt10551, local26, arg1, arg2, super.anInt10550);
	}

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "(I)I")
	@Override
	public int method8231() {
		return this.aClass65_4 == null ? 0 : this.aClass65_4.J();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!r;IZ)Lclient!da;")
	private Class65 method3479(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass65_4 != null && arg0.method7793(this.aClass65_4.PA(), arg1) == 0) {
			return this.aClass65_4;
		} else {
			@Pc(26) Class108 local26 = this.method3477(arg0, arg1, false);
			return local26 == null ? null : local26.aClass65_2;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!r;I)Lclient!ej;")
	@Override
	public Class21_Sub4 method8228(@OriginalArg(0) Class7 arg0) {
		if (this.aClass65_4 == null) {
			return null;
		}
		@Pc(11) Class81 local11 = arg0.method7812();
		local11.NA(super.anInt10551, super.anInt10554, super.anInt10550);
		@Pc(27) Class21_Sub4 local27 = null;
		if (this.aBoolean311) {
			local27 = Static227.method3708(1);
		}
		if (Static263.aBoolean371) {
			this.aClass65_4.method7686(local11, local27 == null ? null : local27.aClass21_Sub7Array1[0], Static18.anInt941, 0);
		} else {
			this.aClass65_4.method7679(local11, local27 == null ? null : local27.aClass21_Sub7Array1[0], 0);
		}
		return local27;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7279(@OriginalArg(1) Class7 arg0) {
		@Pc(29) Class4_Sub6_Sub7 local29;
		if (this.aClass4_Sub6_Sub7_4 == null && this.aBoolean310) {
			@Pc(22) Class108 local22 = this.method3477(arg0, 262144, true);
			local29 = local22 == null ? null : local22.aClass4_Sub6_Sub7_2;
		} else {
			local29 = this.aClass4_Sub6_Sub7_4;
			this.aClass4_Sub6_Sub7_4 = null;
		}
		if (local29 != null) {
			Static440.method6502(local29, super.aByte128, super.anInt10551, super.anInt10550, null);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I")
	@Override
	public int method7281() {
		return this.aShort46 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "(I)V")
	@Override
	public void method8232() {
		this.aBoolean308 = false;
		if (this.aClass65_4 != null) {
			this.aClass65_4.SA(this.aClass65_4.PA() & 0xFFFEFFFF);
		}
	}
}
