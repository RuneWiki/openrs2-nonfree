import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!jha", name = "e", descriptor = "Lclient!g;")
	public static Class121 aClass121_1;

	@OriginalMember(owner = "client!jha", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[5];

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(II)V")
	public static void method4290(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static325.anInt5888 - Static515.anInt8629;
		if (local7 >= 100) {
			Static644.anInt10296 = -1;
			Static23.anInt718 = -1;
			Static2.anInt31 = 1;
			return;
		}
		@Pc(22) int local22 = (int) Static189.aFloat109;
		if (local22 < Static600.anInt9884 >> 8) {
			local22 = Static600.anInt9884 >> 8;
		}
		if (Static276.aBooleanArray32[4] && Static311.anIntArray387[4] + 128 > local22) {
			local22 = Static311.anIntArray387[4] + 128;
		}
		@Pc(63) int local63 = (int) Static378.aFloat160 + Static479.anInt9936 & 0x3FFF;
		Static637.method8529(local22, Static85.anInt1773, local63, arg0, Static57.anInt1181, Static582.method8038(Static16.anInt308, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929) - 200, (local22 >> 3) * 3 + 600 << 2);
		@Pc(110) float local110 = -((float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F) + (float) 1;
		Static53.anInt1153 = (int) ((float) Static66.anInt1398 + local110 * (float) (Static53.anInt1153 - Static66.anInt1398));
		Static395.anInt3530 = (int) ((float) Static389.anInt6998 + local110 * (float) (Static395.anInt3530 - Static389.anInt6998));
		Static512.anInt8589 = (int) ((float) (Static512.anInt8589 - Static55.anInt1161) * local110 + (float) Static55.anInt1161);
		Static64.anInt1371 = (int) ((float) Static314.anInt5696 + (float) (Static64.anInt1371 - Static314.anInt5696) * local110);
		@Pc(161) int local161 = Static105.anInt2114 - Static575.anInt9508;
		if (local161 > 8192) {
			local161 -= 16384;
		} else if (local161 < -8192) {
			local161 += 16384;
		}
		Static105.anInt2114 = (int) ((float) Static575.anInt9508 + local110 * (float) local161);
		Static105.anInt2114 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)V")
	public static void method4291() {
		Static202.method3530();
		Static296.aClass22_3 = null;
		Static353.aClass22_4 = null;
		Static600.aClass121ArrayArray1 = null;
		Static57.aClass22_1 = null;
		Static555.aClass87_14 = null;
	}
}
