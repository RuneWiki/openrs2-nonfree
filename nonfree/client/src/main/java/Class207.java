import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class207 {

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "Lclient!jo;")
	private final Class126 aClass126_48 = new Class126(64);

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "Lclient!ok;")
	private final Class178 aClass178_99;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;)V")
	public Class207(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_99 = arg2;
		this.aClass178_99.method3833(5);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)Lclient!wb;")
	public Class7_Sub4_Sub17 method4332(@OriginalArg(0) int arg0) {
		@Pc(14) Class126 local14 = this.aClass126_48;
		@Pc(24) Class7_Sub4_Sub17 local24;
		synchronized (this.aClass126_48) {
			local24 = (Class7_Sub4_Sub17) this.aClass126_48.method2822((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class178 local37 = this.aClass178_99;
		@Pc(46) byte[] local46;
		synchronized (this.aClass178_99) {
			local46 = this.aClass178_99.method3838(arg0, 5);
		}
		local24 = new Class7_Sub4_Sub17();
		if (local46 != null) {
			local24.method5637(new Class7_Sub14(local46));
		}
		@Pc(68) Class126 local68 = this.aClass126_48;
		synchronized (this.aClass126_48) {
			this.aClass126_48.method2824((long) arg0, local24);
			return local24;
		}
	}
}
