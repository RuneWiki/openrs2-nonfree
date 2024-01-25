import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class10 {

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "Lclient!sr;")
	private Class334 aClass334_1;

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "Lclient!lga;")
	private final Class223 aClass223_2;

	@OriginalMember(owner = "client!aea", name = "j", descriptor = "Lclient!lga;")
	private final Class223 aClass223_1;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!lga;Lclient!lga;)V")
	public Class10(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1) {
		this.aClass223_2 = arg1;
		this.aClass223_1 = arg0;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILclient!kd;)Lclient!wg;")
	public Interface27 method116(@OriginalArg(1) Interface15 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(12) Class369 local12 = arg0.method8734();
		if (Static9.aClass369_1 == local12) {
			return new Class301((Class372) arg0);
		} else if (Static667.aClass369_12 == local12) {
			return new Class283(this.method117(), (Class25) arg0);
		} else if (local12 == Static12.aClass369_2) {
			return new Class30(this.aClass223_1, (Class137) arg0);
		} else if (local12 == Static272.aClass369_4) {
			return new Class30_Sub1(this.aClass223_1, (Class137_Sub1) arg0);
		} else if (Static378.aClass369_10 == local12) {
			return new Class154_Sub1(this.aClass223_1, this.aClass223_2, (Class58_Sub1) arg0);
		} else if (local12 == Static189.aClass369_8) {
			return new Class154_Sub3(this.aClass223_1, this.aClass223_2, (Class58_Sub3) arg0);
		} else if (local12 == Static172.aClass369_7) {
			return new Class154_Sub2(this.aClass223_1, this.aClass223_2, (Class58_Sub2) arg0);
		} else if (local12 == Static158.aClass369_6) {
			return new Class119(this.aClass223_1, this.aClass223_2, (Class324) arg0);
		} else if (local12 == Static141.aClass369_11) {
			return new Class142(this.aClass223_1, (Class129) arg0);
		} else if (local12 == Static207.aClass369_9) {
			return new Class154_Sub2_Sub1(this.aClass223_1, this.aClass223_2, (Class58_Sub2_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)Lclient!sr;")
	private Class334 method117() {
		if (this.aClass334_1 == null) {
			this.aClass334_1 = new Class334();
		}
		return this.aClass334_1;
	}
}
