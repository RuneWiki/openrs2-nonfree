import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!qu", name = "E", descriptor = "[Lclient!raa;")
	public static Class295[] aClass295Array1;

	@OriginalMember(owner = "client!qu", name = "P", descriptor = "I")
	public static int anInt7881;

	@OriginalMember(owner = "client!qu", name = "D", descriptor = "I")
	public static int anInt7871 = -1;

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(ZII)I")
	public static int method6941(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static634.anInt10542 == -1) {
			return 1;
		}
		if (arg0 != Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988()) {
			Static41.method748(true, Static174.aClass120_13.method2690(Static266.anInt4796), arg0);
			if (Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() != arg0) {
				return -1;
			}
		}
		try {
			@Pc(40) Dimension local40 = Static83.aCanvas14.getSize();
			Static462.method6852(Static199.aClass272_7, Static174.aClass120_13.method2690(Static266.anInt4796), Static213.aClass133_5, Static281.aClass55_8, true);
			@Pc(56) Class26 local56 = Static623.method8839(Static348.aClass207_69, Static634.anInt10542);
			@Pc(59) long local59 = Static95.method1587();
			Static213.aClass133_5.la();
			Static16.aClass113_2.method8458(0, Static147.anInt2575, 0);
			Static213.aClass133_5.method7269(Static16.aClass113_2);
			Static213.aClass133_5.DA(local40.width / 2, local40.height / 2, 512, 512);
			Static213.aClass133_5.xa(1.0F);
			Static213.aClass133_5.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(100) Class187 local100 = Static213.aClass133_5.method7256(local56, 2048, 64, 64, 768);
			@Pc(102) int local102 = 0;
			label41: for (@Pc(109) int local109 = 0; local109 < 500; local109++) {
				Static213.aClass133_5.GA(0);
				Static213.aClass133_5.ya();
				for (@Pc(118) int local118 = 15; local118 >= 0; local118--) {
					for (@Pc(122) int local122 = 0; local122 <= local118; local122++) {
						Static318.aClass113_4.method8458((int) ((float) Static302.anInt5267 * ((float) local122 - (float) local118 / 2.0F)), 0, (local118 + 1) * Static302.anInt5267);
						local100.method8645(Static318.aClass113_4, null, 0);
						local102++;
						if (Static95.method1587() - local59 >= (long) arg1) {
							break label41;
						}
					}
				}
			}
			Static213.aClass133_5.method7268();
			@Pc(188) long local188 = (long) (local102 * 1000) / (Static95.method1587() - local59);
			Static213.aClass133_5.GA(0);
			Static213.aClass133_5.ya();
			return (int) local188;
		} catch (@Pc(197) Throwable local197) {
			local197.printStackTrace();
			return -1;
		}
	}
}
