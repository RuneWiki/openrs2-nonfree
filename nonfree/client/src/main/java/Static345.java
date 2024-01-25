import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "Lclient!fr;")
	public static final Class90 aClass90_16 = new Class90(2);

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "Z")
	public static boolean aBoolean338 = false;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_76 = new Class256("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
	public static final int anInt4167 = 1338;

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_99 = new Class81(95, 3);

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_53 = new Class44(9, -1);

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "([[BILclient!cd;)V")
	public static void method3346(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class33_Sub1 arg1) {
		@Pc(8) int local8 = Static287.aByteArrayArray16.length;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(21) byte[] local21 = arg0[local15];
			if (local21 != null) {
				@Pc(34) int local34 = (Static96.anIntArray119[local15] >> 8) * 64 - Static173.anInt3340;
				@Pc(45) int local45 = (Static96.anIntArray119[local15] & 0xFF) * 64 - Static379.anInt6721;
				Static438.method5925();
				arg1.method925(local34, Static332.aClass37Array1, local21, local45, Static387.aClass26_9);
			}
		}
	}
}
