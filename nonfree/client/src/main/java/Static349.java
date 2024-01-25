import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
	public static int anInt6735;

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_93 = new Class173(5, 6);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)I")
	public static int method5630(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
	public static void method5632() {
		if (Static440.aClass44_12 == null) {
			return;
		}
		Static156.aClass136_5.method3290();
		Static204.method7208();
		Static37.method484();
		Static256.method4099();
		Static562.method8061();
		Static325.method8277();
		if (Static529.aClass215_1 != null) {
			Static529.aClass215_1.method5319();
		}
		Static570.method8150();
		Static28.method361();
		Static591.method8353();
		Static533.method7757();
		Static136.method2695(false);
		for (@Pc(37) int local37 = 0; local37 < 2048; local37++) {
			@Pc(43) Class1_Sub4_Sub2_Sub1_Sub2 local43 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local37];
			if (local43 != null) {
				for (@Pc(47) int local47 = 0; local47 < local43.aClass57Array3.length; local47++) {
					local43.aClass57Array3[local47] = null;
				}
			}
		}
		for (@Pc(66) int local66 = 0; local66 < Static436.anInt8163; local66++) {
			@Pc(73) Class1_Sub4_Sub2_Sub1_Sub1 local73 = Static457.aClass4_Sub4Array1[local66].aClass1_Sub4_Sub2_Sub1_Sub1_1;
			if (local73 != null) {
				for (@Pc(77) int local77 = 0; local77 < local73.aClass57Array3.length; local77++) {
					local73.aClass57Array3[local77] = null;
				}
			}
		}
		Static267.aClass8_3 = null;
		Static410.aClass8_6 = null;
		Static440.aClass44_12.method5033();
		Static440.aClass44_12 = null;
	}
}
