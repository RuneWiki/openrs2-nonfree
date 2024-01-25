import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class227 {

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Lclient!jo;")
	private final Class126 aClass126_53 = new Class126(64);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Lclient!ok;")
	private final Class178 aClass178_109;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Lclient!ok;")
	private final Class178 aClass178_110;

	static {
		new Class55("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(ILclient!ok;Lclient!ok;)V")
	public Class227(@OriginalArg(0) int arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_109 = arg1;
		this.aClass178_110 = arg2;
		if (this.aClass178_109 != null) {
			this.aClass178_109.method3833(0);
		}
		if (this.aClass178_110 != null) {
			this.aClass178_110.method3833(0);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)Lclient!ti;")
	public Class7_Sub4_Sub15 method4617(@OriginalArg(1) int arg0) {
		@Pc(11) Class7_Sub4_Sub15 local11 = (Class7_Sub4_Sub15) this.aClass126_53.method2822((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = this.aClass178_109.method3838(arg0, 0);
		} else {
			local25 = this.aClass178_110.method3838(arg0 & 0x7FFF, 0);
		}
		local11 = new Class7_Sub4_Sub15();
		if (local25 != null) {
			local11.method4949(new Class7_Sub14(local25));
		}
		if (arg0 >= 32768) {
			local11.method4946();
		}
		this.aClass126_53.method2824((long) arg0, local11);
		return local11;
	}
}
