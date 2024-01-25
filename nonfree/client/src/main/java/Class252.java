import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class252 {

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "Lclient!pg;")
	private Class4_Sub1 aClass4_Sub1_56;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!pg;")
	private final Class4_Sub1 aClass4_Sub1_55 = new Class4_Sub1();

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class252() {
		this.aClass4_Sub1_55.aClass4_Sub1_57 = this.aClass4_Sub1_55;
		this.aClass4_Sub1_55.aClass4_Sub1_58 = this.aClass4_Sub1_55;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
	public int method5693() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class4_Sub1 local11 = this.aClass4_Sub1_55.aClass4_Sub1_57;
		while (local11 != this.aClass4_Sub1_55) {
			local11 = local11.aClass4_Sub1_57;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!pg;I)V")
	public void method5694(@OriginalArg(0) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub1_58 != null) {
			arg0.method5985();
		}
		arg0.aClass4_Sub1_57 = this.aClass4_Sub1_55;
		arg0.aClass4_Sub1_58 = this.aClass4_Sub1_55.aClass4_Sub1_58;
		arg0.aClass4_Sub1_58.aClass4_Sub1_57 = arg0;
		arg0.aClass4_Sub1_57.aClass4_Sub1_58 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public void method5696() {
		while (true) {
			@Pc(12) Class4_Sub1 local12 = this.aClass4_Sub1_55.aClass4_Sub1_57;
			if (local12 == this.aClass4_Sub1_55) {
				this.aClass4_Sub1_56 = null;
				return;
			}
			local12.method5985();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)Lclient!pg;")
	public Class4_Sub1 method5697() {
		@Pc(12) Class4_Sub1 local12 = this.aClass4_Sub1_55.aClass4_Sub1_57;
		if (this.aClass4_Sub1_55 == local12) {
			this.aClass4_Sub1_56 = null;
			return null;
		} else {
			this.aClass4_Sub1_56 = local12.aClass4_Sub1_57;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)Lclient!pg;")
	public Class4_Sub1 method5698() {
		@Pc(12) Class4_Sub1 local12 = this.aClass4_Sub1_55.aClass4_Sub1_57;
		if (local12 == this.aClass4_Sub1_55) {
			return null;
		} else {
			local12.method5985();
			return local12;
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)Lclient!pg;")
	public Class4_Sub1 method5700() {
		@Pc(11) Class4_Sub1 local11 = this.aClass4_Sub1_56;
		if (this.aClass4_Sub1_55 == local11) {
			this.aClass4_Sub1_56 = null;
			return null;
		} else {
			this.aClass4_Sub1_56 = local11.aClass4_Sub1_57;
			return local11;
		}
	}
}
