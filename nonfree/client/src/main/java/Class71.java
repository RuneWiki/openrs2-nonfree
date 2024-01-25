import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class71 {

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Lclient!mf;")
	private final Class222 aClass222_9 = new Class222(64);

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Lclient!pu;")
	public final Class270 aClass270_17;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "Lclient!pu;")
	private final Class270 aClass270_16;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;Lclient!pu;)V")
	public Class71(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2, @OriginalArg(3) Class270 arg3) {
		this.aClass270_17 = arg3;
		this.aClass270_16 = arg2;
		this.aClass270_16.method5685(3);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
	public void method1492() {
		@Pc(10) Class222 local10 = this.aClass222_9;
		synchronized (this.aClass222_9) {
			this.aClass222_9.method4433(5);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public void method1493() {
		@Pc(6) Class222 local6 = this.aClass222_9;
		synchronized (this.aClass222_9) {
			this.aClass222_9.method4428();
		}
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)Lclient!jn;")
	public Class176 method1494(@OriginalArg(0) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_9;
		@Pc(16) Class176 local16;
		synchronized (this.aClass222_9) {
			local16 = (Class176) this.aClass222_9.method4430((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class270 local35 = this.aClass270_16;
		@Pc(44) byte[] local44;
		synchronized (this.aClass270_16) {
			local44 = this.aClass270_16.method5704(3, arg0);
		}
		local16 = new Class176();
		local16.aClass71_2 = this;
		if (local44 != null) {
			local16.method3693(new Class1_Sub35(local44));
		}
		@Pc(69) Class222 local69 = this.aClass222_9;
		synchronized (this.aClass222_9) {
			this.aClass222_9.method4434(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public void method1496() {
		@Pc(2) Class222 local2 = this.aClass222_9;
		synchronized (this.aClass222_9) {
			this.aClass222_9.method4422();
		}
	}
}
