import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1661 = Static32.method683("null");

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "[I")
	public static int[] anIntArray327 = new int[50];

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "[I")
	public static int[] anIntArray329 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!qa", name = "ab", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_3 = new CRC32();

	@OriginalMember(owner = "client!qa", name = "cb", descriptor = "Lclient!eh;")
	public static Class25 aClass25_13 = new Class25(4096);

	@OriginalMember(owner = "client!qa", name = "eb", descriptor = "I")
	public static int anInt3713 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZIIII)V")
	public static void method2825(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class2_Sub16 local6 = (Class2_Sub16) Static132.aClass81_10.method2682(); local6 != null; local6 = (Class2_Sub16) Static132.aClass81_10.method2686()) {
			if (local6.anInt1777 != -1 || local6.anIntArray186 != null) {
				@Pc(17) int local17 = 0;
				if (local6.anInt1783 < arg3) {
					local17 = arg3 - local6.anInt1783;
				} else if (arg3 < local6.anInt1781) {
					local17 = local6.anInt1781 - arg3;
				}
				if (arg2 > local6.anInt1785) {
					local17 += arg2 - local6.anInt1785;
				} else if (local6.anInt1776 > arg2) {
					local17 += local6.anInt1776 - arg2;
				}
				if (local17 - 64 > local6.anInt1786 || Static150.anInt3220 == 0 || arg0 != local6.anInt1788) {
					if (local6.aClass2_Sub14_Sub1_2 != null) {
						Static128.aClass2_Sub14_Sub4_2.method2592(local6.aClass2_Sub14_Sub1_2);
						local6.aClass2_Sub14_Sub1_2 = null;
					}
					if (local6.aClass2_Sub14_Sub1_1 != null) {
						Static128.aClass2_Sub14_Sub4_2.method2592(local6.aClass2_Sub14_Sub1_1);
						local6.aClass2_Sub14_Sub1_1 = null;
					}
				} else {
					local17 -= 64;
					if (local17 < 0) {
						local17 = 0;
					}
					@Pc(125) int local125 = Static150.anInt3220 * (local6.anInt1786 - local17) / local6.anInt1786;
					if (local6.aClass2_Sub14_Sub1_2 != null) {
						local6.aClass2_Sub14_Sub1_2.method1358(local125);
					} else if (local6.anInt1777 >= 0) {
						@Pc(143) Class53 local143 = Static190.method1807(Static120.aClass11_Sub1_27, local6.anInt1777, 0);
						if (local143 != null) {
							@Pc(150) Class2_Sub5_Sub1 local150 = local143.method1808().method1451(Static6.aClass64_1);
							@Pc(155) Class2_Sub14_Sub1 local155 = Static188.method1380(local150, local125);
							local155.method1349(-1);
							Static128.aClass2_Sub14_Sub4_2.method2590(local155);
							local6.aClass2_Sub14_Sub1_2 = local155;
						}
					}
					if (local6.aClass2_Sub14_Sub1_1 != null) {
						local6.aClass2_Sub14_Sub1_1.method1358(local125);
						if (!local6.aClass2_Sub14_Sub1_1.method3006()) {
							local6.aClass2_Sub14_Sub1_1 = null;
						}
					} else if (local6.anIntArray186 != null && (local6.anInt1780 -= arg1) <= 0) {
						@Pc(189) int local189 = (int) (Math.random() * (double) local6.anIntArray186.length);
						@Pc(197) Class53 local197 = Static190.method1807(Static120.aClass11_Sub1_27, local6.anIntArray186[local189], 0);
						if (local197 != null) {
							@Pc(204) Class2_Sub5_Sub1 local204 = local197.method1808().method1451(Static6.aClass64_1);
							@Pc(209) Class2_Sub14_Sub1 local209 = Static188.method1380(local204, local125);
							local209.method1349(0);
							Static128.aClass2_Sub14_Sub4_2.method2590(local209);
							local6.anInt1780 = (int) ((double) (local6.anInt1787 - local6.anInt1784) * Math.random()) + local6.anInt1784;
							local6.aClass2_Sub14_Sub1_1 = local209;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
	public static void method2826() {
		aCRC32_3 = null;
		anIntArray329 = null;
		aClass49_1661 = null;
		anIntArray327 = null;
		aClass25_13 = null;
	}
}
