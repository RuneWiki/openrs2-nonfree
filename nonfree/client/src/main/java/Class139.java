import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class139 {

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "Lclient!nga;")
	private Class233 aClass233_20 = new Class233(64);

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "Lclient!nga;")
	public Class233 aClass233_21 = new Class233(64);

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "Lclient!eq;")
	public final Class97 aClass97_55;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "Lclient!eq;")
	private final Class97 aClass97_54;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;Lclient!eq;)V")
	public Class139(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) Class97 arg3) {
		this.aClass97_55 = arg3;
		this.aClass97_54 = arg2;
		this.aClass97_54.method2569(34);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V")
	public void method3434() {
		@Pc(2) Class233 local2 = this.aClass233_20;
		synchronized (this.aClass233_20) {
			this.aClass233_20.method5665();
		}
		local2 = this.aClass233_21;
		synchronized (this.aClass233_21) {
			this.aClass233_21.method5665();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
	public void method3436() {
		@Pc(6) Class233 local6 = this.aClass233_20;
		synchronized (this.aClass233_20) {
			this.aClass233_20.method5663();
		}
		local6 = this.aClass233_21;
		synchronized (this.aClass233_21) {
			this.aClass233_21.method5663();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V")
	public void method3437() {
		@Pc(2) Class233 local2 = this.aClass233_20;
		synchronized (this.aClass233_20) {
			this.aClass233_20.method5664(5);
		}
		local2 = this.aClass233_21;
		synchronized (this.aClass233_21) {
			this.aClass233_21.method5664(5);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIB)V")
	public void method3441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass233_20 = new Class233(arg0);
		this.aClass233_21 = new Class233(arg1);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZ)Lclient!wn;")
	public Class375 method3442(@OriginalArg(0) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_20;
		@Pc(16) Class375 local16;
		synchronized (this.aClass233_20) {
			local16 = (Class375) this.aClass233_20.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_54;
		@Pc(38) byte[] local38;
		synchronized (this.aClass97_54) {
			local38 = this.aClass97_54.method2545(arg0, 34);
		}
		local16 = new Class375();
		local16.aClass139_4 = this;
		if (local38 != null) {
			local16.method8500(new Class2_Sub34(local38));
		}
		@Pc(63) Class233 local63 = this.aClass233_20;
		synchronized (this.aClass233_20) {
			this.aClass233_20.method5662(local16, (long) arg0);
			return local16;
		}
	}
}
