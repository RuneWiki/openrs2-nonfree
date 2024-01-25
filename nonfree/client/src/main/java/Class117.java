import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class117 {

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "Lclient!d;")
	private final Class44 aClass44_28 = new Class44(64);

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
	public int anInt3064 = 0;

	@OriginalMember(owner = "client!ip", name = "l", descriptor = "Lclient!um;")
	private final Class243 aClass243_100;

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
	public final int anInt3059;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;)V")
	public Class117(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_100 = arg2;
		this.anInt3059 = this.aClass243_100.method5472(4);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IB)V")
	public void method2461() {
		@Pc(12) Class44 local12 = this.aClass44_28;
		synchronized (this.aClass44_28) {
			this.aClass44_28.method1025(5);
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(IB)Lclient!jt;")
	public Class130 method2462(@OriginalArg(0) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_28;
		@Pc(16) Class130 local16;
		synchronized (this.aClass44_28) {
			local16 = (Class130) this.aClass44_28.method1028((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class243 local35 = this.aClass243_100;
		@Pc(44) byte[] local44;
		synchronized (this.aClass243_100) {
			local44 = this.aClass243_100.method5455(arg0, 4);
		}
		local16 = new Class130();
		local16.anInt3441 = arg0;
		local16.aClass117_5 = this;
		if (local44 != null) {
			local16.method2770(new Class5_Sub15(local44));
		}
		local16.method2771();
		@Pc(75) Class44 local75 = this.aClass44_28;
		synchronized (this.aClass44_28) {
			this.aClass44_28.method1017((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)V")
	public void method2466() {
		@Pc(6) Class44 local6 = this.aClass44_28;
		synchronized (this.aClass44_28) {
			this.aClass44_28.method1031();
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	public void method2467() {
		@Pc(2) Class44 local2 = this.aClass44_28;
		synchronized (this.aClass44_28) {
			this.aClass44_28.method1024();
		}
	}
}
