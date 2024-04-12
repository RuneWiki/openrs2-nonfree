import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_5;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public static int anInt685;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public static int anInt686;

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Lclient!ud;")
	public static Class5 aClass5_9;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Z", line = 736)
	public static boolean method533(@OriginalArg(0) int arg0) {
		if (!Static99.method1665(arg0)) {
			return false;
		}
		@Pc(13) boolean local13 = false;
		@Pc(17) Class2_Sub2_Sub13[] local17 = Static46.aClass2_Sub2_Sub13ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local17.length; local24++) {
			@Pc(30) Class2_Sub2_Sub13 local30 = local17[local24];
			if (local30 != null && local30.anInt1613 == 6) {
				@Pc(56) int local56;
				if (local30.anInt1574 != -1 || local30.anInt1592 != -1) {
					@Pc(51) boolean local51 = Static75.method1354(local30);
					if (local51) {
						local56 = local30.anInt1592;
					} else {
						local56 = local30.anInt1574;
					}
					if (local56 != -1) {
						@Pc(71) Class2_Sub2_Sub6 local71 = Static57.method1042(local56);
						local30.anInt1593 += Class27.anInt1095;
						label50: while (true) {
							do {
								do {
									if (local71.anIntArray128[local30.anInt1569] >= local30.anInt1593) {
										break label50;
									}
									local13 = true;
									local30.anInt1593 -= local71.anIntArray128[local30.anInt1569];
									local30.anInt1569++;
								} while (local30.anInt1569 < local71.anIntArray124.length);
								local30.anInt1569 -= local71.anInt669;
							} while (local30.anInt1569 >= 0 && local30.anInt1569 < local71.anIntArray124.length);
							local30.anInt1569 = 0;
						}
					}
				}
				if (local30.anInt1617 != 0) {
					@Pc(152) int local152 = local30.anInt1617 >> 16;
					local13 = true;
					@Pc(158) int local158 = local152 * Class27.anInt1095;
					local30.anInt1579 = local30.anInt1579 + local158 & 0x7FF;
					local56 = local30.anInt1617 << 16 >> 16;
					local56 *= Class27.anInt1095;
					local30.anInt1614 = local30.anInt1614 + local56 & 0x7FF;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!cb;Lclient!cb;BI)V", line = 1038)
	public static void method540(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(10) byte[] local10 = arg0.method261(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(23) int local23 = 0;
		@Pc(26) byte[] local26 = new byte[1000];
		@Pc(31) int local31 = local10.length - 2;
		@Pc(39) GZIPInputStream local39 = new GZIPInputStream(new ByteArrayInputStream(local10));
		while (true) {
			@Pc(46) int local46 = local39.read(local26, 0, local26.length);
			if (local46 == -1) {
				@Pc(61) byte[] local61 = new byte[local10.length + 9];
				Static107.method993(local10, 0, local61, 9, local10.length);
				@Pc(75) Class2_Sub3 local75 = new Class2_Sub3(local61);
				local75.method1703(2);
				local75.method1725(local31);
				local75.method1725(local23);
				local75.anInt2546 = local61.length - 2;
				@Pc(97) int local97 = local75.method1704();
				local75.anInt2546 = local61.length - 2;
				local75.method1694(local97 - 1);
				arg1.method259(local61.length, arg2, local61);
				return;
			}
			local23 += local46;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 1091)
	public static void method541() {
		aClass5_Sub1_5 = null;
		Class20.aClass40_193 = null;
		aClass5_9 = null;
	}
}
