import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "[Lclient!bl;")
	public static Class26[] aClass26Array3;

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
	public static int anInt3768;

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
	public static int anInt3769;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
	public static int anInt3770;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
	public static int anInt3771;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
	public static int anInt3766 = -1;

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "Lclient!mk;")
	public static final Class130 aClass130_81 = new Class130();

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString125 = "Loading textures - ";

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "[[B")
	public static final byte[][] aByteArrayArray15 = new byte[250][];

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I")
	public static int method3190() {
		try {
			if (Static131.anInt2971 == 0) {
				if (Static274.method4763() - 5000L < Static313.aLong232) {
					return 0;
				}
				Static195.aClass51_7 = Static212.aClass120_3.method3227(Static109.anInt2399, Static58.aString36);
				Static89.aLong69 = Static274.method4763();
				Static131.anInt2971 = 1;
			}
			if (Static89.aLong69 + 30000L < Static274.method4763()) {
				return Static98.method5506(1000);
			}
			@Pc(83) int local83;
			@Pc(120) int local120;
			if (Static131.anInt2971 == 1) {
				if (Static195.aClass51_7.anInt1229 == 2) {
					return Static98.method5506(1001);
				}
				if (Static195.aClass51_7.anInt1229 != 1) {
					return -1;
				}
				Static131.aClass171_3 = new Class171((Socket) Static195.aClass51_7.anObject1, Static212.aClass120_3);
				Static195.aClass51_7 = null;
				local83 = 0;
				if (Static258.aBoolean449) {
					local83 = Static90.anInt2016;
				}
				Static320.aClass4_Sub7_Sub1_3.anInt2667 = 0;
				Static320.aClass4_Sub7_Sub1_3.method2416(23);
				Static320.aClass4_Sub7_Sub1_3.method2387(local83);
				Static131.aClass171_3.method4636(Static320.aClass4_Sub7_Sub1_3.aByteArray42, Static320.aClass4_Sub7_Sub1_3.anInt2667);
				if (Static320.aClass39_2 != null) {
					Static320.aClass39_2.method4801();
				}
				if (Static36.aClass39_1 != null) {
					Static36.aClass39_1.method4801();
				}
				local120 = Static131.aClass171_3.method4639();
				if (Static320.aClass39_2 != null) {
					Static320.aClass39_2.method4801();
				}
				if (Static36.aClass39_1 != null) {
					Static36.aClass39_1.method4801();
				}
				if (local120 != 0) {
					return Static98.method5506(local120);
				}
				Static131.anInt2971 = 2;
			}
			if (Static131.anInt2971 == 2) {
				if (Static131.aClass171_3.method4638() < 2) {
					return -1;
				}
				Static317.anInt6296 = Static131.aClass171_3.method4639();
				Static317.anInt6296 <<= 0x8;
				Static317.anInt6296 += Static131.aClass171_3.method4639();
				Static131.aByteArray43 = new byte[Static317.anInt6296];
				Static166.anInt3696 = 0;
				Static131.anInt2971 = 3;
			}
			if (Static131.anInt2971 != 3) {
				return -1;
			}
			local83 = Static131.aClass171_3.method4638();
			if (local83 < 1) {
				return -1;
			}
			if (Static317.anInt6296 - Static166.anInt3696 < local83) {
				local83 = Static317.anInt6296 - Static166.anInt3696;
			}
			Static131.aClass171_3.method4628(Static131.aByteArray43, local83, Static166.anInt3696);
			Static166.anInt3696 += local83;
			if (Static166.anInt3696 < Static317.anInt6296) {
				return -1;
			} else if (Static314.method2745(Static131.aByteArray43)) {
				Static305.aClass83_Sub1Array1 = new Class83_Sub1[Static21.anInt401];
				local120 = 0;
				for (@Pc(228) int local228 = Static94.anInt2089; local228 <= Static165.anInt3375; local228++) {
					@Pc(234) Class83_Sub1 local234 = Static108.method2007(local228);
					if (local234 != null) {
						Static305.aClass83_Sub1Array1[local120++] = local234;
					}
				}
				Static245.anInt5133 = 0;
				Static63.aClass4_Sub29_1 = null;
				Static131.aClass171_3.method4637();
				Static131.aClass171_3 = null;
				Static166.anInt3695 = 0;
				Static131.aByteArray43 = null;
				Static131.anInt2971 = 0;
				Static313.aLong232 = Static274.method4763();
				return 0;
			} else {
				return Static98.method5506(1002);
			}
		} catch (@Pc(272) IOException local272) {
			return Static98.method5506(1003);
		}
	}
}
