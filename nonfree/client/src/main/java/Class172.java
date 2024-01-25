import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class172 {

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "Lclient!fa;")
	private final Class68 aClass68_30 = new Class68(64);

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "Lclient!fa;")
	public final Class68 aClass68_31 = new Class68(2);

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "Lclient!fs;")
	public final Class76 aClass76_59;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "Lclient!fs;")
	private final Class76 aClass76_58;

	static {
		new Class83("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;Lclient!fs;)V")
	public Class172(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) Class76 arg3) {
		this.aClass76_59 = arg3;
		this.aClass76_58 = arg2;
		this.aClass76_58.method2108(33);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lclient!fn;")
	public Class74 method3977(@OriginalArg(0) int arg0) {
		@Pc(6) Class68 local6 = this.aClass68_30;
		@Pc(16) Class74 local16;
		synchronized (this.aClass68_30) {
			local16 = (Class74) this.aClass68_30.method1787((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass76_58.method2104(arg0, 33);
		local16 = new Class74();
		local16.aClass172_1 = this;
		if (local41 != null) {
			local16.method2056(new Class4_Sub12(local41));
		}
		@Pc(60) Class68 local60 = this.aClass68_30;
		synchronized (this.aClass68_30) {
			this.aClass68_30.method1779((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
	public void method3978() {
		@Pc(2) Class68 local2 = this.aClass68_30;
		synchronized (this.aClass68_30) {
			this.aClass68_30.method1777();
		}
		local2 = this.aClass68_31;
		synchronized (this.aClass68_31) {
			this.aClass68_31.method1777();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	public void method3979() {
		@Pc(2) Class68 local2 = this.aClass68_30;
		synchronized (this.aClass68_30) {
			this.aClass68_30.method1791();
		}
		local2 = this.aClass68_31;
		synchronized (this.aClass68_31) {
			this.aClass68_31.method1791();
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)V")
	public void method3981() {
		@Pc(2) Class68 local2 = this.aClass68_30;
		synchronized (this.aClass68_30) {
			this.aClass68_30.method1788(5);
		}
		local2 = this.aClass68_31;
		synchronized (this.aClass68_31) {
			this.aClass68_31.method1788(5);
		}
	}
}
