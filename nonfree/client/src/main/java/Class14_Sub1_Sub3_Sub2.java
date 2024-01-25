import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class14_Sub1_Sub3_Sub2 extends Class14_Sub1_Sub3 implements Interface20 {

	@OriginalMember(owner = "client!uba", name = "Q", descriptor = "Lclient!ck;")
	private Class55 aClass55_8;

	@OriginalMember(owner = "client!uba", name = "M", descriptor = "Z")
	private boolean aBoolean761 = false;

	@OriginalMember(owner = "client!uba", name = "ib", descriptor = "Lclient!jh;")
	public final Class169 aClass169_4;

	@OriginalMember(owner = "client!uba", name = "S", descriptor = "Z")
	private final boolean aBoolean762;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lclient!ha;Lclient!qfa;IIIIIZIII)V")
	public Class14_Sub1_Sub3_Sub2(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static143.method4223(arg8, arg9));
		this.aClass169_4 = new Class169(arg0, arg1, arg8, arg9, super.aByte125, arg3, this, arg7, arg10);
		this.aBoolean762 = arg1.anInt7843 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lclient!ha;IIB)Z")
	@Override
	public boolean method8003(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class180 local14 = this.aClass169_4.method3987(arg0, false, 131072, false);
		if (local14 == null) {
			return false;
		} else {
			@Pc(28) Class117 local28 = arg0.method7018();
			local28.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
			return Static605.aBoolean812 ? local14.method7929(arg2, arg1, local28, false, 0, Static461.anInt7840) : local14.method7946(arg2, arg1, local28, false, 0);
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8011(@OriginalArg(1) Class126 arg0) {
		this.aClass169_4.method3994(arg0);
	}

	@OriginalMember(owner = "client!uba", name = "g", descriptor = "(I)V")
	@Override
	public void method8001() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lclient!kf;Lclient!ha;IIIZI)V")
	@Override
	public void method7996(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uba", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7998() {
		return false;
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)I")
	@Override
	public int method8012() {
		return this.aClass169_4.anInt4368;
	}

	@OriginalMember(owner = "client!uba", name = "h", descriptor = "(I)I")
	@Override
	public int method8004() {
		return this.aClass169_4.method3989();
	}

	@OriginalMember(owner = "client!uba", name = "e", descriptor = "(B)I")
	@Override
	public int method7991(@OriginalArg(0) byte arg0) {
		if (arg0 <= 81) {
			this.method7999((Class126) null);
		}
		return this.aClass169_4.method3985(-1);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)I")
	@Override
	public int method8009() {
		return this.aClass169_4.anInt4344;
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(ILclient!ha;)Lclient!ww;")
	@Override
	public Class14_Sub10 method8002(@OriginalArg(1) Class126 arg0) {
		@Pc(22) Class180 local22 = this.aClass169_4.method3987(arg0, true, 2048, false);
		if (local22 == null) {
			return null;
		}
		@Pc(29) Class117 local29 = arg0.method7018();
		local29.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
		@Pc(43) Class14_Sub10 local43 = Static443.method6589(this.aBoolean762, 1);
		@Pc(48) int local48 = super.anInt9317 >> 9;
		@Pc(53) int local53 = super.anInt9315 >> 9;
		this.aClass169_4.method3995(local53, local29, local48, local22, arg0, local48, local53, true);
		if (Static605.aBoolean812) {
			local22.method7950(local29, local43.aClass14_Sub9Array1[0], Static461.anInt7840, 0);
		} else {
			local22.method7949(local29, local43.aClass14_Sub9Array1[0], 0);
		}
		if (this.aClass169_4.aClass14_Sub8_7 != null) {
			@Pc(95) Class345 local95 = this.aClass169_4.aClass14_Sub8_7.method4458();
			if (Static605.aBoolean812) {
				arg0.method6986(local95, Static461.anInt7840);
			} else {
				arg0.method7058(local95);
			}
		}
		this.aBoolean761 = local22.F() || this.aClass169_4.aClass14_Sub8_7 != null;
		if (this.aClass55_8 == null) {
			this.aClass55_8 = Static182.method2929(super.anInt9315, super.anInt9317, super.anInt9321, local22);
		} else {
			Static129.method5613(this.aClass55_8, super.anInt9321, local22, super.anInt9315, super.anInt9317);
		}
		return local43;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8010(@OriginalArg(1) Class126 arg0) {
		this.aClass169_4.method3983(arg0);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7997(@OriginalArg(0) Class126 arg0) {
		@Pc(12) Class180 local12 = this.aClass169_4.method3987(arg0, true, 262144, true);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt9317 >> 9;
		@Pc(24) int local24 = super.anInt9315 >> 9;
		@Pc(27) Class117 local27 = arg0.method7018();
		local27.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
		this.aClass169_4.method3995(local24, local27, local19, local12, arg0, local19, local24, false);
	}

	@OriginalMember(owner = "client!uba", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7992() {
		return false;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BLclient!bk;)V")
	public void method8020(@OriginalArg(1) Class35 arg0) {
		this.aClass169_4.method3992(arg0);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
	@Override
	public void method8013() {
	}

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "(B)I")
	@Override
	public int method8015() {
		return this.aClass169_4.anInt4345;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BLclient!ha;)Lclient!ck;")
	@Override
	public Class55 method7999(@OriginalArg(1) Class126 arg0) {
		return this.aClass55_8;
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7987() {
		return this.aBoolean761;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8014() {
		return this.aClass169_4.method3986();
	}
}
