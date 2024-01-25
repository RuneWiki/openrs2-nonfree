import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class16_Sub1_Sub2_Sub2 extends Class16_Sub1_Sub2 implements Interface25 {

	@OriginalMember(owner = "client!ns", name = "jb", descriptor = "Lclient!wg;")
	private Class379 aClass379_7;

	@OriginalMember(owner = "client!ns", name = "eb", descriptor = "Z")
	private final boolean aBoolean477;

	@OriginalMember(owner = "client!ns", name = "L", descriptor = "S")
	private final short aShort90;

	@OriginalMember(owner = "client!ns", name = "N", descriptor = "B")
	private final byte aByte87;

	@OriginalMember(owner = "client!ns", name = "ob", descriptor = "Z")
	private boolean aBoolean478;

	@OriginalMember(owner = "client!ns", name = "Q", descriptor = "B")
	private final byte aByte88;

	@OriginalMember(owner = "client!ns", name = "T", descriptor = "Z")
	private final boolean aBoolean475;

	@OriginalMember(owner = "client!ns", name = "X", descriptor = "Z")
	private final boolean aBoolean476;

	@OriginalMember(owner = "client!ns", name = "M", descriptor = "Lclient!r;")
	private Class2_Sub7_Sub17 aClass2_Sub7_Sub17_5;

	@OriginalMember(owner = "client!ns", name = "kb", descriptor = "Lclient!ka;")
	public Class193 aClass193_6;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!ha;Lclient!ac;IIIIIZIIZ)V")
	public Class16_Sub1_Sub2_Sub2(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static336.method5096(arg8, arg9));
		super.anInt8037 = arg4;
		this.aBoolean477 = arg7;
		this.aShort90 = (short) arg1.anInt106;
		this.aByte87 = (byte) arg8;
		this.aBoolean478 = arg10;
		super.anInt8034 = arg6;
		this.aByte88 = (byte) arg9;
		this.aBoolean475 = arg1.anInt81 != 0 && !arg7;
		this.aBoolean476 = arg0.method8109() && arg1.aBoolean3 && !this.aBoolean477 && Static305.aClass2_Sub49_15.aClass33_Sub18_1.method5267() != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean478) {
			local66 |= 0x10000;
		}
		@Pc(81) Class259 local81 = this.method5795(this.aBoolean476, local66, arg0);
		if (local81 != null) {
			this.aClass2_Sub7_Sub17_5 = local81.aClass2_Sub7_Sub17_6;
			this.aClass193_6 = local81.aClass193_7;
			if (this.aBoolean478) {
				this.aClass193_6 = this.aClass193_6.method6609((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6978(@OriginalArg(0) Class13 arg0) {
	}

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6976() {
		return this.aBoolean478;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZIBLclient!ha;)Lclient!ok;")
	private Class259 method5795(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(20) Class5 local20 = Static79.aClass304_2.method6956(this.aShort90 & 0xFFFF);
		@Pc(45) Class91 local45;
		@Pc(36) Class91 local36;
		if (this.aBoolean477) {
			local45 = Static332.aClass91Array2[super.aByte108];
			local36 = Static124.aClass91Array1[0];
		} else {
			if (super.aByte108 < 3) {
				local36 = Static124.aClass91Array1[super.aByte108 + 1];
			} else {
				local36 = null;
			}
			local45 = Static124.aClass91Array1[super.aByte108];
		}
		return local20.method84(local36, super.anInt8034, this.aByte88, this.aByte87, local45, super.anInt8036, arg2, arg1, arg0, super.anInt8037, (Class326) null);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILclient!rba;Lclient!ha;ZII)V")
	@Override
	public void method6984(@OriginalArg(1) int arg0, @OriginalArg(2) Class16_Sub1 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class16_Sub1_Sub2_Sub2) {
			@Pc(35) Class16_Sub1_Sub2_Sub2 local35 = (Class16_Sub1_Sub2_Sub2) arg1;
			if (this.aClass193_6 == null || local35.aClass193_6 == null) {
				return;
			}
			this.aClass193_6.method6611(local35.aClass193_6, arg5, arg0, arg4, arg3);
		} else if (arg1 instanceof Class16_Sub1_Sub1_Sub1) {
			@Pc(16) Class16_Sub1_Sub1_Sub1 local16 = (Class16_Sub1_Sub1_Sub1) arg1;
			if (this.aClass193_6 != null && local16.aClass193_1 != null) {
				this.aClass193_6.method6611(local16.aClass193_1, arg5, arg0, arg4, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(Lclient!ha;I)Lclient!jk;")
	@Override
	public Class16_Sub5 method6991(@OriginalArg(0) Class13 arg0) {
		if (this.aClass193_6 == null) {
			return null;
		}
		@Pc(19) Class51 local19 = arg0.method8154();
		local19.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
		@Pc(33) Class16_Sub5 local33 = Static134.method8011(this.aBoolean475, 1);
		if (Static582.aBoolean678) {
			this.aClass193_6.method6622(local19, local33.aClass16_Sub10Array1[0], Static529.anInt8509, 0);
		} else {
			this.aClass193_6.method6612(local19, local33.aClass16_Sub10Array1[0], 0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6974() {
		return this.aClass193_6 == null ? false : this.aClass193_6.F();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)I")
	@Override
	public int method6212() {
		return this.aByte87;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6211() {
		return this.aBoolean476;
	}

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "(I)I")
	@Override
	public int method6988(@OriginalArg(0) int arg0) {
		if (arg0 != 1027) {
			this.aClass379_7 = null;
		}
		return this.aClass193_6 == null ? 0 : this.aClass193_6.ma();
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method6213(@OriginalArg(1) Class13 arg0) {
		@Pc(14) Class2_Sub7_Sub17 local14;
		if (this.aClass2_Sub7_Sub17_5 == null && this.aBoolean476) {
			@Pc(25) Class259 local25 = this.method5795(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass2_Sub7_Sub17_6;
		} else {
			local14 = this.aClass2_Sub7_Sub17_5;
			this.aClass2_Sub7_Sub17_5 = null;
		}
		if (local14 != null) {
			Static118.method2106(local14, super.aByte108, super.anInt8037, super.anInt8034, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method6985(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class193 local9 = this.method5797(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class51 local19 = arg1.method8154();
			local19.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
			return Static582.aBoolean678 ? local9.method6617(arg0, arg2, local19, false, 0, Static529.anInt8509) : local9.method6623(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)I")
	@Override
	public int method6207() {
		return this.aShort90 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(B)I")
	@Override
	public int method6980() {
		return this.aClass193_6 == null ? 0 : this.aClass193_6.fa();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method6208(@OriginalArg(1) Class13 arg0) {
		@Pc(14) Class2_Sub7_Sub17 local14;
		if (this.aClass2_Sub7_Sub17_5 == null && this.aBoolean476) {
			@Pc(25) Class259 local25 = this.method5795(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass2_Sub7_Sub17_6;
		} else {
			local14 = this.aClass2_Sub7_Sub17_5;
			this.aClass2_Sub7_Sub17_5 = null;
		}
		if (local14 != null) {
			Static28.method8894(local14, super.aByte108, super.anInt8037, super.anInt8034, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class193 method5797(@OriginalArg(1) Class13 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass193_6 != null && arg0.method8163(this.aClass193_6.ua(), arg1) == 0) {
			return this.aClass193_6;
		} else {
			@Pc(34) Class259 local34 = this.method5795(false, arg1, arg0);
			return local34 == null ? null : local34.aClass193_7;
		}
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(ILclient!ha;)Lclient!wg;")
	@Override
	public Class379 method6983(@OriginalArg(1) Class13 arg0) {
		if (this.aClass379_7 == null) {
			this.aClass379_7 = Static618.method8598(super.anInt8036, this.method5797(arg0, 0), super.anInt8034, super.anInt8037);
		}
		return this.aClass379_7;
	}

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method6990() {
		if (this.aClass193_6 == null) {
			return true;
		} else {
			return !this.aClass193_6.r();
		}
	}

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "(B)V")
	@Override
	public void method6987() {
		this.aBoolean478 = false;
		if (this.aClass193_6 != null) {
			this.aClass193_6.s(this.aClass193_6.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
	@Override
	public void method6209() {
		if (this.aClass193_6 != null) {
			this.aClass193_6.method6624();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)I")
	@Override
	public int method6210() {
		return this.aByte88;
	}
}
