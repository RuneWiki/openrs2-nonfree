import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
	public static int anInt5346 = 0;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	public static int anInt5348 = 128;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
	public static int anInt5349 = -1;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
	public static int anInt5350 = 0;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
	public static int anInt5352 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!we;I)V")
	public static void method4233(@OriginalArg(0) Class184 arg0) {
		Static248.anInt4872 = 3;
		Static70.method1195(true);
		Static127.aBoolean163 = true;
		Static85.aBoolean102 = true;
		Static121.anInt2458 = 0;
		Static192.anInt815 = 127;
		Static70.aBoolean83 = true;
		Static159.aBoolean209 = true;
		Static114.aBoolean143 = true;
		Static265.anInt5214 = 127;
		Static154.anInt3207 = 2;
		Static208.aBoolean248 = true;
		Static253.aBoolean335 = true;
		Static174.anInt3538 = 0;
		Static104.anInt2103 = 0;
		Static226.aBoolean286 = true;
		Static279.anInt5471 = 255;
		Static188.anInt5754 = 0;
		Static50.aBoolean66 = true;
		@Pc(46) Class68 local46 = null;
		Static59.aBoolean75 = true;
		Static304.aBoolean404 = true;
		if (Static160.anInt3283 < 96) {
			Static117.method1978(0);
		} else {
			Static117.method1978(2);
		}
		Static115.aBoolean148 = false;
		Static228.anInt4580 = 0;
		Static106.aBoolean121 = true;
		Static102.anInt2018 = 0;
		Static209.aBoolean250 = false;
		Static74.aBoolean87 = false;
		Static230.anInt4613 = 0;
		try {
			@Pc(85) Class119 local85 = arg0.method4605("runescape");
			while (local85.anInt3695 == 0) {
				Static193.method3169(1L);
			}
			if (local85.anInt3695 == 1) {
				local46 = (Class68) local85.anObject4;
				@Pc(110) byte[] local110 = new byte[(int) local46.method1821()];
				@Pc(126) int local126;
				for (@Pc(112) int local112 = 0; local112 < local110.length; local112 += local126) {
					local126 = local46.method1820(local112, local110, local110.length - local112);
					if (local126 == -1) {
						throw new IOException("EOF");
					}
				}
				Static185.method2976(new Class4_Sub24(local110));
			}
		} catch (@Pc(148) Exception local148) {
		}
		try {
			if (local46 != null) {
				local46.method1824();
			}
		} catch (@Pc(157) Exception local157) {
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method4234() {
		Static228.aClass4_Sub6_Sub2_2.method852();
		Static55.anInt1252 = 1;
		Static127.aClass22_43 = null;
	}
}
