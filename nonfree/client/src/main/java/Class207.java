import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class207 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Lclient!ge;")
	private final Class83 aClass83_43 = new Class83(64);

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "Lclient!ci;")
	private final Class38 aClass38_68;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;)V")
	public Class207(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_68 = arg2;
		this.aClass38_68.method1032(31);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lclient!ad;")
	public Class5 method4882(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_43;
		@Pc(16) Class5 local16;
		synchronized (this.aClass83_43) {
			local16 = (Class5) this.aClass83_43.method2338((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class38 local34 = this.aClass38_68;
		@Pc(43) byte[] local43;
		synchronized (this.aClass38_68) {
			local43 = this.aClass38_68.method1039(arg0, 31);
		}
		local16 = new Class5();
		if (local43 != null) {
			local16.method59(new Class4_Sub20(local43));
		}
		@Pc(67) Class83 local67 = this.aClass83_43;
		synchronized (this.aClass83_43) {
			this.aClass83_43.method2337(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)V")
	public void method4885() {
		@Pc(2) Class83 local2 = this.aClass83_43;
		synchronized (this.aClass83_43) {
			this.aClass83_43.method2345(5);
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)V")
	public void method4886() {
		@Pc(11) Class83 local11 = this.aClass83_43;
		synchronized (this.aClass83_43) {
			this.aClass83_43.method2336();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public void method4887() {
		@Pc(2) Class83 local2 = this.aClass83_43;
		synchronized (this.aClass83_43) {
			this.aClass83_43.method2346();
		}
	}
}
