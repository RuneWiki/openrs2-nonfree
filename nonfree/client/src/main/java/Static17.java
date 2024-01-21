import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!gb;")
	public static Class1_Sub1_Sub5_Sub1 aClass1_Sub1_Sub5_Sub1_2;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Z")
	public static boolean aBoolean39;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!jd;")
	public static Class37 aClass37_6;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[S")
	public static short[] aShortArray3 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	public static int anInt562 = 0;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!rd;")
	public static Class64 aClass64_345 = Static69.method1153("p12_full");

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_346 = Static69.method1153("m");

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	public static int anInt569 = 99;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	public static int anInt574 = 0;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	public static int anInt576 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method347(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static74.aClass69_1);
		arg0.removeFocusListener(Static74.aClass69_1);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method348() {
		aClass1_Sub1_Sub5_Sub1_2 = null;
		aShortArray3 = null;
		aClass64_345 = null;
		aClass37_6 = null;
		aClass64_346 = null;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	public static void method349() {
		if (Static51.aClass24_1 != null) {
			@Pc(7) Class24 local7 = Static51.aClass24_1;
			synchronized (Static51.aClass24_1) {
				Static51.aClass24_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Z")
	public static boolean method351(@OriginalArg(0) int arg0) {
		if (!Static1.method35(arg0)) {
			return false;
		}
		@Pc(13) boolean local13 = false;
		@Pc(17) Class1_Sub1_Sub11[] local17 = Static65.aClass1_Sub1_Sub11ArrayArray1[arg0];
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Class1_Sub1_Sub11 local25 = local17[local19];
			if (local25 != null && local25.anInt1697 == 6) {
				@Pc(53) int local53;
				if (local25.anInt1695 != -1 || local25.anInt1710 != -1) {
					@Pc(48) boolean local48 = Static79.method1362(local25);
					if (local48) {
						local53 = local25.anInt1710;
					} else {
						local53 = local25.anInt1695;
					}
					if (local53 != -1) {
						@Pc(66) Class1_Sub1_Sub4 local66 = Static10.method254(local53);
						local25.anInt1685 += Static113.anInt1815;
						label52: while (true) {
							do {
								do {
									if (local66.anIntArray96[local25.anInt1705] >= local25.anInt1685) {
										break label52;
									}
									local13 = true;
									local25.anInt1685 -= local66.anIntArray96[local25.anInt1705];
									local25.anInt1705++;
								} while (local25.anInt1705 < local66.anIntArray97.length);
								local25.anInt1705 -= local66.anInt707;
							} while (local25.anInt1705 >= 0 && local25.anInt1705 < local66.anIntArray97.length);
							local25.anInt1705 = 0;
						}
					}
				}
				if (local25.anInt1734 != 0 && !local25.aBoolean95) {
					local13 = true;
					@Pc(152) int local152 = local25.anInt1734 >> 16;
					@Pc(156) int local156 = local152 * Static113.anInt1815;
					local25.anInt1747 = local25.anInt1747 + local156 & 0x7FF;
					local53 = local25.anInt1734 << 16 >> 16;
					local53 *= Static113.anInt1815;
					local25.anInt1752 = local25.anInt1752 + local53 & 0x7FF;
				}
			}
		}
		return local13;
	}
}
