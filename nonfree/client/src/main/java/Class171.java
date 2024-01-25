import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class171 {

	@OriginalMember(owner = "client!it", name = "c", descriptor = "Lclient!tq;")
	private Class340 aClass340_30 = new Class340(64);

	@OriginalMember(owner = "client!it", name = "e", descriptor = "Lclient!wm;")
	private final Class390 aClass390_64;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class171(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_64 = arg2;
		if (this.aClass390_64 != null) {
			@Pc(20) int local20 = this.aClass390_64.method8918() - 1;
			this.aClass390_64.method8913(local20);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZI)V")
	public void method4157(@OriginalArg(1) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_30;
		synchronized (this.aClass340_30) {
			this.aClass340_30.method7987();
			this.aClass340_30 = new Class340(arg0);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
	public void method4160() {
		@Pc(14) Class340 local14 = this.aClass340_30;
		synchronized (this.aClass340_30) {
			this.aClass340_30.method7987();
		}
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(B)V")
	public void method4162() {
		@Pc(12) Class340 local12 = this.aClass340_30;
		synchronized (this.aClass340_30) {
			this.aClass340_30.method8000();
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IB)Lclient!o;")
	public Class258 method4163(@OriginalArg(0) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_30;
		@Pc(16) Class258 local16;
		synchronized (this.aClass340_30) {
			local16 = (Class258) this.aClass340_30.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class390 local37 = this.aClass390_64;
		@Pc(50) byte[] local50;
		synchronized (this.aClass390_64) {
			local50 = this.aClass390_64.method8914(Static522.method7392(arg0), Static198.method7148(arg0));
		}
		local16 = new Class258();
		if (local50 != null) {
			local16.method6015(new Class5_Sub41(local50));
		}
		@Pc(72) Class340 local72 = this.aClass340_30;
		synchronized (this.aClass340_30) {
			this.aClass340_30.method7986((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)V")
	public void method4165() {
		@Pc(6) Class340 local6 = this.aClass340_30;
		synchronized (this.aClass340_30) {
			this.aClass340_30.method7996(5);
		}
	}
}
