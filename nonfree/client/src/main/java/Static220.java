import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!o", name = "H", descriptor = "Lclient!wd;")
	public static Class210 aClass210_11;

	@OriginalMember(owner = "client!o", name = "M", descriptor = "[Lclient!kr;")
	public static Class67_Sub3[] aClass67_Sub3Array3;

	@OriginalMember(owner = "client!o", name = "E", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_77 = new Class117("K", "T", "K", "K");

	@OriginalMember(owner = "client!o", name = "P", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_78 = new Class117(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!o", name = "R", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_79 = new Class117("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!o", name = "S", descriptor = "[Lclient!br;")
	public static final Class31[] aClass31Array1 = new Class31[4];

	@OriginalMember(owner = "client!o", name = "V", descriptor = "Z")
	public static boolean aBoolean298 = false;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!kc;Lclient!nq;Lclient!nq;I)V")
	public static void method3942(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class144 arg2) {
		Static321.aClass144_102 = arg2;
		Static86.anInterface4_1 = arg0;
		Static258.aClass144_88 = arg1;
		if (Static258.aClass144_88 != null) {
			Static6.anInt4016 = Static258.aClass144_88.method3890(1);
		}
		if (Static321.aClass144_102 != null) {
			Static329.anInt6331 = Static321.aClass144_102.method3890(1);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IBI)V")
	public static void method3943(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * Static249.anInt4975 >> 8;
		if (arg1 == -1 && !Static120.aBoolean103) {
			Static223.method3982();
		} else if (arg1 != -1 && (arg1 != Static43.anInt850 || !Static74.method1141()) && local10 != 0 && !Static120.aBoolean103) {
			Static89.method1300(arg1, Static135.aClass144_38, local10);
		}
		Static43.anInt850 = arg1;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIII)V")
	public static void method3945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static280.anInt212 <= arg1 && arg2 <= Static346.anInt6607 && Static240.anInt4829 <= arg4 && arg3 <= Static166.anInt3315) {
			Static122.method1897(arg3, arg2, arg0, arg1, arg4);
		} else {
			Static37.method550(arg3, arg2, arg0, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
	public static void method3946() {
		if (Static29.aFrame1 != null) {
			return;
		}
		@Pc(11) int local11 = Static343.anInt6572;
		@Pc(13) int local13 = Static54.anInt1024;
		@Pc(20) int local20 = Static264.anInt5404 - local11 - Static164.anInt3090;
		@Pc(28) int local28 = Static319.anInt6199 - local13 - Static79.anInt5259;
		if (local11 <= 0 && local20 <= 0 && local13 <= 0 && local28 <= 0) {
			return;
		}
		try {
			@Pc(44) Container local44;
			if (Static241.aFrame2 == null) {
				local44 = Static77.aClass118_7.anApplet1;
			} else {
				local44 = Static241.aFrame2;
			}
			@Pc(50) int local50 = 0;
			@Pc(52) int local52 = 0;
			if (Static241.aFrame2 == local44) {
				@Pc(58) Insets local58 = Static241.aFrame2.getInsets();
				local52 = local58.top;
				local50 = local58.left;
			}
			@Pc(67) Graphics local67 = local44.getGraphics();
			local67.setColor(Color.black);
			if (local11 > 0) {
				local67.fillRect(local50, local52, local11, Static319.anInt6199);
			}
			if (local13 > 0) {
				local67.fillRect(local50, local52, Static264.anInt5404, local13);
			}
			if (local20 > 0) {
				local67.fillRect(Static264.anInt5404 + local50 - local20, local52, local20, Static319.anInt6199);
			}
			if (local28 > 0) {
				local67.fillRect(local50, Static319.anInt6199 + local52 - local28, Static264.anInt5404, local28);
				return;
			}
		} catch (@Pc(123) Exception local123) {
			return;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIB)I")
	public static int method3947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = local12 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local12;
	}
}
