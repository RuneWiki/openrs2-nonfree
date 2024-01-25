import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "I")
	public static int anInt5725;

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "Lclient!rg;")
	public static Class310 aClass310_65;

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_163 = new Class160(84, 4);

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)V")
	private static void method5150() {
		Static558.aClass125_39.method2628();
		Static276.aClass125_16.method2628();
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZB)V")
	public static void method5151(@OriginalArg(0) boolean arg0) {
		@Pc(5) Class347[] local5 = Static277.aClass347Array1;
		for (@Pc(7) int local7 = 0; local7 < local5.length; local7++) {
			@Pc(12) Class347 local12 = local5[local7];
			local12.method8306();
		}
		Static532.method7880();
		Static419.method9119();
		Static444.method6621();
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			Static40.aClass289Array1[local27].method7082();
		}
		Static467.method6886(false);
		System.gc();
		Static68.method1086();
		Static460.aBoolean599 = false;
		Static184.anInt7567 = -1;
		Static285.method4779();
		Static379.method5838(true);
		Static636.method8903();
		method5150();
		Static152.method2222();
		if (arg0) {
			Static160.method2323(13);
			return;
		}
		Static160.method2323(3);
		try {
			Static698.method8237(Static531.anApplet2, "loggedout");
		} catch (@Pc(81) Throwable local81) {
		}
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V")
	public static void method5153() {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			Static398.aClass30Array1[local6] = null;
		}
		Static501.anInt8737 = 0;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "([Ljava/lang/String;I[SBI)V")
	public static void method5154(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(12) int local12 = (arg3 + arg1) / 2;
		@Pc(14) int local14 = arg1;
		@Pc(18) String local18 = arg0[local12];
		arg0[local12] = arg0[arg3];
		arg0[arg3] = local18;
		@Pc(32) short local32 = arg2[local12];
		arg2[local12] = arg2[arg3];
		arg2[arg3] = local32;
		for (@Pc(44) int local44 = arg1; local44 < arg3; local44++) {
			if (local18 == null || arg0[local44] != null && arg0[local44].compareTo(local18) < (local44 & 0x1)) {
				@Pc(68) String local68 = arg0[local44];
				arg0[local44] = arg0[local14];
				arg0[local14] = local68;
				@Pc(82) short local82 = arg2[local44];
				arg2[local44] = arg2[local14];
				arg2[local14++] = local82;
			}
		}
		arg0[arg3] = arg0[local14];
		arg0[local14] = local18;
		arg2[arg3] = arg2[local14];
		arg2[local14] = local32;
		method5154(arg0, arg1, arg2, local14 - 1);
		method5154(arg0, local14 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5155(@OriginalArg(0) String arg0) {
		return Static54.method984(arg0);
	}
}
