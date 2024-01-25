import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class12_Sub2_Sub1_Sub5 extends Class12_Sub2_Sub1 {

	@OriginalMember(owner = "client!wba", name = "mb", descriptor = "Lclient!kv;")
	private Class12_Sub4 aClass12_Sub4_8;

	@OriginalMember(owner = "client!wba", name = "Q", descriptor = "I")
	private int anInt9396 = 0;

	@OriginalMember(owner = "client!wba", name = "S", descriptor = "I")
	private final int anInt9397 = -1;

	@OriginalMember(owner = "client!wba", name = "X", descriptor = "I")
	private int anInt9402 = 0;

	@OriginalMember(owner = "client!wba", name = "L", descriptor = "Z")
	private boolean aBoolean784 = false;

	@OriginalMember(owner = "client!wba", name = "Z", descriptor = "Z")
	public boolean aBoolean785 = false;

	@OriginalMember(owner = "client!wba", name = "db", descriptor = "I")
	private int anInt9407 = 0;

	@OriginalMember(owner = "client!wba", name = "I", descriptor = "I")
	private int anInt9390 = 0;

	@OriginalMember(owner = "client!wba", name = "N", descriptor = "I")
	private int anInt9394 = 0;

	@OriginalMember(owner = "client!wba", name = "fb", descriptor = "I")
	private final int anInt9409;

	@OriginalMember(owner = "client!wba", name = "gb", descriptor = "I")
	public final int anInt9410;

	@OriginalMember(owner = "client!wba", name = "rb", descriptor = "Lclient!hq;")
	private Class148 aClass148_3;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class12_Sub2_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt9409 = arg0;
		this.anInt9410 = arg2 + arg1;
		this.anInt9396 = arg12;
		@Pc(54) Class82 local54 = Static62.aClass49_1.method1021(this.anInt9409);
		@Pc(57) int local57 = local54.anInt1827;
		if (local57 == -1) {
			this.aBoolean785 = true;
		} else {
			this.aClass148_3 = Static117.aClass18_1.method296(local57);
			this.aBoolean785 = false;
		}
		if (arg2 == this.anInt9410) {
			Static543.method7102(this, this.anInt9394, this.aClass148_3);
		}
	}

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "(B)V")
	@Override
	public void method7511() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!q;Lclient!r;ILclient!da;)V")
	private void method7519(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(3) Class33 arg2) {
		arg2.method7202(arg0);
		@Pc(9) Class293[] local9 = arg2.method7196();
		@Pc(17) Class163[] local17 = arg2.method7191();
		if ((this.aClass12_Sub4_8 == null || this.aClass12_Sub4_8.aBoolean380) && (local9 != null || local17 != null)) {
			this.aClass12_Sub4_8 = Static291.method4138(Static532.anInt8757, true);
		}
		if (this.aClass12_Sub4_8 != null) {
			this.aClass12_Sub4_8.method4128(arg1, (long) Static532.anInt8757, local9, local17);
			this.aClass12_Sub4_8.method4127(super.aByte128, super.aShort120, super.aShort119, super.aShort121, super.aShort122);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIZLclient!r;)Z")
	@Override
	public boolean method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class162 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILclient!r;ILclient!caa;ZII)V")
	@Override
	public void method7507(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V")
	public void method7520() {
		if (this.aClass12_Sub4_8 != null) {
			this.aClass12_Sub4_8.method4126();
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!r;III)Lclient!da;")
	private Class33 method7522(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class82 local8 = Static62.aClass49_1.method1021(arg1);
		@Pc(21) Class151 local21 = Static261.aClass151Array2[super.aByte128];
		@Pc(36) Class151 local36 = super.aByte127 >= 3 ? null : Static261.aClass151Array2[super.aByte127 + 1];
		return this.aBoolean785 ? local8.method1546(arg0, super.anInt9374, 0, arg2, super.anInt9375, -1, super.anInt9373, local36, -1, local21, Static117.aClass18_1) : local8.method1546(arg0, super.anInt9374, this.anInt9390, arg2, super.anInt9375, this.anInt9394, super.anInt9373, local36, this.anInt9397, local21, Static117.aClass18_1);
	}

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7510() {
		return false;
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(II)V")
	public void method7523(@OriginalArg(0) int arg0) {
		if (this.aBoolean785) {
			return;
		}
		this.anInt9390 += arg0;
		while (this.anInt9390 > this.aClass148_3.anIntArray253[this.anInt9394]) {
			this.anInt9390 -= this.aClass148_3.anIntArray253[this.anInt9394];
			this.anInt9394++;
			if (this.aClass148_3.anIntArray254.length <= this.anInt9394) {
				this.aBoolean785 = true;
				break;
			}
		}
		if (!this.aBoolean785) {
			Static543.method7102(this, this.anInt9394, this.aClass148_3);
		}
	}

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "(Lclient!r;I)Lclient!ifa;")
	@Override
	public Class157 method7502(@OriginalArg(0) Class162 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wba", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7513() {
		return false;
	}

	@OriginalMember(owner = "client!wba", name = "f", descriptor = "(I)I")
	@Override
	public int method7509(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			this.method7503();
		}
		return this.anInt9407;
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(Z)I")
	@Override
	public int method7501() {
		return this.anInt9402;
	}

	@OriginalMember(owner = "client!wba", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7503() {
		return this.aBoolean784;
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7498(@OriginalArg(0) Class162 arg0) {
		@Pc(11) Class33 local11 = this.method7522(arg0, this.anInt9409, 0);
		if (local11 != null) {
			@Pc(16) Class25 local16 = arg0.method6862();
			local16.NA(super.anInt9374, super.anInt9373, super.anInt9375);
			this.method7519(local16, arg0, local11);
		}
	}

	@OriginalMember(owner = "client!wba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass12_Sub4_8 != null) {
			this.aClass12_Sub4_8.method4126();
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!r;I)Lclient!hr;")
	@Override
	public Class12_Sub3 method7496(@OriginalArg(0) Class162 arg0) {
		@Pc(25) Class33 local25 = this.method7522(arg0, this.anInt9409, (this.anInt9396 == 0 ? 0 : 5) | 0x800);
		if (local25 == null) {
			return null;
		}
		if (this.anInt9396 != 0) {
			local25.M(this.anInt9396 * 2048);
		}
		@Pc(41) Class25 local41 = arg0.method6862();
		local41.NA(super.anInt9374, super.anInt9373, super.anInt9375);
		this.method7519(local41, arg0, local25);
		if (Static286.aBoolean372) {
			local25.method7183(local41, null, Static578.anInt9366, 0);
		} else {
			local25.method7192(local41, null, 0);
		}
		if (this.aClass12_Sub4_8 != null) {
			@Pc(77) Class339 local77 = this.aClass12_Sub4_8.method4130();
			if (Static286.aBoolean372) {
				arg0.method6883(local77, Static578.anInt9366);
			} else {
				arg0.method6860(local77);
			}
		}
		this.aBoolean784 = local25.LA();
		this.anInt9402 = local25.J();
		this.anInt9407 = local25.RA();
		return null;
	}
}
