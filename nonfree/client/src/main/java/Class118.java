import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class118 {

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "Lclient!nga;")
	private final Class233 aClass233_15 = new Class233(128);

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "Lclient!eq;")
	private final Class97 aClass97_43;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class118(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_43 = arg2;
		if (this.aClass97_43 != null) {
			@Pc(20) int local20 = this.aClass97_43.method2546() - 1;
			this.aClass97_43.method2569(local20);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)Lclient!uia;")
	public Class340 method3057(@OriginalArg(0) int arg0) {
		@Pc(11) Class233 local11 = this.aClass233_15;
		@Pc(21) Class340 local21;
		synchronized (this.aClass233_15) {
			local21 = (Class340) this.aClass233_15.method5669((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(42) byte[] local42 = this.aClass97_43.method2545(Static519.method7279(arg0), Static638.method6582(arg0));
		local21 = new Class340();
		if (local42 != null) {
			local21.method7885(new Class2_Sub34(local42));
		}
		@Pc(58) Class233 local58 = this.aClass233_15;
		synchronized (this.aClass233_15) {
			this.aClass233_15.method5662(local21, (long) arg0);
			return local21;
		}
	}
}
