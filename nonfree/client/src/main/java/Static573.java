import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
	public static int anInt9327;

	@OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
	public static int anInt9329;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
	public static int anInt9325 = 104;

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
	public static int anInt9326 = -1;

	@OriginalMember(owner = "client!wba", name = "g", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_168 = new Class319(60, 2);

	@OriginalMember(owner = "client!wba", name = "o", descriptor = "[I")
	public static final int[] anIntArray622 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
	public static void method7713() {
		if (Static31.anInt879 == 0) {
			return;
		}
		try {
			if (++Static446.anInt7727 > 2000) {
				if (Static400.aClass75_3 != null) {
					Static400.aClass75_3.method1850();
					Static400.aClass75_3 = null;
				}
				if (Static17.anInt564 >= 2) {
					Static403.anInt6918 = -5;
					Static31.anInt879 = 0;
					return;
				}
				Static293.aClass174_3.method4003();
				Static31.anInt879 = 1;
				Static17.anInt564++;
				Static446.anInt7727 = 0;
			}
			if (Static31.anInt879 == 1) {
				Static120.aClass23_6 = Static293.aClass174_3.method3998(Static246.aClass114_10);
				Static31.anInt879 = 2;
			}
			if (Static31.anInt879 == 2) {
				if (Static120.aClass23_6.anInt875 == 2) {
					throw new IOException();
				}
				if (Static120.aClass23_6.anInt875 != 1) {
					return;
				}
				Static400.aClass75_3 = Static76.method1623((Socket) Static120.aClass23_6.anObject1);
				Static120.aClass23_6 = null;
				Static364.method5312();
				Static31.anInt879 = 4;
			}
			@Pc(115) int local115;
			if (Static31.anInt879 == 4) {
				if (!Static400.aClass75_3.method1855(1)) {
					return;
				}
				Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, 1);
				local115 = Static480.aClass1_Sub20_Sub1_1.aByteArray52[0] & 0xFF;
				if (local115 != 21) {
					Static31.anInt879 = 0;
					Static403.anInt6918 = local115;
					Static400.aClass75_3.method1850();
					Static400.aClass75_3 = null;
					return;
				}
				Static31.anInt879 = 5;
			}
			if (Static31.anInt879 == 5) {
				if (!Static400.aClass75_3.method1855(1)) {
					return;
				}
				Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, 1);
				Static542.aStringArray39 = new String[Static480.aClass1_Sub20_Sub1_1.aByteArray52[0] & 0xFF];
				Static31.anInt879 = 6;
			}
			if (Static31.anInt879 == 6 && Static400.aClass75_3.method1855(Static542.aStringArray39.length * 8)) {
				Static480.aClass1_Sub20_Sub1_1.anInt5238 = 0;
				Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, Static542.aStringArray39.length * 8);
				for (local115 = 0; local115 < Static542.aStringArray39.length; local115++) {
					Static542.aStringArray39[local115] = Static541.method7808(Static480.aClass1_Sub20_Sub1_1.method4416());
				}
				Static31.anInt879 = 0;
				Static403.anInt6918 = 21;
				Static400.aClass75_3.method1850();
				Static400.aClass75_3 = null;
			}
		} catch (@Pc(221) IOException local221) {
			if (Static400.aClass75_3 != null) {
				Static400.aClass75_3.method1850();
				Static400.aClass75_3 = null;
			}
			if (Static17.anInt564 >= 2) {
				Static403.anInt6918 = -4;
				Static31.anInt879 = 0;
			} else {
				Static293.aClass174_3.method4003();
				Static446.anInt7727 = 0;
				Static31.anInt879 = 1;
				Static17.anInt564++;
			}
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;I)V")
	public static void method7718(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		Static167.method2564(arg2, arg1, true, arg3, arg0, -1);
	}
}
