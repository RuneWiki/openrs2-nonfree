import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bea", name = "q", descriptor = "I")
	public static int anInt662;

	@OriginalMember(owner = "client!bea", name = "m", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!bea", name = "o", descriptor = "I")
	public static int anInt660 = 0;

	@OriginalMember(owner = "client!bea", name = "s", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_20 = new Class136(1, 3);

	@OriginalMember(owner = "client!bea", name = "v", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_21 = new Class136(99, 4);

	@OriginalMember(owner = "client!bea", name = "w", descriptor = "[Lclient!se;")
	public static final Class313[] aClass313Array1 = new Class313[16];

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IILclient!vfa;I)V")
	public static void method678(@OriginalArg(1) int arg0, @OriginalArg(2) Class357 arg1, @OriginalArg(3) int arg2) {
		if (Static202.aBoolean295) {
			@Pc(13) Class230 local13 = Static139.anInt2304 == -1 ? null : Static246.aClass258_1.method6202(Static139.anInt2304);
			if (Static74.method1225(arg1).method8725() && (Static42.anInt714 & 0x20) != 0 && (local13 == null || arg1.method8382(Static139.anInt2304, local13.anInt6315) != local13.anInt6315)) {
				Static227.method3576(true, (long) (arg1.anInt9804 | arg1.anInt9846 << 0), 0L, false, arg1.anInt9804, 25, false, arg1.anInt9871, Static497.anInt8481, Static111.aString29, Static485.aString115 + " -> " + arg1.aString138, arg1.anInt9846);
			}
		}
		@Pc(88) String local88;
		for (@Pc(81) int local81 = 9; local81 >= 5; local81--) {
			local88 = Static406.method6232(arg1, local81);
			if (local88 != null) {
				Static227.method3576(true, (long) (arg1.anInt9804 | arg1.anInt9846 << 0), (long) (local81 + 1), false, arg1.anInt9804, 1003, false, arg1.anInt9871, Static78.method1245(local81, arg1), local88, arg1.aString138, arg1.anInt9846);
			}
		}
		local88 = Static494.method7286(arg1);
		if (local88 != null) {
			Static227.method3576(true, (long) (arg1.anInt9846 << 0 | arg1.anInt9804), 0L, false, arg1.anInt9804, 17, false, arg1.anInt9871, arg1.anInt9835, local88, arg1.aString138, arg1.anInt9846);
		}
		for (@Pc(177) int local177 = 4; local177 >= 0; local177--) {
			@Pc(184) String local184 = Static406.method6232(arg1, local177);
			if (local184 != null) {
				Static227.method3576(true, (long) (arg1.anInt9846 << 0 | arg1.anInt9804), (long) (local177 + 1), false, arg1.anInt9804, 48, false, arg1.anInt9871, Static78.method1245(local177, arg1), local184, arg1.aString138, arg1.anInt9846);
			}
		}
		if (!Static74.method1225(arg1).method8729()) {
			return;
		}
		if (arg1.aString142 == null) {
			Static227.method3576(true, (long) (arg1.anInt9846 << 0 | arg1.anInt9804), 0L, false, arg1.anInt9804, 30, false, arg1.anInt9871, -1, Static76.aClass58_10.method1237(Static321.anInt5554), "", arg1.anInt9846);
		} else {
			Static227.method3576(true, (long) (arg1.anInt9804 | arg1.anInt9846 << 0), 0L, false, arg1.anInt9804, 30, false, arg1.anInt9871, -1, arg1.aString142, "", arg1.anInt9846);
		}
	}

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "(I)V")
	public static void method680() {
		Static92.aClass44Array17 = null;
		Static619.aClass44Array18 = null;
		Static184.aClass44Array8 = null;
		Static438.aClass44Array13 = null;
		Static405.aClass44Array10 = null;
		Static449.aClass44Array14 = null;
		Static110.aClass44Array6 = null;
		Static437.aClass6_11 = null;
		Static471.aClass6_12 = null;
		Static22.aClass44Array3 = null;
		Static619.aClass44Array19 = null;
		Static121.aClass44_6 = null;
		Static468.aClass44Array15 = null;
		Static288.aClass6_8 = null;
		Static426.aClass44Array12 = null;
		Static285.aClass44Array9 = null;
		Static61.aClass44Array5 = null;
		Static493.aClass44_21 = null;
	}
}
