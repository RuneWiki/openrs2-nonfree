import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class386 {

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "Lclient!jda;")
	private final Class165 aClass165_82 = new Class165(64);

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "Lclient!aj;")
	private final Class15 aClass15_163;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "Lclient!aj;")
	public final Class15 aClass15_164;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;Lclient!aj;)V")
	public Class386(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) Class15 arg3) {
		this.aClass15_163 = arg2;
		this.aClass15_164 = arg3;
		this.aClass15_163.method512(3);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)V")
	public void method9138() {
		@Pc(6) Class165 local6 = this.aClass165_82;
		synchronized (this.aClass165_82) {
			this.aClass165_82.method4394(5);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	public void method9141() {
		@Pc(10) Class165 local10 = this.aClass165_82;
		synchronized (this.aClass165_82) {
			this.aClass165_82.method4400();
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)Lclient!gd;")
	public Class115 method9142(@OriginalArg(0) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_82;
		@Pc(16) Class115 local16;
		synchronized (this.aClass165_82) {
			local16 = (Class115) this.aClass165_82.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class15 local29 = this.aClass15_163;
		@Pc(40) byte[] local40;
		synchronized (this.aClass15_163) {
			local40 = this.aClass15_163.method517(arg0, 3);
		}
		local16 = new Class115();
		local16.aClass386_1 = this;
		if (local40 != null) {
			local16.method3450(new Class3_Sub25(local40));
		}
		@Pc(65) Class165 local65 = this.aClass165_82;
		synchronized (this.aClass165_82) {
			this.aClass165_82.method4392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
	public void method9144() {
		@Pc(2) Class165 local2 = this.aClass165_82;
		synchronized (this.aClass165_82) {
			this.aClass165_82.method4403();
		}
	}
}
