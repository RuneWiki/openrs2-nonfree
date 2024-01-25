import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_130 = new Class268(20, -2);

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "Lclient!fa;")
	public static final Class89 aClass89_27 = new Class89(7, 0, 1, 1);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)Z")
	public static boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(III)Z")
	public static boolean method6210(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static385.method6197(arg1, arg0) | (arg1 & 0x40000) != 0 || Static216.method3668(arg1, arg0);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method6212(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		Static595.method8360(arg0, -1, -1, arg1);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
	public static void method6213() {
		Static28.method4860();
		Static456.aClass6_Sub40_Sub2_2.anInt10169 = 0;
		Static457.aClass268_147 = null;
		Static501.anInt8676 = 0;
		Static441.aClass268_143 = null;
		Static328.anInt6241 = 0;
		Static376.anInt6901 = 0;
		Static112.aClass268_38 = null;
		Static5.aClass268_3 = null;
		Static497.method7422();
		Static542.method7933();
		for (@Pc(30) int local30 = 0; local30 < 2048; local30++) {
			Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local30] = null;
		}
		Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 = null;
		for (@Pc(46) int local46 = 0; local46 < Static273.anInt5420; local46++) {
			@Pc(53) Class20_Sub2_Sub2_Sub1_Sub2 local53 = Static1.aClass6_Sub46Array5[local46].aClass20_Sub2_Sub2_Sub1_Sub2_1;
			if (local53 != null) {
				local53.anInt5572 = -1;
			}
		}
		Static580.method8186();
		Static624.anInt10280 = -1;
		Static160.anInt3352 = -1;
		Static334.anInt6354 = 1;
		Static190.method3390(10);
		for (@Pc(84) int local84 = 0; local84 < 100; local84++) {
			Static501.aBooleanArray46[local84] = true;
		}
		Static181.method3307();
		Static317.aLong161 = 0L;
		Static32.aClass6_Sub17_1 = null;
	}
}
