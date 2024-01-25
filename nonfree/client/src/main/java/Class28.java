import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class28 {

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "Lclient!qc;")
	private final Class231 aClass231_9 = new Class231(64);

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "Lclient!dda;")
	private final Class53 aClass53_16;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
	public final int anInt825;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;)V")
	public Class28(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_16 = arg2;
		this.anInt825 = this.aClass53_16.method1592(19);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZ)Lclient!fda;")
	public Class85 method834(@OriginalArg(0) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_9;
		@Pc(16) Class85 local16;
		synchronized (this.aClass231_9) {
			local16 = (Class85) this.aClass231_9.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class53 local35 = this.aClass53_16;
		@Pc(44) byte[] local44;
		synchronized (this.aClass53_16) {
			local44 = this.aClass53_16.method1616(arg0, 19);
		}
		local16 = new Class85();
		if (local44 != null) {
			local16.method2387(new Class2_Sub29(local44));
		}
		@Pc(66) Class231 local66 = this.aClass231_9;
		synchronized (this.aClass231_9) {
			this.aClass231_9.method6232(local16, (long) arg0);
			return local16;
		}
	}
}
