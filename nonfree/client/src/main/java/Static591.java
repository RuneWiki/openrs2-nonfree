import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!tv", name = "u", descriptor = "F")
	public static float aFloat207;

	@OriginalMember(owner = "client!tv", name = "s", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_198 = new Class151(69, 0);

	@OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
	public static int anInt9102 = -1;

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(B)V")
	public static void method7777() {
		Static610.anInt9363 = 200;
		Static248.anInt4083 = (int) ((double) Static224.anInt3557 * 34.46D);
		Static248.anInt4083 <<= 0x2;
		if (Static582.aClass33_13.method8108()) {
			Static248.anInt4083 += 512;
		}
		Static679.method9005(false);
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V")
	public static void method7781() {
		Static305.method4281();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static263.aClass389Array1[local8].method8817();
		}
		Static67.method1453();
		Static424.method5891();
		Static20.method473();
		System.gc();
		Static582.aClass33_13.ya();
	}
}
