import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!ir", name = "r", descriptor = "[[Lclient!mq;")
	public static Class156[][] aClass156ArrayArray2;

	@OriginalMember(owner = "client!ir", name = "M", descriptor = "I")
	public static int anInt3545;

	@OriginalMember(owner = "client!ir", name = "N", descriptor = "I")
	public static int anInt3546;

	@OriginalMember(owner = "client!ir", name = "L", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_78 = new Class119(77, 8);

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2829(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(22) String local22 = Static40.method777(arg0);
		if (local22 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < Static202.anInt3950; local27++) {
			@Pc(32) String local32 = Static388.aStringArray45[local27];
			if (local32.startsWith("*")) {
				local32 = local32.substring(1);
			}
			local32 = Static40.method777(local32);
			if (local32 != null && local32.equals(local22)) {
				Static202.anInt3950--;
				for (@Pc(56) int local56 = local27; local56 < Static202.anInt3950; local56++) {
					Static388.aStringArray45[local56] = Static388.aStringArray45[local56 + 1];
					Static93.aStringArray19[local56] = Static93.aStringArray19[local56 + 1];
					Static102.anIntArray137[local56] = Static102.anIntArray137[local56 + 1];
					Static20.aStringArray6[local56] = Static20.aStringArray6[local56 + 1];
					Static252.anIntArray306[local56] = Static252.anIntArray306[local56 + 1];
					Static272.aBooleanArray19[local56] = Static272.aBooleanArray19[local56 + 1];
				}
				Static161.anInt3318 = Static301.anInt2459;
				Static30.method641(Static359.aClass217_94);
				Static302.aClass3_Sub7_Sub1_2.method2628(Static24.method582(arg0));
				Static302.aClass3_Sub7_Sub1_2.method2608(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IBI)Z")
	public static boolean method2831(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static23.method511(arg1, arg0) | (arg1 & 0x70000) != 0 || Static40.method776(arg0, arg1);
	}
}
