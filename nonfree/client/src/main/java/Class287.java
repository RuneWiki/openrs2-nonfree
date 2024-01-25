import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class287 {

	@OriginalMember(owner = "client!qga", name = "i", descriptor = "Lclient!mc;")
	private Class4_Sub1 aClass4_Sub1_10;

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "Lclient!mc;")
	public final Class4_Sub1 aClass4_Sub1_9 = new Class4_Sub1();

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "()V")
	public Class287() {
		this.aClass4_Sub1_9.aClass4_Sub1_8 = this.aClass4_Sub1_9;
		this.aClass4_Sub1_9.aClass4_Sub1_7 = this.aClass4_Sub1_9;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!mc;I)V")
	public void method6808(@OriginalArg(0) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub1_7 != null) {
			arg0.method5082();
		}
		arg0.aClass4_Sub1_8 = this.aClass4_Sub1_9;
		arg0.aClass4_Sub1_7 = this.aClass4_Sub1_9.aClass4_Sub1_7;
		arg0.aClass4_Sub1_7.aClass4_Sub1_8 = arg0;
		arg0.aClass4_Sub1_8.aClass4_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
	public void method6810() {
		while (true) {
			@Pc(9) Class4_Sub1 local9 = this.aClass4_Sub1_9.aClass4_Sub1_8;
			if (local9 == this.aClass4_Sub1_9) {
				this.aClass4_Sub1_10 = null;
				return;
			}
			local9.method5082();
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)I")
	public int method6811() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class4_Sub1 local16 = this.aClass4_Sub1_9.aClass4_Sub1_8; local16 != this.aClass4_Sub1_9; local16 = local16.aClass4_Sub1_8) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)Lclient!mc;")
	public Class4_Sub1 method6812() {
		@Pc(11) Class4_Sub1 local11 = this.aClass4_Sub1_10;
		if (this.aClass4_Sub1_9 == local11) {
			this.aClass4_Sub1_10 = null;
			return null;
		} else {
			this.aClass4_Sub1_10 = local11.aClass4_Sub1_8;
			return local11;
		}
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)Lclient!mc;")
	public Class4_Sub1 method6814() {
		@Pc(7) Class4_Sub1 local7 = this.aClass4_Sub1_9.aClass4_Sub1_8;
		if (this.aClass4_Sub1_9 == local7) {
			this.aClass4_Sub1_10 = null;
			return null;
		} else {
			this.aClass4_Sub1_10 = local7.aClass4_Sub1_8;
			return local7;
		}
	}
}
