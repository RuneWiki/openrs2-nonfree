import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!sp", name = "C", descriptor = "I")
	public static int anInt5407 = 0;

	@OriginalMember(owner = "client!sp", name = "E", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_85 = new Class32("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!sp", name = "G", descriptor = "I")
	public static int anInt5408 = -1;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BIIIIII)V")
	public static void method4699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class4 local8 = Static164.method2913(arg0, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray10 != null) {
			@Pc(18) Class2_Sub22 local18 = new Class2_Sub22();
			local18.anObjectArray33 = local8.anObjectArray10;
			local18.aClass4_15 = local8;
			Static256.method4003(local18);
		}
		Static33.anInt698 = arg5;
		Static23.anInt501 = arg2;
		Static317.anInt5417 = arg1;
		Static309.anInt5189 = arg0;
		Static62.anInt1263 = arg4;
		Static284.anInt4920 = local8.anInt58;
		Static110.aBoolean180 = true;
		Static345.anInt6624 = arg3;
		Static51.method872(local8);
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(Z)V")
	public static void method4706() {
		if (Static385.aFrame2 != null) {
			return;
		}
		@Pc(12) int local12 = Static341.anInt5819;
		@Pc(14) int local14 = Static88.anInt1685;
		@Pc(22) int local22 = Static70.anInt1246 - Static253.anInt4467 - local12;
		@Pc(30) int local30 = Static230.anInt4054 - local14 - Static362.anInt6102;
		if (local12 <= 0 && local22 <= 0 && local14 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(52) Container local52;
			if (Static8.aFrame1 == null) {
				local52 = Static359.aClass111_5.anApplet1;
			} else {
				local52 = Static8.aFrame1;
			}
			@Pc(58) int local58 = 0;
			@Pc(60) int local60 = 0;
			if (Static8.aFrame1 == local52) {
				@Pc(66) Insets local66 = Static8.aFrame1.getInsets();
				local58 = local66.left;
				local60 = local66.top;
			}
			@Pc(75) Graphics local75 = local52.getGraphics();
			local75.setColor(Color.black);
			if (local12 > 0) {
				local75.fillRect(local58, local60, local12, Static230.anInt4054);
			}
			if (local14 > 0) {
				local75.fillRect(local58, local60, Static70.anInt1246, local14);
			}
			if (local22 > 0) {
				local75.fillRect(local58 + Static70.anInt1246 - local22, local60, local22, Static230.anInt4054);
			}
			if (local30 > 0) {
				local75.fillRect(local58, local60 + Static230.anInt4054 - local30, Static70.anInt1246, local30);
				return;
			}
		} catch (@Pc(135) Exception local135) {
			return;
		}
	}
}
