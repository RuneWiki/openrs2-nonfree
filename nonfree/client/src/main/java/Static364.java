import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!od", name = "E", descriptor = "I")
	public static int anInt7313;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "Lclient!gs;")
	public static final Class123 aClass123_15 = new Class123("WTI", 5);

	@OriginalMember(owner = "client!od", name = "w", descriptor = "[I")
	public static final int[] anIntArray516 = new int[14];

	@OriginalMember(owner = "client!od", name = "C", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_135 = new Class254(29, -2);

	@OriginalMember(owner = "client!od", name = "D", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	public static void method6159() {
		Static547.aClass6_Sub26_Sub2_2.anInt5769 = 0;
		Static180.aClass254_74 = null;
		Static345.aClass6_Sub26_Sub2_1.anInt5769 = 0;
		Static291.anInt5565 = 0;
		Static205.aClass254_80 = null;
		Static555.aClass254_173 = null;
		Static462.anInt8534 = 0;
		Static467.aClass254_148 = null;
		Static258.anInt5222 = 0;
		Static480.method7889();
		Static131.method2520();
		for (@Pc(36) int local36 = 0; local36 < 2048; local36++) {
			Static239.aClass11_Sub1_Sub1_Sub2Array1[local36] = null;
		}
		Static350.aClass11_Sub1_Sub1_Sub2_4 = null;
		for (@Pc(52) int local52 = 0; local52 < Static452.anInt8286; local52++) {
			@Pc(59) Class11_Sub1_Sub1_Sub1 local59 = Static9.aClass6_Sub33Array1[local52].aClass11_Sub1_Sub1_Sub1_2;
			if (local59 != null) {
				local59.anInt7407 = -1;
			}
		}
		Static250.method4403();
		Static84.anInt1994 = 1;
		Static145.method2683(10);
		for (@Pc(77) int local77 = 0; local77 < 100; local77++) {
			Static429.aBooleanArray27[local77] = true;
		}
		Static382.method6025();
		Static133.aClass6_Sub47_2 = null;
		Static503.aLong217 = 0L;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)Lclient!sf;")
	public static Class284 method6163(@OriginalArg(0) int arg0) {
		@Pc(15) Class284 local15 = (Class284) Static206.aClass245_34.method6082((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static231.aClass168_56.method4435(arg0, 0);
		local15 = new Class284();
		if (local25 != null) {
			local15.method7142(new Class6_Sub26(local25));
		}
		local15.method7139();
		Static206.aClass245_34.method6075(local15, (long) arg0);
		return local15;
	}
}
