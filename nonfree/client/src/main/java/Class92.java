import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eia")
public final class Class92 {

	@OriginalMember(owner = "client!eia", name = "g", descriptor = "Lclient!nga;")
	private final Class233 aClass233_13 = new Class233(256);

	@OriginalMember(owner = "client!eia", name = "d", descriptor = "Lclient!eq;")
	private final Class97 aClass97_32;

	@OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class92(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_32 = arg2;
		this.aClass97_32.method2569(26);
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V")
	public void method2506() {
		@Pc(2) Class233 local2 = this.aClass233_13;
		synchronized (this.aClass233_13) {
			this.aClass233_13.method5665();
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(II)V")
	public void method2508() {
		@Pc(6) Class233 local6 = this.aClass233_13;
		synchronized (this.aClass233_13) {
			this.aClass233_13.method5664(5);
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IB)Lclient!ki;")
	public Class2_Sub5_Sub13 method2509(@OriginalArg(0) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_13;
		@Pc(16) Class2_Sub5_Sub13 local16;
		synchronized (this.aClass233_13) {
			local16 = (Class2_Sub5_Sub13) this.aClass233_13.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_32;
		@Pc(38) byte[] local38;
		synchronized (this.aClass97_32) {
			local38 = this.aClass97_32.method2545(arg0, 26);
		}
		local16 = new Class2_Sub5_Sub13();
		if (local38 != null) {
			local16.method4632(new Class2_Sub34(local38));
		}
		@Pc(68) Class233 local68 = this.aClass233_13;
		synchronized (this.aClass233_13) {
			this.aClass233_13.method5662(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "(I)V")
	public void method2510() {
		@Pc(2) Class233 local2 = this.aClass233_13;
		synchronized (this.aClass233_13) {
			this.aClass233_13.method5663();
		}
	}
}
