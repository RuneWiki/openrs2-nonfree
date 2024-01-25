import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class17 {

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "Lclient!qc;")
	private final Class231 aClass231_7 = new Class231(128);

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "Lclient!dda;")
	private final Class53 aClass53_8;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;)V")
	public Class17(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_8 = arg2;
		if (this.aClass53_8 != null) {
			@Pc(20) int local20 = this.aClass53_8.method1607() - 1;
			this.aClass53_8.method1592(local20);
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)Lclient!rn;")
	public Class251 method621(@OriginalArg(0) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_7;
		@Pc(16) Class251 local16;
		synchronized (this.aClass231_7) {
			local16 = (Class251) this.aClass231_7.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass53_8.method1616(Static237.method3667(arg0), Static352.method5543(arg0));
		local16 = new Class251();
		if (local39 != null) {
			local16.method6542(new Class2_Sub29(local39));
		}
		@Pc(62) Class231 local62 = this.aClass231_7;
		synchronized (this.aClass231_7) {
			this.aClass231_7.method6232(local16, (long) arg0);
			return local16;
		}
	}
}
