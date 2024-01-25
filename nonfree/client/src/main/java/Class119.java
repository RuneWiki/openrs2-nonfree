import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class119 {

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "Lclient!nga;")
	private final Class233 aClass233_16 = new Class233(64);

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "Lclient!eq;")
	private final Class97 aClass97_44;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class119(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_44 = arg2;
		if (this.aClass97_44 != null) {
			this.aClass97_44.method2569(35);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
	public void method3059() {
		@Pc(2) Class233 local2 = this.aClass233_16;
		synchronized (this.aClass233_16) {
			this.aClass233_16.method5665();
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
	public void method3060() {
		@Pc(2) Class233 local2 = this.aClass233_16;
		synchronized (this.aClass233_16) {
			this.aClass233_16.method5663();
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IB)V")
	public void method3061() {
		@Pc(6) Class233 local6 = this.aClass233_16;
		synchronized (this.aClass233_16) {
			this.aClass233_16.method5664(5);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)Lclient!nb;")
	public Class227 method3063(@OriginalArg(0) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_16;
		@Pc(16) Class227 local16;
		synchronized (this.aClass233_16) {
			local16 = (Class227) this.aClass233_16.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_44;
		@Pc(38) byte[] local38;
		synchronized (this.aClass97_44) {
			local38 = this.aClass97_44.method2545(arg0, 35);
		}
		local16 = new Class227();
		if (local38 != null) {
			local16.method5554(new Class2_Sub34(local38));
		}
		local16.method5556();
		@Pc(71) Class233 local71 = this.aClass233_16;
		synchronized (this.aClass233_16) {
			this.aClass233_16.method5662(local16, (long) arg0);
			return local16;
		}
	}
}
