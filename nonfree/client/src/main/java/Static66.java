import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!em", name = "m", descriptor = "I")
	public static int anInt4755;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "I")
	public static int anInt4746 = 20;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "[F")
	public static float[] aFloatArray19 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!em", name = "j", descriptor = "[I")
	public static int[] anIntArray439 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!em", name = "n", descriptor = "I")
	public static int anInt4756 = 0;

	@OriginalMember(owner = "client!em", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString333 = "";

	@OriginalMember(owner = "client!em", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString334 = "green:";

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)Lclient!jn;")
	public static Class1_Sub3_Sub11 method3524() {
		if (Static268.aClass108_11 == null) {
			return null;
		} else {
			Static121.aClass72_1.method1776(Static268.aClass108_11);
			@Pc(23) Class1_Sub3_Sub11 local23 = (Class1_Sub3_Sub11) Static121.aClass72_1.method1777();
			@Pc(28) Class107 local28 = Static173.method2819(local23.anInt3104);
			return local28 != null && local28.aBoolean242 && local28.method2745() ? local23 : Static269.method4046();
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V")
	public static void method3525(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static47.method948(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static313.method4736(local7);
			local7 = Static309.method4686("%3a", ":", local7);
			local7 = Static309.method4686("%40", "@", local7);
			local7 = Static309.method4686("%26", "&", local7);
			local7 = Static309.method4686("%23", "#", local7);
			if (Static36.aClass112_1.anApplet1 == null) {
				return;
			}
			@Pc(109) Class47 local109 = Static36.aClass112_1.method2883(new URL(Static36.aClass112_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static8.anInt227 + "&u=" + Static22.aLong33 + "&v1=" + Static179.aString256 + "&v2=" + Static179.aString255 + "&e=" + local7));
			while (local109.anInt1417 == 0) {
				Static312.method4734(1L);
			}
			if (local109.anInt1417 == 1) {
				@Pc(129) DataInputStream local129 = (DataInputStream) local109.anObject2;
				local129.read();
				local129.close();
			}
		} catch (@Pc(136) Exception local136) {
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!th;)V")
	public static void method3527(@OriginalArg(1) Class168 arg0) {
		Static122.anInt2670 = arg0.method4069("titlebg");
		Static169.anInt3799 = arg0.method4069("logo");
	}
}
