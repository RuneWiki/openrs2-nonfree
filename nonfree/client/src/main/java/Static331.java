import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "Lclient!nq;")
	public static Class144 aClass144_106;

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_112 = new Class117(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_113 = new Class117("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
	public static int anInt6366 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBLjava/util/Random;)I")
	public static int method5444(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static56.method844(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(45) int local45 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(48) int local48;
			do {
				local48 = arg1.nextInt();
			} while (local45 <= local48);
			return Static345.method5613(local48, arg0);
		}
	}
}
