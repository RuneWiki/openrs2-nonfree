import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!hs", name = "Q", descriptor = "D")
	public static double aDouble13;

	@OriginalMember(owner = "client!hs", name = "eb", descriptor = "[I")
	public static int[] anIntArray250;

	@OriginalMember(owner = "client!hs", name = "N", descriptor = "[I")
	public static final int[] anIntArray249 = new int[1];

	@OriginalMember(owner = "client!hs", name = "nb", descriptor = "I")
	public static int anInt4187 = 0;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBI)V")
	public static void method3561(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static671.aFloat183 < Static671.aFloat182) {
			Static671.aFloat183 = (float) ((double) Static671.aFloat183 + (double) Static671.aFloat183 / 30.0D);
			if (Static671.aFloat182 < Static671.aFloat183) {
				Static671.aFloat183 = Static671.aFloat182;
			}
			Static2.method25();
			Static671.anInt9350 = (int) Static671.aFloat183 >> 1;
			Static671.aByteArrayArrayArray17 = Static566.method7447(Static671.anInt9350);
		} else if (Static671.aFloat183 > Static671.aFloat182) {
			Static671.aFloat183 = (float) ((double) Static671.aFloat183 - (double) Static671.aFloat183 / 30.0D);
			if (Static671.aFloat183 < Static671.aFloat182) {
				Static671.aFloat183 = Static671.aFloat182;
			}
			Static2.method25();
			Static671.anInt9350 = (int) Static671.aFloat183 >> 1;
			Static671.aByteArrayArrayArray17 = Static566.method7447(Static671.anInt9350);
		}
		if (Static146.anInt2698 != -1 && Static426.anInt6954 != -1) {
			@Pc(78) int local78 = Static146.anInt2698 - Static81.anInt10273;
			if (local78 < 2 || local78 > 2) {
				local78 /= 8;
			}
			@Pc(94) int local94 = Static426.anInt6954 - Static594.anInt9606;
			if (local94 < 2 || local94 > 2) {
				local94 /= 8;
			}
			Static81.anInt10273 += local78;
			if (local78 == 0 && local94 == 0) {
				Static426.anInt6954 = -1;
				Static146.anInt2698 = -1;
			}
			Static594.anInt9606 -= -local94;
			Static2.method25();
		}
		if (Static270.anInt4659 <= 0) {
			Static28.anInt691 = -1;
			Static329.anInt5459 = -1;
		} else {
			Static258.anInt4526--;
			if (Static258.anInt4526 == 0) {
				Static258.anInt4526 = 100;
				Static270.anInt4659--;
			}
		}
		if (!Static323.aBoolean351 || Static310.aClass302_27 == null) {
			return;
		}
		for (@Pc(170) Class3_Sub3 local170 = (Class3_Sub3) Static310.aClass302_27.method6603(); local170 != null; local170 = (Class3_Sub3) Static310.aClass302_27.method6605()) {
			@Pc(179) Class188 local179 = Static671.aClass378_4.method8708(local170.aClass3_Sub46_1.anInt9112);
			if (local170.method119(arg1, arg0)) {
				if (local179.aStringArray32 != null) {
					if (local179.aStringArray32[4] != null) {
						Static390.method5454(-1, true, local179.aStringArray32[4], (long) local170.aClass3_Sub46_1.anInt9112, 1001, 0, local179.aString63, (long) local170.aClass3_Sub46_1.anInt9112, false, local179.anInt4980, -1, false);
					}
					if (local179.aStringArray32[3] != null) {
						Static390.method5454(-1, true, local179.aStringArray32[3], (long) local170.aClass3_Sub46_1.anInt9112, 1011, 0, local179.aString63, (long) local170.aClass3_Sub46_1.anInt9112, false, local179.anInt4980, -1, false);
					}
					if (local179.aStringArray32[2] != null) {
						Static390.method5454(-1, true, local179.aStringArray32[2], (long) local170.aClass3_Sub46_1.anInt9112, 1010, 0, local179.aString63, (long) local170.aClass3_Sub46_1.anInt9112, false, local179.anInt4980, -1, false);
					}
					if (local179.aStringArray32[1] != null) {
						Static390.method5454(-1, true, local179.aStringArray32[1], (long) local170.aClass3_Sub46_1.anInt9112, 1007, 0, local179.aString63, (long) local170.aClass3_Sub46_1.anInt9112, false, local179.anInt4980, -1, false);
					}
					if (local179.aStringArray32[0] != null) {
						Static390.method5454(-1, true, local179.aStringArray32[0], (long) local170.aClass3_Sub46_1.anInt9112, 1006, 0, local179.aString63, (long) local170.aClass3_Sub46_1.anInt9112, false, local179.anInt4980, -1, false);
					}
				}
				if (!local170.aClass3_Sub46_1.aBoolean638) {
					local170.aClass3_Sub46_1.aBoolean638 = true;
					Static250.method3776(Static459.aClass343_8, local170.aClass3_Sub46_1.anInt9112, local179.anInt4980);
				}
				if (local170.aClass3_Sub46_1.aBoolean638) {
					Static250.method3776(Static304.aClass343_4, local170.aClass3_Sub46_1.anInt9112, local179.anInt4980);
				}
			} else if (local170.aClass3_Sub46_1.aBoolean638) {
				local170.aClass3_Sub46_1.aBoolean638 = false;
				Static250.method3776(Static375.aClass343_9, local170.aClass3_Sub46_1.anInt9112, local179.anInt4980);
			}
		}
	}
}
