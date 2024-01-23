import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
	public static int[] anIntArray515;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray21 = new boolean[200];

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
	public static int anInt4954 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLclient!kb;II)[Lclient!fj;")
	public static Class7[] method3927(@OriginalArg(1) Class83 arg0, @OriginalArg(3) int arg1) {
		return Static19.method387(arg1, 0, arg0) ? Static254.method4238() : null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/awt/Component;IILclient!gn;)Lclient!bi;")
	public static Class9 method3929(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class66 arg3) {
		if (Static43.anInt1255 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(39) Class9 local39 = (Class9) Class.forName("Class9_Sub2").getDeclaredConstructor().newInstance();
			local39.anInt5583 = arg0;
			local39.anIntArray562 = new int[(Static199.aBoolean240 ? 2 : 1) * 256];
			local39.method4344(arg1);
			local39.anInt5582 = (-1024 & arg0) + 1024;
			if (local39.anInt5582 > 16384) {
				local39.anInt5582 = 16384;
			}
			local39.method4343(local39.anInt5582);
			if (Static246.anInt5380 > 0 && Static224.aClass60_1 == null) {
				Static224.aClass60_1 = new Class60();
				Static224.aClass60_1.aClass66_4 = arg3;
				arg3.method1615(Static246.anInt5380, Static224.aClass60_1);
			}
			if (Static224.aClass60_1 != null) {
				if (Static224.aClass60_1.aClass9Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static224.aClass60_1.aClass9Array1[arg2] = local39;
			}
			return local39;
		} catch (@Pc(116) Throwable local116) {
			try {
				@Pc(122) Class9_Sub1 local122 = new Class9_Sub1(arg3, arg2);
				local122.anIntArray562 = new int[(Static199.aBoolean240 ? 2 : 1) * 256];
				local122.anInt5583 = arg0;
				local122.method4344(arg1);
				local122.anInt5582 = 16384;
				local122.method4343(local122.anInt5582);
				if (Static246.anInt5380 > 0 && Static224.aClass60_1 == null) {
					Static224.aClass60_1 = new Class60();
					Static224.aClass60_1.aClass66_4 = arg3;
					arg3.method1615(Static246.anInt5380, Static224.aClass60_1);
				}
				if (Static224.aClass60_1 != null) {
					if (Static224.aClass60_1.aClass9Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static224.aClass60_1.aClass9Array1[arg2] = local122;
				}
				return local122;
			} catch (@Pc(193) Throwable local193) {
				return new Class9();
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public static void method3930() {
		if (Static102.aBoolean119) {
			return;
		}
		if (Static205.aBoolean243) {
			Static25.aFloat19 = (int) Static25.aFloat19 + 47 & 0xFFFFFFF0;
		} else {
			Static18.aFloat18 += (12.0F - Static18.aFloat18) / 2.0F;
		}
		Static37.aBoolean69 = true;
		Static102.aBoolean119 = true;
	}
}
