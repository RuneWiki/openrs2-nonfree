import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class206 {

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "Lclient!nga;")
	private final Class233 aClass233_29 = new Class233(64);

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "Lclient!eq;")
	private final Class97 aClass97_85;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class206(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_85 = arg2;
		if (this.aClass97_85 != null) {
			this.aClass97_85.method2569(11);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V")
	public void method4910() {
		@Pc(6) Class233 local6 = this.aClass233_29;
		synchronized (this.aClass233_29) {
			this.aClass233_29.method5664(5);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	public void method4912() {
		@Pc(10) Class233 local10 = this.aClass233_29;
		synchronized (this.aClass233_29) {
			this.aClass233_29.method5665();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V")
	public void method4915() {
		@Pc(12) Class233 local12 = this.aClass233_29;
		synchronized (this.aClass233_29) {
			this.aClass233_29.method5663();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)Lclient!dn;")
	public Class79 method4916(@OriginalArg(0) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_29;
		@Pc(16) Class79 local16;
		synchronized (this.aClass233_29) {
			local16 = (Class79) this.aClass233_29.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class97 local34 = this.aClass97_85;
		@Pc(43) byte[] local43;
		synchronized (this.aClass97_85) {
			local43 = this.aClass97_85.method2545(arg0, 11);
		}
		local16 = new Class79();
		if (local43 != null) {
			local16.method1708(new Class2_Sub34(local43));
		}
		@Pc(67) Class233 local67 = this.aClass233_29;
		synchronized (this.aClass233_29) {
			this.aClass233_29.method5662(local16, (long) arg0);
			return local16;
		}
	}
}
