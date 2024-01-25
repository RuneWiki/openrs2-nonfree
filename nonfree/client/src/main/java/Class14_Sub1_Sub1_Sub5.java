import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class14_Sub1_Sub1_Sub5 extends Class14_Sub1_Sub1 implements Interface20 {

	@OriginalMember(owner = "client!kd", name = "lb", descriptor = "[I")
	public static final int[] lb = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!kd", name = "tb", descriptor = "Lclient!ck;")
	private Class55 aClass55_4;

	@OriginalMember(owner = "client!kd", name = "ob", descriptor = "Z")
	private boolean aBoolean378 = false;

	@OriginalMember(owner = "client!kd", name = "sb", descriptor = "Lclient!jh;")
	public final Class169 aClass169_1;

	@OriginalMember(owner = "client!kd", name = "ib", descriptor = "Z")
	private final boolean aBoolean377;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!ha;Lclient!qfa;IIIIIZIIIIIII)V")
	public Class14_Sub1_Sub1_Sub5(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt7801 == 1, Static142.method7396(arg12, arg13));
		this.aClass169_1 = new Class169(arg0, arg1, arg12, arg13, super.aByte125, arg3, this, arg7, arg14);
		this.aBoolean377 = arg1.anInt7843 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)I")
	@Override
	public int method8012() {
		return this.aClass169_1.anInt4368;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!kf;Lclient!ha;IIIZI)V")
	@Override
	public void method7996(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!bk;I)V")
	public void method4236(@OriginalArg(0) Class35 arg0) {
		this.aClass169_1.method3992(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	@Override
	public void method8013() {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!ha;)Lclient!ck;")
	@Override
	public Class55 method7999(@OriginalArg(1) Class126 arg0) {
		return this.aClass55_4;
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7998() {
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8011(@OriginalArg(1) Class126 arg0) {
		this.aClass169_1.method3994(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)I")
	@Override
	public int method8015() {
		return this.aClass169_1.anInt4345;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7992() {
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7997(@OriginalArg(0) Class126 arg0) {
		@Pc(16) Class180 local16 = this.aClass169_1.method3987(arg0, true, 262144, true);
		if (local16 != null) {
			@Pc(21) Class117 local21 = arg0.method7018();
			local21.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
			this.aClass169_1.method3995(super.aShort72, local21, super.aShort74, local16, arg0, super.aShort73, super.aShort71, false);
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)I")
	@Override
	public int method7991(@OriginalArg(0) byte arg0) {
		return arg0 < 81 ? -29 : this.aClass169_1.method3985(-1);
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)I")
	@Override
	public int method8004() {
		return this.aClass169_1.method3989();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8010(@OriginalArg(1) Class126 arg0) {
		this.aClass169_1.method3983(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ha;IIB)Z")
	@Override
	public boolean method8003(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(21) Class180 local21 = this.aClass169_1.method3987(arg0, false, 131072, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class117 local28 = arg0.method7018();
			local28.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
			return Static605.aBoolean812 ? local21.method7929(arg2, arg1, local28, false, 0, Static461.anInt7840) : local21.method7946(arg2, arg1, local28, false, 0);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I")
	@Override
	public int method8009() {
		return this.aClass169_1.anInt4344;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8014() {
		return this.aClass169_1.method3986();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ILclient!ha;)Lclient!ww;")
	@Override
	public Class14_Sub10 method8002(@OriginalArg(1) Class126 arg0) {
		@Pc(14) Class180 local14 = this.aClass169_1.method3987(arg0, true, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class117 local21 = arg0.method7018();
		local21.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
		@Pc(35) Class14_Sub10 local35 = Static443.method6589(this.aBoolean377, 1);
		this.aClass169_1.method3995(super.aShort72, local21, super.aShort74, local14, arg0, super.aShort73, super.aShort71, true);
		if (Static605.aBoolean812) {
			local14.method7950(local21, local35.aClass14_Sub9Array1[0], Static461.anInt7840, 0);
		} else {
			local14.method7949(local21, local35.aClass14_Sub9Array1[0], 0);
		}
		if (this.aClass169_1.aClass14_Sub8_7 != null) {
			@Pc(81) Class345 local81 = this.aClass169_1.aClass14_Sub8_7.method4458();
			if (Static605.aBoolean812) {
				arg0.method6986(local81, Static461.anInt7840);
			} else {
				arg0.method7058(local81);
			}
		}
		this.aBoolean378 = local14.F() || this.aClass169_1.aClass14_Sub8_7 != null;
		if (this.aClass55_4 == null) {
			this.aClass55_4 = Static182.method2929(super.anInt9315, super.anInt9317, super.anInt9321, local14);
		} else {
			Static129.method5613(this.aClass55_4, super.anInt9321, local14, super.anInt9315, super.anInt9317);
		}
		return local35;
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V")
	@Override
	public void method8001() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7987() {
		return this.aBoolean378;
	}
}
