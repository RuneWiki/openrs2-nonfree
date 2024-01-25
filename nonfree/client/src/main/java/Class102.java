import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class102 {

	@OriginalMember(owner = "client!er", name = "f", descriptor = "Lclient!wda;")
	private Class377 aClass377_1;

	@OriginalMember(owner = "client!er", name = "c", descriptor = "Lclient!nd;")
	private final Class238 aClass238_67;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "Lclient!nd;")
	private final Class238 aClass238_68;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!nd;Lclient!nd;)V")
	public Class102(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class238 arg1) {
		this.aClass238_67 = arg1;
		this.aClass238_68 = arg0;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!jd;I)Lclient!nea;")
	public Interface17 method2562(@OriginalArg(0) Interface12 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) Class151 local16 = arg0.method8831();
		if (Static307.aClass151_8 == local16) {
			return new Class65((Class160) arg0);
		} else if (local16 == Static502.aClass151_11) {
			return new Class170(this.method2563(), (Class179) arg0);
		} else if (Static481.aClass151_9 == local16) {
			return new Class141(this.aClass238_68, (Class135) arg0);
		} else if (Static23.aClass151_2 == local16) {
			return new Class141_Sub1(this.aClass238_68, (Class135_Sub1) arg0);
		} else if (local16 == Static141.aClass151_3) {
			return new Class188_Sub1(this.aClass238_68, this.aClass238_67, (Class56_Sub3) arg0);
		} else if (local16 == Static239.aClass151_5) {
			return new Class188_Sub3(this.aClass238_68, this.aClass238_67, (Class56_Sub2) arg0);
		} else if (Static261.aClass151_6 == local16) {
			return new Class188_Sub2(this.aClass238_68, this.aClass238_67, (Class56_Sub1) arg0);
		} else if (Static225.aClass151_4 == local16) {
			return new Class347(this.aClass238_68, this.aClass238_67, (Class237) arg0);
		} else if (Static272.aClass151_7 == local16) {
			return new Class194(this.aClass238_68, (Class198) arg0);
		} else if (local16 == Static15.aClass151_1) {
			return new Class188_Sub2_Sub1(this.aClass238_68, this.aClass238_67, (Class56_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)Lclient!wda;")
	private Class377 method2563() {
		if (this.aClass377_1 == null) {
			this.aClass377_1 = new Class377();
		}
		return this.aClass377_1;
	}
}
