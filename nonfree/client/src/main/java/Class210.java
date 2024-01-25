import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class210 {

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "Lclient!jo;")
	private final Class126 aClass126_50 = new Class126(64);

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "Lclient!ok;")
	private final Class178 aClass178_104;

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
	public final int anInt5452;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;)V")
	public Class210(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_104 = arg2;
		this.anInt5452 = this.aClass178_104.method3833(19);
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(BI)Lclient!tl;")
	public Class237 method4380(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_50;
		@Pc(16) Class237 local16;
		synchronized (this.aClass126_50) {
			local16 = (Class237) this.aClass126_50.method2822((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class178 local29 = this.aClass178_104;
		@Pc(38) byte[] local38;
		synchronized (this.aClass178_104) {
			local38 = this.aClass178_104.method3838(arg0, 19);
		}
		local16 = new Class237();
		if (local38 != null) {
			local16.method4974(new Class7_Sub14(local38));
		}
		@Pc(65) Class126 local65 = this.aClass126_50;
		synchronized (this.aClass126_50) {
			this.aClass126_50.method2824((long) arg0, local16);
			return local16;
		}
	}
}
