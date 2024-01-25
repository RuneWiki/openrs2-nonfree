import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!se", name = "z", descriptor = "Ljava/awt/Font;")
	public static Font aFont3;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "Z")
	public static boolean aBoolean642 = false;

	@OriginalMember(owner = "client!se", name = "B", descriptor = "Z")
	public static boolean aBoolean643 = true;

	@OriginalMember(owner = "client!se", name = "G", descriptor = "Z")
	public static boolean aBoolean647 = false;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!oi;)V")
	public static void method5943(@OriginalArg(1) Class185 arg0) {
		Static304.aClass185_16 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	public static void method5945() {
		if (Static186.aClass117_3.method5714()) {
			Static186.aClass117_3.method5683(Static91.aCanvas2);
			Static252.method3559();
			Static186.aClass117_3.method5703(Static91.aCanvas2);
			Static186.aClass117_3.method5688(Static91.aCanvas2);
		} else {
			Static422.method5393(Static214.anInt3968);
		}
		Static186.method2688();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
	public static void method5946(@OriginalArg(1) int arg0) {
		Static290.anIntArray368 = new int[arg0];
		Static372.anIntArray452 = new int[arg0];
		Static340.anIntArray401 = new int[arg0];
		Static214.anIntArray283 = new int[arg0];
		Static263.anIntArray345 = new int[arg0];
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)Z")
	public static boolean method5948() {
		@Pc(7) Class1 local7 = Static57.aClass14_3.aClass1_5.aClass1_268;
		if (local7 == null || Static57.aClass14_3.aClass1_5 == local7) {
			return false;
		}
		@Pc(18) Class1_Sub10 local18 = (Class1_Sub10) local7;
		if (local18.anInt1057 >= 2000) {
			local18.anInt1057 -= 2000;
		}
		return local18.anInt1057 == 1004;
	}
}
