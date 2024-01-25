import java.awt.Component;
import java.lang.reflect.Constructor;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
	public static int anInt6392 = -1;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZ)[B")
	public static byte[] method5334(@OriginalArg(0) int arg0) {
		@Pc(15) Class5_Sub3_Sub1 local15 = (Class5_Sub3_Sub1) Static202.aClass97_3.method2405((long) arg0);
		if (local15 == null) {
			@Pc(20) byte[] local20 = new byte[512];
			@Pc(26) Random local26 = new Random((long) arg0);
			for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
				local20[local28] = (byte) local28;
			}
			for (@Pc(42) int local42 = 0; local42 < 255; local42++) {
				@Pc(48) int local48 = 255 - local42;
				@Pc(53) int local53 = Static508.method7270(local48, local26);
				@Pc(57) byte local57 = local20[local53];
				local20[local53] = local20[local48];
				local20[local48] = local20[511 - local42] = local57;
			}
			local15 = new Class5_Sub3_Sub1(local20);
			Static202.aClass97_3.method2400(local15, (long) arg0);
		}
		return local15.aByteArray1;
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(B)V")
	public static void method5336() {
		Static156.aClass300_14.method7189();
		Static174.aClass358_5.method8327();
		Static126.aClass358_3.method8327();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method5337(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = arg0.length();
		if (local11 == 0) {
			return new byte[0];
		}
		@Pc(22) int local22 = local11 + 3 & 0xFFFFFFFC;
		@Pc(28) int local28 = local22 / 4 * 3;
		if (local22 - 2 >= local11 || Static631.method8510(arg0.charAt(local22 - 2)) == -1) {
			local28 -= 2;
		} else if (local22 - 1 >= local11 || Static631.method8510(arg0.charAt(local22 - 1)) == -1) {
			local28--;
		}
		@Pc(62) byte[] local62 = new byte[local28];
		Static173.method2974(arg0, 0, local62);
		return local62;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZLjava/awt/Component;Z)Lclient!tb;")
	public static Class11 method5338(@OriginalArg(1) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class11_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class11) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class11_Sub1(arg0, true);
		}
	}
}
