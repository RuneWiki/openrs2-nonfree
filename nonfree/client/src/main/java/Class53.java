import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class53 {

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Lclient!nga;")
	private final Class233 aClass233_6 = new Class233(64);

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Lclient!eq;")
	private final Class97 aClass97_13;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class53(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_13 = arg2;
		this.aClass97_13.method2569(5);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)Lclient!oe;")
	public Class2_Sub5_Sub16 method1237(@OriginalArg(1) int arg0) {
		@Pc(11) Class233 local11 = this.aClass233_6;
		@Pc(21) Class2_Sub5_Sub16 local21;
		synchronized (this.aClass233_6) {
			local21 = (Class2_Sub5_Sub16) this.aClass233_6.method5669((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class97 local34 = this.aClass97_13;
		@Pc(45) byte[] local45;
		synchronized (this.aClass97_13) {
			local45 = this.aClass97_13.method2545(arg0, 5);
		}
		local21 = new Class2_Sub5_Sub16();
		if (local45 != null) {
			local21.method6052(new Class2_Sub34(local45));
		}
		@Pc(67) Class233 local67 = this.aClass233_6;
		synchronized (this.aClass233_6) {
			this.aClass233_6.method5662(local21, (long) arg0);
			return local21;
		}
	}
}
