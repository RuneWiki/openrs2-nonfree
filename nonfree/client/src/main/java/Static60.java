import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
	public static int anInt1151;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
	public static int anInt1152 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public static void method949() {
		if (Static146.aBoolean196) {
			return;
		}
		Static146.aBoolean196 = true;
		if (Static74.aBoolean115) {
			Static270.aFloat49 = (int) Static270.aFloat49 + 191 & 0xFFFFFF80;
		} else {
			Static171.aFloat28 += (24.0F - Static171.aFloat28) / 2.0F;
		}
		Static114.aBoolean167 = true;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public static void method950() {
		if (Static239.aClass12_Sub3_Sub2_2 != null && Static239.aClass12_Sub3_Sub2_2.anInt4141 + 64 - Static239.aClass12_Sub3_Sub2_2.method3375() * 64 >> 7 == Static207.anInt4065 && Static239.aClass12_Sub3_Sub2_2.anInt4113 + 64 - Static239.aClass12_Sub3_Sub2_2.method3375() * 64 >> 7 == Static296.anInt1762) {
			Static207.anInt4065 = 0;
		}
		@Pc(49) int local49;
		for (local49 = 0; local49 < 104; local49++) {
			for (@Pc(56) int local56 = 0; local56 < 104; local56++) {
				Static267.anIntArrayArray28[local49][local56] = 0;
			}
		}
		for (local49 = 0; local49 < Static41.anInt856; local49++) {
			@Pc(86) Class12_Sub3_Sub2 local86 = Static257.aClass12_Sub3_Sub2Array1[Static85.anIntArray179[local49]];
			if (local86 != null) {
				local86.aBoolean279 = false;
			}
		}
		for (local49 = 0; local49 < Static68.anInt1262; local49++) {
			@Pc(113) Class12_Sub3_Sub1 local113 = Static100.aClass12_Sub3_Sub1Array1[Static10.anIntArray20[local49]];
			if (local113 != null) {
				local113.aBoolean279 = false;
			}
		}
	}
}
