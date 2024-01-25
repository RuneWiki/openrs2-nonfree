import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "I")
	public static int anInt2241;

	@OriginalMember(owner = "client!eca", name = "m", descriptor = "J")
	public static long aLong76;

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "Lclient!gha;")
	public static final Class134 aClass134_1 = new Class134();

	@OriginalMember(owner = "client!eca", name = "f", descriptor = "Z")
	public static boolean aBoolean151 = true;

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "I")
	public static int anInt2243 = 0;

	@OriginalMember(owner = "client!eca", name = "h", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_44 = new Class216(1, 3);

	@OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
	public static final int anInt2248 = 1405;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IZ)V")
	public static void method2151(@OriginalArg(1) boolean arg0) {
		Static491.aClass92_8.method3865(Static340.aClass33_9.method8076());
		@Pc(10) int[] local10 = Static340.aClass33_9.Y();
		Static303.anInt4789 = local10[1];
		Static202.anInt3312 = local10[0];
		Static3.anInt3611 = local10[2];
		Static36.anInt794 = local10[3];
		if (arg0) {
			Static340.aClass33_9.DA(Static543.anInt8401, Static266.anInt4302, Static429.anInt6768, Static618.anInt9706);
			Static565.method7484(Static346.aDouble23);
		} else {
			Static340.aClass33_9.DA(Static650.anInt10259, Static636.anInt9898, Static82.anInt8417, Static357.anInt5419);
			Static565.method7484(Static251.aDouble11);
		}
	}
}
