import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "[I")
	public static final int[] anIntArray322 = new int[5];

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "()V")
	public static void method4968() {
		if (Static88.anInt1483 == 0 || Static453.aClass70_9 == null) {
			return;
		}
		Static44.aClass100_1.K(Static655.anIntArray610);
		for (@Pc(14) int local14 = 0; local14 < Static349.anIntArray335.length; local14++) {
			Static44.aClass100_1.method8621(-256, Static655.anIntArray610[3] - Static655.anIntArray610[1], Static349.anIntArray335[local14] + Static288.anIntArray296[local14], Static655.anIntArray610[1]);
		}
		for (@Pc(43) int local43 = 0; local43 < Static43.anInt712; local43++) {
			@Pc(48) Class250 local48 = Static5.aClass250Array181[local43];
			Static44.aClass100_1.H(local48.anIntArray376[0], local48.anIntArray377[0], local48.anIntArray375[0], Static65.anIntArray67);
			Static44.aClass100_1.H(local48.anIntArray376[1], local48.anIntArray377[1], local48.anIntArray375[1], Static467.anIntArray447);
			Static44.aClass100_1.H(local48.anIntArray376[2], local48.anIntArray377[2], local48.anIntArray375[2], Static597.anIntArray539);
			Static44.aClass100_1.H(local48.anIntArray376[3], local48.anIntArray377[3], local48.anIntArray375[3], Static314.anIntArray319);
			if (Static65.anIntArray67[2] != -1 && Static467.anIntArray447[2] != -1 && Static597.anIntArray539[2] != -1 && Static314.anIntArray319[2] != -1) {
				@Pc(136) int local136 = -65536;
				if (local48.aByte91 == 4) {
					local136 = -16776961;
				}
				Static44.aClass100_1.method8597(Static65.anIntArray67[0], Static467.anIntArray447[0], Static467.anIntArray447[1], local136, Static65.anIntArray67[1]);
				Static44.aClass100_1.method8597(Static467.anIntArray447[0], Static597.anIntArray539[0], Static597.anIntArray539[1], local136, Static467.anIntArray447[1]);
				Static44.aClass100_1.method8597(Static597.anIntArray539[0], Static314.anIntArray319[0], Static314.anIntArray319[1], local136, Static597.anIntArray539[1]);
				Static44.aClass100_1.method8597(Static314.anIntArray319[0], Static65.anIntArray67[0], Static65.anIntArray67[1], local136, Static314.anIntArray319[1]);
				Static44.aClass100_1.method8597(Static65.anIntArray67[0], Static597.anIntArray539[0], Static597.anIntArray539[1], local136, Static65.anIntArray67[1]);
			}
		}
		Static453.aClass70_9.method8433(10, -16777216, -256, "Dynamic: " + Static107.anInt1735 + "/" + 5000, 75);
		Static453.aClass70_9.method8433(10, -16777216, -256, "Total Opaque Onscreen: " + Static347.anInt5727 + "/" + 10000, 90);
		Static453.aClass70_9.method8433(10, -16777216, -256, "Total Trans Onscreen: " + Static574.anInt8994 + "/" + 5000, 105);
		Static453.aClass70_9.method8433(10, -16777216, -256, "Occluders: " + (Static115.anInt1870 + Static609.anInt7074) + " Active: " + Static43.anInt712, 120);
		Static453.aClass70_9.method8433(10, -16777216, -256, "Occluded: Ground:" + Static179.anInt3379 + " Walls: " + Static117.anInt1892 + " CPs: " + Static424.anInt6889 + " Pixels: " + Static547.anInt8693, 135);
		Static453.aClass70_9.method8433(10, -16777216, -256, "Occlude Calc Took: " + Static381.aLong189 / 1000L + "us", 150);
		if (Static88.anInt1483 != 2 || Static660.anIntArray613 == null) {
			return;
		}
		for (@Pc(389) int local389 = 0; local389 < Static660.anIntArray613.length; local389++) {
			@Pc(395) float local395 = (float) Static660.anIntArray613[local389];
			local395 /= 4194304.0F;
			if (local395 > 1.0F) {
				local395 = 1.0F;
			}
			local395 *= 255.0F;
			local395 = 255.0F - local395;
			@Pc(416) int local416 = (int) local395;
			Static660.anIntArray613[local389] = local416 | local416 << 8 | local416 << 16 | 0xFF000000;
		}
		@Pc(444) Class155 local444 = Static44.aClass100_1.method8645(Static504.anInt8078, Static504.anInt8078, Static660.anIntArray613, Static362.anInt9811);
		local444.method7205(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IBI)Z")
	public static boolean method4972(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static197.method3296(arg1, arg0) | Static186.method3178(arg1, arg0) | Static649.method8957(arg0, arg1)) & Static177.method3094(arg1, arg0);
	}
}
