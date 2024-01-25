import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class138 {

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Lclient!lh;")
	private final Class151 aClass151_98 = new Class151(128);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "Lclient!hh;")
	private final Class109 aClass109_54;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;)V")
	public Class138(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_54 = arg2;
		if (this.aClass109_54 != null) {
			@Pc(20) int local20 = this.aClass109_54.method2324() - 1;
			this.aClass109_54.method2322(local20);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Lclient!er;")
	public Class74 method3163(@OriginalArg(0) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_98;
		@Pc(16) Class74 local16;
		synchronized (this.aClass151_98) {
			local16 = (Class74) this.aClass151_98.method3288((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass109_54.method2349(Static279.method5836(arg0), Static336.method4846(arg0));
		local16 = new Class74();
		if (local39 != null) {
			local16.method1463(new Class1_Sub14(local39));
		}
		@Pc(55) Class151 local55 = this.aClass151_98;
		synchronized (this.aClass151_98) {
			this.aClass151_98.method3291((long) arg0, local16);
			return local16;
		}
	}
}
