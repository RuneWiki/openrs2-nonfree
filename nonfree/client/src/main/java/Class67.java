import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class67 {

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "Lclient!maa;")
	private Class217 aClass217_1;

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "Lclient!sea;")
	private final Class308 aClass308_38;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "Lclient!sea;")
	private final Class308 aClass308_39;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!sea;Lclient!sea;)V")
	public Class67(@OriginalArg(0) Class308 arg0, @OriginalArg(1) Class308 arg1) {
		this.aClass308_38 = arg0;
		this.aClass308_39 = arg1;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)Lclient!maa;")
	private Class217 method1473() {
		if (this.aClass217_1 == null) {
			this.aClass217_1 = new Class217();
		}
		return this.aClass217_1;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!cea;I)Lclient!co;")
	public Interface6 method1474(@OriginalArg(0) Interface4 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class252 local11 = arg0.method6715();
		if (local11 == Static284.aClass252_17) {
			return new Class10((Class273) arg0);
		} else if (Static237.aClass252_8 == local11) {
			return new Class150(this.method1473(), (Class194) arg0);
		} else if (Static40.aClass252_1 == local11) {
			return new Class137(this.aClass308_38, (Class132) arg0);
		} else if (local11 == Static429.aClass252_15) {
			return new Class137_Sub1(this.aClass308_38, (Class132_Sub1) arg0);
		} else if (local11 == Static361.aClass252_13) {
			return new Class12_Sub1(this.aClass308_38, this.aClass308_39, (Class23_Sub2) arg0);
		} else if (Static494.aClass252_16 == local11) {
			return new Class12_Sub3(this.aClass308_38, this.aClass308_39, (Class23_Sub3) arg0);
		} else if (Static191.aClass252_7 == local11) {
			return new Class12_Sub2(this.aClass308_38, this.aClass308_39, (Class23_Sub1) arg0);
		} else if (local11 == Static241.aClass252_9) {
			return new Class55(this.aClass308_38, this.aClass308_39, (Class36) arg0);
		} else if (local11 == Static67.aClass252_5) {
			return new Class365(this.aClass308_38, (Class75) arg0);
		} else if (local11 == Static271.aClass252_10) {
			return new Class12_Sub2_Sub1(this.aClass308_38, this.aClass308_39, (Class23_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}
}
