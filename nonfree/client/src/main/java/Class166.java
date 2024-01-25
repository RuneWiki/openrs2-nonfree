import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class166 {

	@OriginalMember(owner = "client!mv", name = "j", descriptor = "Lclient!ge;")
	private final Class83 aClass83_30 = new Class83(64);

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "Lclient!ci;")
	private final Class38 aClass38_53;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;)V")
	public Class166(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_53 = arg2;
		this.aClass38_53.method1032(5);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)Lclient!ro;")
	public Class4_Sub1_Sub16 method4183(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_30;
		@Pc(16) Class4_Sub1_Sub16 local16;
		synchronized (this.aClass83_30) {
			local16 = (Class4_Sub1_Sub16) this.aClass83_30.method2338((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class38 local34 = this.aClass38_53;
		@Pc(43) byte[] local43;
		synchronized (this.aClass38_53) {
			local43 = this.aClass38_53.method1039(arg0, 5);
		}
		local16 = new Class4_Sub1_Sub16();
		if (local43 != null) {
			local16.method5150(new Class4_Sub20(local43));
		}
		@Pc(65) Class83 local65 = this.aClass83_30;
		synchronized (this.aClass83_30) {
			this.aClass83_30.method2337(local16, (long) arg0);
			return local16;
		}
	}
}
