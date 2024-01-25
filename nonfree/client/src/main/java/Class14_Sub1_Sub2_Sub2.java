import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class14_Sub1_Sub2_Sub2 extends Class14_Sub1_Sub2 implements Interface20 {

	@OriginalMember(owner = "client!tu", name = "R", descriptor = "Lclient!ck;")
	private Class55 aClass55_7;

	@OriginalMember(owner = "client!tu", name = "nb", descriptor = "Z")
	private boolean aBoolean748 = false;

	@OriginalMember(owner = "client!tu", name = "hb", descriptor = "Lclient!jh;")
	public final Class169 aClass169_3;

	@OriginalMember(owner = "client!tu", name = "mb", descriptor = "Z")
	private final boolean aBoolean747;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!ha;Lclient!qfa;IIIIIZIIIII)V")
	public Class14_Sub1_Sub2_Sub2(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass169_3 = new Class169(arg0, arg1, arg10, arg11, super.aByte125, arg3, this, arg7, arg12);
		this.aBoolean747 = arg1.anInt7843 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7997(@OriginalArg(0) Class126 arg0) {
		@Pc(12) Class180 local12 = this.aClass169_3.method3987(arg0, true, 262144, false);
		if (local12 == null) {
			return;
		}
		@Pc(24) int local24 = super.anInt9317 >> 9;
		@Pc(29) int local29 = super.anInt9315 >> 9;
		@Pc(32) Class117 local32 = arg0.method7018();
		local32.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
		this.aClass169_3.method3995(local29, local32, local24, local12, arg0, local24, local29, false);
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(ILclient!ha;)Lclient!ww;")
	@Override
	public Class14_Sub10 method8002(@OriginalArg(1) Class126 arg0) {
		@Pc(14) Class180 local14 = this.aClass169_3.method3987(arg0, true, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class117 local21 = arg0.method7018();
		local21.method7244(super.anInt9317 + super.aShort106, super.anInt9321, super.anInt9315 + super.aShort105);
		@Pc(42) Class14_Sub10 local42 = Static443.method6589(this.aBoolean747, 1);
		@Pc(52) int local52 = super.anInt9317 >> 9;
		@Pc(57) int local57 = super.anInt9315 >> 9;
		this.aClass169_3.method3995(local57, local21, local52, local14, arg0, local52, local57, true);
		if (Static605.aBoolean812) {
			local14.method7950(local21, local42.aClass14_Sub9Array1[0], Static461.anInt7840, 0);
		} else {
			local14.method7949(local21, local42.aClass14_Sub9Array1[0], 0);
		}
		if (this.aClass169_3.aClass14_Sub8_7 != null) {
			@Pc(99) Class345 local99 = this.aClass169_3.aClass14_Sub8_7.method4458();
			if (Static605.aBoolean812) {
				arg0.method6986(local99, Static461.anInt7840);
			} else {
				arg0.method7058(local99);
			}
		}
		this.aBoolean748 = local14.F() || this.aClass169_3.aClass14_Sub8_7 != null;
		if (this.aClass55_7 == null) {
			this.aClass55_7 = Static182.method2929(super.anInt9315, super.anInt9317, super.anInt9321, local14);
		} else {
			Static129.method5613(this.aClass55_7, super.anInt9321, local14, super.anInt9315, super.anInt9317);
		}
		return local42;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!ha;IIB)Z")
	@Override
	public boolean method8003(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class180 local17 = this.aClass169_3.method3987(arg0, false, 131072, false);
		if (local17 == null) {
			return false;
		} else {
			@Pc(24) Class117 local24 = arg0.method7018();
			local24.method7244(super.aShort106 + super.anInt9317, super.anInt9321, super.anInt9315 + super.aShort105);
			return Static605.aBoolean812 ? local17.method7929(arg2, arg1, local24, false, 0, Static461.anInt7840) : local17.method7946(arg2, arg1, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLclient!ha;)Lclient!ck;")
	@Override
	public Class55 method7999(@OriginalArg(1) Class126 arg0) {
		return this.aClass55_7;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V")
	@Override
	public void method8013() {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8010(@OriginalArg(1) Class126 arg0) {
		this.aClass169_3.method3983(arg0);
	}

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "(I)I")
	@Override
	public int method8004() {
		return this.aClass169_3.method3989();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8014() {
		return this.aClass169_3.method3986();
	}

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7998() {
		return false;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)I")
	@Override
	public int method8009() {
		return this.aClass169_3.anInt4344;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7987() {
		return this.aBoolean748;
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(B)I")
	@Override
	public int method8015() {
		return this.aClass169_3.anInt4345;
	}

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "(B)I")
	@Override
	public int method7991(@OriginalArg(0) byte arg0) {
		if (arg0 < 81) {
			Static561.aClass275_1 = null;
		}
		return this.aClass169_3.method3985(-1);
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)I")
	@Override
	public int method8012() {
		return this.aClass169_3.anInt4368;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8011(@OriginalArg(1) Class126 arg0) {
		this.aClass169_3.method3994(arg0);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLclient!bk;)V")
	public void method7891(@OriginalArg(1) Class35 arg0) {
		this.aClass169_3.method3992(arg0);
	}
}
