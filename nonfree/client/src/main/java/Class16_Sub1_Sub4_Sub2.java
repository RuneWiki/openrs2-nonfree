import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class16_Sub1_Sub4_Sub2 extends Class16_Sub1_Sub4 implements Interface25 {

	@OriginalMember(owner = "client!paa", name = "P", descriptor = "Lclient!wg;")
	private Class379 aClass379_8;

	@OriginalMember(owner = "client!paa", name = "X", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "client!paa", name = "T", descriptor = "Lclient!jfa;")
	public final Class178 aClass178_4;

	@OriginalMember(owner = "client!paa", name = "V", descriptor = "Z")
	private final boolean aBoolean505;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!ha;Lclient!ac;IIIIIZIIIII)V")
	public Class16_Sub1_Sub4_Sub2(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass178_4 = new Class178(arg0, arg1, arg10, arg11, super.aByte109, arg3, this, arg7, arg12);
		this.aBoolean505 = arg1.anInt81 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)I")
	@Override
	public int method6210() {
		return this.aClass178_4.anInt4901;
	}

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "(B)I")
	@Override
	public int method6980() {
		return this.aClass178_4.method4324();
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method6213(@OriginalArg(1) Class13 arg0) {
		this.aClass178_4.method4320(arg0);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6978(@OriginalArg(0) Class13 arg0) {
		@Pc(15) Class193 local15 = this.aClass178_4.method4326(true, arg0, 262144, false);
		if (local15 == null) {
			return;
		}
		@Pc(22) int local22 = super.anInt8037 >> 9;
		@Pc(27) int local27 = super.anInt8034 >> 9;
		@Pc(30) Class51 local30 = arg0.method8154();
		local30.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
		this.aClass178_4.method4319(local27, local27, local30, false, local15, arg0, local22, local22);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method6985(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class193 local12 = this.aClass178_4.method4326(false, arg1, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class51 local19 = arg1.method8154();
			local19.method6705(super.aShort92 + super.anInt8037, super.anInt8036, super.anInt8034 + super.aShort91);
			return Static582.aBoolean678 ? local12.method6617(arg0, arg2, local19, false, 0, Static529.anInt8509) : local12.method6623(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!paa", name = "h", descriptor = "(I)I")
	@Override
	public int method6988(@OriginalArg(0) int arg0) {
		if (arg0 != 1027) {
			this.aClass379_8 = null;
		}
		return this.aClass178_4.method4318((byte) -20);
	}

	@OriginalMember(owner = "client!paa", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method6990() {
		return false;
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)V")
	@Override
	public void method6209() {
	}

	@OriginalMember(owner = "client!paa", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6974() {
		return this.aBoolean506;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!td;)V")
	public void method6215(@OriginalArg(1) Class326 arg0) {
		this.aClass178_4.method4323(arg0);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method6208(@OriginalArg(1) Class13 arg0) {
		this.aClass178_4.method4321(arg0);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Z)I")
	@Override
	public int method6212() {
		return this.aClass178_4.anInt4908;
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(Lclient!ha;I)Lclient!jk;")
	@Override
	public Class16_Sub5 method6991(@OriginalArg(0) Class13 arg0) {
		@Pc(14) Class193 local14 = this.aClass178_4.method4326(true, arg0, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class51 local21 = arg0.method8154();
		local21.method6705(super.aShort92 + super.anInt8037, super.anInt8036, super.anInt8034 + super.aShort91);
		@Pc(50) Class16_Sub5 local50 = Static134.method8011(this.aBoolean505, 1);
		@Pc(55) int local55 = super.anInt8037 >> 9;
		@Pc(60) int local60 = super.anInt8034 >> 9;
		this.aClass178_4.method4319(local60, local60, local21, true, local14, arg0, local55, local55);
		if (Static582.aBoolean678) {
			local14.method6622(local21, local50.aClass16_Sub10Array1[0], Static529.anInt8509, 0);
		} else {
			local14.method6612(local21, local50.aClass16_Sub10Array1[0], 0);
		}
		if (this.aClass178_4.aClass16_Sub7_6 != null) {
			@Pc(102) Class119 local102 = this.aClass178_4.aClass16_Sub7_6.method5982();
			if (Static582.aBoolean678) {
				arg0.method8165(local102, Static529.anInt8509);
			} else {
				arg0.method8101(local102);
			}
		}
		this.aBoolean506 = local14.F() || this.aClass178_4.aClass16_Sub7_6 != null;
		if (this.aClass379_8 == null) {
			this.aClass379_8 = Static618.method8598(super.anInt8036, local14, super.anInt8034, super.anInt8037);
		} else {
			Static509.method7067(this.aClass379_8, local14, super.anInt8037, super.anInt8036, super.anInt8034);
		}
		return local50;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)I")
	@Override
	public int method6207() {
		return this.aClass178_4.anInt4905;
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6211() {
		return this.aClass178_4.method4322();
	}

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "(ILclient!ha;)Lclient!wg;")
	@Override
	public Class379 method6983(@OriginalArg(1) Class13 arg0) {
		return this.aClass379_8;
	}
}
