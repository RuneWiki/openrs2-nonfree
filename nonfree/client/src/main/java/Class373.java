import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class373 {

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!ia;")
	private Class166 aClass166_2;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "Lclient!rg;")
	private final Class310 aClass310_129;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!rg;")
	private final Class310 aClass310_128;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!rg;Lclient!rg;)V")
	public Class373(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class310 arg1) {
		this.aClass310_129 = arg1;
		this.aClass310_128 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!nfa;)Lclient!mf;")
	public Interface13 method8992(@OriginalArg(1) Interface14 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(12) Class51 local12 = arg0.method9393();
		if (Static410.aClass51_24 == local12) {
			return new Class153((Class363) arg0);
		} else if (local12 == Static410.aClass51_23) {
			return new Class113(this.method8994(), (Class395) arg0);
		} else if (Static191.aClass51_13 == local12) {
			return new Class234(this.aClass310_128, (Class225) arg0);
		} else if (local12 == Static92.aClass51_35) {
			return new Class234_Sub1(this.aClass310_128, (Class225_Sub1) arg0);
		} else if (local12 == Static650.aClass51_34) {
			return new Class139_Sub2(this.aClass310_128, this.aClass310_129, (Class132_Sub2) arg0);
		} else if (Static210.aClass51_16 == local12) {
			return new Class139_Sub3(this.aClass310_128, this.aClass310_129, (Class132_Sub3) arg0);
		} else if (Static209.aClass51_36 == local12) {
			return new Class139_Sub1(this.aClass310_128, this.aClass310_129, (Class132_Sub1) arg0);
		} else if (Static378.aClass51_20 == local12) {
			return new Class222(this.aClass310_128, this.aClass310_129, (Class353) arg0);
		} else if (local12 == Static370.aClass51_19) {
			return new Class344(this.aClass310_128, (Class286) arg0);
		} else if (Static129.aClass51_6 == local12) {
			return new Class139_Sub1_Sub1(this.aClass310_128, this.aClass310_129, (Class132_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)Lclient!ia;")
	private Class166 method8994() {
		if (this.aClass166_2 == null) {
			this.aClass166_2 = new Class166();
		}
		return this.aClass166_2;
	}
}
