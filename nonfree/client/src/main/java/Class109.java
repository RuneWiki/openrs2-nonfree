import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class109 {

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "Lclient!ad;")
	private final Class5 aClass5_29 = new Class5(64);

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!dn;")
	private final Class56 aClass56_42;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "Lclient!dn;")
	public final Class56 aClass56_43;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;Lclient!dn;)V")
	public Class109(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) Class56 arg3) {
		this.aClass56_42 = arg2;
		this.aClass56_43 = arg3;
		this.aClass56_42.method1373(3);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)Lclient!of;")
	public Class174 method2970(@OriginalArg(1) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_29;
		@Pc(16) Class174 local16;
		synchronized (this.aClass5_29) {
			local16 = (Class174) this.aClass5_29.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass56_42.method1384(3, arg0);
		local16 = new Class174();
		local16.aClass109_6 = this;
		if (local33 != null) {
			local16.method4169(new Class3_Sub2(local33));
		}
		@Pc(58) Class5 local58 = this.aClass5_29;
		synchronized (this.aClass5_29) {
			this.aClass5_29.method114((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(BI)V")
	public void method2973() {
		@Pc(6) Class5 local6 = this.aClass5_29;
		synchronized (this.aClass5_29) {
			this.aClass5_29.method106(5);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public void method2974() {
		@Pc(6) Class5 local6 = this.aClass5_29;
		synchronized (this.aClass5_29) {
			this.aClass5_29.method110();
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	public void method2976() {
		@Pc(2) Class5 local2 = this.aClass5_29;
		synchronized (this.aClass5_29) {
			this.aClass5_29.method116();
		}
	}
}
