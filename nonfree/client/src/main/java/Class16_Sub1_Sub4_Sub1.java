import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class16_Sub1_Sub4_Sub1 extends Class16_Sub1_Sub4 implements Interface25 {

	@OriginalMember(owner = "client!mga", name = "fb", descriptor = "Lclient!wg;")
	private Class379 aClass379_6;

	@OriginalMember(owner = "client!mga", name = "nb", descriptor = "B")
	private final byte aByte83;

	@OriginalMember(owner = "client!mga", name = "bb", descriptor = "S")
	private final short aShort86;

	@OriginalMember(owner = "client!mga", name = "gb", descriptor = "Z")
	private final boolean aBoolean444;

	@OriginalMember(owner = "client!mga", name = "kb", descriptor = "Z")
	private final boolean aBoolean445;

	@OriginalMember(owner = "client!mga", name = "ob", descriptor = "B")
	private final byte aByte84;

	@OriginalMember(owner = "client!mga", name = "ab", descriptor = "Z")
	private final boolean aBoolean443;

	@OriginalMember(owner = "client!mga", name = "ib", descriptor = "Lclient!ka;")
	private Class193 aClass193_5;

	@OriginalMember(owner = "client!mga", name = "O", descriptor = "Lclient!r;")
	private Class2_Sub7_Sub17 aClass2_Sub7_Sub17_4;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lclient!ha;Lclient!ac;IIIIIZIIII)V")
	public Class16_Sub1_Sub4_Sub1(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aByte83 = (byte) arg11;
		this.aShort86 = (short) arg1.anInt106;
		super.anInt8034 = arg6;
		this.aBoolean444 = arg7;
		super.anInt8037 = arg4;
		this.aBoolean445 = arg1.anInt81 != 0 && !arg7;
		this.aByte84 = (byte) arg10;
		this.aBoolean443 = arg0.method8109() && arg1.aBoolean3 && !this.aBoolean444 && Static305.aClass2_Sub49_15.aClass33_Sub18_1.method5267() != 0;
		@Pc(73) Class259 local73 = this.method5310(this.aBoolean443, arg0, 2048);
		if (local73 != null) {
			this.aClass193_5 = local73.aClass193_7;
			this.aClass2_Sub7_Sub17_4 = local73.aClass2_Sub7_Sub17_6;
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6978(@OriginalArg(0) Class13 arg0) {
	}

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "(B)I")
	@Override
	public int method6980() {
		return this.aClass193_5 == null ? 0 : this.aClass193_5.fa();
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!ha;BI)Lclient!ka;")
	private Class193 method5307(@OriginalArg(0) Class13 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass193_5 != null && arg0.method8163(this.aClass193_5.ua(), arg1) == 0) {
			return this.aClass193_5;
		} else {
			@Pc(29) Class259 local29 = this.method5310(false, arg0, arg1);
			return local29 == null ? null : local29.aClass193_7;
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method6985(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class193 local9 = this.method5307(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(23) Class51 local23 = arg1.method8154();
			local23.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
			return Static582.aBoolean678 ? local9.method6617(arg0, arg2, local23, false, 0, Static529.anInt8509) : local9.method6623(arg0, arg2, local23, false, 0);
		}
	}

	@OriginalMember(owner = "client!mga", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6974() {
		return this.aClass193_5 == null ? false : this.aClass193_5.F();
	}

	@OriginalMember(owner = "client!mga", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method6990() {
		if (this.aClass193_5 == null) {
			return true;
		} else {
			return !this.aClass193_5.r();
		}
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method6213(@OriginalArg(1) Class13 arg0) {
		@Pc(19) Class2_Sub7_Sub17 local19;
		if (this.aClass2_Sub7_Sub17_4 == null && this.aBoolean443) {
			@Pc(32) Class259 local32 = this.method5310(true, arg0, 262144);
			local19 = local32 == null ? null : local32.aClass2_Sub7_Sub17_6;
		} else {
			local19 = this.aClass2_Sub7_Sub17_4;
			this.aClass2_Sub7_Sub17_4 = null;
		}
		if (local19 != null) {
			Static118.method2106(local19, super.aByte108, super.anInt8037, super.anInt8034, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method6208(@OriginalArg(1) Class13 arg0) {
		@Pc(25) Class2_Sub7_Sub17 local25;
		if (this.aClass2_Sub7_Sub17_4 == null && this.aBoolean443) {
			@Pc(18) Class259 local18 = this.method5310(true, arg0, 262144);
			local25 = local18 == null ? null : local18.aClass2_Sub7_Sub17_6;
		} else {
			local25 = this.aClass2_Sub7_Sub17_4;
			this.aClass2_Sub7_Sub17_4 = null;
		}
		if (local25 != null) {
			Static28.method8894(local25, super.aByte108, super.anInt8037, super.anInt8034, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "(ILclient!ha;)Lclient!wg;")
	@Override
	public Class379 method6983(@OriginalArg(1) Class13 arg0) {
		if (this.aClass379_6 == null) {
			this.aClass379_6 = Static618.method8598(super.anInt8036, this.method5307(arg0, 0), super.anInt8034, super.anInt8037);
		}
		return this.aClass379_6;
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(B)V")
	@Override
	public void method6209() {
		if (this.aClass193_5 != null) {
			this.aClass193_5.method6624();
		}
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6211() {
		return this.aBoolean443;
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(Lclient!ha;I)Lclient!jk;")
	@Override
	public Class16_Sub5 method6991(@OriginalArg(0) Class13 arg0) {
		if (this.aClass193_5 == null) {
			return null;
		}
		@Pc(11) Class51 local11 = arg0.method8154();
		local11.method6705(super.aShort92 + super.anInt8037, super.anInt8036, super.anInt8034 + super.aShort91);
		@Pc(32) Class16_Sub5 local32 = Static134.method8011(this.aBoolean445, 1);
		if (Static582.aBoolean678) {
			this.aClass193_5.method6622(local11, local32.aClass16_Sub10Array1[0], Static529.anInt8509, 0);
		} else {
			this.aClass193_5.method6612(local11, local32.aClass16_Sub10Array1[0], 0);
		}
		return local32;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)I")
	@Override
	public int method6207() {
		return this.aShort86 & 0xFFFF;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Z)I")
	@Override
	public int method6212() {
		return this.aByte84;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)I")
	@Override
	public int method6210() {
		return this.aByte83;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(ZILclient!ha;I)Lclient!ok;")
	private Class259 method5310(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class5 local13 = Static79.aClass304_2.method6956(this.aShort86 & 0xFFFF);
		@Pc(25) Class91 local25;
		@Pc(20) Class91 local20;
		if (this.aBoolean444) {
			local20 = Static124.aClass91Array1[0];
			local25 = Static332.aClass91Array2[super.aByte108];
		} else {
			if (super.aByte108 < 3) {
				local20 = Static124.aClass91Array1[super.aByte108 + 1];
			} else {
				local20 = null;
			}
			local25 = Static124.aClass91Array1[super.aByte108];
		}
		return local13.method84(local20, super.anInt8034, this.aByte83, this.aByte84, local25, super.anInt8036, arg1, arg2, arg0, super.anInt8037, (Class326) null);
	}

	@OriginalMember(owner = "client!mga", name = "h", descriptor = "(I)I")
	@Override
	public int method6988(@OriginalArg(0) int arg0) {
		if (arg0 != 1027) {
			this.method6974();
		}
		return this.aClass193_5 == null ? 0 : this.aClass193_5.ma();
	}
}
