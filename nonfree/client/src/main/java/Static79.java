import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cka", name = "c", descriptor = "I")
	public static final int anInt1280 = 1339;

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(II)Z")
	public static boolean method1207(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)V")
	public static void method1208() {
		try {
			@Pc(16) int local16;
			if (Static175.anInt2881 == 1) {
				local16 = Static537.aClass5_Sub14_Sub4_35.method3227();
				if (local16 > 0 && Static537.aClass5_Sub14_Sub4_35.method3241()) {
					local16 -= Static133.anInt2251;
					if (local16 < 0) {
						local16 = 0;
					}
					Static537.aClass5_Sub14_Sub4_35.method3245(local16);
					return;
				}
				Static537.aClass5_Sub14_Sub4_35.method3247();
				Static537.aClass5_Sub14_Sub4_35.method3255();
				Static651.aClass37_1 = null;
				Static402.aClass5_Sub31_2 = null;
				if (Static516.aClass50_76 == null) {
					Static175.anInt2881 = 0;
				} else {
					Static175.anInt2881 = 2;
				}
			}
			if (Static175.anInt2881 == 3) {
				local16 = Static537.aClass5_Sub14_Sub4_35.method3227();
				if (local16 < Static332.anInt6016 && Static537.aClass5_Sub14_Sub4_35.method3241()) {
					local16 += Static94.anInt1559;
					if (local16 > Static332.anInt6016) {
						local16 = Static332.anInt6016;
					}
					Static537.aClass5_Sub14_Sub4_35.method3245(local16);
				} else {
					Static175.anInt2881 = 0;
					Static94.anInt1559 = 0;
				}
			}
		} catch (@Pc(106) Exception local106) {
			local106.printStackTrace();
			Static537.aClass5_Sub14_Sub4_35.method3247();
			Static402.aClass5_Sub31_2 = null;
			Static175.anInt2881 = 0;
			Static516.aClass50_76 = null;
			Static464.aClass5_Sub14_Sub4_25 = null;
			Static651.aClass37_1 = null;
		}
	}

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(I)I")
	public static int method1209() {
		@Pc(5) Class143 local5 = Static563.aClass143_13;
		@Pc(7) boolean local7 = false;
		if (Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() != 0) {
			@Pc(19) Canvas local19 = new Canvas();
			local19.setSize(100, 100);
			local5 = Static553.method7615(0, (Class50) null, local19, (Interface3) null, 0);
			local7 = true;
		}
		@Pc(38) long local38 = Static124.method1947();
		for (@Pc(40) int local40 = 0; local40 < 10000; local40++) {
			local5.method6254();
		}
		@Pc(68) int local68 = (int) (Static124.method1947() - local38);
		local5.method6252(0, 0, -16777216, 100, 100);
		if (local7) {
			local5.method6225();
		}
		return local68;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(B)Lclient!nh;")
	public static Class243 method1210() {
		return Static146.method2198();
	}
}
