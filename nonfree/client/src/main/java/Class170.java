import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class170 {

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "Lclient!sc;")
	private Class305 aClass305_1;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "Lclient!mv;")
	private final Class229 aClass229_53;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "Lclient!mv;")
	private final Class229 aClass229_55;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!mv;Lclient!mv;)V")
	public Class170(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class229 arg1) {
		this.aClass229_53 = arg0;
		this.aClass229_55 = arg1;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Lclient!sc;")
	private Class305 method3437() {
		if (this.aClass305_1 == null) {
			this.aClass305_1 = new Class305();
		}
		return this.aClass305_1;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!nda;)Lclient!jt;")
	public Interface16 method3441(@OriginalArg(1) Interface17 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(13) Class225 local13 = arg0.method7443();
		if (Static268.aClass225_18 == local13) {
			return new Class346((Class206) arg0);
		} else if (Static262.aClass225_17 == local13) {
			return new Class174(this.method3437(), (Class190) arg0);
		} else if (local13 == Static213.aClass225_13) {
			return new Class16(this.aClass229_53, (Class213) arg0);
		} else if (Static373.aClass225_23 == local13) {
			return new Class16_Sub1(this.aClass229_53, (Class213_Sub1) arg0);
		} else if (local13 == Static562.aClass225_29) {
			return new Class137_Sub3(this.aClass229_53, this.aClass229_55, (Class153_Sub1) arg0);
		} else if (Static143.aClass225_25 == local13) {
			return new Class137_Sub1(this.aClass229_53, this.aClass229_55, (Class153_Sub3) arg0);
		} else if (Static190.aClass225_11 == local13) {
			return new Class137_Sub2(this.aClass229_53, this.aClass229_55, (Class153_Sub2) arg0);
		} else if (Static53.aClass225_30 == local13) {
			return new Class66(this.aClass229_53, this.aClass229_55, (Class313) arg0);
		} else if (Static171.aClass225_10 == local13) {
			return new Class44(this.aClass229_53, (Class333) arg0);
		} else if (local13 == Static208.aClass225_12) {
			return new Class137_Sub2_Sub1(this.aClass229_53, this.aClass229_55, (Class153_Sub2_Sub1) arg0);
		} else {
			return null;
		}
	}
}
