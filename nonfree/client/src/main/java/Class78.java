import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class78 {

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Lclient!n;")
	private final Class4_Sub1 aClass4_Sub1_64 = new Class4_Sub1();

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class78() {
		this.aClass4_Sub1_64.aClass4_Sub1_72 = this.aClass4_Sub1_64;
		this.aClass4_Sub1_64.aClass4_Sub1_71 = this.aClass4_Sub1_64;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!n;)V")
	public void method2671(@OriginalArg(1) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub1_71 != null) {
			arg0.method3176();
		}
		arg0.aClass4_Sub1_71 = this.aClass4_Sub1_64;
		arg0.aClass4_Sub1_72 = this.aClass4_Sub1_64.aClass4_Sub1_72;
		arg0.aClass4_Sub1_71.aClass4_Sub1_72 = arg0;
		arg0.aClass4_Sub1_72.aClass4_Sub1_71 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)Lclient!n;")
	public Class4_Sub1 method2672() {
		@Pc(12) Class4_Sub1 local12 = this.aClass4_Sub1_64.aClass4_Sub1_72;
		return this.aClass4_Sub1_64 == local12 ? null : local12;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!n;I)V")
	public void method2674(@OriginalArg(0) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub1_71 != null) {
			arg0.method3176();
		}
		arg0.aClass4_Sub1_71 = this.aClass4_Sub1_64.aClass4_Sub1_71;
		arg0.aClass4_Sub1_72 = this.aClass4_Sub1_64;
		arg0.aClass4_Sub1_71.aClass4_Sub1_72 = arg0;
		arg0.aClass4_Sub1_72.aClass4_Sub1_71 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Lclient!n;")
	public Class4_Sub1 method2676() {
		@Pc(7) Class4_Sub1 local7 = this.aClass4_Sub1_64.aClass4_Sub1_72;
		if (this.aClass4_Sub1_64 == local7) {
			return null;
		} else {
			local7.method3176();
			return local7;
		}
	}
}
