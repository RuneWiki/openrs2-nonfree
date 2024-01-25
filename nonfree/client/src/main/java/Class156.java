import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class156 {

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Lclient!wq;")
	private final Class391 aClass391_20 = new Class391(128);

	@OriginalMember(owner = "client!he", name = "h", descriptor = "Lclient!la;")
	private final Class208 aClass208_53;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class156(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_53 = arg2;
		if (this.aClass208_53 != null) {
			@Pc(20) int local20 = this.aClass208_53.method4988() - 1;
			this.aClass208_53.method5005(local20);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)Lclient!ki;")
	public Class200 method3083(@OriginalArg(0) int arg0) {
		@Pc(12) Class391 local12 = this.aClass391_20;
		@Pc(22) Class200 local22;
		synchronized (this.aClass391_20) {
			local22 = (Class200) this.aClass391_20.method9275((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(44) byte[] local44 = this.aClass208_53.method4991(Static192.method3808(arg0), Static250.method3678(arg0), -120);
		local22 = new Class200();
		if (local44 != null) {
			local22.method4716(new Class5_Sub23(local44));
		}
		@Pc(62) Class391 local62 = this.aClass391_20;
		synchronized (this.aClass391_20) {
			this.aClass391_20.method9273((long) arg0, local22, 1);
			return local22;
		}
	}
}
