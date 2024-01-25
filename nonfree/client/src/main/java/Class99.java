import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class99 {

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "Lclient!ct;")
	private Class58 aClass58_1;

	@OriginalMember(owner = "client!fda", name = "i", descriptor = "Lclient!pq;")
	private final Class251 aClass251_47;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class99(@OriginalArg(0) Class251 arg0) {
		this.aClass251_47 = arg0;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)Lclient!ct;")
	private Class58 method1996() {
		if (this.aClass58_1 == null) {
			this.aClass58_1 = new Class58();
		}
		return this.aClass58_1;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!gca;I)Lclient!mv;")
	public Interface15 method2001(@OriginalArg(0) Interface10 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class165 local11 = arg0.method7847();
		if (local11 == Static91.aClass165_13) {
			return new Class157((Class50) arg0);
		} else if (local11 == Static227.aClass165_8) {
			return new Class150(this.method1996(), (Class95) arg0);
		} else if (local11 == Static153.aClass165_4) {
			return new Class70(this.aClass251_47, (Class253) arg0);
		} else if (Static500.aClass165_17 == local11) {
			return new Class70_Sub1(this.aClass251_47, (Class253_Sub1) arg0);
		} else if (local11 == Static343.aClass165_14) {
			return new Class184_Sub1((Class10_Sub1) arg0);
		} else if (Static245.aClass165_9 == local11) {
			return new Class184_Sub2(this.aClass251_47, (Class10_Sub2) arg0);
		} else if (local11 == Static188.aClass165_7) {
			return new Class184_Sub3(this.aClass251_47, (Class10_Sub3) arg0);
		} else if (Static348.aClass165_18 == local11) {
			return new Class230((Class349) arg0);
		} else if (Static471.aClass165_16 == local11) {
			return new Class213(this.aClass251_47, (Class135) arg0);
		} else {
			return null;
		}
	}
}
