import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
	public static int anInt654 = 0;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_21 = new Class119(4);

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
	public static int anInt664 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public static void method836() {
		while (true) {
			if (Static269.aClass2_Sub10_Sub1_3.method2046(Static71.anInt1574) >= 11) {
				@Pc(12) int local12 = Static269.aClass2_Sub10_Sub1_3.method2052(11);
				if (local12 != 2047) {
					@Pc(19) boolean local19 = false;
					if (Static129.aClass62_Sub1_Sub2_Sub2Array1[local12] == null) {
						Static129.aClass62_Sub1_Sub2_Sub2Array1[local12] = new Class62_Sub1_Sub2_Sub2();
						Static129.aClass62_Sub1_Sub2_Sub2Array1[local12].anInt5328 = local12;
						if (Static338.aClass2_Sub10Array1[local12] != null) {
							Static129.aClass62_Sub1_Sub2_Sub2Array1[local12].method4785(Static338.aClass2_Sub10Array1[local12]);
						}
						local19 = true;
					}
					Static103.anIntArray218[Static214.anInt4133++] = local12;
					@Pc(60) Class62_Sub1_Sub2_Sub2 local60 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local12];
					local60.anInt5333 = Static212.anInt4090;
					@Pc(68) int local68 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
					@Pc(75) int local75 = Static163.anIntArray157[Static269.aClass2_Sub10_Sub1_3.method2052(3)];
					@Pc(80) int local80 = Static269.aClass2_Sub10_Sub1_3.method2052(5);
					if (local80 > 15) {
						local80 -= 32;
					}
					@Pc(91) int local91 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
					if (local91 == 1) {
						Static102.anIntArray217[Static95.anInt6378++] = local12;
					}
					@Pc(109) int local109 = Static269.aClass2_Sub10_Sub1_3.method2052(5);
					if (local109 > 15) {
						local109 -= 32;
					}
					if (local19) {
						local60.method4783(local75);
					}
					local60.method4792(Static182.anInt3603, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0] + local109, local68 == 1, local80 + Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0]);
					continue;
				}
			}
			Static269.aClass2_Sub10_Sub1_3.method2051();
			return;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZZ)V")
	public static void method841(@OriginalArg(2) boolean arg0) {
		Static154.anInt6526++;
		Static135.method2703();
		if (arg0) {
			Static138.anInt2875++;
			Static24.method735();
		}
	}
}
