import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Lclient!dc;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "I")
	public static int anInt3426;

	@OriginalMember(owner = "client!n", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString112 = "Discard";

	@OriginalMember(owner = "client!n", name = "J", descriptor = "I")
	public static int anInt3434 = -1;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V")
	public static void method2709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static142.aClass4_Sub17_Sub1_3.anInt2400 = 0;
		Static142.aClass4_Sub17_Sub1_3.method1861(20);
		Static142.aClass4_Sub17_Sub1_3.method1861(arg3);
		Static142.aClass4_Sub17_Sub1_3.method1861(arg1);
		Static142.aClass4_Sub17_Sub1_3.method1875(arg0);
		Static142.aClass4_Sub17_Sub1_3.method1875(arg2);
		Static227.anInt3978 = 0;
		Static101.anInt4751 = 0;
		Static81.anInt4026 = 1;
		Static171.anInt3391 = -3;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)Lclient!ej;")
	public static Class43 method2710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass43_1;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method2711(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) short[] local8 = new short[16];
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static225.anInt4475; local15++) {
			@Pc(22) Class163 local22 = Static277.method4117(local15);
			if ((!arg1 || local22.aBoolean315) && local22.anInt4869 == -1 && local22.anInt4892 == -1 && local22.anInt4889 == 0 && local22.aString169.toLowerCase().indexOf(local11) != -1) {
				if (local13 >= 250) {
					Static270.aShortArray84 = null;
					Static18.anInt381 = -1;
					return;
				}
				if (local8.length <= local13) {
					@Pc(72) short[] local72 = new short[local8.length * 2];
					for (@Pc(74) int local74 = 0; local74 < local13; local74++) {
						local72[local74] = local8[local74];
					}
					local8 = local72;
				}
				local8[local13++] = (short) local15;
			}
		}
		Static270.aShortArray84 = local8;
		Static18.anInt381 = local13;
		Static127.anInt2700 = 0;
		@Pc(106) String[] local106 = new String[Static18.anInt381];
		for (@Pc(108) int local108 = 0; local108 < Static18.anInt381; local108++) {
			local106[local108] = Static277.method4117(local8[local108]).aString169;
		}
		Static79.method1228(Static270.aShortArray84, local106);
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)V")
	public static void method2712() {
		aString112 = null;
		aClass31_1 = null;
	}
}
