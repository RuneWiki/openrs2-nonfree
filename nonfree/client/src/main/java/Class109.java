import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class109 {

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "[Lclient!wc;")
	private Class124_Sub1[] aClass124_Sub1Array1;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!fh;")
	private Class4_Sub9 aClass4_Sub9_4;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!dn;")
	private final Class54 aClass54_1;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "Lclient!su;")
	private final Class234 aClass234_1;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!dv;")
	private Class4_Sub2_Sub2_Sub1 aClass4_Sub2_Sub2_Sub1_2;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!dn;Lclient!su;)V")
	public Class109(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class234 arg1) {
		this.aClass54_1 = arg0;
		this.aClass234_1 = arg1;
		if (!this.aClass54_1.method1245()) {
			this.aClass4_Sub2_Sub2_Sub1_2 = this.aClass54_1.method1239(true, 255, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z")
	public boolean method2042() {
		if (this.aClass4_Sub9_4 != null) {
			return true;
		}
		if (this.aClass4_Sub2_Sub2_Sub1_2 == null) {
			if (this.aClass54_1.method1245()) {
				return false;
			}
			this.aClass4_Sub2_Sub2_Sub1_2 = this.aClass54_1.method1239(true, 255, 255, (byte) 0);
		}
		if (this.aClass4_Sub2_Sub2_Sub1_2.aBoolean113) {
			return false;
		} else {
			this.aClass4_Sub9_4 = new Class4_Sub9(this.aClass4_Sub2_Sub2_Sub1_2.method1359());
			this.aClass124_Sub1Array1 = new Class124_Sub1[(this.aClass4_Sub9_4.aByteArray81.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!ht;ILclient!ht;)Lclient!wc;")
	public Class124_Sub1 method2044(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(3) Class117 arg2) {
		return this.method2045(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!ht;ILclient!ht;Z)Lclient!wc;")
	private Class124_Sub1 method2045(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class117 arg2) {
		if (this.aClass4_Sub9_4 == null) {
			throw new RuntimeException();
		}
		this.aClass4_Sub9_4.anInt6207 = arg1 * 8 + 5;
		if (this.aClass4_Sub9_4.anInt6207 >= this.aClass4_Sub9_4.aByteArray81.length) {
			throw new RuntimeException();
		} else if (this.aClass124_Sub1Array1[arg1] == null) {
			@Pc(55) int local55 = this.aClass4_Sub9_4.method4997();
			@Pc(60) int local60 = this.aClass4_Sub9_4.method4997();
			@Pc(74) Class124_Sub1 local74 = new Class124_Sub1(arg1, arg2, arg0, this.aClass54_1, this.aClass234_1, local55, local60, true);
			this.aClass124_Sub1Array1[arg1] = local74;
			return local74;
		} else {
			return this.aClass124_Sub1Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	public void method2046() {
		if (this.aClass124_Sub1Array1 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.aClass124_Sub1Array1.length; local17++) {
			if (this.aClass124_Sub1Array1[local17] != null) {
				this.aClass124_Sub1Array1[local17].method5844();
			}
		}
		for (@Pc(42) int local42 = 0; local42 < this.aClass124_Sub1Array1.length; local42++) {
			if (this.aClass124_Sub1Array1[local42] != null) {
				this.aClass124_Sub1Array1[local42].method5845();
			}
		}
	}
}
