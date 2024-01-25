import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!dq", name = "u", descriptor = "I")
	public static int anInt1388 = 0;

	@OriginalMember(owner = "client!dq", name = "B", descriptor = "[J")
	public static final long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!dq", name = "E", descriptor = "[S")
	public static final short[] aShortArray47 = new short[] { 12, 49, 35, 24, 16, 36, 58, 43 };

	@OriginalMember(owner = "client!dq", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString48 = "Loaded world list data";

	@OriginalMember(owner = "client!dq", name = "I", descriptor = "[I")
	public static final int[] anIntArray84 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!sj;I)Ljava/lang/String;")
	public static String method1085(@OriginalArg(0) Class181 arg0) {
		if (Static47.method819(arg0).method1144() == 0) {
			return null;
		} else if (arg0.aString202 == null || arg0.aString202.trim().length() == 0) {
			return Static212.aBoolean98 ? "Hidden-use" : null;
		} else {
			return arg0.aString202;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BZ)V")
	public static void method1088(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static191.anInt3991 != -1) {
				Static167.method2704(Static191.anInt3991);
			}
			for (@Pc(19) Class3_Sub32 local19 = (Class3_Sub32) Static188.aClass24_21.method595(); local19 != null; local19 = (Class3_Sub32) Static188.aClass24_21.method602()) {
				if (!local19.method5718()) {
					local19 = (Class3_Sub32) Static188.aClass24_21.method595();
					if (local19 == null) {
						break;
					}
				}
				Static42.method732(local19, true, false);
			}
			Static191.anInt3991 = -1;
			Static188.aClass24_21 = new Class24(8);
			Static114.method1969();
			Static191.anInt3991 = Static154.anInt6367;
			Static30.method596(false);
			Static203.method3543();
			Static139.method2274(Static191.anInt3991);
		}
		Static346.method5641();
		Static164.anInt6256 = -1;
		Static341.method5590(Static218.anInt4471);
		Static349.aClass5_Sub4_Sub4_Sub1_2 = new Class5_Sub4_Sub4_Sub1();
		Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0] = 52;
		Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 = 6656;
		Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 = 6656;
		Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0] = 52;
		Static210.anInt4317 = 0;
		Static110.anInt2324 = 0;
		if (Static261.anInt5200 == 2) {
			Static110.anInt2324 = Static156.anInt3023 << 7;
			Static210.anInt4317 = Static158.anInt3055 << 7;
		} else {
			Static9.method165();
		}
		Static135.method2265();
		if (Static110.anInt2324 == 0 || Static210.anInt4317 == 0) {
			Static353.method5714(10);
		} else {
			Static347.method5657();
			Static353.method5714(28);
		}
	}
}
