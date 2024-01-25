import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class21_Sub1_Sub1_Sub4 extends Class21_Sub1_Sub1 implements Interface21 {

	@OriginalMember(owner = "client!kh", name = "G", descriptor = "Lclient!eh;")
	private Class93 aClass93_5;

	@OriginalMember(owner = "client!kh", name = "bb", descriptor = "Z")
	private final boolean aBoolean407;

	@OriginalMember(owner = "client!kh", name = "L", descriptor = "B")
	private final byte aByte89;

	@OriginalMember(owner = "client!kh", name = "R", descriptor = "Z")
	private boolean aBoolean406;

	@OriginalMember(owner = "client!kh", name = "M", descriptor = "Z")
	private final boolean aBoolean405;

	@OriginalMember(owner = "client!kh", name = "W", descriptor = "S")
	private final short aShort75;

	@OriginalMember(owner = "client!kh", name = "U", descriptor = "B")
	private final byte aByte90;

	@OriginalMember(owner = "client!kh", name = "hb", descriptor = "Z")
	private final boolean aBoolean408;

	@OriginalMember(owner = "client!kh", name = "H", descriptor = "Lclient!da;")
	public Class65 aClass65_5;

	@OriginalMember(owner = "client!kh", name = "lb", descriptor = "Lclient!ha;")
	private Class4_Sub6_Sub7 lb;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!r;Lclient!nf;IIIIIZIIIIIIZ)V")
	public Class21_Sub1_Sub1_Sub4(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class233 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt6715 == 1, Static542.method7592(arg13, arg12));
		this.aBoolean407 = arg1.anInt6681 != 0 && !arg7;
		this.aByte89 = (byte) arg13;
		this.aBoolean406 = arg14;
		this.aBoolean405 = arg7;
		this.aShort75 = (short) arg1.anInt6713;
		this.aByte90 = (byte) arg12;
		super.aByte128 = (byte) arg3;
		this.aBoolean408 = arg0.method7782() && arg1.aBoolean466 && !this.aBoolean405 && Static455.aClass4_Sub35_Sub1_1.method7614(Static453.anInt8614) != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean406) {
			local80 |= 0x10000;
		}
		@Pc(95) Class108 local95 = this.method4402(this.aBoolean408, local80, arg0);
		if (local95 != null) {
			this.aClass65_5 = local95.aClass65_2;
			this.lb = local95.aClass4_Sub6_Sub7_2;
			if (this.aBoolean406) {
				this.aClass65_5 = this.aClass65_5.method7682((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLclient!r;I)Lclient!da;")
	private Class65 method4399(@OriginalArg(1) Class7 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass65_5 != null && arg0.method7793(this.aClass65_5.PA(), arg1) == 0) {
			return this.aClass65_5;
		} else {
			@Pc(26) Class108 local26 = this.method4402(false, arg1, arg0);
			return local26 == null ? null : local26.aClass65_2;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method7278(@OriginalArg(0) Class7 arg0) {
		@Pc(24) Class4_Sub6_Sub7 local24;
		if (this.lb == null && this.aBoolean408) {
			@Pc(35) Class108 local35 = this.method4402(true, 262144, arg0);
			local24 = local35 == null ? null : local35.aClass4_Sub6_Sub7_2;
		} else {
			local24 = this.lb;
			this.lb = null;
		}
		if (local24 != null) {
			Static4.method1519(local24, super.aByte128, super.anInt10551, super.anInt10550, null);
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7282() {
		return this.aBoolean408;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)I")
	public int method4400() {
		return this.aClass65_5 == null ? 15 : this.aClass65_5.K() / 4;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZIBLclient!r;)Lclient!fj;")
	private Class108 method4402(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class7 arg2) {
		@Pc(18) Class233 local18 = Static103.aClass298_1.method6822(this.aShort75 & 0xFFFF);
		@Pc(26) Class115 local26;
		@Pc(30) Class115 local30;
		if (this.aBoolean405) {
			local26 = Static140.aClass115Array1[super.aByte128];
			local30 = Static432.aClass115Array3[0];
		} else {
			local26 = Static432.aClass115Array3[super.aByte128];
			if (super.aByte128 >= 3) {
				local30 = null;
			} else {
				local30 = Static432.aClass115Array3[super.aByte128 + 1];
			}
		}
		return local18.method5286(local30, super.anInt10554, this.aByte90 == 11 ? this.aByte89 + 4 : this.aByte89, arg2, this.aByte90 == 11 ? 10 : this.aByte90, super.anInt10551, local26, arg1, arg0, super.anInt10550);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8235() {
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(ILclient!r;)V")
	@Override
	public void method8233(@OriginalArg(1) Class7 arg0) {
	}

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8229() {
		return this.aClass65_5 == null ? false : this.aClass65_5.LA();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7279(@OriginalArg(1) Class7 arg0) {
		@Pc(18) Class4_Sub6_Sub7 local18;
		if (this.lb == null && this.aBoolean408) {
			@Pc(29) Class108 local29 = this.method4402(true, 262144, arg0);
			local18 = local29 == null ? null : local29.aClass4_Sub6_Sub7_2;
		} else {
			local18 = this.lb;
			this.lb = null;
		}
		if (local18 != null) {
			Static440.method6502(local18, super.aByte128, super.anInt10551, super.anInt10550, null);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)I")
	@Override
	public int method8224(@OriginalArg(0) byte arg0) {
		if (arg0 > -102) {
			Static271.aClass90_82 = null;
		}
		return this.aClass65_5 == null ? 0 : this.aClass65_5.RA();
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)I")
	@Override
	public int method7283() {
		return this.aByte89;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)I")
	@Override
	public int method7280() {
		return this.aByte90;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!vj;IZLclient!r;IIB)V")
	@Override
	public void method8230(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 instanceof Class21_Sub1_Sub2_Sub1) {
			@Pc(5) Class21_Sub1_Sub2_Sub1 local5 = (Class21_Sub1_Sub2_Sub1) arg0;
			if (this.aClass65_5 != null && local5.aClass65_4 != null) {
				this.aClass65_5.method7677(local5.aClass65_4, arg1, arg4, arg5, arg2);
			}
		} else if (arg0 instanceof Class21_Sub1_Sub1_Sub4) {
			@Pc(28) Class21_Sub1_Sub1_Sub4 local28 = (Class21_Sub1_Sub1_Sub4) arg0;
			if (this.aClass65_5 != null && local28.aClass65_5 != null) {
				this.aClass65_5.method7677(local28.aClass65_5, arg1, arg4, arg5, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "(I)I")
	@Override
	public int method8231() {
		return this.aClass65_5 == null ? 0 : this.aClass65_5.J();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!r;I)Lclient!ej;")
	@Override
	public Class21_Sub4 method8228(@OriginalArg(0) Class7 arg0) {
		if (this.aClass65_5 == null) {
			return null;
		}
		@Pc(18) Class81 local18 = arg0.method7812();
		local18.NA(super.anInt10551, super.anInt10554, super.anInt10550);
		@Pc(28) Class21_Sub4 local28 = null;
		if (this.aBoolean407) {
			local28 = Static227.method3708(1);
		}
		if (Static263.aBoolean371) {
			this.aClass65_5.method7686(local18, local28 == null ? null : local28.aClass21_Sub7Array1[0], Static18.anInt941, 0);
		} else {
			this.aClass65_5.method7679(local18, local28 == null ? null : local28.aClass21_Sub7Array1[0], 0);
		}
		return local28;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
	@Override
	public void method7284() {
		if (this.aClass65_5 != null) {
			this.aClass65_5.method7676();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILclient!r;B)Z")
	@Override
	public boolean method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2) {
		@Pc(9) Class65 local9 = this.method4399(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(22) Class81 local22 = arg2.method7812();
			local22.NA(super.anInt10551, super.anInt10554, super.anInt10550);
			return Static263.aBoolean371 ? local9.method7685(arg0, arg1, local22, false, Static18.anInt941) : local9.method7684(arg0, arg1, local22, false);
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(ILclient!r;)Lclient!eh;")
	@Override
	public Class93 method8223(@OriginalArg(1) Class7 arg0) {
		if (this.aClass93_5 == null) {
			this.aClass93_5 = Static369.method7616(super.anInt10551, super.anInt10554, super.anInt10550, this.method4399(arg0, 0));
		}
		return this.aClass93_5;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
	@Override
	public int method7281() {
		return this.aShort75 & 0xFFFF;
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8225() {
		return this.aBoolean406;
	}

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "(I)V")
	@Override
	public void method8232() {
		this.aBoolean406 = false;
		if (this.aClass65_5 != null) {
			this.aClass65_5.SA(this.aClass65_5.PA() & 0xFFFEFFFF);
		}
	}
}
