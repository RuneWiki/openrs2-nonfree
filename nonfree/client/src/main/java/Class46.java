import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class46 {

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Lclient!d;")
	private final Class44 aClass44_8 = new Class44(64);

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Lclient!um;")
	private final Class243 aClass243_44;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "I")
	public final int anInt1286;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;)V")
	public Class46(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_44 = arg2;
		if (this.aClass243_44 == null) {
			this.anInt1286 = 0;
		} else {
			this.anInt1286 = this.aClass243_44.method5472(16);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
	public void method1074() {
		@Pc(2) Class44 local2 = this.aClass44_8;
		synchronized (this.aClass44_8) {
			this.aClass44_8.method1025(5);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public void method1075() {
		@Pc(6) Class44 local6 = this.aClass44_8;
		synchronized (this.aClass44_8) {
			this.aClass44_8.method1031();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)Lclient!lf;")
	public Class148 method1077(@OriginalArg(0) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_8;
		@Pc(16) Class148 local16;
		synchronized (this.aClass44_8) {
			local16 = (Class148) this.aClass44_8.method1028((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class243 local37 = this.aClass243_44;
		@Pc(46) byte[] local46;
		synchronized (this.aClass243_44) {
			local46 = this.aClass243_44.method5455(arg0, 16);
		}
		local16 = new Class148();
		if (local46 != null) {
			local16.method3040(new Class5_Sub15(local46));
		}
		@Pc(68) Class44 local68 = this.aClass44_8;
		synchronized (this.aClass44_8) {
			this.aClass44_8.method1017((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public void method1078() {
		@Pc(6) Class44 local6 = this.aClass44_8;
		synchronized (this.aClass44_8) {
			this.aClass44_8.method1024();
		}
	}
}
