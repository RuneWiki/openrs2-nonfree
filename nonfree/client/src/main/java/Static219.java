import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!go", name = "j", descriptor = "I")
	public static int anInt3590 = 1;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_37 = new Class144(50, 1);

	@OriginalMember(owner = "client!go", name = "c", descriptor = "Lclient!dja;")
	public static final Class78 aClass78_6 = new Class78("", 10);

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!ee;)V")
	public static void method3261(@OriginalArg(0) Class9_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < 2; local5++) {
			@Pc(8) Class9_Sub1 local8 = null;
			for (@Pc(12) Class9_Sub1 local12 = Static356.aClass9_Sub1Array4[local5]; local12 != null; local12 = local12.aClass9_Sub1_24) {
				if (local12 == arg0) {
					if (local8 == null) {
						Static356.aClass9_Sub1Array4[local5] = local12.aClass9_Sub1_24;
					} else {
						local8.aClass9_Sub1_24 = local12.aClass9_Sub1_24;
					}
					Static632.aBoolean653 = true;
					return;
				}
				local8 = local12;
			}
			local8 = null;
			for (@Pc(47) Class9_Sub1 local47 = Static120.aClass9_Sub1Array2[local5]; local47 != null; local47 = local47.aClass9_Sub1_24) {
				if (local47 == arg0) {
					if (local8 == null) {
						Static120.aClass9_Sub1Array2[local5] = local47.aClass9_Sub1_24;
					} else {
						local8.aClass9_Sub1_24 = local47.aClass9_Sub1_24;
					}
					Static632.aBoolean653 = true;
					return;
				}
				local8 = local47;
			}
			local8 = null;
			for (@Pc(82) Class9_Sub1 local82 = Static52.aClass9_Sub1Array1[local5]; local82 != null; local82 = local82.aClass9_Sub1_24) {
				if (local82 == arg0) {
					if (local8 == null) {
						Static52.aClass9_Sub1Array1[local5] = local82.aClass9_Sub1_24;
					} else {
						local8.aClass9_Sub1_24 = local82.aClass9_Sub1_24;
					}
					Static632.aBoolean653 = true;
					return;
				}
				local8 = local82;
			}
		}
	}
}
