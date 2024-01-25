import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	public static int anInt903;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
	public static int anInt907;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public static void method960() {
		Static43.aClipboard3 = null;
		Static149.aBoolean224 = false;
		Static177.anIntArray430 = null;
		Static152.anIntArray351 = null;
		Static79.anIntArray426 = null;
		Static89.aBooleanArray6 = null;
		Static228.method4134();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILclient!t;ZI)V")
	public static void method962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub36 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt5650 == -1 && arg3.anIntArray713 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(28) int local28 = arg3.anInt5638 * Static8.anInt201 >> 8;
		if (arg0 > arg3.anInt5649) {
			local16 = arg0 - arg3.anInt5649;
		} else if (arg3.anInt5655 > arg0) {
			local16 = arg3.anInt5655 - arg0;
		}
		if (arg3.anInt5648 < arg2) {
			local16 += arg2 - arg3.anInt5648;
		} else if (arg3.anInt5637 > arg2) {
			local16 += arg3.anInt5637 - arg2;
		}
		if (arg3.anInt5644 == 0 || arg3.anInt5644 < local16 - 64 || Static8.anInt201 == 0 || arg1 != arg3.anInt5652) {
			if (arg3.aClass1_Sub6_Sub3_1 != null) {
				Static170.aClass1_Sub6_Sub4_2.method1665(arg3.aClass1_Sub6_Sub3_1);
				arg3.aClass1_Sub6_Sub3_1 = null;
			}
			if (arg3.aClass1_Sub6_Sub3_2 != null) {
				Static170.aClass1_Sub6_Sub4_2.method1665(arg3.aClass1_Sub6_Sub3_2);
				arg3.aClass1_Sub6_Sub3_2 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(143) int local143 = (arg3.anInt5644 - local16) * local28 / arg3.anInt5644;
		if (arg3.aClass1_Sub6_Sub3_1 != null) {
			arg3.aClass1_Sub6_Sub3_1.method1519(local143);
		} else if (arg3.anInt5650 >= 0) {
			@Pc(161) Class81 local161 = Static359.method2199(Static301.aClass165_92, arg3.anInt5650, 0);
			if (local161 != null) {
				@Pc(168) Class1_Sub12_Sub1 local168 = local161.method2202().method1480(Static49.aClass213_1);
				@Pc(173) Class1_Sub6_Sub3 local173 = Static357.method1498(local168, local143);
				local173.method1526(-1);
				Static170.aClass1_Sub6_Sub4_2.method1670(local173);
				arg3.aClass1_Sub6_Sub3_1 = local173;
			}
		}
		if (arg3.aClass1_Sub6_Sub3_2 != null) {
			arg3.aClass1_Sub6_Sub3_2.method1519(local143);
			if (arg3.aClass1_Sub6_Sub3_2.method5711()) {
				return;
			}
			arg3.aClass1_Sub6_Sub3_2 = null;
		} else if (arg3.anIntArray713 != null && (arg3.anInt5636 -= arg4) <= 0) {
			@Pc(207) int local207 = (int) (Math.random() * (double) arg3.anIntArray713.length);
			@Pc(215) Class81 local215 = Static359.method2199(Static301.aClass165_92, arg3.anIntArray713[local207], 0);
			if (local215 != null) {
				@Pc(222) Class1_Sub12_Sub1 local222 = local215.method2202().method1480(Static49.aClass213_1);
				@Pc(227) Class1_Sub6_Sub3 local227 = Static357.method1498(local222, local143);
				local227.method1526(0);
				Static170.aClass1_Sub6_Sub4_2.method1670(local227);
				arg3.aClass1_Sub6_Sub3_2 = local227;
				arg3.anInt5636 = arg3.anInt5643 + (int) ((double) (arg3.anInt5653 - arg3.anInt5643) * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
	public static void method963() {
		Static207.aClass140_104.method3819();
	}
}
