import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class84 {

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "Lclient!ad;")
	private final Class5 aClass5_24 = new Class5(64);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "Lclient!dn;")
	private final Class56 aClass56_33;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
	public final int anInt2821;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;)V")
	public Class84(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_33 = arg2;
		this.anInt2821 = this.aClass56_33.method1373(19);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)Lclient!ra;")
	public Class197 method2270(@OriginalArg(1) int arg0) {
		@Pc(11) Class5 local11 = this.aClass5_24;
		@Pc(21) Class197 local21;
		synchronized (this.aClass5_24) {
			local21 = (Class197) this.aClass5_24.method104((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass56_33.method1384(19, arg0);
		local21 = new Class197();
		if (local38 != null) {
			local21.method4875(new Class3_Sub2(local38));
		}
		@Pc(54) Class5 local54 = this.aClass5_24;
		synchronized (this.aClass5_24) {
			this.aClass5_24.method114((long) arg0, local21);
			return local21;
		}
	}
}
