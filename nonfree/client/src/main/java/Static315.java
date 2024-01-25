import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!pr", name = "o", descriptor = "Lclient!lt;")
	public static Class158 aClass158_56;

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "Lclient!qi;")
	public static final Class207 aClass207_5 = new Class207("LOCAL", 4);

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "[Lclient!fn;")
	public static final Class83[] aClass83Array3 = new Class83[14];

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "Z")
	public static boolean aBoolean274 = false;

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[200];

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(JBLclient!qq;)V")
	public static void method3815(@OriginalArg(0) long arg0, @OriginalArg(2) Class28 arg1) {
		Static173.anInt3049 = Static378.anInt7203;
		Static383.anInt6309 = 0;
		Static378.anInt7203 = 0;
		@Pc(14) long local14 = Static154.method2527();
		for (@Pc(25) Class48_Sub1 local25 = (Class48_Sub1) Static62.aClass128_2.method2831(); local25 != null; local25 = (Class48_Sub1) Static62.aClass128_2.method2832()) {
			if (local25.method1287(arg1, arg0)) {
				Static383.anInt6309++;
			}
		}
		if (Static202.aBoolean237 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static62.aClass128_2.method2828() + ", running: " + Static383.anInt6309 + ". Particles: " + Static378.anInt7203 + ". Time taken: " + (Static154.method2527() - local14) + "ms");
		}
	}
}
