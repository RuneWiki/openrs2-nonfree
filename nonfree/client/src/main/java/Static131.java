import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
	public static int[] anIntArray367;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "[I")
	public static int[] anIntArray368;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	public static int anInt2854;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!eh;")
	public static Class27 aClass27_74 = new Class27(5);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!o;)V")
	public static void method2193(@OriginalArg(1) Class73_Sub1 arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static186.anIntArray517.length; local15++) {
			Static186.anIntArray517[local15] = 0;
		}
		@Pc(38) int local38;
		for (@Pc(28) int local28 = 0; local28 < 5000; local28++) {
			local38 = (int) (Math.random() * 128.0D * (double) 256);
			Static186.anIntArray517[local38] = (int) (Math.random() * 256.0D);
		}
		@Pc(57) int local57;
		@Pc(61) int local61;
		@Pc(69) int local69;
		for (local38 = 0; local38 < 20; local38++) {
			for (local57 = 1; local57 < 255; local57++) {
				for (local61 = 1; local61 < 127; local61++) {
					local69 = (local57 << 7) + local61;
					Static186.anIntArray518[local69] = (Static186.anIntArray517[local69 - 128] + Static186.anIntArray517[local69 - 1] + Static186.anIntArray517[local69 + 1] + Static186.anIntArray517[local69 + 128]) / 4;
				}
			}
			@Pc(112) int[] local112 = Static186.anIntArray517;
			Static186.anIntArray517 = Static186.anIntArray518;
			Static186.anIntArray518 = local112;
		}
		if (arg0 == null) {
			return;
		}
		local57 = 0;
		for (local61 = 0; local61 < arg0.anInt2956; local61++) {
			for (local69 = 0; local69 < arg0.anInt2959; local69++) {
				if (arg0.aByteArray39[local57++] != 0) {
					@Pc(148) int local148 = local69 + arg0.anInt2962 + 16;
					@Pc(155) int local155 = arg0.anInt2960 + local61 + 16;
					@Pc(162) int local162 = local148 + (local155 << 7);
					Static186.anIntArray517[local162] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method2194(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static53.method1020(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static136.aClass65_5.anApplet1 != null) {
				@Pc(101) Class36 local101 = Static136.aClass65_5.method2012(new URL(Static136.aClass65_5.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static49.anInt1242 + "&u=" + Static197.aLong133 + "&v1=" + Static119.aString2 + "&v2=" + Static119.aString3 + "&e=" + local7));
				while (local101.anInt1500 == 0) {
					Static146.method2494(1L);
				}
				if (local101.anInt1500 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local101.anObject2;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BD)V")
	public static void method2196(@OriginalArg(1) double arg0) {
		if (Static208.aDouble11 == arg0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(28) int local28 = (int) (Math.pow((double) local16 / 255.0D, arg0) * 255.0D);
			Static111.anIntArray320[local16] = local28 > 255 ? 255 : local28;
		}
		Static208.aDouble11 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIILclient!ah;)V")
	public static void method2197(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2) {
		if (Static178.anInt3828 != 0 && Static178.anInt3828 != 3) {
			return;
		}
		@Pc(18) int local18 = arg0 - arg2.anInt251 / 2;
		@Pc(25) int local25 = arg1 - arg2.anInt221 / 2;
		@Pc(31) int local31 = Static12.anInt352 + Static31.anInt799 & 0x7FF;
		@Pc(35) int local35 = Class46.anIntArray226[local31];
		@Pc(39) int local39 = Class46.anIntArray225[local31];
		@Pc(47) int local47 = (Static154.anInt3449 + 256) * local39 >> 8;
		@Pc(55) int local55 = local35 * (Static154.anInt3449 + 256) >> 8;
		@Pc(65) int local65 = local25 * local47 - local18 * local55 >> 11;
		@Pc(73) int local73 = Static84.aClass9_Sub4_Sub1_2.anInt3903 - local65 >> 7;
		@Pc(84) int local84 = local25 * local55 + local47 * local18 >> 11;
		@Pc(92) int local92 = Static84.aClass9_Sub4_Sub1_2.anInt3925 + local84 >> 7;
		@Pc(112) boolean local112 = Static149.method2551(local73, 1, 0, true, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 0, local92, 0, 0);
		if (!local112) {
			return;
		}
		Static96.aClass1_Sub9_Sub1_3.method899(local18);
		Static96.aClass1_Sub9_Sub1_3.method899(local25);
		Static96.aClass1_Sub9_Sub1_3.method890(Static31.anInt799);
		Static96.aClass1_Sub9_Sub1_3.method899(57);
		Static96.aClass1_Sub9_Sub1_3.method899(Static12.anInt352);
		Static96.aClass1_Sub9_Sub1_3.method899(Static154.anInt3449);
		Static96.aClass1_Sub9_Sub1_3.method899(89);
		Static96.aClass1_Sub9_Sub1_3.method890(Static84.aClass9_Sub4_Sub1_2.anInt3925);
		Static96.aClass1_Sub9_Sub1_3.method890(Static84.aClass9_Sub4_Sub1_2.anInt3903);
		Static96.aClass1_Sub9_Sub1_3.method899(Static193.anInt4130);
		Static96.aClass1_Sub9_Sub1_3.method899(63);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!ah;)Lclient!ah;")
	public static Class6 method2198(@OriginalArg(1) Class6 arg0) {
		if (arg0.anInt204 != -1) {
			return Static107.method1857(arg0.anInt204);
		}
		@Pc(20) int local20 = arg0.anInt229 >>> 16;
		for (@Pc(30) Class1_Sub11 local30 = (Class1_Sub11) Static10.aClass33_1.method1067(); local30 != null; local30 = (Class1_Sub11) Static10.aClass33_1.method1070()) {
			if (local20 == local30.anInt1626) {
				return Static107.method1857((int) local30.aLong150);
			}
		}
		return null;
	}
}
