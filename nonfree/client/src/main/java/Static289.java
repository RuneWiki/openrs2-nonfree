import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "[I")
	public static int[] anIntArray501;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "Lclient!kc;")
	public static Class1_Sub1_Sub12 aClass1_Sub1_Sub12_4;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public static int anInt5491 = 0;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString183 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "Z")
	public static boolean aBoolean394 = true;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ek;")
	public static RuntimeException_Sub1 method4286(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString36 = local12.aString36 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BZ)V")
	public static void method4287(@OriginalArg(1) boolean arg0) {
		Static82.method1238();
		if (Static258.anInt5016 != 30 && Static258.anInt5016 != 25) {
			return;
		}
		Static305.anInt5777++;
		if (Static305.anInt5777 < 50 && !arg0) {
			return;
		}
		Static305.anInt5777 = 0;
		if (!Static67.aBoolean109 && Static81.aClass7_2 != null) {
			Static137.aClass1_Sub14_Sub1_6.method2661(122);
			try {
				Static81.aClass7_2.method108(Static137.aClass1_Sub14_Sub1_6.aByteArray34, Static137.aClass1_Sub14_Sub1_6.anInt3290);
				Static137.aClass1_Sub14_Sub1_6.anInt3290 = 0;
			} catch (@Pc(49) IOException local49) {
				Static67.aBoolean109 = true;
			}
		}
		Static82.method1238();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method4288(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static268.anInt5931 >= 100) {
			Static199.method3219(Static69.aString44);
			return;
		}
		@Pc(21) String local21 = Static136.method2200(arg0);
		if (local21 == null) {
			return;
		}
		@Pc(27) int local27;
		@Pc(40) String local40;
		@Pc(68) String local68;
		for (local27 = 0; local27 < Static268.anInt5931; local27++) {
			local40 = Static136.method2200(Static57.aStringArray8[local27]);
			if (local40 != null && local40.equals(local21)) {
				Static199.method3219(arg0 + Static161.aString105);
				return;
			}
			if (Static172.aStringArray3[local27] != null) {
				local68 = Static136.method2200(Static172.aStringArray3[local27]);
				if (local68 != null && local68.equals(local21)) {
					Static199.method3219(arg0 + Static161.aString105);
					return;
				}
			}
		}
		for (local27 = 0; local27 < Static175.anInt3635; local27++) {
			local40 = Static136.method2200(Static279.aStringArray44[local27]);
			if (local40 != null && local40.equals(local21)) {
				Static199.method3219(Static4.aString1 + arg0 + Static278.aString173);
				return;
			}
			if (Static263.aStringArray43[local27] != null) {
				local68 = Static136.method2200(Static263.aStringArray43[local27]);
				if (local68 != null && local68.equals(local21)) {
					Static199.method3219(Static4.aString1 + arg0 + Static278.aString173);
					return;
				}
			}
		}
		if (Static136.method2200(Static229.aClass22_Sub3_Sub2_2.aString153).equals(local21)) {
			Static199.method3219(Static238.aString161);
		} else {
			Static137.aClass1_Sub14_Sub1_6.method2661(26);
			Static137.aClass1_Sub14_Sub1_6.method2631(Static255.method3873(arg0) + 1);
			Static137.aClass1_Sub14_Sub1_6.method2619(arg0);
			Static137.aClass1_Sub14_Sub1_6.method2631(arg1 ? 1 : 0);
		}
	}
}
