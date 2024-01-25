import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "Lclient!da;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "Lclient!uq;")
	public static Class7_Sub39 aClass7_Sub39_1 = null;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
	public static int anInt1605 = 0;

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!qo;)V")
	public static void method1296(@OriginalArg(1) Class22_Sub2_Sub1_Sub2 arg0) {
		for (@Pc(14) Class7_Sub26 local14 = (Class7_Sub26) Static45.aClass74_4.method1793(); local14 != null; local14 = (Class7_Sub26) Static45.aClass74_4.method1798()) {
			if (arg0 == local14.aClass22_Sub2_Sub1_Sub2_1) {
				if (local14.aClass7_Sub8_Sub4_1 != null) {
					Static134.aClass7_Sub8_Sub3_2.method3898(local14.aClass7_Sub8_Sub4_1);
					local14.aClass7_Sub8_Sub4_1 = null;
				}
				local14.method5648();
				return;
			}
		}
	}
}
