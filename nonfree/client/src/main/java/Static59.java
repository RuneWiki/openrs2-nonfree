import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
	public static int anInt1267;

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "Lclient!am;")
	public static Class11 aClass11_25;

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "Lclient!hr;")
	public static Class95 aClass95_1;

	@OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
	public static int anInt1278;

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "J")
	public static long aLong51 = 0L;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
	public static int anInt1272 = 16777215;

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "[I")
	public static final int[] anIntArray142 = new int[5];

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZI)V")
	public static void method1049(@OriginalArg(0) boolean arg0) {
		Static294.method3383();
		if (Static139.anInt3135 != 30 && Static139.anInt3135 != 25) {
			return;
		}
		Static140.anInt3160++;
		if (Static140.anInt3160 < 50 && !arg0) {
			return;
		}
		Static140.anInt3160 = 0;
		if (!Static355.aBoolean596 && Static131.aClass171_3 != null) {
			Static320.aClass4_Sub7_Sub1_3.method1237(99);
			try {
				Static131.aClass171_3.method4636(Static320.aClass4_Sub7_Sub1_3.aByteArray42, Static320.aClass4_Sub7_Sub1_3.anInt2667);
				Static320.aClass4_Sub7_Sub1_3.anInt2667 = 0;
			} catch (@Pc(57) IOException local57) {
				Static355.aBoolean596 = true;
			}
		}
		Static294.method3383();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!fd;IBI)V")
	public static void method1050(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static293.anInt5929 = arg2;
		Static82.aClass72_7 = arg0;
		Static144.anInt3232 = arg1;
	}
}
