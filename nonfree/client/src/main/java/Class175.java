import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class175 {

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "Lclient!d;")
	private final Class44 aClass44_40 = new Class44(16);

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "Lclient!um;")
	private final Class243 aClass243_156;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;)V")
	public Class175(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_156 = arg2;
		this.aClass243_156.method5472(30);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
	public void method3552() {
		@Pc(11) Class44 local11 = this.aClass44_40;
		synchronized (this.aClass44_40) {
			this.aClass44_40.method1024();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZI)V")
	public void method3554() {
		@Pc(6) Class44 local6 = this.aClass44_40;
		synchronized (this.aClass44_40) {
			this.aClass44_40.method1025(5);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)Lclient!bl;")
	public Class22 method3556(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_40;
		@Pc(16) Class22 local16;
		synchronized (this.aClass44_40) {
			local16 = (Class22) this.aClass44_40.method1028((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class243 local34 = this.aClass243_156;
		@Pc(43) byte[] local43;
		synchronized (this.aClass243_156) {
			local43 = this.aClass243_156.method5455(arg0, 30);
		}
		local16 = new Class22();
		if (local43 != null) {
			local16.method567(new Class5_Sub15(local43));
		}
		@Pc(65) Class44 local65 = this.aClass44_40;
		synchronized (this.aClass44_40) {
			this.aClass44_40.method1017((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
	public void method3557() {
		@Pc(6) Class44 local6 = this.aClass44_40;
		synchronized (this.aClass44_40) {
			this.aClass44_40.method1031();
		}
	}
}
