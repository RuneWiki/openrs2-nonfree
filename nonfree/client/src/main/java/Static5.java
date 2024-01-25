import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "n", descriptor = "Lclient!rs;")
	public static Class217 aClass217_1;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "Lclient!um;")
	public static final Class244 aClass244_3 = new Class244();

	@OriginalMember(owner = "client!af", name = "r", descriptor = "S")
	public static short aShort1 = 32767;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "Z")
	public static boolean aBoolean10 = false;

	@OriginalMember(owner = "client!af", name = "u", descriptor = "I")
	public static int anInt245 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)V")
	public static void method200(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub2_Sub7 local12 = Static212.method3218(arg0, 9);
		local12.method3084();
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
	public static void method201() {
		Static97.aBoolean149 = true;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!cu;I)V")
	public static void method202(@OriginalArg(0) Class3_Sub2_Sub1_Sub1 arg0) {
		for (@Pc(14) Class6_Sub19 local14 = (Class6_Sub19) Static307.aClass244_26.method5976(); local14 != null; local14 = (Class6_Sub19) Static307.aClass244_26.method5964()) {
			if (local14.aClass3_Sub2_Sub1_Sub1_1 == arg0) {
				if (local14.aClass6_Sub4_Sub1_3 != null) {
					Static360.aClass6_Sub4_Sub4_2.method5907(local14.aClass6_Sub4_Sub1_3);
					local14.aClass6_Sub4_Sub1_3 = null;
				}
				local14.method6525();
				return;
			}
		}
	}
}
