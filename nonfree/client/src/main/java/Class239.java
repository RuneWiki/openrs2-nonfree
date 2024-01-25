import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class239 {

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "Lclient!wf;")
	private Class4_Sub2 aClass4_Sub2_51;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "Lclient!wf;")
	private final Class4_Sub2 aClass4_Sub2_50 = new Class4_Sub2();

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	public Class239() {
		this.aClass4_Sub2_50.aClass4_Sub2_57 = this.aClass4_Sub2_50;
		this.aClass4_Sub2_50.aClass4_Sub2_56 = this.aClass4_Sub2_50;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)Lclient!wf;")
	public Class4_Sub2 method5119() {
		@Pc(7) Class4_Sub2 local7 = this.aClass4_Sub2_50.aClass4_Sub2_57;
		if (local7 == this.aClass4_Sub2_50) {
			return null;
		} else {
			local7.method5538();
			return local7;
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)Lclient!wf;")
	public Class4_Sub2 method5120() {
		@Pc(6) Class4_Sub2 local6 = this.aClass4_Sub2_51;
		if (this.aClass4_Sub2_50 == local6) {
			this.aClass4_Sub2_51 = null;
			return null;
		} else {
			this.aClass4_Sub2_51 = local6.aClass4_Sub2_57;
			return local6;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	public void method5122() {
		while (true) {
			@Pc(12) Class4_Sub2 local12 = this.aClass4_Sub2_50.aClass4_Sub2_57;
			if (this.aClass4_Sub2_50 == local12) {
				this.aClass4_Sub2_51 = null;
				return;
			}
			local12.method5538();
		}
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)I")
	public int method5124() {
		@Pc(16) int local16 = 0;
		@Pc(20) Class4_Sub2 local20 = this.aClass4_Sub2_50.aClass4_Sub2_57;
		while (local20 != this.aClass4_Sub2_50) {
			local20 = local20.aClass4_Sub2_57;
			local16++;
		}
		return local16;
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)Lclient!wf;")
	public Class4_Sub2 method5125() {
		@Pc(12) Class4_Sub2 local12 = this.aClass4_Sub2_50.aClass4_Sub2_57;
		if (local12 == this.aClass4_Sub2_50) {
			this.aClass4_Sub2_51 = null;
			return null;
		} else {
			this.aClass4_Sub2_51 = local12.aClass4_Sub2_57;
			return local12;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZLclient!wf;)V")
	public void method5126(@OriginalArg(1) Class4_Sub2 arg0) {
		if (arg0.aClass4_Sub2_56 != null) {
			arg0.method5538();
		}
		arg0.aClass4_Sub2_56 = this.aClass4_Sub2_50.aClass4_Sub2_56;
		arg0.aClass4_Sub2_57 = this.aClass4_Sub2_50;
		arg0.aClass4_Sub2_56.aClass4_Sub2_57 = arg0;
		arg0.aClass4_Sub2_57.aClass4_Sub2_56 = arg0;
	}
}
