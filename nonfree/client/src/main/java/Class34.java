import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class34 {

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "Lclient!aq;")
	private Class4_Sub2 aClass4_Sub2_4;

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "Lclient!aq;")
	public final Class4_Sub2 aClass4_Sub2_3 = new Class4_Sub2();

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	public Class34() {
		this.aClass4_Sub2_3.aClass4_Sub2_9 = this.aClass4_Sub2_3;
		this.aClass4_Sub2_3.aClass4_Sub2_10 = this.aClass4_Sub2_3;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!aq;)V")
	public void method1397(@OriginalArg(1) Class4_Sub2 arg0) {
		if (arg0.aClass4_Sub2_9 != null) {
			arg0.method6693();
		}
		arg0.aClass4_Sub2_10 = this.aClass4_Sub2_3;
		arg0.aClass4_Sub2_9 = this.aClass4_Sub2_3.aClass4_Sub2_9;
		arg0.aClass4_Sub2_9.aClass4_Sub2_10 = arg0;
		arg0.aClass4_Sub2_10.aClass4_Sub2_9 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I")
	public int method1398() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class4_Sub2 local11 = this.aClass4_Sub2_3.aClass4_Sub2_10;
		while (local11 != this.aClass4_Sub2_3) {
			local11 = local11.aClass4_Sub2_10;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)Lclient!aq;")
	public Class4_Sub2 method1399() {
		@Pc(6) Class4_Sub2 local6 = this.aClass4_Sub2_4;
		if (local6 == this.aClass4_Sub2_3) {
			this.aClass4_Sub2_4 = null;
			return null;
		} else {
			this.aClass4_Sub2_4 = local6.aClass4_Sub2_10;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
	public void method1400() {
		while (true) {
			@Pc(5) Class4_Sub2 local5 = this.aClass4_Sub2_3.aClass4_Sub2_10;
			if (this.aClass4_Sub2_3 == local5) {
				this.aClass4_Sub2_4 = null;
				return;
			}
			local5.method6693();
		}
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)Lclient!aq;")
	public Class4_Sub2 method1402() {
		@Pc(7) Class4_Sub2 local7 = this.aClass4_Sub2_3.aClass4_Sub2_10;
		if (this.aClass4_Sub2_3 == local7) {
			this.aClass4_Sub2_4 = null;
			return null;
		} else {
			this.aClass4_Sub2_4 = local7.aClass4_Sub2_10;
			return local7;
		}
	}
}
