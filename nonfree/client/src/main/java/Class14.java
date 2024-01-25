import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class14 {

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Lclient!nga;")
	private final Class233 aClass233_1 = new Class233(128);

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "Lclient!eq;")
	private final Class97 aClass97_1;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class14(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_1 = arg2;
		this.aClass97_1.method2569(1);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
	public void method291() {
		@Pc(2) Class233 local2 = this.aClass233_1;
		synchronized (this.aClass233_1) {
			this.aClass233_1.method5665();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)Lclient!wl;")
	public Class373 method293(@OriginalArg(1) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_1;
		@Pc(16) Class373 local16;
		synchronized (this.aClass233_1) {
			local16 = (Class373) this.aClass233_1.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_1;
		@Pc(38) byte[] local38;
		synchronized (this.aClass97_1) {
			local38 = this.aClass97_1.method2545(arg0, 1);
		}
		local16 = new Class373();
		if (local38 != null) {
			local16.method8492(new Class2_Sub34(local38));
		}
		@Pc(60) Class233 local60 = this.aClass233_1;
		synchronized (this.aClass233_1) {
			this.aClass233_1.method5662(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	public void method295() {
		@Pc(2) Class233 local2 = this.aClass233_1;
		synchronized (this.aClass233_1) {
			this.aClass233_1.method5663();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
	public void method297() {
		@Pc(10) Class233 local10 = this.aClass233_1;
		synchronized (this.aClass233_1) {
			this.aClass233_1.method5664(5);
		}
	}
}
