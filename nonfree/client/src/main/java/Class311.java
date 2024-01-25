import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class311 {

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!lk;")
	private Class215 aClass215_2;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!wia;")
	private final Class386 aClass386_113;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "Lclient!wia;")
	private final Class386 aClass386_114;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!wia;Lclient!wia;)V")
	public Class311(@OriginalArg(0) Class386 arg0, @OriginalArg(1) Class386 arg1) {
		this.aClass386_113 = arg1;
		this.aClass386_114 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!cn;)Lclient!aj;")
	public Interface1 method7623(@OriginalArg(1) Interface2 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class310 local11 = arg0.method9078();
		if (Static174.aClass310_20 == local11) {
			return new Class340((Class133) arg0);
		} else if (Static558.aClass310_16 == local11) {
			return new Class142(this.method7624(), (Class160) arg0);
		} else if (Static45.aClass310_1 == local11) {
			return new Class324(this.aClass386_114, (Class53) arg0);
		} else if (local11 == Static575.aClass310_18) {
			return new Class324_Sub1(this.aClass386_114, (Class53_Sub1) arg0);
		} else if (local11 == Static204.aClass310_17) {
			return new Class94_Sub3(this.aClass386_114, this.aClass386_113, (Class92_Sub3) arg0);
		} else if (local11 == Static79.aClass310_2) {
			return new Class94_Sub1(this.aClass386_114, this.aClass386_113, (Class92_Sub2) arg0);
		} else if (local11 == Static334.aClass310_8) {
			return new Class94_Sub2(this.aClass386_114, this.aClass386_113, (Class92_Sub1) arg0);
		} else if (Static339.aClass310_9 == local11) {
			return new Class148(this.aClass386_114, this.aClass386_113, (Class263) arg0);
		} else if (Static509.aClass310_14 == local11) {
			return new Class252(this.aClass386_114, (Class369) arg0);
		} else if (Static427.aClass310_11 == local11) {
			return new Class94_Sub2_Sub1(this.aClass386_114, this.aClass386_113, (Class92_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Lclient!lk;")
	private Class215 method7624() {
		if (this.aClass215_2 == null) {
			this.aClass215_2 = new Class215();
		}
		return this.aClass215_2;
	}
}
