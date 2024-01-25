import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class16_Sub1_Sub3_Sub2 extends Class16_Sub1_Sub3 implements Interface25 {

	@OriginalMember(owner = "client!jga", name = "O", descriptor = "Lclient!wg;")
	private Class379 aClass379_5;

	@OriginalMember(owner = "client!jga", name = "S", descriptor = "Z")
	private boolean aBoolean370 = false;

	@OriginalMember(owner = "client!jga", name = "jb", descriptor = "Lclient!jfa;")
	public final Class178 aClass178_3;

	@OriginalMember(owner = "client!jga", name = "X", descriptor = "Z")
	private final boolean aBoolean371;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!ha;Lclient!ac;IIIIIZII)V")
	public Class16_Sub1_Sub3_Sub2(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt89);
		this.aClass178_3 = new Class178(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean371 = arg1.anInt81 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILclient!td;)V")
	public void method4364(@OriginalArg(1) Class326 arg0) {
		this.aClass178_3.method4323(arg0);
	}

	@OriginalMember(owner = "client!jga", name = "f", descriptor = "(B)V")
	@Override
	public void method6987() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)I")
	@Override
	public int method6212() {
		return this.aClass178_3.anInt4908;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method6985(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class193 local12 = this.aClass178_3.method4326(false, arg1, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(24) Class51 local24 = arg1.method8154();
			local24.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
			return Static582.aBoolean678 ? local12.method6617(arg0, arg2, local24, false, 0, Static529.anInt8509) : local12.method6623(arg0, arg2, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "(ILclient!ha;)Lclient!wg;")
	@Override
	public Class379 method6983(@OriginalArg(1) Class13 arg0) {
		return this.aClass379_5;
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(Lclient!ha;I)Lclient!jk;")
	@Override
	public Class16_Sub5 method6991(@OriginalArg(0) Class13 arg0) {
		@Pc(14) Class193 local14 = this.aClass178_3.method4326(true, arg0, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class51 local21 = arg0.method8154();
		local21.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
		@Pc(35) Class16_Sub5 local35 = Static134.method8011(this.aBoolean371, 1);
		@Pc(48) int local48 = super.anInt8037 >> 9;
		@Pc(53) int local53 = super.anInt8034 >> 9;
		this.aClass178_3.method4319(local53, local53, local21, true, local14, arg0, local48, local48);
		if (Static582.aBoolean678) {
			local14.method6622(local21, local35.aClass16_Sub10Array1[0], Static529.anInt8509, 0);
		} else {
			local14.method6612(local21, local35.aClass16_Sub10Array1[0], 0);
		}
		if (this.aClass178_3.aClass16_Sub7_6 != null) {
			@Pc(95) Class119 local95 = this.aClass178_3.aClass16_Sub7_6.method5982();
			if (Static582.aBoolean678) {
				arg0.method8165(local95, Static529.anInt8509);
			} else {
				arg0.method8101(local95);
			}
		}
		this.aBoolean370 = local14.F() || this.aClass178_3.aClass16_Sub7_6 != null;
		if (this.aClass379_5 == null) {
			this.aClass379_5 = Static618.method8598(super.anInt8036, local14, super.anInt8034, super.anInt8037);
		} else {
			Static509.method7067(this.aClass379_5, local14, super.anInt8037, super.anInt8036, super.anInt8034);
		}
		return local35;
	}

	@OriginalMember(owner = "client!jga", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method6990() {
		return false;
	}

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "(B)I")
	@Override
	public int method6980() {
		return this.aClass178_3.method4324();
	}

	@OriginalMember(owner = "client!jga", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6976() {
		return false;
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(B)V")
	@Override
	public void method6209() {
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6978(@OriginalArg(0) Class13 arg0) {
		@Pc(16) Class193 local16 = this.aClass178_3.method4326(true, arg0, 262144, true);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt8037 >> 9;
		@Pc(28) int local28 = super.anInt8034 >> 9;
		@Pc(31) Class51 local31 = arg0.method8154();
		local31.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
		this.aClass178_3.method4319(local28, local28, local31, false, local16, arg0, local23, local23);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method6208(@OriginalArg(1) Class13 arg0) {
		this.aClass178_3.method4321(arg0);
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method6213(@OriginalArg(1) Class13 arg0) {
		this.aClass178_3.method4320(arg0);
	}

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6974() {
		return this.aBoolean370;
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6211() {
		return this.aClass178_3.method4322();
	}

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "(I)I")
	@Override
	public int method6988(@OriginalArg(0) int arg0) {
		if (arg0 != 1027) {
			this.aBoolean370 = true;
		}
		return this.aClass178_3.method4318((byte) -20);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IILclient!rba;Lclient!ha;ZII)V")
	@Override
	public void method6984(@OriginalArg(1) int arg0, @OriginalArg(2) Class16_Sub1 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)I")
	@Override
	public int method6210() {
		return this.aClass178_3.anInt4901;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)I")
	@Override
	public int method6207() {
		return this.aClass178_3.anInt4905;
	}
}
