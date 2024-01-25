import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "[Lclient!ri;")
	public static final Class177[] aClass177Array1 = new Class177[4];

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ne;I)V")
	public static void method5660(@OriginalArg(0) Class139 arg0) {
		Static192.anInt3806 = 3;
		Static187.method3351(true);
		Static263.anInt5208 = 127;
		Static157.aBoolean233 = true;
		Static178.aBoolean274 = true;
		Static352.aBoolean585 = true;
		Static95.anInt1828 = 2;
		Static306.aBoolean497 = true;
		Static136.anInt2582 = 1;
		Static124.anInt2371 = 0;
		Static230.aBoolean379 = true;
		Static248.aBoolean414 = true;
		Static215.aBoolean349 = true;
		Static211.anInt4178 = 0;
		Static278.anInt5486 = 0;
		Static44.anInt747 = 0;
		Static323.aBoolean522 = true;
		Static34.aBoolean42 = true;
		Static349.anInt6699 = 255;
		Static226.anInt4453 = 127;
		Static280.aBoolean452 = true;
		if (Static345.anInt6645 < 96) {
			Static229.method4132(0);
		} else {
			Static229.method4132(2);
		}
		Static344.anInt6622 = Static26.anInt514 == 1 ? 2 : 4;
		Static131.aBoolean194 = false;
		Static223.anInt4410 = 2;
		Static254.anInt5030 = 2;
		Static161.anInt3186 = 0;
		Static209.aBoolean344 = false;
		Static326.aBoolean530 = true;
		Static118.aBoolean168 = false;
		Static208.anInt4114 = 0;
		Static351.aBoolean584 = true;
		@Pc(90) Class92 local90 = null;
		try {
			@Pc(94) Class16 local94 = arg0.method3868();
			while (local94.anInt381 == 0) {
				Static20.method408(1L);
			}
			if (local94.anInt381 == 1) {
				local90 = (Class92) local94.anObject1;
				@Pc(118) byte[] local118 = new byte[(int) local90.method2382()];
				@Pc(132) int local132;
				for (@Pc(120) int local120 = 0; local120 < local118.length; local120 += local132) {
					local132 = local90.method2384(local118, local120, local118.length - local120);
					if (local132 == -1) {
						throw new IOException("EOF");
					}
				}
				Static309.method5418(new Class5_Sub12(local118));
			}
		} catch (@Pc(156) Exception local156) {
		}
		try {
			if (local90 != null) {
				local90.method2387();
			}
		} catch (@Pc(163) Exception local163) {
		}
	}
}
