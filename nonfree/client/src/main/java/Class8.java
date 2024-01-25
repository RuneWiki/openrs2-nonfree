import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class8 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!ge;")
	private Class83 aClass83_1 = new Class83(64);

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "Lclient!ge;")
	public Class83 aClass83_2 = new Class83(64);

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "Lclient!ci;")
	private final Class38 aClass38_2;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!ci;")
	public final Class38 aClass38_1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;Lclient!ci;)V")
	public Class8(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) Class38 arg3) {
		this.aClass38_2 = arg2;
		this.aClass38_1 = arg3;
		this.aClass38_2.method1032(34);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public void method63() {
		@Pc(6) Class83 local6 = this.aClass83_1;
		synchronized (this.aClass83_1) {
			this.aClass83_1.method2336();
		}
		local6 = this.aClass83_2;
		synchronized (this.aClass83_2) {
			this.aClass83_2.method2336();
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	public void method65() {
		@Pc(6) Class83 local6 = this.aClass83_1;
		synchronized (this.aClass83_1) {
			this.aClass83_1.method2346();
		}
		local6 = this.aClass83_2;
		synchronized (this.aClass83_2) {
			this.aClass83_2.method2346();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	public void method66(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass83_1 = new Class83(arg1);
		this.aClass83_2 = new Class83(arg0);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
	public void method68() {
		@Pc(2) Class83 local2 = this.aClass83_1;
		synchronized (this.aClass83_1) {
			this.aClass83_1.method2345(5);
		}
		local2 = this.aClass83_2;
		synchronized (this.aClass83_2) {
			this.aClass83_2.method2345(5);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)Lclient!cb;")
	public Class33 method69(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_1;
		@Pc(16) Class33 local16;
		synchronized (this.aClass83_1) {
			local16 = (Class33) this.aClass83_1.method2338((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class38 local29 = this.aClass38_2;
		@Pc(44) byte[] local44;
		synchronized (this.aClass38_2) {
			local44 = this.aClass38_2.method1039(arg0, 34);
		}
		local16 = new Class33();
		local16.aClass8_1 = this;
		if (local44 != null) {
			local16.method912(new Class4_Sub20(local44));
		}
		@Pc(69) Class83 local69 = this.aClass83_1;
		synchronized (this.aClass83_1) {
			this.aClass83_1.method2337(local16, (long) arg0);
			return local16;
		}
	}
}
