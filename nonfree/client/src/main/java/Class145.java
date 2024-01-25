import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class145 {

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "Lclient!fr;")
	private final Class91 aClass91_59 = new Class91(128);

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Lclient!qs;")
	private final Class211 aClass211_55;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;)V")
	public Class145(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_55 = arg2;
		if (this.aClass211_55 != null) {
			@Pc(20) int local20 = this.aClass211_55.method4751() - 1;
			this.aClass211_55.method4772(local20);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Lclient!rj;")
	public Class216 method3324(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_59;
		@Pc(21) Class216 local21;
		synchronized (this.aClass91_59) {
			local21 = (Class216) this.aClass91_59.method1988((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(42) byte[] local42 = this.aClass211_55.method4758(Static25.method519(arg0), Static63.method1233(arg0));
		local21 = new Class216();
		if (local42 != null) {
			local21.method4946(new Class1_Sub3(local42));
		}
		@Pc(58) Class91 local58 = this.aClass91_59;
		synchronized (this.aClass91_59) {
			this.aClass91_59.method1990(local21, (long) arg0);
			return local21;
		}
	}
}
