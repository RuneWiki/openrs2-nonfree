import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class169 {

	@OriginalMember(owner = "client!na", name = "f", descriptor = "Lclient!dc;")
	private Class44 aClass44_36 = new Class44(128);

	@OriginalMember(owner = "client!na", name = "m", descriptor = "Lclient!dc;")
	public Class44 aClass44_37 = new Class44(64);

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Lclient!he;")
	public final Class100 aClass100_49;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "Lclient!he;")
	private final Class100 aClass100_50;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;Lclient!he;)V")
	public Class169(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3) {
		this.aClass100_49 = arg3;
		this.aClass100_50 = arg2;
		this.aClass100_50.method2523(36);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public void method3947() {
		@Pc(6) Class44 local6 = this.aClass44_36;
		synchronized (this.aClass44_36) {
			this.aClass44_36.method1351();
		}
		local6 = this.aClass44_37;
		synchronized (this.aClass44_37) {
			this.aClass44_37.method1351();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lclient!wd;")
	public Class260 method3948(@OriginalArg(0) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_36;
		@Pc(16) Class260 local16;
		synchronized (this.aClass44_36) {
			local16 = (Class260) this.aClass44_36.method1353((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass100_50.method2520(arg0, 36);
		local16 = new Class260();
		local16.anInt7736 = arg0;
		local16.aClass169_28 = this;
		if (local33 != null) {
			local16.method6331(new Class6_Sub1(local33));
		}
		local16.method6330();
		@Pc(58) Class44 local58 = this.aClass44_36;
		synchronized (this.aClass44_36) {
			this.aClass44_36.method1349(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)V")
	public void method3949() {
		@Pc(2) Class44 local2 = this.aClass44_36;
		synchronized (this.aClass44_36) {
			this.aClass44_36.method1352(5);
		}
		local2 = this.aClass44_37;
		synchronized (this.aClass44_37) {
			this.aClass44_37.method1352(5);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BII)V")
	public void method3951(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass44_36 = new Class44(arg0);
		this.aClass44_37 = new Class44(arg1);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public void method3952() {
		@Pc(2) Class44 local2 = this.aClass44_36;
		synchronized (this.aClass44_36) {
			this.aClass44_36.method1348();
		}
		local2 = this.aClass44_37;
		synchronized (this.aClass44_37) {
			this.aClass44_37.method1348();
		}
	}
}
