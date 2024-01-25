import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!lk", name = "J", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!lk", name = "K", descriptor = "Lclient!mu;")
	public static Class165 aClass165_7;

	@OriginalMember(owner = "client!lk", name = "M", descriptor = "Lclient!ru;")
	public static Class216 aClass216_5;

	@OriginalMember(owner = "client!lk", name = "F", descriptor = "Lclient!d;")
	public static final Class44 aClass44_62 = new Class44(10);

	@OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
	public static int anInt6067 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIB)I")
	public static int method4848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static80.anIntArray70[arg0 & 0x3] : Static193.anIntArray183[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "(I)Lclient!dk;")
	public static Class50_Sub1 method4850() {
		return Static79.aClass50_Sub1Array1.length > Static9.anInt205 ? Static79.aClass50_Sub1Array1[Static9.anInt205++] : null;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I")
	public static int method4851(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "(I)V")
	public static void method4852() {
		for (@Pc(15) int local15 = 0; local15 < Static182.anInt3087; local15++) {
			@Pc(21) int local21 = Static175.anIntArray133[local15];
			@Pc(29) Class2_Sub1_Sub3_Sub1 local29 = ((Class5_Sub7) Static380.aClass252_36.method5659((long) local21)).aClass2_Sub1_Sub3_Sub1_1;
			@Pc(33) int local33 = Static76.aClass5_Sub15_Sub2_1.method5539();
			if ((local33 & 0x20) != 0) {
				local33 += Static76.aClass5_Sub15_Sub2_1.method5539() << 8;
			}
			if ((local33 & 0x8) != 0) {
				local29.aString64 = Static76.aClass5_Sub15_Sub2_1.method5549();
				local29.anInt6132 = 100;
			}
			if ((local33 & 0x40) != 0) {
				if (local29.aClass131_1.method2779()) {
					Static166.method2328(local29);
				}
				local29.method4091(Static196.aClass180_1.method3713(Static76.aClass5_Sub15_Sub2_1.method5598()));
				local29.method4904(local29.aClass131_1.anInt3463);
				local29.anInt6134 = local29.aClass131_1.anInt3460 << 3;
				if (local29.aClass131_1.method2779()) {
					Static168.method3851(local29, local29.anIntArray434[0], null, local29.aByte105, null, local29.anIntArray433[0], 0);
				}
			}
			@Pc(129) int local129;
			@Pc(133) int local133;
			if ((local33 & 0x4) != 0) {
				local129 = Static76.aClass5_Sub15_Sub2_1.method5542();
				local133 = Static76.aClass5_Sub15_Sub2_1.method5585();
				local29.method4905(Static85.anInt1536, local133, local129);
			}
			if ((local33 & 0x100) != 0) {
				local29.aByte87 = Static76.aClass5_Sub15_Sub2_1.method5548();
				local29.aByte86 = Static76.aClass5_Sub15_Sub2_1.method5570();
				local29.aByte89 = Static76.aClass5_Sub15_Sub2_1.method5570();
				local29.aByte88 = (byte) Static76.aClass5_Sub15_Sub2_1.method5585();
				local29.anInt6121 = Static85.anInt1536 + Static76.aClass5_Sub15_Sub2_1.method5593();
				local29.anInt6168 = Static85.anInt1536 + Static76.aClass5_Sub15_Sub2_1.method5591();
			}
			if ((local33 & 0x1000) != 0) {
				local129 = Static76.aClass5_Sub15_Sub2_1.method5539();
				@Pc(192) int[] local192 = new int[local129];
				@Pc(195) int[] local195 = new int[local129];
				@Pc(198) int[] local198 = new int[local129];
				for (@Pc(200) int local200 = 0; local200 < local129; local200++) {
					@Pc(206) int local206 = Static76.aClass5_Sub15_Sub2_1.method5546();
					if (local206 == 65535) {
						local206 = -1;
					}
					local192[local200] = local206;
					local195[local200] = Static76.aClass5_Sub15_Sub2_1.method5578();
					local198[local200] = Static76.aClass5_Sub15_Sub2_1.method5593();
				}
				Static112.method1552(local29, local192, local195, local198);
			}
			if ((local33 & 0x800) != 0) {
				local29.anInt5275 = Static76.aClass5_Sub15_Sub2_1.method5593();
				local29.anInt5288 = Static76.aClass5_Sub15_Sub2_1.method5591();
			}
			if ((local33 & 0x2000) != 0) {
				local129 = Static76.aClass5_Sub15_Sub2_1.method5593();
				local29.anInt6131 = Static76.aClass5_Sub15_Sub2_1.method5539();
				local29.anInt6184 = Static76.aClass5_Sub15_Sub2_1.method5578();
				local29.anInt6142 = local129 & 0x7FFF;
				local29.aBoolean408 = (local129 & 0x8000) != 0;
				local29.anInt6133 = local29.anInt6131 + local29.anInt6142 + Static85.anInt1536;
			}
			if ((local33 & 0x2) != 0) {
				local129 = Static76.aClass5_Sub15_Sub2_1.method5598();
				if (local129 == 65535) {
					local129 = -1;
				}
				local133 = Static76.aClass5_Sub15_Sub2_1.method5585();
				Static202.method2688(local129, local133, local29);
			}
			if ((local33 & 0x80) != 0) {
				local129 = Static76.aClass5_Sub15_Sub2_1.method5542();
				local133 = Static76.aClass5_Sub15_Sub2_1.method5594();
				local29.method4905(Static85.anInt1536, local133, local129);
				local29.anInt6186 = Static85.anInt1536 + 300;
				local29.anInt6156 = Static76.aClass5_Sub15_Sub2_1.method5539();
			}
			@Pc(378) int local378;
			if ((local33 & 0x400) != 0) {
				local129 = Static76.aClass5_Sub15_Sub2_1.method5591();
				local133 = Static76.aClass5_Sub15_Sub2_1.method5559();
				if (local129 == 65535) {
					local129 = -1;
				}
				local378 = Static76.aClass5_Sub15_Sub2_1.method5585();
				local29.method4908(true, local129, local133, local378);
			}
			if ((local33 & 0x10) != 0) {
				local29.anInt6176 = Static76.aClass5_Sub15_Sub2_1.method5546();
				if (local29.anInt6176 == 65535) {
					local29.anInt6176 = -1;
				}
			}
			if ((local33 & 0x200) != 0) {
				local29.anInt6129 = Static76.aClass5_Sub15_Sub2_1.method5570();
				local29.anInt6169 = Static76.aClass5_Sub15_Sub2_1.method5582();
				local29.anInt6179 = Static76.aClass5_Sub15_Sub2_1.method5570();
				local29.anInt6167 = Static76.aClass5_Sub15_Sub2_1.method5570();
				local29.anInt6148 = Static76.aClass5_Sub15_Sub2_1.method5546() + Static85.anInt1536;
				local29.anInt6144 = Static76.aClass5_Sub15_Sub2_1.method5593() + Static85.anInt1536;
				local29.anInt6172 = Static76.aClass5_Sub15_Sub2_1.method5585();
				local29.anInt6167 += local29.anIntArray433[0];
				local29.anInt6196 = 0;
				local29.anInt6199 = 1;
				local29.anInt6179 += local29.anIntArray434[0];
				local29.anInt6169 += local29.anIntArray433[0];
				local29.anInt6129 += local29.anIntArray434[0];
			}
			if ((local33 & 0x1) != 0) {
				local129 = Static76.aClass5_Sub15_Sub2_1.method5546();
				local133 = Static76.aClass5_Sub15_Sub2_1.method5603();
				if (local129 == 65535) {
					local129 = -1;
				}
				local378 = Static76.aClass5_Sub15_Sub2_1.method5594();
				local29.method4908(false, local129, local133, local378);
			}
		}
	}
}
