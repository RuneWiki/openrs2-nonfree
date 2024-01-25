import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_201 = new Class189("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
	public static int anInt6184 = -1;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "[I")
	public static final int[] anIntArray399 = new int[4096];

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!qa;JI)V")
	public static void method4824(@OriginalArg(0) Class172 arg0, @OriginalArg(1) long arg1) {
		Static432.anInt7226 = Static434.anInt7261;
		Static161.anInt3312 = 0;
		Static434.anInt7261 = 0;
		@Pc(14) long local14 = Static118.method1934();
		for (@Pc(19) Class6_Sub8 local19 = (Class6_Sub8) Static245.aClass138_4.method3311(); local19 != null; local19 = (Class6_Sub8) Static245.aClass138_4.method3312()) {
			if (local19.method5924(arg0, arg1)) {
				Static161.anInt3312++;
			}
		}
		if (Static6.aBoolean4 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static245.aClass138_4.method3306() + ", running: " + Static161.anInt3312 + ". Particles: " + Static434.anInt7261 + ". Time taken: " + (Static118.method1934() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)[Lclient!gr;")
	public static Class95[] method4826() {
		return new Class95[] { Static353.aClass95_13, Static229.aClass95_9, Static117.aClass95_6, Static43.aClass95_3, Static68.aClass95_4, Static270.aClass95_10, Static141.aClass95_7, Static27.aClass95_5, Static416.aClass95_15, Static314.aClass95_12, Static396.aClass95_14, Static156.aClass95_8, Static444.aClass95_16, Static19.aClass95_1, Static305.aClass95_11 };
	}
}
