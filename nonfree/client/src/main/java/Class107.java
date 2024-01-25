import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class107 {

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "Lclient!ff;")
	private final Class83 aClass83_24 = new Class83(128);

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "Lclient!vh;")
	private final Class250 aClass250_34;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;)V")
	public Class107(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_34 = arg2;
		this.aClass250_34.method5653(1);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	public void method2351() {
		@Pc(6) Class83 local6 = this.aClass83_24;
		synchronized (this.aClass83_24) {
			this.aClass83_24.method1667();
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZI)V")
	public void method2352() {
		@Pc(6) Class83 local6 = this.aClass83_24;
		synchronized (this.aClass83_24) {
			this.aClass83_24.method1663(5);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)Lclient!wp;")
	public Class267 method2353(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_24;
		@Pc(16) Class267 local16;
		synchronized (this.aClass83_24) {
			local16 = (Class267) this.aClass83_24.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass250_34.method5667(arg0, 1);
		local16 = new Class267();
		if (local41 != null) {
			local16.method6010(new Class1_Sub1(local41));
		}
		@Pc(57) Class83 local57 = this.aClass83_24;
		synchronized (this.aClass83_24) {
			this.aClass83_24.method1675((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public void method2355() {
		@Pc(12) Class83 local12 = this.aClass83_24;
		synchronized (this.aClass83_24) {
			this.aClass83_24.method1669();
		}
	}
}
