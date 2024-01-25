import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
	public static int anInt3576;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
	public static int anInt3577;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_105 = new Class194(99, 12);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3068(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static174.anInt3362;
		@Pc(13) int[] local13 = Static495.anIntArray529;
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			@Pc(25) Class9_Sub2_Sub1_Sub2_Sub1 local25 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local13[local17]];
			if (local25 != null && Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 != local25 && local25.aString5 != null && local25.aString5.equalsIgnoreCase(arg0)) {
				local15 = true;
				@Pc(52) Class3_Sub27 local52;
				if (arg1 == 1) {
					local52 = Static59.method1040(Static325.aClass20_2, Static443.aClass314_111);
					local52.aClass3_Sub9_Sub2_2.method5581(local13[local17]);
					local52.aClass3_Sub9_Sub2_2.method5572(0);
					Static148.method2572(local52);
				} else if (arg1 == 4) {
					local52 = Static59.method1040(Static325.aClass20_2, Static326.aClass314_92);
					local52.aClass3_Sub9_Sub2_2.method5595(local13[local17]);
					local52.aClass3_Sub9_Sub2_2.method5572(0);
					Static148.method2572(local52);
				} else if (arg1 == 5) {
					local52 = Static59.method1040(Static325.aClass20_2, Static27.aClass314_8);
					local52.aClass3_Sub9_Sub2_2.method5616(local13[local17]);
					local52.aClass3_Sub9_Sub2_2.method5593(0);
					Static148.method2572(local52);
				} else if (arg1 == 6) {
					local52 = Static59.method1040(Static325.aClass20_2, Static62.aClass314_23);
					local52.aClass3_Sub9_Sub2_2.method5595(local13[local17]);
					local52.aClass3_Sub9_Sub2_2.method5572(0);
					Static148.method2572(local52);
				} else if (arg1 == 7) {
					local52 = Static59.method1040(Static325.aClass20_2, Static583.aClass314_148);
					local52.aClass3_Sub9_Sub2_2.method5635(0);
					local52.aClass3_Sub9_Sub2_2.method5620(local13[local17]);
					Static148.method2572(local52);
				}
				break;
			}
		}
		if (!local15) {
			Static608.method8332(Static369.aClass235_24.method5893(Static455.anInt7738) + arg0);
		}
	}
}
