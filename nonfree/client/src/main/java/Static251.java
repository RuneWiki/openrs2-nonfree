import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "Lclient!xa;")
	public static Class37 aClass37_27;

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "[I")
	public static int[] anIntArray323;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
	public static int anInt5425;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
	public static int anInt5429;

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray21;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
	public static int anInt5430;

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "Lclient!ft;")
	public static final Class110 aClass110_26 = new Class110(0, 19);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)Z")
	public static boolean method4498(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static259.method4587(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | Static381.method1552(arg0, arg1) | Static130.method2554(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static387.method6201(arg1, arg0) | Static291.method4968(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
	public static void method4499() {
		if (Static578.aFrame2 != null) {
			return;
		}
		@Pc(8) int local8 = Static524.anInt9579;
		@Pc(10) int local10 = Static426.anInt8255;
		@Pc(18) int local18 = Static3.anInt172 - Static582.anInt10234 - local8;
		@Pc(31) int local31 = Static232.anInt4725 - local10 - Static294.anInt10217;
		if (local8 <= 0 && local18 <= 0 && local10 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(51) Container local51;
			if (Static531.aFrame1 != null) {
				local51 = Static531.aFrame1;
			} else if (Static253.anApplet3 == null) {
				local51 = Static329.anApplet_Sub1_1;
			} else {
				local51 = Static253.anApplet3;
			}
			@Pc(59) int local59 = 0;
			@Pc(61) int local61 = 0;
			if (local51 == Static531.aFrame1) {
				@Pc(67) Insets local67 = Static531.aFrame1.getInsets();
				local59 = local67.left;
				local61 = local67.top;
			}
			@Pc(76) Graphics local76 = local51.getGraphics();
			local76.setColor(Color.black);
			if (local8 > 0) {
				local76.fillRect(local59, local61, local8, Static232.anInt4725);
			}
			if (local10 > 0) {
				local76.fillRect(local59, local61, Static3.anInt172, local10);
			}
			if (local18 > 0) {
				local76.fillRect(Static3.anInt172 + local59 - local18, local61, local18, Static232.anInt4725);
			}
			if (local31 > 0) {
				local76.fillRect(local59, Static232.anInt4725 + local61 - local31, Static3.anInt172, local31);
				return;
			}
		} catch (@Pc(131) Exception local131) {
			return;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!jd;II)V")
	public static void method4501(@OriginalArg(0) Class167 arg0, @OriginalArg(2) int arg1) {
		if (Static386.aBoolean632) {
			arg1 = 0;
			Static386.aBoolean632 = false;
		}
		if (Static491.aClass167_9 != null && Static491.aClass167_9.method4129(arg0)) {
			return;
		}
		Static491.aClass167_9 = arg0;
		Static589.aLong260 = Static376.method6088();
		Static59.anInt1515 = arg1;
		Static170.anInt9047 = arg1;
		if (Static170.anInt9047 != 0) {
			Static17.aFloat120 = Static191.aFloat55;
			Static536.anInt9712 = Static591.anInt10348;
			Static370.anInt7278 = Static247.anInt5390;
			Static142.anInt3262 = Static446.anInt8504;
			Static10.aFloat1 = Static288.aFloat118;
			Static23.aFloat179 = Static424.aFloat173;
			Static567.aFloat204 = Static11.aFloat2;
			Static257.aFloat115 = Static25.aFloat12;
			Static110.aFloat27 = Static260.aFloat116;
			Static173.aClass108_1 = Static300.aClass108_6;
			return;
		}
		Static203.method3388();
	}
}
