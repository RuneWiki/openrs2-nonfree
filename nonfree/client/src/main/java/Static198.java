import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "[Lclient!uj;")
	public static Class79[] aClass79Array7;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "[[[Lclient!df;")
	public static Class2_Sub12[][][] aClass2_Sub12ArrayArrayArray2;

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "[I")
	public static int[] anIntArray725;

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
	public static int anInt4484;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Lclient!qe;")
	public static Class78 aClass78_781 = Static199.method3560("rect_debug=");

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "Lclient!qe;")
	private static Class78 aClass78_782 = Static199.method3560("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "[I")
	public static int[] anIntArray724 = new int[2000];

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "Lclient!qe;")
	public static Class78 aClass78_783 = Static199.method3560(")1 ");

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "Lclient!qe;")
	public static Class78 aClass78_784 = aClass78_782;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "Lclient!qe;")
	public static Class78 aClass78_785 = Static199.method3560("sl_arrows");

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "Lclient!qe;")
	public static Class78 aClass78_786 = Static199.method3560(")1");

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "Lclient!qe;")
	public static Class78 aClass78_787 = Static199.method3560("labels)3dat");

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "Z")
	public static boolean aBoolean193 = false;

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
	public static int anInt4485 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
	public static void method3552() {
		for (@Pc(6) int local6 = 0; local6 < 5; local6++) {
			Static87.aBooleanArray61[local6] = false;
		}
		Static145.anInt3290 = 1;
		Static167.anInt3840 = -1;
		Static11.anInt314 = -1;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!oe;I)V")
	public static void method3553(@OriginalArg(0) Class72 arg0) {
		Static41.aClass79_Sub1Array1 = Static78.method1327(Static170.anInt3940, arg0);
		Static66.anIntArray235 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			@Pc(23) float local23 = (float) (Static201.anIntArray727[local13] >> 16 & 0xFF);
			@Pc(32) float local32 = (float) (Static201.anIntArray727[local13] >> 8 & 0xFF);
			@Pc(42) int local42 = Static201.anIntArray727[local13 + 1] >> 8 & 0xFF;
			@Pc(52) int local52 = Static201.anIntArray727[local13 + 1] >> 16 & 0xFF;
			@Pc(59) float local59 = ((float) local42 - local32) / 64.0F;
			@Pc(67) int local67 = Static201.anIntArray727[local13 + 1] & 0xFF;
			@Pc(74) float local74 = (float) (Static201.anIntArray727[local13] & 0xFF);
			@Pc(81) float local81 = ((float) local52 - local23) / 64.0F;
			@Pc(89) float local89 = ((float) local67 - local74) / 64.0F;
			for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
				Static66.anIntArray235[local13 * 64 + local91] = (int) local32 << 8 | (int) local23 << 16 | (int) local74;
				local23 += local81;
				local32 += local59;
				local74 += local89;
			}
		}
		for (@Pc(134) int local134 = 192; local134 < 255; local134++) {
			Static66.anIntArray235[local134] = Static201.anIntArray727[3];
		}
		Static26.anIntArray81 = new int[32768];
		Static129.anIntArray480 = new int[32768];
		Static18.method262(null);
		Static17.anIntArray51 = new int[32768];
		Static127.anIntArray781 = new int[32768];
		Static220.aClass2_Sub3_Sub8_Sub1_1 = new Class2_Sub3_Sub8_Sub1(128, 254);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILclient!l;)V")
	public static void method3555(@OriginalArg(2) Class2_Sub23_Sub1 arg0) {
		while (true) {
			@Pc(19) Class2_Sub5 local19 = (Class2_Sub5) Static35.aClass44_8.method1359();
			if (local19 == null) {
				return;
			}
			@Pc(24) boolean local24 = false;
			for (@Pc(26) int local26 = 0; local26 < local19.anInt486; local26++) {
				if (local19.aClass33Array2[local26] != null) {
					if (local19.aClass33Array2[local26].anInt947 == 2) {
						local19.anIntArray88[local26] = -5;
					}
					if (local19.aClass33Array2[local26].anInt947 == 0) {
						local24 = true;
					}
				}
				if (local19.aClass33Array1[local26] != null) {
					if (local19.aClass33Array1[local26].anInt947 == 2) {
						local19.anIntArray88[local26] = -6;
					}
					if (local19.aClass33Array1[local26].anInt947 == 0) {
						local24 = true;
					}
				}
			}
			if (local24) {
				return;
			}
			arg0.method2155(177);
			arg0.method2132(0);
			@Pc(99) int local99 = arg0.anInt2703;
			arg0.method2134(local19.anInt485);
			for (@Pc(106) int local106 = 0; local106 < local19.anInt486; local106++) {
				if (local19.anIntArray88[local106] == 0) {
					try {
						@Pc(132) int local132 = local19.anIntArray85[local106];
						@Pc(144) Field local144;
						@Pc(148) int local148;
						if (local132 == 0) {
							local144 = (Field) local19.aClass33Array2[local106].anObject2;
							local148 = local144.getInt(null);
							arg0.method2132(0);
							arg0.method2134(local148);
						} else if (local132 == 1) {
							local144 = (Field) local19.aClass33Array2[local106].anObject2;
							local144.setInt(null, local19.anIntArray87[local106]);
							arg0.method2132(0);
						} else if (local132 == 2) {
							local144 = (Field) local19.aClass33Array2[local106].anObject2;
							local148 = local144.getModifiers();
							arg0.method2132(0);
							arg0.method2134(local148);
						}
						@Pc(218) Method local218;
						if (local132 == 3) {
							local218 = (Method) local19.aClass33Array1[local106].anObject2;
							@Pc(223) byte[][] local223 = local19.aByteArrayArrayArray2[local106];
							@Pc(227) Object[] local227 = new Object[local223.length];
							for (@Pc(229) int local229 = 0; local229 < local223.length; local229++) {
								@Pc(241) ObjectInputStream local241 = new ObjectInputStream(new ByteArrayInputStream(local223[local229]));
								local227[local229] = local241.readObject();
							}
							@Pc(260) Object local260 = local218.invoke(null, local227);
							if (local260 == null) {
								arg0.method2132(0);
							} else if (local260 instanceof Number) {
								arg0.method2132(1);
								arg0.method2103(((Number) local260).longValue());
							} else if (local260 instanceof Class78) {
								arg0.method2132(2);
								arg0.method2085((Class78) local260);
							} else {
								arg0.method2132(4);
							}
						} else if (local132 == 4) {
							local218 = (Method) local19.aClass33Array1[local106].anObject2;
							local148 = local218.getModifiers();
							arg0.method2132(0);
							arg0.method2134(local148);
						}
					} catch (@Pc(330) ClassNotFoundException local330) {
						arg0.method2132(-10);
					} catch (@Pc(336) InvalidClassException local336) {
						arg0.method2132(-11);
					} catch (@Pc(342) StreamCorruptedException local342) {
						arg0.method2132(-12);
					} catch (@Pc(348) OptionalDataException local348) {
						arg0.method2132(-13);
					} catch (@Pc(354) IllegalAccessException local354) {
						arg0.method2132(-14);
					} catch (@Pc(360) IllegalArgumentException local360) {
						arg0.method2132(-15);
					} catch (@Pc(368) InvocationTargetException local368) {
						arg0.method2132(-16);
					} catch (@Pc(374) SecurityException local374) {
						arg0.method2132(-17);
					} catch (@Pc(382) IOException local382) {
						arg0.method2132(-18);
					} catch (@Pc(388) NullPointerException local388) {
						arg0.method2132(-19);
					} catch (@Pc(394) Exception local394) {
						arg0.method2132(-20);
					} catch (@Pc(400) Throwable local400) {
						arg0.method2132(-21);
					}
				} else {
					arg0.method2132(local19.anIntArray88[local106]);
				}
			}
			arg0.method2141(local99);
			arg0.method2093(arg0.anInt2703 - local99);
			local19.method3986();
		}
	}
}
