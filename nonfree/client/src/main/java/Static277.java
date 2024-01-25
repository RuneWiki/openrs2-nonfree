import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
	public static int anInt4945 = 0;

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_93 = new Class156(91, 4);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Z")
	public static boolean method4476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 || arg1 == 5;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIII)V")
	public static void method4478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class5_Sub1_Sub18 local9 = Static123.method1827((long) arg0, 9);
		local9.method7441();
		local9.anInt8632 = arg2;
		local9.anInt8635 = arg1;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
	public static void method4480() {
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub27_2, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub27_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub19_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub19_2, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub16_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub7_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub22_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub14_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub8_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub3_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub21_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub23_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub10_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub28_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub29_2, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub29_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub12_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub20_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub17_1, 0);
		Static534.method7354();
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub26_1, 2);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub1_1, 2);
		Static569.method7681();
		Static8.method134();
		Static27.aBoolean20 = true;
	}
}
