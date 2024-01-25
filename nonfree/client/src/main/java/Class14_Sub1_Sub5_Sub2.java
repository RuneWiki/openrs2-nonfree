import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class14_Sub1_Sub5_Sub2 extends Class14_Sub1_Sub5 implements Interface20 {

	@OriginalMember(owner = "client!sl", name = "lb", descriptor = "Z")
	public static boolean lb = false;

	@OriginalMember(owner = "client!sl", name = "L", descriptor = "Lclient!ck;")
	private Class55 aClass55_6;

	@OriginalMember(owner = "client!sl", name = "ib", descriptor = "Z")
	private boolean aBoolean719 = false;

	@OriginalMember(owner = "client!sl", name = "J", descriptor = "Lclient!jh;")
	public final Class169 aClass169_2;

	@OriginalMember(owner = "client!sl", name = "cb", descriptor = "Z")
	private final boolean aBoolean718;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!ha;Lclient!qfa;IIIIIZII)V")
	public Class14_Sub1_Sub5_Sub2(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt7814);
		this.aClass169_2 = new Class169(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean718 = arg1.anInt7843 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8014() {
		return this.aClass169_2.method3986();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
	@Override
	public void method8013() {
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(B)I")
	@Override
	public int method7991(@OriginalArg(0) byte arg0) {
		if (arg0 < 81) {
			this.method7997((Class126) null);
		}
		return this.aClass169_2.method3985(-1);
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(ILclient!ha;)Lclient!ww;")
	@Override
	public Class14_Sub10 method8002(@OriginalArg(1) Class126 arg0) {
		@Pc(14) Class180 local14 = this.aClass169_2.method3987(arg0, true, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class117 local21 = arg0.method7018();
		local21.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
		@Pc(35) Class14_Sub10 local35 = Static443.method6589(this.aBoolean718, 1);
		@Pc(40) int local40 = super.anInt9317 >> 9;
		@Pc(45) int local45 = super.anInt9315 >> 9;
		this.aClass169_2.method3995(local45, local21, local40, local14, arg0, local40, local45, true);
		if (Static605.aBoolean812) {
			local14.method7950(local21, local35.aClass14_Sub9Array1[0], Static461.anInt7840, 0);
		} else {
			local14.method7949(local21, local35.aClass14_Sub9Array1[0], 0);
		}
		if (this.aClass169_2.aClass14_Sub8_7 != null) {
			@Pc(92) Class345 local92 = this.aClass169_2.aClass14_Sub8_7.method4458();
			if (Static605.aBoolean812) {
				arg0.method6986(local92, Static461.anInt7840);
			} else {
				arg0.method7058(local92);
			}
		}
		this.aBoolean719 = local14.F() || this.aClass169_2.aClass14_Sub8_7 != null;
		if (this.aClass55_6 == null) {
			this.aClass55_6 = Static182.method2929(super.anInt9315, super.anInt9317, super.anInt9321, local14);
		} else {
			Static129.method5613(this.aClass55_6, super.anInt9321, local14, super.anInt9315, super.anInt9317);
		}
		return local35;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)I")
	@Override
	public int method8012() {
		return this.aClass169_2.anInt4368;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLclient!ha;)Lclient!ck;")
	@Override
	public Class55 method7999(@OriginalArg(1) Class126 arg0) {
		return this.aClass55_6;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)I")
	@Override
	public int method8009() {
		return this.aClass169_2.anInt4344;
	}

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7998() {
		return false;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8011(@OriginalArg(1) Class126 arg0) {
		this.aClass169_2.method3994(arg0);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!bk;B)V")
	public void method7532(@OriginalArg(0) Class35 arg0) {
		this.aClass169_2.method3992(arg0);
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)I")
	@Override
	public int method8015() {
		return this.aClass169_2.anInt4345;
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7992() {
		return false;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8010(@OriginalArg(1) Class126 arg0) {
		this.aClass169_2.method3983(arg0);
	}

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "(I)I")
	@Override
	public int method8004() {
		return this.aClass169_2.method3989();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7997(@OriginalArg(0) Class126 arg0) {
		@Pc(17) Class180 local17 = this.aClass169_2.method3987(arg0, true, 262144, true);
		if (local17 == null) {
			return;
		}
		@Pc(24) int local24 = super.anInt9317 >> 9;
		@Pc(29) int local29 = super.anInt9315 >> 9;
		@Pc(32) Class117 local32 = arg0.method7018();
		local32.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
		this.aClass169_2.method3995(local29, local32, local24, local17, arg0, local24, local29, false);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!ha;IIB)Z")
	@Override
	public boolean method8003(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class180 local17 = this.aClass169_2.method3987(arg0, false, 131072, false);
		if (local17 == null) {
			return false;
		} else {
			@Pc(24) Class117 local24 = arg0.method7018();
			local24.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
			return Static605.aBoolean812 ? local17.method7929(arg2, arg1, local24, false, 0, Static461.anInt7840) : local17.method7946(arg2, arg1, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7987() {
		return this.aBoolean719;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!kf;Lclient!ha;IIIZI)V")
	@Override
	public void method7996(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)V")
	@Override
	public void method8001() {
		throw new IllegalStateException();
	}
}
