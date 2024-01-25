import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class344 {

	@OriginalMember(owner = "client!un", name = "i", descriptor = "Lclient!nga;")
	private final Class233 aClass233_56 = new Class233(64);

	@OriginalMember(owner = "client!un", name = "j", descriptor = "Lclient!eq;")
	private final Class97 aClass97_142;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "Lclient!eq;")
	public final Class97 aClass97_141;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;Lclient!eq;)V")
	public Class344(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) Class97 arg3) {
		this.aClass97_142 = arg2;
		this.aClass97_141 = arg3;
		this.aClass97_142.method2569(3);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Lclient!to;")
	public Class328 method8016(@OriginalArg(1) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_56;
		@Pc(16) Class328 local16;
		synchronized (this.aClass233_56) {
			local16 = (Class328) this.aClass233_56.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_142;
		@Pc(38) byte[] local38;
		synchronized (this.aClass97_142) {
			local38 = this.aClass97_142.method2545(arg0, 3);
		}
		local16 = new Class328();
		local16.aClass344_2 = this;
		if (local38 != null) {
			local16.method7665(new Class2_Sub34(local38));
		}
		@Pc(68) Class233 local68 = this.aClass233_56;
		synchronized (this.aClass233_56) {
			this.aClass233_56.method5662(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	public void method8017() {
		@Pc(6) Class233 local6 = this.aClass233_56;
		synchronized (this.aClass233_56) {
			this.aClass233_56.method5665();
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)V")
	public void method8018() {
		@Pc(2) Class233 local2 = this.aClass233_56;
		synchronized (this.aClass233_56) {
			this.aClass233_56.method5664(5);
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	public void method8019() {
		@Pc(6) Class233 local6 = this.aClass233_56;
		synchronized (this.aClass233_56) {
			this.aClass233_56.method5663();
		}
	}
}
