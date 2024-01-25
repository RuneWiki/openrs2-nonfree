import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mia")
public final class Class210 {

	@OriginalMember(owner = "client!mia", name = "c", descriptor = "Lclient!eaa;")
	private Class83 aClass83_1;

	@OriginalMember(owner = "client!mia", name = "g", descriptor = "Lclient!in;")
	private final Class157 aClass157_178;

	@OriginalMember(owner = "client!mia", name = "k", descriptor = "Lclient!in;")
	private final Class157 aClass157_179;

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Lclient!in;Lclient!in;)V")
	public Class210(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class157 arg1) {
		this.aClass157_178 = arg0;
		this.aClass157_179 = arg1;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)Lclient!eaa;")
	private Class83 method5948() {
		if (this.aClass83_1 == null) {
			this.aClass83_1 = new Class83();
		}
		return this.aClass83_1;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(ZLclient!af;)Lclient!aaa;")
	public Interface1 method5950(@OriginalArg(1) Interface2 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class6 local11 = arg0.method9087();
		if (Static505.aClass6_11 == local11) {
			return new Class270((Class162) arg0);
		} else if (Static192.aClass6_4 == local11) {
			return new Class323(this.method5948(), (Class224) arg0);
		} else if (local11 == Static496.aClass6_10) {
			return new Class98(this.aClass157_178, (Class362) arg0);
		} else if (local11 == Static225.aClass6_5) {
			return new Class98_Sub1(this.aClass157_178, (Class362_Sub1) arg0);
		} else if (local11 == Static66.aClass6_12) {
			return new Class53_Sub2(this.aClass157_178, this.aClass157_179, (Class110_Sub3) arg0);
		} else if (local11 == Static70.aClass6_2) {
			return new Class53_Sub3(this.aClass157_178, this.aClass157_179, (Class110_Sub2) arg0);
		} else if (local11 == Static454.aClass6_8) {
			return new Class53_Sub1(this.aClass157_178, this.aClass157_179, (Class110_Sub1) arg0);
		} else if (local11 == Static435.aClass6_7) {
			return new Class175(this.aClass157_178, this.aClass157_179, (Class252) arg0);
		} else if (Static397.aClass6_6 == local11) {
			return new Class344(this.aClass157_178, (Class220) arg0);
		} else if (Static457.aClass6_9 == local11) {
			return new Class53_Sub1_Sub1(this.aClass157_178, this.aClass157_179, (Class110_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}
}
