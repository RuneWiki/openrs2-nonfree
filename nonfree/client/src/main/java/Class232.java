import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class232 {

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "Lclient!d;")
	private final Class44 aClass44_64 = new Class44(64);

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "Lclient!um;")
	private final Class243 aClass243_229;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;)V")
	public Class232(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_229 = arg2;
		this.aClass243_229.method5472(5);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)Lclient!qm;")
	public Class5_Sub2_Sub14 method5107(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_64;
		@Pc(25) Class5_Sub2_Sub14 local25;
		synchronized (this.aClass44_64) {
			local25 = (Class5_Sub2_Sub14) this.aClass44_64.method1028((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class243 local38 = this.aClass243_229;
		@Pc(47) byte[] local47;
		synchronized (this.aClass243_229) {
			local47 = this.aClass243_229.method5455(arg0, 5);
		}
		local25 = new Class5_Sub2_Sub14();
		if (local47 != null) {
			local25.method4387(new Class5_Sub15(local47));
		}
		local6 = this.aClass44_64;
		synchronized (this.aClass44_64) {
			this.aClass44_64.method1017((long) arg0, local25);
			return local25;
		}
	}
}
