import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!gca", name = "i", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_35 = new Class230(22, -1);

	@OriginalMember(owner = "client!gca", name = "j", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!gca", name = "p", descriptor = "I")
	public static int anInt3385 = 0;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!ufa;Lclient!pe;I)V")
	public static void method2975(@OriginalArg(0) Class326 arg0, @OriginalArg(1) Class254 arg1) {
		Static128.aClass254_100 = arg1;
		Static286.aString135 = "";
		Static535.aClass326_5 = arg0;
		if (Class229.aString77.startsWith("win")) {
			Static286.aString135 = Static286.aString135 + "windows/";
		} else if (Class229.aString77.startsWith("linux")) {
			Static286.aString135 = Static286.aString135 + "linux/";
		} else if (Class229.aString77.startsWith("mac")) {
			Static286.aString135 = Static286.aString135 + "macos/";
		}
		if (Static535.aClass326_5.aBoolean803) {
			Static286.aString135 = Static286.aString135 + "msjava/";
		} else if (Class229.aString76.startsWith("amd64") || Class229.aString76.startsWith("x86_64")) {
			Static286.aString135 = Static286.aString135 + "x86_64/";
		} else if (Class229.aString76.startsWith("i386") || Class229.aString76.startsWith("i486") || Class229.aString76.startsWith("i586") || Class229.aString76.startsWith("x86")) {
			Static286.aString135 = Static286.aString135 + "x86/";
		} else if (Class229.aString76.startsWith("ppc")) {
			Static286.aString135 = Static286.aString135 + "ppc/";
		} else {
			Static286.aString135 = Static286.aString135 + "universal/";
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)Lclient!fs;")
	public static Class109 method2976(@OriginalArg(1) int arg0) {
		@Pc(6) Class109[] local6 = Static244.method4291();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			@Pc(13) Class109 local13 = local6[local8];
			if (arg0 == local13.anInt3299) {
				return local13;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILjava/lang/String;Lclient!fd;)I")
	public static int method2978(@OriginalArg(1) String arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		@Pc(14) int local14 = arg1.anInt7869;
		@Pc(18) byte[] local18 = Static521.method7718(arg0);
		arg1.method6539(local18.length);
		arg1.anInt7869 += Static192.aClass197_3.method4991(local18, arg1.aByteArray86, local18.length, 0, arg1.anInt7869);
		return arg1.anInt7869 - local14;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIII)V")
	public static void method2981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static455.aClass3_Sub27_Sub1_1.anInt4793 * arg1 >> 8;
		if (arg2 == -1 && !Static353.aBoolean597) {
			Static54.method1306();
		} else if (arg2 != -1 && (arg2 != Static509.anInt9416 || !Static88.method2036()) && local6 != 0 && !Static353.aBoolean597) {
			Static119.method2383(arg0, arg2, local6, Static302.aClass254_86);
		}
		Static509.anInt9416 = arg2;
	}
}
