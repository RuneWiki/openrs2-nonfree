import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static364 {

	@OriginalMember(owner = "client!nba", name = "w", descriptor = "Lclient!vd;")
	public static Class353 aClass353_60;

	@OriginalMember(owner = "client!nba", name = "t", descriptor = "Lclient!ada;")
	public static final Class8 aClass8_36 = new Class8();

	@OriginalMember(owner = "client!nba", name = "v", descriptor = "I")
	public static int anInt6726 = 0;

	@OriginalMember(owner = "client!nba", name = "x", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_120 = new Class268(5, 4);

	@OriginalMember(owner = "client!nba", name = "C", descriptor = "Lclient!ef;")
	public static final Class77 aClass77_3 = new Class77();

	@OriginalMember(owner = "client!nba", name = "D", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIIII)V")
	public static void method5768(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static347.anInt6542 <= arg2 && arg1 <= Static553.anInt9425 && Static100.anInt10042 <= arg0 && Static567.anInt9578 >= arg3) {
			Static474.method7153(arg1, arg0, arg3, arg4, arg2);
		} else {
			Static586.method8243(arg0, arg2, arg3, arg4, arg1);
		}
	}
}
