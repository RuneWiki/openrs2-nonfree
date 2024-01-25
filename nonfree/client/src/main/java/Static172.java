import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!gba", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString32 = null;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!ha;II)V")
	public static void method2458(@OriginalArg(0) Class132 arg0, @OriginalArg(2) int arg1) {
		if (!Static267.aBoolean292 || !Static322.aBoolean345) {
			Static485.anInt8287 = 0;
			return;
		}
		if (Static159.aBoolean166) {
			Static599.aLong288 = Static623.aClass13_1.method9172();
		}
		Static164.anInt10678 = 0;
		Static70.anInt1336 = 0;
		Static428.anInt7351 = 0;
		@Pc(27) int[] local27 = arg0.Y();
		Static153.anInt2553 = (int) ((float) local27[2] / 3.0F);
		Static399.anInt6714 = (int) ((float) local27[3] / 3.0F);
		arg0.method7451(Static674.anIntArray652);
		if ((int) ((float) Static674.anIntArray652[0] / 3.0F) != Static312.anInt8379 || (int) ((float) Static674.anIntArray652[1] / 3.0F) != Static522.anInt8677) {
			Static312.anInt8379 = (int) ((float) Static674.anIntArray652[0] / 3.0F);
			Static522.anInt8677 = (int) ((float) Static674.anIntArray652[1] / 3.0F);
			Static492.anInt6134 = Static522.anInt8677 >> 1;
			Static115.anIntArray125 = new int[Static522.anInt8677 * Static312.anInt8379];
			Static613.anInt10037 = Static312.anInt8379 >> 1;
		}
		Static7.aClass207_1 = arg0.method7496();
		Static485.anInt8287 = 0;
		for (@Pc(104) int local104 = 0; local104 < Static33.anInt812; local104++) {
			Static633.method8703(arg0, Static527.aClass379Array3[local104], arg1);
		}
		for (@Pc(123) int local123 = 0; local123 < Static288.anInt4888; local123++) {
			Static633.method8703(arg0, Static642.aClass379Array4[local123], arg1);
		}
		for (@Pc(142) int local142 = 0; local142 < Static242.anInt4294; local142++) {
			Static633.method8703(arg0, Static414.aClass379Array2[local142], arg1);
		}
		Static339.anInt5857 = 0;
		if (Static485.anInt8287 > 0) {
			@Pc(169) int local169 = Static115.anIntArray125.length;
			@Pc(175) int local175 = local169 - local169 & 0x7;
			@Pc(177) int local177 = 0;
			while (local177 < local175) {
				Static115.anIntArray125[local177++] = Integer.MAX_VALUE;
				Static115.anIntArray125[local177++] = Integer.MAX_VALUE;
				Static115.anIntArray125[local177++] = Integer.MAX_VALUE;
				Static115.anIntArray125[local177++] = Integer.MAX_VALUE;
				Static115.anIntArray125[local177++] = Integer.MAX_VALUE;
				Static115.anIntArray125[local177++] = Integer.MAX_VALUE;
				Static115.anIntArray125[local177++] = Integer.MAX_VALUE;
				Static115.anIntArray125[local177++] = Integer.MAX_VALUE;
			}
			while (local169 > local177) {
				Static115.anIntArray125[local177++] = Integer.MAX_VALUE;
			}
			Static383.anInt6430 = 1;
			for (@Pc(244) int local244 = 0; local244 < Static485.anInt8287; local244++) {
				@Pc(250) Class379 local250 = Static121.aClass379Array1[local244];
				Static279.method4089(local250.aShortArray157[1], local250.aShortArray159[0], local250.aShortArray157[3], local250.aShortArray159[1], local250.aShortArray158[0], local250.aShortArray157[0], local250.aShortArray158[1], local250.aShortArray159[3], local250.aShortArray158[3]);
				Static279.method4089(local250.aShortArray157[2], local250.aShortArray159[1], local250.aShortArray157[3], local250.aShortArray159[2], local250.aShortArray158[1], local250.aShortArray157[1], local250.aShortArray158[2], local250.aShortArray159[3], local250.aShortArray158[3]);
			}
			Static383.anInt6430 = 2;
		}
		if (Static159.aBoolean166) {
			Static676.aLong312 = Static623.aClass13_1.method9172() - Static599.aLong288;
		}
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(Z)V")
	public static void method2461() {
		Static131.aClass9_14 = null;
		Static256.aClass9_23 = null;
		Static474.aClass9_30 = null;
		Static174.aClass9_21 = null;
		Static308.aClass9_25 = null;
		Static149.aClass9_16 = null;
		Static154.aClass9_17 = null;
		Static22.aClass9_2 = null;
		Static24.aClass9Array7 = null;
	}
}
