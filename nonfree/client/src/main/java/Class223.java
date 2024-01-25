import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class223 {

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "Lclient!ge;")
	private final Class83 aClass83_47 = new Class83(64);

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "Lclient!ci;")
	private final Class38 aClass38_74;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;)V")
	public Class223(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_74 = arg2;
		this.aClass38_74.method1032(32);
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V")
	public void method5133() {
		@Pc(7) Class83 local7 = this.aClass83_47;
		synchronized (this.aClass83_47) {
			this.aClass83_47.method2336();
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
	public void method5134() {
		@Pc(2) Class83 local2 = this.aClass83_47;
		synchronized (this.aClass83_47) {
			this.aClass83_47.method2346();
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Lclient!sc;")
	public Class231 method5135(@OriginalArg(0) int arg0) {
		@Pc(11) Class83 local11 = this.aClass83_47;
		@Pc(21) Class231 local21;
		synchronized (this.aClass83_47) {
			local21 = (Class231) this.aClass83_47.method2338((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class38 local34 = this.aClass38_74;
		@Pc(43) byte[] local43;
		synchronized (this.aClass38_74) {
			local43 = this.aClass38_74.method1039(arg0, 32);
		}
		local21 = new Class231();
		if (local43 != null) {
			local21.method5242(new Class4_Sub20(local43));
		}
		@Pc(65) Class83 local65 = this.aClass83_47;
		synchronized (this.aClass83_47) {
			this.aClass83_47.method2337(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)V")
	public void method5136() {
		@Pc(6) Class83 local6 = this.aClass83_47;
		synchronized (this.aClass83_47) {
			this.aClass83_47.method2345(5);
		}
	}
}
