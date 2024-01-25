import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method3726() {
		Static156.aClass146_3.method3336();
		Static412.aClass169_5.method3855();
		Static167.aClass223_1.method5040();
		Static113.aClass127_2.method2814();
		Static336.aClass59_2.method1475();
		Static354.aClass170_2.method3861();
		Static244.aClass174_2.method4014();
		Static93.aClass70_1.method1599();
		Static427.aClass58_1.method1463();
		Static91.aClass43_1.method976();
		Static255.aClass222_1.method5012();
		Static405.aClass190_4.method4318();
		Static171.aClass254_3.method5837();
		Static320.aClass116_1.method2667();
		Static414.aClass258_2.method5884();
		Static187.aClass217_1.method4852();
		Static251.aClass147_1.method3377();
		Static221.aClass72_1.method1666();
		Static187.aClass145_1.method3333();
		Static333.aClass50_3.method1395();
		Static336.method4768();
		Static256.method3947();
		Static241.method3732();
		Static388.method5344();
		Static403.aClass220_53.method4987();
		Static117.aClass220_14.method4987();
		Static282.aClass220_42.method4987();
		Static210.aClass220_26.method4987();
		Static308.aClass220_46.method4987();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public static void method3729() {
		if (Static93.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static268.anInt4597;
		@Pc(14) int local14 = Static335.anInt5653;
		@Pc(22) int local22 = Static377.anInt6742 - Static235.anInt4053 - local8;
		@Pc(29) int local29 = Static383.anInt6310 - local14 - Static381.anInt6279;
		if (local8 <= 0 && local22 <= 0 && local14 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(45) Container local45;
			if (Static176.aFrame2 == null) {
				local45 = Static165.aClass103_3.anApplet1;
			} else {
				local45 = Static176.aFrame2;
			}
			@Pc(51) int local51 = 0;
			@Pc(53) int local53 = 0;
			if (local45 == Static176.aFrame2) {
				@Pc(59) Insets local59 = Static176.aFrame2.getInsets();
				local53 = local59.top;
				local51 = local59.left;
			}
			@Pc(68) Graphics local68 = local45.getGraphics();
			local68.setColor(Color.black);
			if (local8 > 0) {
				local68.fillRect(local51, local53, local8, Static383.anInt6310);
			}
			if (local14 > 0) {
				local68.fillRect(local51, local53, Static377.anInt6742, local14);
			}
			if (local22 > 0) {
				local68.fillRect(Static377.anInt6742 + local51 - local22, local53, local22, Static383.anInt6310);
			}
			if (local29 > 0) {
				local68.fillRect(local51, Static383.anInt6310 + local53 - local29, Static377.anInt6742, local29);
				return;
			}
		} catch (@Pc(120) Exception local120) {
			return;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZI)I")
	public static int method3730(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZIZII)Lclient!lt;")
	public static Class158 method3731(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Class14 local5 = null;
		if (Static18.aClass155_3 != null) {
			local5 = new Class14(arg1, Static18.aClass155_3, Static179.aClass155Array1[arg1], 1000000);
		}
		Static420.aClass96_Sub1Array1[arg1] = Static397.aClass259_1.method5890(arg1, Static158.aClass14_1, local5);
		if (arg0) {
			Static420.aClass96_Sub1Array1[arg1].method4059();
		}
		return new Class158(Static420.aClass96_Sub1Array1[arg1], arg2, 1);
	}
}
