import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class254 {

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "Lclient!d;")
	private Class44 aClass44_69 = new Class44(64);

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "Lclient!um;")
	private final Class243 aClass243_242;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;)V")
	public Class254(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_242 = arg2;
		if (this.aClass243_242 != null) {
			@Pc(20) int local20 = this.aClass243_242.method5478() - 1;
			this.aClass243_242.method5472(local20);
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
	public void method5701() {
		@Pc(6) Class44 local6 = this.aClass44_69;
		synchronized (this.aClass44_69) {
			this.aClass44_69.method1031();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)Lclient!df;")
	public Class47 method5702(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_69;
		@Pc(16) Class47 local16;
		synchronized (this.aClass44_69) {
			local16 = (Class47) this.aClass44_69.method1028((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class243 local29 = this.aClass243_242;
		@Pc(42) byte[] local42;
		synchronized (this.aClass243_242) {
			local42 = this.aClass243_242.method5455(Static76.method1136(arg0), Static4.method42(arg0));
		}
		local16 = new Class47();
		if (local42 != null) {
			local16.method1081(new Class5_Sub15(local42));
		}
		@Pc(70) Class44 local70 = this.aClass44_69;
		synchronized (this.aClass44_69) {
			this.aClass44_69.method1017((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
	public void method5704() {
		@Pc(13) Class44 local13 = this.aClass44_69;
		synchronized (this.aClass44_69) {
			this.aClass44_69.method1024();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V")
	public void method5706() {
		@Pc(2) Class44 local2 = this.aClass44_69;
		synchronized (this.aClass44_69) {
			this.aClass44_69.method1025(5);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)V")
	public void method5707(@OriginalArg(1) int arg0) {
		@Pc(11) Class44 local11 = this.aClass44_69;
		synchronized (this.aClass44_69) {
			this.aClass44_69.method1031();
			this.aClass44_69 = new Class44(arg0);
		}
	}
}
