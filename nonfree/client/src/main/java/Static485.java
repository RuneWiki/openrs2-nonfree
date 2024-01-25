import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "Lclient!bi;")
	public static Class31 aClass31_105;

	@OriginalMember(owner = "client!sl", name = "r", descriptor = "Lclient!ef;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!sl", name = "w", descriptor = "F")
	public static float aFloat165;

	@OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
	public static int anInt8162 = -1;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!bi;)V")
	public static void method6740(@OriginalArg(1) Class31 arg0) {
		Static287.aClass31_63 = arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIII)V")
	public static void method6741(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static483.anInt8145 = arg1;
		Static425.anInt7333 = arg3;
		Static153.anInt3365 = arg2;
		Static80.anInt1664 = arg0;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)V")
	public static void method6742() {
		Static552.aClass183_40.method4287();
		Static363.aClass183_26.method4287();
	}

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)V")
	public static void method6744() {
		if (Static528.aFrame1 != null) {
			return;
		}
		@Pc(10) int local10 = Static191.anInt5908;
		@Pc(12) int local12 = Static249.anInt4946;
		@Pc(24) int local24 = Static376.anInt6720 - Static2.anInt29 - local10;
		@Pc(31) int local31 = Static86.anInt2256 - Static19.anInt390 - local12;
		if (local10 <= 0 && local24 <= 0 && local12 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(51) Container local51;
			if (Static537.aFrame2 != null) {
				local51 = Static537.aFrame2;
			} else if (Static55.anApplet1 == null) {
				local51 = Static31.anApplet_Sub1_1;
			} else {
				local51 = Static55.anApplet1;
			}
			@Pc(61) int local61 = 0;
			@Pc(63) int local63 = 0;
			if (local51 == Static537.aFrame2) {
				@Pc(69) Insets local69 = Static537.aFrame2.getInsets();
				local61 = local69.left;
				local63 = local69.top;
			}
			@Pc(78) Graphics local78 = local51.getGraphics();
			local78.setColor(Color.black);
			if (local10 > 0) {
				local78.fillRect(local61, local63, local10, Static86.anInt2256);
			}
			if (local12 > 0) {
				local78.fillRect(local61, local63, Static376.anInt6720, local12);
			}
			if (local24 > 0) {
				local78.fillRect(local61 + Static376.anInt6720 - local24, local63, local24, Static86.anInt2256);
			}
			if (local31 > 0) {
				local78.fillRect(local61, local63 + Static86.anInt2256 - local31, Static376.anInt6720, local31);
				return;
			}
		} catch (@Pc(134) Exception local134) {
			return;
		}
	}
}
