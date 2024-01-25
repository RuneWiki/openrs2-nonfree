import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
	public static int anInt5191 = -1;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!oi;II)Lclient!ti;")
	public static Class1_Sub3_Sub16 method4159(@OriginalArg(0) int arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(3) int arg2) {
		@Pc(23) Class1_Sub19 local23 = new Class1_Sub19(arg1.method4002(arg2, arg0));
		@Pc(56) Class1_Sub3_Sub16 local56 = new Class1_Sub3_Sub16(arg0, local23.method2914(), local23.method2914(), local23.method2877(), local23.method2877(), local23.method2915() == 1, local23.method2915(), local23.method2915());
		@Pc(60) int local60 = local23.method2915();
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			local56.aClass14_46.method205(new Class1_Sub6(local23.method2915(), local23.method2896(), local23.method2896(), local23.method2896(), local23.method2896(), local23.method2896(), local23.method2896(), local23.method2896(), local23.method2896()));
		}
		local56.method5112();
		return local56;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
	public static void method4160() {
		if (Static33.aFrame1 != null) {
			return;
		}
		@Pc(13) Container local13;
		if (Static138.aFrame2 == null) {
			local13 = Static259.aClass177_2.anApplet1;
		} else {
			local13 = Static138.aFrame2;
		}
		Static342.anInt5549 = local13.getSize().width;
		Static455.anInt7239 = local13.getSize().height;
		@Pc(35) Insets local35;
		if (local13 == Static138.aFrame2) {
			local35 = Static138.aFrame2.getInsets();
			Static455.anInt7239 -= local35.top + local35.bottom;
			Static342.anInt5549 -= local35.left + local35.right;
		}
		if (Static208.method3017() == 1) {
			Static232.anInt4198 = (Static342.anInt5549 - Static401.anInt6459) / 2;
			Static40.anInt597 = Static238.anInt4296;
			Static351.anInt5682 = 0;
			Static192.anInt3532 = Static401.anInt6459;
		} else if (Static45.anInt669 < 96 && Static214.anInt3968 == 0) {
			@Pc(79) int local79 = Static342.anInt5549 <= 1024 ? Static342.anInt5549 : 1024;
			@Pc(88) int local88 = Static455.anInt7239 > 768 ? 768 : Static455.anInt7239;
			Static192.anInt3532 = local79;
			Static232.anInt4198 = (Static342.anInt5549 - local79) / 2;
			Static351.anInt5682 = 0;
			Static40.anInt597 = local88;
		} else {
			Static351.anInt5682 = 0;
			Static40.anInt597 = Static455.anInt7239;
			Static232.anInt4198 = 0;
			Static192.anInt3532 = Static342.anInt5549;
		}
		if (Static254.aClass170_4 != Static268.aClass170_5) {
			@Pc(125) boolean local125;
			if (Static192.anInt3532 < 1024 && Static40.anInt597 < 768) {
				local125 = true;
			} else {
				local125 = false;
			}
		}
		Static91.aCanvas2.setSize(Static192.anInt3532, Static40.anInt597);
		if (Static186.aClass117_3 != null) {
			Static186.aClass117_3.method5686(Static91.aCanvas2);
		}
		if (Static138.aFrame2 == local13) {
			local35 = Static138.aFrame2.getInsets();
			Static91.aCanvas2.setLocation(Static232.anInt4198 + local35.left, Static351.anInt5682 + local35.top);
		} else {
			Static91.aCanvas2.setLocation(Static232.anInt4198, Static351.anInt5682);
		}
		if (Static118.anInt1785 != -1) {
			Static428.method5437(true);
		}
		Static463.method5975();
	}
}
