import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class301 {

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "Lclient!fw;")
	public final Class120 aClass120_6 = new Class120();

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "Z")
	public boolean aBoolean617 = false;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Z)V")
	public Class301(@OriginalArg(0) boolean arg0) {
		this.aBoolean617 = arg0;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)V")
	public void method7458() {
		while (true) {
			@Pc(17) Class4_Sub8 local17 = (Class4_Sub8) this.aClass120_6.method2957();
			if (local17 == null) {
				return;
			}
			local17.method7841();
			Static427.method6667(local17);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!qs;I)V")
	public void method7459(@OriginalArg(0) Class4_Sub8 arg0) {
		@Pc(8) Class4_Sub1 local8 = arg0.aClass4_Sub1_2;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class4_Sub5[] local13 = arg0.aClass4_Sub5Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean514) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(47) Class4_Sub8 local47;
		if (this.aBoolean617) {
			for (local47 = (Class4_Sub8) this.aClass120_6.method2966(); local47 != null; local47 = (Class4_Sub8) this.aClass120_6.method2962()) {
				if (local8 == local47.aClass4_Sub1_2) {
					local47.method7841();
					Static427.method6667(local47);
				}
			}
		}
		for (local47 = (Class4_Sub8) this.aClass120_6.method2966(); local47 != null; local47 = (Class4_Sub8) this.aClass120_6.method2962()) {
			if (local47.aClass4_Sub1_2.anInt8918 <= local8.anInt8918) {
				Static344.method5774(local47, arg0);
				return;
			}
		}
		this.aClass120_6.method2960(arg0);
	}
}
