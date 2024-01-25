import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!tja", name = "r", descriptor = "Lclient!wia;")
	public static Class386 aClass386_122;

	@OriginalMember(owner = "client!tja", name = "m", descriptor = "[F")
	public static final float[] aFloatArray82 = new float[4];

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "([BI)V")
	public static void method8245(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class14_Sub29 local15 = new Class14_Sub29(arg0);
		while (true) {
			while (true) {
				@Pc(19) int local19 = local15.method5866();
				if (local19 == 0) {
					return;
				}
				if (local19 == 1) {
					@Pc(34) int[] local34 = Static1.anIntArray747 = new int[6];
					local34[0] = local15.method5900();
					local34[1] = local15.method5900();
					local34[2] = local15.method5900();
					local34[3] = local15.method5900();
					local34[4] = local15.method5900();
					local34[5] = local15.method5900();
				} else {
					@Pc(81) int local81;
					@Pc(86) int local86;
					if (local19 == 4) {
						local81 = local15.method5866();
						Static508.anIntArray662 = new int[local81];
						for (local86 = 0; local86 < local81; local86++) {
							Static508.anIntArray662[local86] = local15.method5900();
							if (Static508.anIntArray662[local86] == 65535) {
								Static508.anIntArray662[local86] = -1;
							}
						}
					} else if (local19 == 5) {
						local81 = local15.method5866();
						Static333.anIntArray457 = new int[local81];
						for (local86 = 0; local86 < local81; local86++) {
							Static333.anIntArray457[local86] = local15.method5900();
							if (Static333.anIntArray457[local86] == 65535) {
								Static333.anIntArray457[local86] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tja", name = "d", descriptor = "(I)V")
	public static void method8246() {
		Static43.aClass230Array1 = null;
		if (Static128.aBoolean202 && Static482.method7137() != 1) {
			Static582.method8312(Static117.method9144(), 0, 0, Static430.anInt7691 == 3 || Static430.anInt7691 == 7, Static180.method2869());
		}
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (Static128.aBoolean202) {
			local37 = Static619.method8679();
			local39 = Static571.method8194();
		}
		Static443.method6487(-1, Static561.anInt9759 + local37, local37, Static563.anInt9769, Static639.anInt10685 + local39, local37, local39, local39);
		if (Static43.aClass230Array1 != null) {
			Static475.method6872(Static561.anInt9759 + local37, Static178.anInt3433, local39 + Static639.anInt10685, Static114.anInt2293, Static176.aClass230_2.anInt6682, -1412584499, Static43.aClass230Array1, true, local39, local37);
			Static43.aClass230Array1 = null;
		}
	}
}
