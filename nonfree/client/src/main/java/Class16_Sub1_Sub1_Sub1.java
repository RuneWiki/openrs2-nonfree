import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aja")
public final class Class16_Sub1_Sub1_Sub1 extends Class16_Sub1_Sub1 implements Interface25 {

	@OriginalMember(owner = "client!aja", name = "cb", descriptor = "Lclient!wg;")
	private Class379 aClass379_1;

	@OriginalMember(owner = "client!aja", name = "V", descriptor = "Z")
	private boolean aBoolean42;

	@OriginalMember(owner = "client!aja", name = "ab", descriptor = "B")
	private final byte aByte15;

	@OriginalMember(owner = "client!aja", name = "ob", descriptor = "B")
	private final byte aByte16;

	@OriginalMember(owner = "client!aja", name = "db", descriptor = "S")
	private final short aShort14;

	@OriginalMember(owner = "client!aja", name = "eb", descriptor = "Z")
	private final boolean aBoolean44;

	@OriginalMember(owner = "client!aja", name = "bb", descriptor = "Z")
	private final boolean aBoolean43;

	@OriginalMember(owner = "client!aja", name = "ib", descriptor = "Z")
	private final boolean aBoolean45;

	@OriginalMember(owner = "client!aja", name = "R", descriptor = "Lclient!ka;")
	public Class193 aClass193_1;

