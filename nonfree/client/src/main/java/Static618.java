import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "[[[Lclient!qj;")
	public static Class311[][][] aClass311ArrayArrayArray2;

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_187 = new Class225(23, 3);

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method8398(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			@Pc(27) char local27 = arg0.charAt(local19);
			if (local27 == '<' || local27 == '>') {
				local17 += 3;
			}
		}
		@Pc(54) StringBuffer local54 = new StringBuffer(local15 + local17);
		for (@Pc(58) int local58 = 0; local58 < local15; local58++) {
			@Pc(66) char local66 = arg0.charAt(local58);
			if (local66 == '<') {
				local54.append("<lt>");
			} else if (local66 == '>') {
				local54.append("<gt>");
			} else {
				local54.append(local66);
			}
		}
		return local54.toString();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIB)V")
	public static void method8400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class2_Sub33 local13 = Static592.method8154(Static4.aClass349_1, Static487.aClass221_2.aClass48_1);
		local13.aClass2_Sub20_Sub2_1.method8556(arg0);
		local13.aClass2_Sub20_Sub2_1.method8572(arg1);
		Static487.aClass221_2.method5173(local13);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BILjava/lang/String;)Lclient!md;")
	public static Class63 method8401(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(10) Class63 local10;
		try {
			local10 = (Class63) Class.forName("cj").getDeclaredConstructor().newInstance();
		} catch (@Pc(12) Throwable local12) {
			local10 = new Class63_Sub2();
		}
		local10.anInt9464 = arg0;
		local10.aString105 = arg1;
		return local10;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)V")
	public static void method8402(@OriginalArg(0) int arg0) {
		if (Static311.anInt4777 == arg0) {
			return;
		}
		Static426.anInt6942 = Static280.anInt6752 = Static617.anIntArray691[arg0];
		Static138.method2005();
		Static506.anIntArrayArray50 = new int[Static426.anInt6942][Static280.anInt6752];
		Static675.anIntArrayArrayArray26 = new int[4][Static426.anInt6942 >> 3][Static280.anInt6752 >> 3];
		Static648.anIntArrayArray62 = new int[Static426.anInt6942][Static280.anInt6752];
		for (@Pc(41) int local41 = 0; local41 < 4; local41++) {
			Static626.aClass226Array1[local41] = Static687.method9260(Static426.anInt6942, Static280.anInt6752);
		}
		Static481.aByteArrayArrayArray17 = new byte[4][Static426.anInt6942][Static280.anInt6752];
		Static683.method9209(Static426.anInt6942, Static280.anInt6752);
		Static660.method9035(Static396.aClass145_6, Static426.anInt6942 >> 3, Static280.anInt6752 >> 3);
		Static311.anInt4777 = arg0;
	}
}
