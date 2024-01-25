import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "Z")
	public static boolean aBoolean231;

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_40 = new Class306("Loading shaders", "Lade shaders", "Chargement des nuanceurs", "Carregando sombreamento - ");

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)[B")
	public static byte[] method2922(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub14 local12 = (Class1_Sub1_Sub14) Static50.aClass201_2.method4927((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
				@Pc(47) int local47 = 255 - local40;
				@Pc(52) int local52 = Static220.method3801(local23, local47);
				@Pc(56) byte local56 = local17[local52];
				local17[local52] = local17[local47];
				local17[local47] = local17[511 - local40] = local56;
			}
			local12 = new Class1_Sub1_Sub14(local17);
			Static50.aClass201_2.method4925(local12, (long) arg0);
		}
		return local12.aByteArray95;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
	public static void method2924() {
		if (Static151.anInt2788 == 2) {
			Static17.anInt454 = 96;
			return;
		}
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("maxMemory");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Long local31 = (Long) local21.invoke(local25, (Object[]) null);
					Static17.anInt454 = (int) (local31 / 1048576L) + 1;
				} catch (@Pc(41) Throwable local41) {
				}
			}
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BIIII)V")
	public static void method2925(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static544.aClass1_Sub22_Sub1_1.anInt5444 != 0 && arg3 != 0 && Static482.anInt7992 < 50 && arg0 != -1) {
			Static527.aClass35Array1[Static482.anInt7992++] = new Class35((byte) 2, arg0, arg3, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V")
	public static void method2927(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static541.method7520(13, arg1);
		local8.method4946();
		local8.anInt5822 = arg0;
	}
}
