import java.util.Random;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
	public static int anInt9531 = 1;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
	public static void method8061() {
		@Pc(5) Class279 local5 = Static104.aClass279_10;
		synchronized (Static104.aClass279_10) {
			Static104.aClass279_10.method6638();
		}
		local5 = Static488.aClass279_44;
		synchronized (Static488.aClass279_44) {
			Static488.aClass279_44.method6638();
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)[I")
	public static int[] method8063() {
		return new int[] { Static72.anInt1666, Static397.anInt6848, Static496.anInt8329 };
	}
}
