import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class208 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "Lclient!jo;")
	private final Class126 aClass126_49 = new Class126(128);

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "Lclient!ok;")
	private final Class178 aClass178_103;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;)V")
	public Class208(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_103 = arg2;
		if (this.aClass178_103 != null) {
			@Pc(20) int local20 = this.aClass178_103.method3832() - 1;
			this.aClass178_103.method3833(local20);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Lclient!rj;")
	public Class218 method4373(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_49;
		@Pc(16) Class218 local16;
		synchronized (this.aClass126_49) {
			local16 = (Class218) this.aClass126_49.method2822((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass178_103.method3838(Static426.method5486(arg0), Static100.method1733(arg0));
		local16 = new Class218();
		if (local37 != null) {
			local16.method4455(new Class7_Sub14(local37));
		}
		@Pc(55) Class126 local55 = this.aClass126_49;
		synchronized (this.aClass126_49) {
			this.aClass126_49.method2824((long) arg0, local16);
			return local16;
		}
	}
}
