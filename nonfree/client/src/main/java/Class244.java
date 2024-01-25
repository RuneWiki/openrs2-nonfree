import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class244 {

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "Lclient!nga;")
	private final Class233 aClass233_33 = new Class233(64);

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "Lclient!eq;")
	private final Class97 aClass97_100;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
	public final int anInt7444;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class244(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_100 = arg2;
		if (this.aClass97_100 == null) {
			this.anInt7444 = 0;
		} else {
			this.anInt7444 = this.aClass97_100.method2569(16);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)Lclient!en;")
	public Class96 method6259(@OriginalArg(1) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_33;
		@Pc(16) Class96 local16;
		synchronized (this.aClass233_33) {
			local16 = (Class96) this.aClass233_33.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class97 local35 = this.aClass97_100;
		@Pc(44) byte[] local44;
		synchronized (this.aClass97_100) {
			local44 = this.aClass97_100.method2545(arg0, 16);
		}
		local16 = new Class96();
		if (local44 != null) {
			local16.method2535(new Class2_Sub34(local44));
		}
		@Pc(66) Class233 local66 = this.aClass233_33;
		synchronized (this.aClass233_33) {
			this.aClass233_33.method5662(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	public void method6260() {
		@Pc(11) Class233 local11 = this.aClass233_33;
		synchronized (this.aClass233_33) {
			this.aClass233_33.method5663();
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
	public void method6263() {
		@Pc(2) Class233 local2 = this.aClass233_33;
		synchronized (this.aClass233_33) {
			this.aClass233_33.method5665();
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V")
	public void method6264() {
		@Pc(10) Class233 local10 = this.aClass233_33;
		synchronized (this.aClass233_33) {
			this.aClass233_33.method5664(5);
		}
	}
}
