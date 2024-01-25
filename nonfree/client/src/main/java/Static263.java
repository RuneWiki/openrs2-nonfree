import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_252 = new Class198(20);

	@OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
	public static int anInt6815 = 0;

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
	public static int anInt6816 = 0;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
	public static void method5690() {
		Static40.aClass198_39.method5209();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method5691(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg1, 3);
		local8.method4908();
		local8.aString58 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(B)V")
	public static void method5696() {
		Static127.aClass4_Sub11_Sub1_3.method705();
		@Pc(15) int local15 = Static127.aClass4_Sub11_Sub1_3.method711(1);
		if (local15 == 0) {
			return;
		}
		@Pc(26) int local26 = Static127.aClass4_Sub11_Sub1_3.method711(2);
		if (local26 == 0) {
			Static311.anIntArray474[Static244.anInt4894++] = 2047;
			return;
		}
		@Pc(50) int local50;
		@Pc(60) int local60;
		if (local26 == 1) {
			local50 = Static127.aClass4_Sub11_Sub1_3.method711(3);
			Static158.aClass8_Sub1_Sub2_Sub1_1.method2082(1, local50);
			local60 = Static127.aClass4_Sub11_Sub1_3.method711(1);
			if (local60 == 1) {
				Static311.anIntArray474[Static244.anInt4894++] = 2047;
			}
		} else if (local26 == 2) {
			if (Static127.aClass4_Sub11_Sub1_3.method711(1) == 1) {
				local50 = Static127.aClass4_Sub11_Sub1_3.method711(3);
				Static158.aClass8_Sub1_Sub2_Sub1_1.method2082(2, local50);
				local60 = Static127.aClass4_Sub11_Sub1_3.method711(3);
				Static158.aClass8_Sub1_Sub2_Sub1_1.method2082(2, local60);
			} else {
				local50 = Static127.aClass4_Sub11_Sub1_3.method711(3);
				Static158.aClass8_Sub1_Sub2_Sub1_1.method2082(0, local50);
			}
			local50 = Static127.aClass4_Sub11_Sub1_3.method711(1);
			if (local50 == 1) {
				Static311.anIntArray474[Static244.anInt4894++] = 2047;
			}
		} else if (local26 == 3) {
			local50 = Static127.aClass4_Sub11_Sub1_3.method711(1);
			if (local50 == 1) {
				Static311.anIntArray474[Static244.anInt4894++] = 2047;
			}
			local60 = Static127.aClass4_Sub11_Sub1_3.method711(7);
			@Pc(161) int local161 = Static127.aClass4_Sub11_Sub1_3.method711(1);
			Static12.anInt267 = Static127.aClass4_Sub11_Sub1_3.method711(2);
			@Pc(171) int local171 = Static127.aClass4_Sub11_Sub1_3.method711(7);
			Static158.aClass8_Sub1_Sub2_Sub1_1.method2084(Static12.anInt267, local171, local161 == 1, local60);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZII)V")
	public static void method5704(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub4_Sub18 local13 = Static302.method4961(arg1, 5);
		local13.method4908();
		local13.anInt5705 = arg0;
	}
}
