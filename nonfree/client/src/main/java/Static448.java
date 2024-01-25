import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!qaa", name = "d", descriptor = "[Lclient!af;")
	public static Class10[] aClass10Array2;

	@OriginalMember(owner = "client!qaa", name = "h", descriptor = "[I")
	public static final int[] anIntArray542 = new int[32];

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)V")
	public static void method6632() {
		for (@Pc(4) Class2_Sub5_Sub2 local4 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4280(); local4 != null; local4 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4288()) {
			if (local4.anInt964 > 1) {
				local4.anInt964 = 0;
				Static465.aClass233_42.method5662(local4, ((Class2_Sub5_Sub20) local4.aClass175_1.aClass2_Sub5_34.aClass2_Sub5_66).aLong277);
				local4.aClass175_1.method4283();
			}
		}
		Static178.anInt3981 = 0;
		Static90.anInt1824 = 0;
		Static261.aClass238_28.method5841();
		Static294.aClass222_18.method5469();
		Static61.aClass175_2.method4283();
		Static642.aBoolean757 = false;
	}

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)V")
	public static void method6633() {
		Static511.anInt7699 = 0;
		Static376.anInt6732 = -1;
		Static129.anInt2985 = -1;
		Static271.anInt5226 = -1;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IB)C")
	public static char method6635(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(48) char local48 = Static450.aCharArray8[local12 - 128];
			if (local48 == '\u0000') {
				local48 = '?';
			}
			local12 = local48;
		}
		return (char) local12;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	public static void method6636(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static128.method2531(local6.height, local6.width);
		if (Static244.anInt4841 == 1) {
			Static167.aClass87_3.method7974(arg0, Static250.anInt8280, Static326.anInt5898);
		} else {
			Static167.aClass87_3.method7974(arg0, Static312.anInt5689, Static400.anInt7142);
		}
	}
}
