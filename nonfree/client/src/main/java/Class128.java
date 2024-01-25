import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class128 {

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "Lclient!nga;")
	private final Class233 aClass233_18 = new Class233(64);

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "Lclient!eq;")
	private final Class97 aClass97_50;

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
	public final int anInt4003;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class128(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_50 = arg2;
		this.anInt4003 = this.aClass97_50.method2569(19);
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)Lclient!eg;")
	public Class89 method3293(@OriginalArg(0) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_18;
		@Pc(16) Class89 local16;
		synchronized (this.aClass233_18) {
			local16 = (Class89) this.aClass233_18.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_50;
		@Pc(38) byte[] local38;
		synchronized (this.aClass97_50) {
			local38 = this.aClass97_50.method2545(arg0, 19);
		}
		local16 = new Class89();
		if (local38 != null) {
			local16.method2471(new Class2_Sub34(local38));
		}
		@Pc(62) Class233 local62 = this.aClass233_18;
		synchronized (this.aClass233_18) {
			this.aClass233_18.method5662(local16, (long) arg0);
			return local16;
		}
	}
}
