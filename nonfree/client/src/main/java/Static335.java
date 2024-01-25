import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
	public static int anInt5447;

	@OriginalMember(owner = "client!qg", name = "C", descriptor = "Z")
	public static boolean aBoolean372;

	@OriginalMember(owner = "client!qg", name = "D", descriptor = "Lclient!o;")
	public static Class49 aClass49_20;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "Lclient!d;")
	public static final Class44 aClass44_55 = new Class44(5);

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_99 = new Class198("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "Lclient!vg;")
	public static final Class252 aClass252_32 = new Class252(16);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!fh;I)Ljava/lang/String;")
	public static String method4338(@OriginalArg(1) Class5_Sub15 arg0) {
		try {
			@Pc(7) int local7 = arg0.method5542();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt7013 += Static330.aClass71_1.method1502(0, arg0.aByteArray93, local7, local15, arg0.anInt7013);
			return Static8.method148(0, local7, local15);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILclient!fi;)Ljava/lang/String;")
	public static String method4339(@OriginalArg(1) int arg0, @OriginalArg(2) Class76 arg1) {
		if (!Static55.method885(arg1).method5380(arg0) && arg1.anObjectArray13 == null) {
			return null;
		} else if (arg1.aStringArray14 == null || arg1.aStringArray14.length <= arg0 || arg1.aStringArray14[arg0] == null || arg1.aStringArray14[arg0].trim().length() == 0) {
			return Static97.aBoolean113 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray14[arg0];
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V")
	public static void method4340() {
		if (Static406.aBoolean456) {
			return;
		}
		if (Static216.aClass1_Sub1_1.aBoolean297) {
			Static99.aFloat33 = (int) Static99.aFloat33 + 191 & 0xFFFFFF80;
		} else {
			Static405.aFloat177 += (24.0F - Static405.aFloat177) / 2.0F;
		}
		Static406.aBoolean456 = true;
		Static324.aBoolean348 = true;
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V")
	public static void method4341() {
		Static348.aClass200_7.method5820(Static38.aFloat116, Static217.aFloat90, Static210.aFloat86);
	}
}
