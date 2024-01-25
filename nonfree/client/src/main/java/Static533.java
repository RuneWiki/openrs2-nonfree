import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_124 = new Class154(59, 7);

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
	public static int anInt8769 = 0;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z")
	public static boolean method7004() {
		try {
			return Static47.method845();
		} catch (@Pc(14) IOException local14) {
			Static454.method5907();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static149.aClass349_37 == null ? -1 : Static149.aClass349_37.method7331()) + "," + (Static577.aClass349_162 == null ? -1 : Static577.aClass349_162.method7331()) + "," + (Static511.aClass349_152 == null ? -1 : Static511.aClass349_152.method7331()) + " - " + Static528.anInt8479 + "," + (Static485.anInt7725 + Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray566[0]) + "," + (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray565[0] + Static310.anInt5129) + " - ";
			for (@Pc(79) int local79 = 0; local79 < Static528.anInt8479 && local79 < 50; local79++) {
				local77 = local77 + Static361.aClass2_Sub7_Sub2_1.aByteArray52[local79] + ",";
			}
			Static357.method5094(local19, local77);
			Static449.method5858(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBIII)V")
	public static void method7005(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class2_Sub34 local6 = Static593.method7730();
		local6.aClass2_Sub7_Sub2_2.method4459(Static28.aClass283_7.anInt6971);
		local6.aClass2_Sub7_Sub2_2.method4459(arg3);
		local6.aClass2_Sub7_Sub2_2.method4459(arg1);
		local6.aClass2_Sub7_Sub2_2.method4511(arg0);
		local6.aClass2_Sub7_Sub2_2.method4511(arg2);
		Static100.method1508(local6);
		Static372.anInt6216 = -3;
		Static561.anInt9175 = 0;
		Static565.anInt9250 = 0;
		Static130.anInt2132 = 1;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BII)Z")
	public static boolean method7006(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
