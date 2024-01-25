import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "Lclient!kr;")
	public static Class46 aClass46_14;

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
	public static int anInt4077;

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_120 = new Class157(40, 3);

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
	public static int anInt4075 = 0;

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "[I")
	public static final int[] anIntArray309 = new int[100];

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)V")
	public static void method3490() {
		Static300.method5057(Static308.aClass157_192);
		for (@Pc(23) Class2_Sub40 local23 = (Class2_Sub40) Static303.aClass41_32.method896(); local23 != null; local23 = (Class2_Sub40) Static303.aClass41_32.method904()) {
			if (!local23.method5722()) {
				local23 = (Class2_Sub40) Static303.aClass41_32.method896();
				if (local23 == null) {
					break;
				}
			}
			if (local23.anInt6090 == 0) {
				Static357.method5709(true, true, local23);
			}
		}
		if (Static91.aClass68_12 != null) {
			Static114.method2241(Static91.aClass68_12);
			Static91.aClass68_12 = null;
		}
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
	public static void method3491() {
		@Pc(7) Class209 local7 = null;
		try {
			@Pc(16) Class26 local16 = Static62.aClass179_2.method4890();
			while (local16.anInt484 == 0) {
				Static248.method4401(1L);
			}
			if (local16.anInt484 == 1) {
				local7 = (Class209) local16.anObject1;
				@Pc(40) byte[] local40 = new byte[(int) local7.method5629()];
				@Pc(55) int local55;
				for (@Pc(42) int local42 = 0; local42 < local40.length; local42 += local55) {
					local55 = local7.method5627(local40, local42, local40.length - local42);
					if (local55 == -1) {
						throw new IOException("EOF");
					}
				}
				Static12.method188(new Class2_Sub12(local40));
			}
		} catch (@Pc(84) Exception local84) {
		}
		try {
			if (local7 != null) {
				local7.method5628();
			}
		} catch (@Pc(91) Exception local91) {
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!qi;I)V")
	public static void method3492(@OriginalArg(0) Class2_Sub33 arg0) {
		if (Static196.aClass51ArrayArrayArray3 == null) {
			return;
		}
		@Pc(8) Interface8 local8 = null;
		if (arg0.anInt5548 == 0) {
			local8 = (Interface8) Static356.method5687(arg0.anInt5560, arg0.anInt5552, arg0.anInt5558);
		}
		if (arg0.anInt5548 == 1) {
			local8 = (Interface8) Static346.method5010(arg0.anInt5560, arg0.anInt5552, arg0.anInt5558);
		}
		if (arg0.anInt5548 == 2) {
			local8 = (Interface8) Static109.method2112(arg0.anInt5560, arg0.anInt5552, arg0.anInt5558, rc.class);
		}
		if (arg0.anInt5548 == 3) {
			local8 = (Interface8) Static217.method4135(arg0.anInt5560, arg0.anInt5552, arg0.anInt5558);
		}
		if (local8 == null) {
			arg0.anInt5557 = 0;
			arg0.anInt5555 = -1;
			arg0.anInt5559 = 0;
		} else {
			arg0.anInt5555 = local8.method5502();
			arg0.anInt5559 = local8.method5503();
			arg0.anInt5557 = local8.method5501();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = Static12.method187(Static197.anInt4298, Static38.anInt553, arg6);
		@Pc(23) int local23 = Static12.method187(Static197.anInt4298, Static38.anInt553, arg2);
		@Pc(29) int local29 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1);
		@Pc(37) int local37 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg5);
		@Pc(46) int local46 = Static12.method187(Static197.anInt4298, Static38.anInt553, arg6 + arg0);
		@Pc(55) int local55 = Static12.method187(Static197.anInt4298, Static38.anInt553, arg2 - arg0);
		for (@Pc(57) int local57 = local17; local57 < local46; local57++) {
			Static115.method2278(Static364.anIntArrayArray57[local57], local37, arg3, local29);
		}
		for (@Pc(73) int local73 = local23; local73 > local55; local73--) {
			Static115.method2278(Static364.anIntArrayArray57[local73], local37, arg3, local29);
		}
		@Pc(100) int local100 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1 + arg0);
		@Pc(109) int local109 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg5 - arg0);
		for (@Pc(111) int local111 = local46; local111 <= local55; local111++) {
			@Pc(117) int[] local117 = Static364.anIntArrayArray57[local111];
			Static115.method2278(local117, local100, arg3, local29);
			Static115.method2278(local117, local109, arg4, local100);
			Static115.method2278(local117, local37, arg3, local109);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	public static void method3494(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub9_Sub4 local8 = Static98.method1971(12, arg0);
		local8.method1799();
	}
}
