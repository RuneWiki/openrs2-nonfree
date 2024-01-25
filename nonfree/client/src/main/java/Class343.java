import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class343 {

	@OriginalMember(owner = "client!um", name = "f", descriptor = "Lclient!nga;")
	private final Class233 aClass233_55 = new Class233(16);

	@OriginalMember(owner = "client!um", name = "e", descriptor = "Lclient!eq;")
	private final Class97 aClass97_140;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class343(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_140 = arg2;
		this.aClass97_140.method2569(30);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public void method8009() {
		@Pc(13) Class233 local13 = this.aClass233_55;
		synchronized (this.aClass233_55) {
			this.aClass233_55.method5665();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
	public void method8010() {
		@Pc(6) Class233 local6 = this.aClass233_55;
		synchronized (this.aClass233_55) {
			this.aClass233_55.method5664(5);
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(II)Lclient!hg;")
	public Class146 method8012(@OriginalArg(1) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_55;
		@Pc(16) Class146 local16;
		synchronized (this.aClass233_55) {
			local16 = (Class146) this.aClass233_55.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_140;
		@Pc(38) byte[] local38;
		synchronized (this.aClass97_140) {
			local38 = this.aClass97_140.method2545(arg0, 30);
		}
		local16 = new Class146();
		if (local38 != null) {
			local16.method3601(new Class2_Sub34(local38));
		}
		@Pc(60) Class233 local60 = this.aClass233_55;
		synchronized (this.aClass233_55) {
			this.aClass233_55.method5662(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
	public void method8013() {
		@Pc(10) Class233 local10 = this.aClass233_55;
		synchronized (this.aClass233_55) {
			this.aClass233_55.method5663();
		}
	}
}