	@OriginalMember(owner = "client!aja", name = "X", descriptor = "Lclient!r;")
	private Class2_Sub7_Sub17 aClass2_Sub7_Sub17_1;

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(Lclient!ha;Lclient!ac;IIIIIZIIIIIIZ)V")
	public Class16_Sub1_Sub1_Sub1(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt61 == 1, Static525.method7300(arg13, arg12));
		this.aBoolean42 = arg14;
		this.aByte15 = (byte) arg13;
		super.aByte108 = (byte) arg3;
		this.aByte16 = (byte) arg12;
		this.aShort14 = (short) arg1.anInt106;
		this.aBoolean44 = arg7;
		this.aBoolean43 = arg1.anInt81 != 0 && !arg7;
		this.aBoolean45 = arg0.method8109() && arg1.aBoolean3 && !this.aBoolean44 && Static305.aClass2_Sub49_15.aClass33_Sub18_1.method5267() != 0;
		@Pc(81) int local81 = 2048;
		if (this.aBoolean42) {
			local81 |= 0x10000;
		}
		@Pc(96) Class259 local96 = this.method510(local81, this.aBoolean45, arg0);
		if (local96 != null) {
			this.aClass193_1 = local96.aClass193_7;
			this.aClass2_Sub7_Sub17_1 = local96.aClass2_Sub7_Sub17_6;
			if (this.aBoolean42) {
				this.aClass193_1 = this.aClass193_1.method6609((byte) 0, local81, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)I")
	@Override
	public int method6210() {
		return this.aByte15;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6978(@OriginalArg(0) Class13 arg0) {
	}

	@OriginalMember(owner = "client!aja", name = "h", descriptor = "(I)I")
	@Override
	public int method6988(@OriginalArg(0) int arg0) {
		if (arg0 != 1027) {
			this.method6983((Class13) null);
		}
		return this.aClass193_1 == null ? 0 : this.aClass193_1.ma();
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(B)I")
	@Override
	public int method6207() {
		return this.aShort14 & 0xFFFF;
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(B)V")
	@Override
	public void method6209() {
		if (this.aClass193_1 != null) {
			this.aClass193_1.method6624();
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IZBLclient!ha;)Lclient!ok;")
	private Class259 method510(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(13) Class5 local13 = Static79.aClass304_2.method6956(this.aShort14 & 0xFFFF);
		@Pc(25) Class91 local25;
		@Pc(20) Class91 local20;
		if (this.aBoolean44) {
			local20 = Static124.aClass91Array1[0];
			local25 = Static332.aClass91Array2[super.aByte108];
		} else {
			if (super.aByte108 >= 3) {
				local20 = null;
			} else {
				local20 = Static124.aClass91Array1[super.aByte108 + 1];
			}
			local25 = Static124.aClass91Array1[super.aByte108];
		}
		return local13.method84(local20, super.anInt8034, this.aByte16 == 11 ? this.aByte15 + 4 : this.aByte15, this.aByte16 == 11 ? 10 : this.aByte16, local25, super.anInt8036, arg2, arg0, arg1, super.anInt8037, (Class326) null);
	}

	@OriginalMember(owner = "client!aja", name = "f", descriptor = "(B)V")
	@Override
	public void method6987() {
		this.aBoolean42 = false;
		if (this.aClass193_1 != null) {
			this.aClass193_1.s(this.aClass193_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!aja", name = "d", descriptor = "(ILclient!ha;)Lclient!wg;")
	@Override
	public Class379 method6983(@OriginalArg(1) Class13 arg0) {
		if (this.aClass379_1 == null) {
			this.aClass379_1 = Static618.method8598(super.anInt8036, this.method511(arg0, 0), super.anInt8034, super.anInt8037);
		}
		return this.aClass379_1;
	}

	@OriginalMember(owner = "client!aja", name = "d", descriptor = "(B)I")
	@Override
	public int method6980() {
		return this.aClass193_1 == null ? 0 : this.aClass193_1.fa();
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class193 method511(@OriginalArg(1) Class13 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass193_1 != null && arg0.method8163(this.aClass193_1.ua(), arg1) == 0) {
			return this.aClass193_1;
		} else {
			@Pc(31) Class259 local31 = this.method510(arg1, false, arg0);
			return local31 == null ? null : local31.aClass193_7;
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method6985(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class193 local16 = this.method511(arg1, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class51 local21 = arg1.method8154();
			local21.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
			return Static582.aBoolean678 ? local16.method6617(arg0, arg2, local21, false, 0, Static529.anInt8509) : local16.method6623(arg0, arg2, local21, false, 0);
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IILclient!rba;Lclient!ha;ZII)V")
	@Override
	public void method6984(@OriginalArg(1) int arg0, @OriginalArg(2) Class16_Sub1 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class16_Sub1_Sub2_Sub2) {
			@Pc(21) Class16_Sub1_Sub2_Sub2 local21 = (Class16_Sub1_Sub2_Sub2) arg1;
			if (this.aClass193_1 != null && local21.aClass193_6 != null) {
				this.aClass193_1.method6611(local21.aClass193_6, arg5, arg0, arg4, arg3);
			}
		} else if (arg1 instanceof Class16_Sub1_Sub1_Sub1) {
			@Pc(43) Class16_Sub1_Sub1_Sub1 local43 = (Class16_Sub1_Sub1_Sub1) arg1;
			if (this.aClass193_1 != null && local43.aClass193_1 != null) {
				this.aClass193_1.method6611(local43.aClass193_1, arg5, arg0, arg4, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(Lclient!ha;I)Lclient!jk;")
	@Override
	public Class16_Sub5 method6991(@OriginalArg(0) Class13 arg0) {
		if (this.aClass193_1 == null) {
			return null;
		}
		@Pc(11) Class51 local11 = arg0.method8154();
		local11.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
		@Pc(33) Class16_Sub5 local33 = Static134.method8011(this.aBoolean43, 1);
		if (Static582.aBoolean678) {
			this.aClass193_1.method6622(local11, local33.aClass16_Sub10Array1[0], Static529.anInt8509, 0);
		} else {
			this.aClass193_1.method6612(local11, local33.aClass16_Sub10Array1[0], 0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6211() {
		return this.aBoolean45;
	}

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "(Z)I")
	public int method513() {
		return this.aClass193_1 == null ? 15 : this.aClass193_1.na() / 4;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Z)I")
	@Override
	public int method6212() {
		return this.aByte16;
	}

	@OriginalMember(owner = "client!aja", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6974() {
		return this.aClass193_1 == null ? false : this.aClass193_1.F();
	}

	@OriginalMember(owner = "client!aja", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method6990() {
		if (this.aClass193_1 == null) {
			return true;
		} else {
			return !this.aClass193_1.r();
		}
	}

	@OriginalMember(owner = "client!aja", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6976() {
		return this.aBoolean42;
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method6213(@OriginalArg(1) Class13 arg0) {
		@Pc(29) Class2_Sub7_Sub17 local29;
		if (this.aClass2_Sub7_Sub17_1 == null && this.aBoolean45) {
			@Pc(22) Class259 local22 = this.method510(262144, true, arg0);
			local29 = local22 == null ? null : local22.aClass2_Sub7_Sub17_6;
		} else {
			local29 = this.aClass2_Sub7_Sub17_1;
			this.aClass2_Sub7_Sub17_1 = null;
		}
		if (local29 != null) {
			Static118.method2106(local29, super.aByte108, super.anInt8037, super.anInt8034, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method6208(@OriginalArg(1) Class13 arg0) {
		@Pc(22) Class2_Sub7_Sub17 local22;
		if (this.aClass2_Sub7_Sub17_1 == null && this.aBoolean45) {
			@Pc(33) Class259 local33 = this.method510(262144, true, arg0);
			local22 = local33 == null ? null : local33.aClass2_Sub7_Sub17_6;
		} else {
			local22 = this.aClass2_Sub7_Sub17_1;
			this.aClass2_Sub7_Sub17_1 = null;
		}
		if (local22 != null) {
			Static28.method8894(local22, super.aByte108, super.anInt8037, super.anInt8034, (boolean[]) null);
		}
	}
}
