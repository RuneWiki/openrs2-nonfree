import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!hia", name = "y", descriptor = "I")
	public static int anInt3993;

	@OriginalMember(owner = "client!hia", name = "z", descriptor = "F")
	public static float aFloat86;

	@OriginalMember(owner = "client!hia", name = "g", descriptor = "[Lclient!ao;")
	public static final Interface1[] anInterface1Array1 = new Interface1[75];

	@OriginalMember(owner = "client!hia", name = "r", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_64 = new Class337(99, 6);

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Ljava/lang/String;IILclient!fc;)Lclient!eha;")
	public static Class91 method3586(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2) {
		if (arg1 == 0) {
			return arg2.method2101(arg0);
		}
		@Pc(39) Class91 local39;
		if (arg1 == 1) {
			try {
				Static653.method5178(new Object[] { (new URL(Static7.anApplet1.getCodeBase(), arg0)).toString() }, "openjs", Static7.anApplet1);
				local39 = new Class91();
				local39.anInt2271 = 1;
				return local39;
			} catch (@Pc(45) Throwable local45) {
				local39 = new Class91();
				local39.anInt2271 = 2;
				return local39;
			}
		} else if (arg1 == 2) {
			try {
				Static7.anApplet1.getAppletContext().showDocument(new URL(Static7.anApplet1.getCodeBase(), arg0), "_blank");
				local39 = new Class91();
				local39.anInt2271 = 1;
				return local39;
			} catch (@Pc(77) Exception local77) {
				local39 = new Class91();
				local39.anInt2271 = 2;
				return local39;
			}
		} else if (arg1 == 3) {
			try {
				Static653.method5177(Static7.anApplet1, "loggedout");
			} catch (@Pc(98) Throwable local98) {
			}
			try {
				Static7.anApplet1.getAppletContext().showDocument(new URL(Static7.anApplet1.getCodeBase(), arg0), "_top");
				local39 = new Class91();
				local39.anInt2271 = 1;
				return local39;
			} catch (@Pc(118) Exception local118) {
				local39 = new Class91();
				local39.anInt2271 = 2;
				return local39;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIZ)V")
	public static void method3587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static485.aClass272_16.method6570(Static174.aClass120_24.method2690(Static266.anInt4796));
		@Pc(59) int local59;
		@Pc(30) int local30;
		if (Static266.aBoolean355) {
			for (@Pc(20) Class5_Sub5_Sub4 local20 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8702(); local20 != null; local20 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8710()) {
				if (local20.anInt2287 == 1) {
					local30 = Static235.method3913((Class5_Sub5_Sub15) local20.aClass368_2.aClass5_Sub5_64.aClass5_Sub5_66);
				} else {
					local30 = Static102.method1640(local20);
				}
				if (local30 > local13) {
					local13 = local30;
				}
			}
			local13 += 8;
			local59 = Static140.anInt2437 * 16 + 21;
			Static644.anInt10625 = (Static186.aBoolean231 ? 26 : 22) + Static140.anInt2437 * 16;
		} else {
			for (@Pc(76) Class5_Sub5_Sub15 local76 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7908(); local76 != null; local76 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7914()) {
				local30 = Static235.method3913(local76);
				if (local13 < local30) {
					local13 = local30;
				}
			}
			Static644.anInt10625 = Static491.anInt8293 * 16 + (Static186.aBoolean231 ? 26 : 22);
			local13 += 8;
			local59 = Static491.anInt8293 * 16 + 21;
		}
		@Pc(124) int local124 = arg1 - local13 / 2;
		if (local124 + local13 > Static345.anInt5827) {
			local124 = Static345.anInt5827 - local13;
		}
		if (local124 < 0) {
			local124 = 0;
		}
		local30 = arg0;
		if (arg0 + local59 > Static408.anInt7118) {
			local30 = Static408.anInt7118 - local59;
		}
		Static346.anInt4654 = local124;
		if (local30 < 0) {
			local30 = 0;
		}
		Static115.anInt2157 = local13;
		Static142.aBoolean190 = true;
		Static612.anInt10212 = local30;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method3588(@OriginalArg(0) Class5_Sub5_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static11.aClass61Array1 != Static456.aClass61Array3) {
			@Pc(12) int local12 = Static20.aClass61Array2[arg1].method8584(arg3, arg2);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class61 local19 = Static20.aClass61Array2[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method8584(arg3, arg2);
					if (arg4 != null) {
						arg4[local14] = local19.method8581(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(III)Z")
	public static boolean method3590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
