import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!taa", name = "m", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_161 = new Class56(31, 12);

	@OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
	public static int anInt8114 = 0;

	@OriginalMember(owner = "client!taa", name = "s", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)Lclient!wo;")
	public static Class276 method6738() {
		try {
			return (Class276) Class.forName("Class276_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V")
	public static void method6739() {
		if (Static407.anInt7011 == 6) {
			Static407.anInt7011 = 7;
		}
	}

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "(III)V")
	public static void method6745(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub7_Sub18 local16 = Static543.method7218(14, arg1);
		local16.method7326();
		local16.anInt8802 = arg0;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method6746(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Static194.method3271();
		Static351.method5158();
		Static449.method6249();
		Static5.method78(arg1, arg0);
		Static273.method4140();
		Static154.method2918(Static505.aClass45_11);
		Static3.method5705(Static505.aClass45_11);
		Static476.method6555(Static552.aClass322_150, Static505.aClass45_11);
		Static123.method2518();
		Static405.method5859(Static494.aClass14Array14);
		Static238.method3668();
		Static563.method7599();
		if (Static32.anInt602 == 3) {
			Static25.method439(4);
		} else if (Static32.anInt602 == 7) {
			Static25.method439(8);
		} else if (Static32.anInt602 == 10) {
			Static25.method439(11);
		} else if (Static32.anInt602 == 1 || Static32.anInt602 == 2) {
			Static333.method4749();
		}
	}

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "(I)V")
	public static void method6747() {
		Static12.aClass6_57.method102();
	}
}
