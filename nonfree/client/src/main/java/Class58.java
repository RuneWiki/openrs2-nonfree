import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class58 {

	@OriginalMember(owner = "client!co", name = "d", descriptor = "Lclient!nga;")
	private final Class233 aClass233_7 = new Class233(64);

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Lclient!eq;")
	private final Class97 aClass97_14;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class58(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_14 = arg2;
		this.aClass97_14.method2569(31);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	public void method1361() {
		@Pc(2) Class233 local2 = this.aClass233_7;
		synchronized (this.aClass233_7) {
			this.aClass233_7.method5663();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
	public void method1362() {
		@Pc(14) Class233 local14 = this.aClass233_7;
		synchronized (this.aClass233_7) {
			this.aClass233_7.method5664(5);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
	public void method1363() {
		@Pc(2) Class233 local2 = this.aClass233_7;
		synchronized (this.aClass233_7) {
			this.aClass233_7.method5665();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)Lclient!ne;")
	public Class230 method1364(@OriginalArg(1) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_7;
		@Pc(16) Class230 local16;
		synchronized (this.aClass233_7) {
			local16 = (Class230) this.aClass233_7.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_14;
		@Pc(38) byte[] local38;
		synchronized (this.aClass97_14) {
			local38 = this.aClass97_14.method2545(arg0, 31);
		}
		local16 = new Class230();
		if (local38 != null) {
			local16.method5586(new Class2_Sub34(local38));
		}
		@Pc(60) Class233 local60 = this.aClass233_7;
		synchronized (this.aClass233_7) {
			this.aClass233_7.method5662(local16, (long) arg0);
			return local16;
		}
	}
}
