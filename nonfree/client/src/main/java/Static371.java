import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "Lclient!li;")
	public static Class142 aClass142_1;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "Lclient!du;")
	public static final Class56 aClass56_7 = new Class56();

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
	public static int anInt6500 = 0;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "Z")
	public static boolean aBoolean486 = false;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "Lclient!lm;")
	public static final Class144 aClass144_11 = new Class144("", 13);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!dq;)V")
	public static void method5581(@OriginalArg(1) Class53 arg0) {
		Static146.anInt2670 = 3;
		Static276.method4295(true);
		Static194.aBoolean254 = true;
		Static265.aBoolean343 = true;
		Static264.aBoolean341 = true;
		Static107.anInt2129 = 127;
		Static116.aBoolean177 = true;
		Static193.anInt6666 = 255;
		Static80.aBoolean128 = true;
		Static123.anInt2360 = 0;
		Static193.anInt6663 = 2;
		Static364.aBoolean378 = true;
		Static11.anInt3910 = 0;
		Static34.anInt734 = 0;
		Static136.aBoolean194 = true;
		Static364.aBoolean379 = true;
		Static16.anInt400 = 127;
		Static158.aBoolean211 = true;
		Static37.aBoolean52 = true;
		Static1.anInt41 = 0;
		Static235.anInt4315 = 1;
		if (Static314.anInt5576 >= 96) {
			Static346.method5275(2);
		} else {
			Static346.method5275(0);
		}
		Static117.aBoolean178 = false;
		Static223.aBoolean308 = false;
		Static37.anInt767 = 0;
		Static265.aBoolean344 = true;
		Static244.anInt1013 = Static78.anInt1502 == 1 ? 2 : 4;
		Static180.aBoolean232 = true;
		Static193.anInt6668 = 2;
		Static365.anInt2296 = 2;
		Static301.anInt5429 = 0;
		Static168.aBoolean222 = false;
		@Pc(90) Class202 local90 = null;
		try {
			@Pc(94) Class1 local94 = arg0.method1170();
			while (local94.anInt2 == 0) {
				Static185.method3004(1L);
			}
			if (local94.anInt2 == 1) {
				local90 = (Class202) local94.anObject1;
				@Pc(123) byte[] local123 = new byte[(int) local90.method4941()];
				@Pc(137) int local137;
				for (@Pc(125) int local125 = 0; local125 < local123.length; local125 += local137) {
					local137 = local90.method4942(local123.length - local125, local125, local123);
					if (local137 == -1) {
						throw new IOException("EOF");
					}
				}
				Static30.method727(new Class2_Sub13(local123));
			}
		} catch (@Pc(161) Exception local161) {
		}
		try {
			if (local90 != null) {
				local90.method4940();
			}
		} catch (@Pc(168) Exception local168) {
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)V")
	public static void method5582(@OriginalArg(1) byte arg0) {
		if (Static75.aByteArrayArrayArray5 == null) {
			Static75.aByteArrayArrayArray5 = new byte[4][Static392.anInt6751][Static307.anInt5484];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static392.anInt6751; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static307.anInt5484; local27++) {
					Static75.aByteArrayArrayArray5[local19][local23][local27] = arg0;
				}
			}
		}
	}
}
