import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oja")
public final class Class264 {

	@OriginalMember(owner = "client!oja", name = "g", descriptor = "Lclient!sca;")
	private Class316 aClass316_1;

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "Lclient!la;")
	private final Class208 aClass208_101;

	@OriginalMember(owner = "client!oja", name = "j", descriptor = "Lclient!la;")
	private final Class208 aClass208_102;

	@OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(Lclient!la;Lclient!la;)V")
	public Class264(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class208 arg1) {
		this.aClass208_101 = arg1;
		this.aClass208_102 = arg0;
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(ILclient!jl;)Lclient!fu;")
	public Interface5 method6317(@OriginalArg(1) Interface10 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(14) Class361 local14 = arg0.method8585();
		if (Static622.aClass361_18 == local14) {
			return new Class115((Class303) arg0);
		} else if (Static71.aClass361_6 == local14) {
			return new Class375(this.method6320(), (Class225) arg0);
		} else if (local14 == Static16.aClass361_1) {
			return new Class37(this.aClass208_102, (Class63) arg0);
		} else if (local14 == Static93.aClass361_19) {
			return new Class37_Sub1(this.aClass208_102, (Class63_Sub1) arg0);
		} else if (Static536.aClass361_17 == local14) {
			return new Class25_Sub2(this.aClass208_102, this.aClass208_101, (Class31_Sub2) arg0);
		} else if (local14 == Static40.aClass361_4) {
			return new Class25_Sub3(this.aClass208_102, this.aClass208_101, (Class31_Sub3) arg0);
		} else if (Static335.aClass361_14 == local14) {
			return new Class25_Sub1(this.aClass208_102, this.aClass208_101, (Class31_Sub1) arg0);
		} else if (Static534.aClass361_3 == local14) {
			return new Class66(this.aClass208_102, this.aClass208_101, (Class341) arg0);
		} else if (local14 == Static53.aClass361_5) {
			return new Class137(this.aClass208_102, (Class280) arg0);
		} else if (local14 == Static237.aClass361_9) {
			return new Class25_Sub1_Sub1(this.aClass208_102, this.aClass208_101, (Class31_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(I)Lclient!sca;")
	private Class316 method6320() {
		if (this.aClass316_1 == null) {
			this.aClass316_1 = new Class316();
		}
		return this.aClass316_1;
	}
}
