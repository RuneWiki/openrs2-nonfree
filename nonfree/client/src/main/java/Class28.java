import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class28 {

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "Lclient!d;")
	private Class44 aClass44_4 = new Class44(128);

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "Lclient!d;")
	public Class44 aClass44_5 = new Class44(64);

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "Lclient!um;")
	public final Class243 aClass243_36;

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "Lclient!um;")
	private final Class243 aClass243_35;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;Lclient!um;)V")
	public Class28(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2, @OriginalArg(3) Class243 arg3) {
		this.aClass243_36 = arg3;
		this.aClass243_35 = arg2;
		this.aClass243_35.method5472(36);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
	public void method667() {
		@Pc(6) Class44 local6 = this.aClass44_4;
		synchronized (this.aClass44_4) {
			this.aClass44_4.method1025(5);
		}
		local6 = this.aClass44_5;
		synchronized (this.aClass44_5) {
			this.aClass44_5.method1025(5);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIB)V")
	public void method668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass44_4 = new Class44(arg1);
		this.aClass44_5 = new Class44(arg0);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)Lclient!ae;")
	public Class6 method670(@OriginalArg(0) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_4;
		@Pc(16) Class6 local16;
		synchronized (this.aClass44_4) {
			local16 = (Class6) this.aClass44_4.method1028((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class243 local29 = this.aClass243_35;
		@Pc(38) byte[] local38;
		synchronized (this.aClass243_35) {
			local38 = this.aClass243_35.method5455(arg0, 36);
		}
		local16 = new Class6();
		local16.anInt133 = arg0;
		local16.aClass28_1 = this;
		if (local38 != null) {
			local16.method86(new Class5_Sub15(local38));
		}
		local16.method91();
		@Pc(78) Class44 local78 = this.aClass44_4;
		synchronized (this.aClass44_4) {
			this.aClass44_4.method1017((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
	public void method671() {
		@Pc(2) Class44 local2 = this.aClass44_4;
		synchronized (this.aClass44_4) {
			this.aClass44_4.method1031();
		}
		local2 = this.aClass44_5;
		synchronized (this.aClass44_5) {
			this.aClass44_5.method1031();
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
	public void method673() {
		@Pc(6) Class44 local6 = this.aClass44_4;
		synchronized (this.aClass44_4) {
			this.aClass44_4.method1024();
		}
		local6 = this.aClass44_5;
		synchronized (this.aClass44_5) {
			this.aClass44_5.method1024();
		}
	}
}
