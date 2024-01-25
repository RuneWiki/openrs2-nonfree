import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class16_Sub1_Sub3_Sub1 extends Class16_Sub1_Sub3 implements Interface25 {

	@OriginalMember(owner = "client!eb", name = "Q", descriptor = "Lclient!wg;")
	private Class379 aClass379_3;

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "Z")
	private boolean aBoolean206;

	@OriginalMember(owner = "client!eb", name = "kb", descriptor = "Z")
	private final boolean aBoolean209;

	@OriginalMember(owner = "client!eb", name = "lb", descriptor = "B")
	private final byte lb;

	@OriginalMember(owner = "client!eb", name = "T", descriptor = "S")
	private final short aShort54;

	@OriginalMember(owner = "client!eb", name = "jb", descriptor = "Z")
	private final boolean aBoolean208;

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "Z")
	private final boolean aBoolean207;

	@OriginalMember(owner = "client!eb", name = "Z", descriptor = "Lclient!r;")
	private Class2_Sub7_Sub17 aClass2_Sub7_Sub17_2;

	@OriginalMember(owner = "client!eb", name = "fb", descriptor = "Lclient!ka;")
	private Class193 aClass193_3;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!ha;Lclient!ac;IIIIIZIZ)V")
	public Class16_Sub1_Sub3_Sub1(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt89);
		this.aBoolean206 = arg9;
		this.aBoolean209 = arg7;
		super.anInt8034 = arg6;
		this.lb = (byte) arg8;
		this.aShort54 = (short) arg1.anInt106;
		this.aBoolean208 = arg1.anInt81 != 0 && !arg7;
		super.anInt8037 = arg4;
		this.aBoolean207 = arg0.method8109() && arg1.aBoolean3 && !this.aBoolean209 && Static305.aClass2_Sub49_15.aClass33_Sub18_1.method5267() != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean206) {
			local63 |= 0x10000;
		}
		@Pc(78) Class259 local78 = this.method2192(this.aBoolean207, local63, arg0);
		if (local78 != null) {
			this.aClass2_Sub7_Sub17_2 = local78.aClass2_Sub7_Sub17_6;
			this.aClass193_3 = local78.aClass193_7;
			if (this.aBoolean206) {
				this.aClass193_3 = this.aClass193_3.method6609((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6978(@OriginalArg(0) Class13 arg0) {
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)I")
	@Override
	public int method6988(@OriginalArg(0) int arg0) {
		if (arg0 == 1027) {
			return this.aClass193_3 == null ? 0 : this.aClass193_3.ma();
		} else {
			return -93;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
	@Override
	public int method6210() {
		return this.lb;
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(B)V")
	@Override
	public void method6987() {
		this.aBoolean206 = false;
		if (this.aClass193_3 != null) {
			this.aClass193_3.s(this.aClass193_3.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I")
	@Override
	public int method6980() {
		return this.aClass193_3 == null ? 0 : this.aClass193_3.fa();
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
	@Override
	public void method6209() {
		if (this.aClass193_3 != null) {
			this.aClass193_3.method6624();
		}
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method6990() {
		if (this.aClass193_3 == null) {
			return true;
		} else {
			return !this.aClass193_3.r();
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method6213(@OriginalArg(1) Class13 arg0) {
		@Pc(29) Class2_Sub7_Sub17 local29;
		if (this.aClass2_Sub7_Sub17_2 == null && this.aBoolean207) {
			@Pc(22) Class259 local22 = this.method2192(true, 262144, arg0);
			local29 = local22 == null ? null : local22.aClass2_Sub7_Sub17_6;
		} else {
			local29 = this.aClass2_Sub7_Sub17_2;
			this.aClass2_Sub7_Sub17_2 = null;
		}
		if (local29 != null) {
			Static118.method2106(local29, super.aByte108, super.anInt8037, super.anInt8034, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(ILclient!ha;)Lclient!wg;")
	@Override
	public Class379 method6983(@OriginalArg(1) Class13 arg0) {
		if (this.aClass379_3 == null) {
			this.aClass379_3 = Static618.method8598(super.anInt8036, this.method2191(0, arg0), super.anInt8034, super.anInt8037);
		}
		return this.aClass379_3;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Lclient!ha;I)Lclient!jk;")
	@Override
	public Class16_Sub5 method6991(@OriginalArg(0) Class13 arg0) {
		if (this.aClass193_3 == null) {
			return null;
		}
		@Pc(11) Class51 local11 = arg0.method8154();
		local11.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
		@Pc(25) Class16_Sub5 local25 = Static134.method8011(this.aBoolean208, 1);
		if (Static582.aBoolean678) {
			this.aClass193_3.method6622(local11, local25.aClass16_Sub10Array1[0], Static529.anInt8509, 0);
		} else {
			this.aClass193_3.method6612(local11, local25.aClass16_Sub10Array1[0], 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6211() {
		return this.aBoolean207;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class193 method2191(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1) {
		if (this.aClass193_3 != null && arg1.method8163(this.aClass193_3.ua(), arg0) == 0) {
			return this.aClass193_3;
		} else {
			@Pc(32) Class259 local32 = this.method2192(false, arg0, arg1);
			return local32 == null ? null : local32.aClass193_7;
		}
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6974() {
		return this.aClass193_3 == null ? false : this.aClass193_3.F();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method6208(@OriginalArg(1) Class13 arg0) {
		@Pc(14) Class2_Sub7_Sub17 local14;
		if (this.aClass2_Sub7_Sub17_2 == null && this.aBoolean207) {
			@Pc(25) Class259 local25 = this.method2192(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass2_Sub7_Sub17_6;
		} else {
			local14 = this.aClass2_Sub7_Sub17_2;
			this.aClass2_Sub7_Sub17_2 = null;
		}
		if (local14 != null) {
			Static28.method8894(local14, super.aByte108, super.anInt8037, super.anInt8034, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!rba;Lclient!ha;ZII)V")
	@Override
	public void method6984(@OriginalArg(1) int arg0, @OriginalArg(2) Class16_Sub1 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class16_Sub1_Sub3_Sub1) {
			@Pc(9) Class16_Sub1_Sub3_Sub1 local9 = (Class16_Sub1_Sub3_Sub1) arg1;
			if (this.aClass193_3 != null && local9.aClass193_3 != null) {
				this.aClass193_3.method6611(local9.aClass193_3, arg5, arg0, arg4, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)I")
	@Override
	public int method6207() {
		return this.aShort54 & 0xFFFF;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZIILclient!ha;)Lclient!ok;")
	private Class259 method2192(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(18) Class5 local18 = Static79.aClass304_2.method6956(this.aShort54 & 0xFFFF);
		@Pc(26) Class91 local26;
		@Pc(30) Class91 local30;
		if (this.aBoolean209) {
			local26 = Static332.aClass91Array2[super.aByte108];
			local30 = Static124.aClass91Array1[0];
		} else {
			local26 = Static124.aClass91Array1[super.aByte108];
			if (super.aByte108 < 3) {
				local30 = Static124.aClass91Array1[super.aByte108 + 1];
			} else {
				local30 = null;
			}
		}
		return local18.method84(local30, super.anInt8034, this.lb, 22, local26, super.anInt8036, arg2, arg1, arg0, super.anInt8037, (Class326) null);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)I")
	@Override
	public int method6212() {
		return 22;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method6985(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class193 local14 = this.method2191(131072, arg1);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class51 local19 = arg1.method8154();
			local19.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
			return Static582.aBoolean678 ? local14.method6617(arg0, arg2, local19, false, 0, Static529.anInt8509) : local14.method6623(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6976() {
		return this.aBoolean206;
	}
}
