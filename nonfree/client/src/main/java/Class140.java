import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class140 {

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "Lclient!nga;")
	private final Class233 aClass233_22 = new Class233(64);

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "Lclient!eq;")
	private final Class97 aClass97_57;

	static {
		new Class188("", 76);
	}

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class140(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_57 = arg2;
		this.aClass97_57.method2569(32);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)Lclient!is;")
	public Class165 method3446(@OriginalArg(0) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_22;
		@Pc(16) Class165 local16;
		synchronized (this.aClass233_22) {
			local16 = (Class165) this.aClass233_22.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_57;
		@Pc(38) byte[] local38;
		synchronized (this.aClass97_57) {
			local38 = this.aClass97_57.method2545(arg0, 32);
		}
		local16 = new Class165();
		if (local38 != null) {
			local16.method4050(new Class2_Sub34(local38));
		}
		@Pc(65) Class233 local65 = this.aClass233_22;
		synchronized (this.aClass233_22) {
			this.aClass233_22.method5662(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)V")
	public void method3447() {
		@Pc(10) Class233 local10 = this.aClass233_22;
		synchronized (this.aClass233_22) {
			this.aClass233_22.method5665();
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
	public void method3448() {
		@Pc(2) Class233 local2 = this.aClass233_22;
		synchronized (this.aClass233_22) {
			this.aClass233_22.method5663();
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IB)V")
	public void method3449() {
		@Pc(10) Class233 local10 = this.aClass233_22;
		synchronized (this.aClass233_22) {
			this.aClass233_22.method5664(5);
		}
	}
}
