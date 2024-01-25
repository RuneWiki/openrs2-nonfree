import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class58 {

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Lclient!pw;")
	private Class4_Sub1 aClass4_Sub1_6;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!pw;")
	public final Class4_Sub1 aClass4_Sub1_5 = new Class4_Sub1();

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class58() {
		this.aClass4_Sub1_5.aClass4_Sub1_9 = this.aClass4_Sub1_5;
		this.aClass4_Sub1_5.aClass4_Sub1_10 = this.aClass4_Sub1_5;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!pw;I)V")
	public void method1195(@OriginalArg(0) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub1_10 != null) {
			arg0.method5235();
		}
		arg0.aClass4_Sub1_9 = this.aClass4_Sub1_5;
		arg0.aClass4_Sub1_10 = this.aClass4_Sub1_5.aClass4_Sub1_10;
		arg0.aClass4_Sub1_10.aClass4_Sub1_9 = arg0;
		arg0.aClass4_Sub1_9.aClass4_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)Lclient!pw;")
	public Class4_Sub1 method1197() {
		@Pc(7) Class4_Sub1 local7 = this.aClass4_Sub1_5.aClass4_Sub1_9;
		if (local7 == this.aClass4_Sub1_5) {
			this.aClass4_Sub1_6 = null;
			return null;
		} else {
			this.aClass4_Sub1_6 = local7.aClass4_Sub1_9;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public void method1198() {
		while (true) {
			@Pc(10) Class4_Sub1 local10 = this.aClass4_Sub1_5.aClass4_Sub1_9;
			if (this.aClass4_Sub1_5 == local10) {
				this.aClass4_Sub1_6 = null;
				return;
			}
			local10.method5235();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lclient!pw;")
	public Class4_Sub1 method1199() {
		@Pc(15) Class4_Sub1 local15 = this.aClass4_Sub1_6;
		if (this.aClass4_Sub1_5 == local15) {
			this.aClass4_Sub1_6 = null;
			return null;
		} else {
			this.aClass4_Sub1_6 = local15.aClass4_Sub1_9;
			return local15;
		}
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(Z)I")
	public int method1200() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class4_Sub1 local11 = this.aClass4_Sub1_5.aClass4_Sub1_9;
		while (this.aClass4_Sub1_5 != local11) {
			local11 = local11.aClass4_Sub1_9;
			local7++;
		}
		return false ? -54 : local7;
	}
}
