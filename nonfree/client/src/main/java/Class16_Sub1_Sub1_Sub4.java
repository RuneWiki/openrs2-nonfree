import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class16_Sub1_Sub1_Sub4 extends Class16_Sub1_Sub1 implements Interface25 {

	@OriginalMember(owner = "client!eq", name = "fb", descriptor = "Lclient!wg;")
	private Class379 aClass379_4;

	@OriginalMember(owner = "client!eq", name = "jb", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!eq", name = "nb", descriptor = "Lclient!jfa;")
	public final Class178 aClass178_2;

	@OriginalMember(owner = "client!eq", name = "ab", descriptor = "Z")
	private final boolean aBoolean232;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!ha;Lclient!ac;IIIIIZIIIIIII)V")
	public Class16_Sub1_Sub1_Sub4(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt61 == 1, Static355.method5319(arg12, arg13));
		this.aClass178_2 = new Class178(arg0, arg1, arg12, arg13, super.aByte109, arg3, this, arg7, arg14);
		this.aBoolean232 = arg1.anInt81 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)I")
	@Override
	public int method6210() {
		return this.aClass178_2.anInt4901;
	}

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6976() {
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(ILclient!ha;)Lclient!wg;")
	@Override
	public Class379 method6983(@OriginalArg(1) Class13 arg0) {
		return this.aClass379_4;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6211() {
		return this.aClass178_2.method4322();
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(Lclient!ha;I)Lclient!jk;")
	@Override
	public Class16_Sub5 method6991(@OriginalArg(0) Class13 arg0) {
		@Pc(14) Class193 local14 = this.aClass178_2.method4326(true, arg0, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(29) Class51 local29 = arg0.method8154();
		local29.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
		@Pc(43) Class16_Sub5 local43 = Static134.method8011(this.aBoolean232, 1);
		this.aClass178_2.method4319(super.aShort106, super.aShort105, local29, true, local14, arg0, super.aShort103, super.aShort104);
		if (Static582.aBoolean678) {
			local14.method6622(local29, local43.aClass16_Sub10Array1[0], Static529.anInt8509, 0);
		} else {
			local14.method6612(local29, local43.aClass16_Sub10Array1[0], 0);
		}
		if (this.aClass178_2.aClass16_Sub7_6 != null) {
			@Pc(89) Class119 local89 = this.aClass178_2.aClass16_Sub7_6.method5982();
			if (Static582.aBoolean678) {
				arg0.method8165(local89, Static529.anInt8509);
			} else {
				arg0.method8101(local89);
			}
		}
		this.aBoolean233 = local14.F() || this.aClass178_2.aClass16_Sub7_6 != null;
		if (this.aClass379_4 == null) {
			this.aClass379_4 = Static618.method8598(super.anInt8036, local14, super.anInt8034, super.anInt8037);
		} else {
			Static509.method7067(this.aClass379_4, local14, super.anInt8037, super.anInt8036, super.anInt8034);
		}
		return local43;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)V")
	@Override
	public void method6209() {
	}

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method6990() {
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "(I)I")
	@Override
	public int method6988(@OriginalArg(0) int arg0) {
		if (arg0 != 1027) {
			Static139.aClass238_66 = null;
		}
		return this.aClass178_2.method4318((byte) -20);
	}

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(B)V")
	@Override
	public void method6987() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(B)I")
	@Override
	public int method6980() {
		return this.aClass178_2.method4324();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method6208(@OriginalArg(1) Class13 arg0) {
		this.aClass178_2.method4321(arg0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)I")
	@Override
	public int method6207() {
		return this.aClass178_2.anInt4905;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZLclient!td;)V")
	public void method2558(@OriginalArg(1) Class326 arg0) {
		this.aClass178_2.method4323(arg0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method6985(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class193 local12 = this.aClass178_2.method4326(false, arg1, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(26) Class51 local26 = arg1.method8154();
			local26.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
			return Static582.aBoolean678 ? local12.method6617(arg0, arg2, local26, false, 0, Static529.anInt8509) : local12.method6623(arg0, arg2, local26, false, 0);
		}
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6974() {
		return this.aBoolean233;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method6213(@OriginalArg(1) Class13 arg0) {
		this.aClass178_2.method4320(arg0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILclient!rba;Lclient!ha;ZII)V")
	@Override
	public void method6984(@OriginalArg(1) int arg0, @OriginalArg(2) Class16_Sub1 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6978(@OriginalArg(0) Class13 arg0) {
		@Pc(12) Class193 local12 = this.aClass178_2.method4326(true, arg0, 262144, true);
		if (local12 != null) {
			@Pc(23) Class51 local23 = arg0.method8154();
			local23.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
			this.aClass178_2.method4319(super.aShort106, super.aShort105, local23, false, local12, arg0, super.aShort103, super.aShort104);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)I")
	@Override
	public int method6212() {
		return this.aClass178_2.anInt4908;
	}
}
