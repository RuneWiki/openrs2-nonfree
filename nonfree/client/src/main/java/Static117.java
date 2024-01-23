import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!in", name = "c", descriptor = "Lclient!gg;")
	public static Class4_Sub2_Sub9 aClass4_Sub2_Sub9_2;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!in", name = "i", descriptor = "I")
	public static int anInt2591;

	@OriginalMember(owner = "client!in", name = "f", descriptor = "I")
	public static int anInt2589 = 0;

	@OriginalMember(owner = "client!in", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray20 = new String[100];

	@OriginalMember(owner = "client!in", name = "j", descriptor = "Z")
	public static boolean aBoolean172 = false;

	@OriginalMember(owner = "client!in", name = "k", descriptor = "I")
	public static int anInt2592 = 0;

	@OriginalMember(owner = "client!in", name = "o", descriptor = "I")
	public static int anInt2596 = 0;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!p;I)V")
	public static void method2004(@OriginalArg(0) Class4_Sub17 arg0) {
		@Pc(15) byte[] local15 = new byte[24];
		if (Static287.aClass137_3 != null) {
			try {
				Static287.aClass137_3.method3389(0L);
				@Pc(23) int local23 = 0;
				Static287.aClass137_3.method3395(local15);
				while (local23 < 24 && local15[local23] == 0) {
					local23++;
				}
				if (local23 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (@Pc(49) int local49 = 0; local49 < 24; local49++) {
					local15[local49] = -1;
				}
			}
		}
		arg0.method1878(24, local15);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "([BZ)V")
	public static void method2006(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class4_Sub17 local10 = new Class4_Sub17(arg0);
		local10.anInt2400 = arg0.length - 2;
		Static84.anInt1699 = local10.method1837();
		Static46.anIntArray120 = new int[Static84.anInt1699];
		Static274.aByteArrayArray20 = new byte[Static84.anInt1699][];
		Static262.anIntArray439 = new int[Static84.anInt1699];
		Static100.anIntArray223 = new int[Static84.anInt1699];
		Static296.aBooleanArray13 = new boolean[Static84.anInt1699];
		Static239.aByteArrayArray18 = new byte[Static84.anInt1699][];
		Static159.anIntArray285 = new int[Static84.anInt1699];
		local10.anInt2400 = arg0.length - Static84.anInt1699 * 8 - 7;
		Static15.anInt278 = local10.method1837();
		Static197.anInt3881 = local10.method1837();
		@Pc(70) int local70 = (local10.method1874() & 0xFF) + 1;
		@Pc(72) int local72;
		for (local72 = 0; local72 < Static84.anInt1699; local72++) {
			Static262.anIntArray439[local72] = local10.method1837();
		}
		for (local72 = 0; local72 < Static84.anInt1699; local72++) {
			Static100.anIntArray223[local72] = local10.method1837();
		}
		for (local72 = 0; local72 < Static84.anInt1699; local72++) {
			Static159.anIntArray285[local72] = local10.method1837();
		}
		for (local72 = 0; local72 < Static84.anInt1699; local72++) {
			Static46.anIntArray120[local72] = local10.method1837();
		}
		local10.anInt2400 = arg0.length + 3 - Static84.anInt1699 * 8 - local70 * 3 - 7;
		Static6.anIntArray14 = new int[local70];
		for (local72 = 1; local72 < local70; local72++) {
			Static6.anIntArray14[local72] = local10.method1835();
			if (Static6.anIntArray14[local72] == 0) {
				Static6.anIntArray14[local72] = 1;
			}
		}
		local10.anInt2400 = 0;
		for (local72 = 0; local72 < Static84.anInt1699; local72++) {
			@Pc(193) int local193 = Static159.anIntArray285[local72];
			@Pc(197) int local197 = Static46.anIntArray120[local72];
			@Pc(201) int local201 = local197 * local193;
			@Pc(204) byte[] local204 = new byte[local201];
			@Pc(206) boolean local206 = false;
			Static274.aByteArrayArray20[local72] = local204;
			@Pc(213) byte[] local213 = new byte[local201];
			Static239.aByteArrayArray18[local72] = local213;
			@Pc(221) int local221 = local10.method1874();
			@Pc(230) int local230;
			if ((local221 & 0x1) == 0) {
				for (local230 = 0; local230 < local201; local230++) {
					local204[local230] = local10.method1892();
				}
				if ((local221 & 0x2) != 0) {
					for (local230 = 0; local230 < local201; local230++) {
						@Pc(260) byte local260 = local213[local230] = local10.method1892();
						local206 |= local260 != -1;
					}
				}
			} else {
				local230 = 0;
				label97: while (true) {
					@Pc(282) int local282;
					if (local230 >= local193) {
						if ((local221 & 0x2) == 0) {
							break;
						}
						local230 = 0;
						while (true) {
							if (local230 >= local193) {
								break label97;
							}
							for (local282 = 0; local282 < local197; local282++) {
								@Pc(336) byte local336 = local213[local230 + local282 * local193] = local10.method1892();
								local206 |= local336 != -1;
							}
							local230++;
						}
					}
					for (local282 = 0; local282 < local197; local282++) {
						local204[local230 + local193 * local282] = local10.method1892();
					}
					local230++;
				}
			}
			Static296.aBooleanArray13[local72] = local206;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
	public static void method2008() {
		aStringArray19 = null;
		aClass4_Sub2_Sub9_2 = null;
		aStringArray20 = null;
	}
}
