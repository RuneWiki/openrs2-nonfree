import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
	public static int anInt6349;

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "[Lclient!al;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_129 = new Class136(13, 7);

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_42 = new Class293(64);

	@OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
	public static int anInt6350 = 0;

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_130 = new Class136(73, 3);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method5615(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local15 - local19 < local11) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(66) char local66;
			if (local17 == '\u0000') {
				local66 = arg0.charAt(local13++);
			} else {
				local66 = local17;
			}
			@Pc(76) char local76;
			if (local19 == '\u0000') {
				local76 = arg2.charAt(local15++);
			} else {
				local76 = local19;
			}
			local17 = Static347.method8145(local66);
			local19 = Static347.method8145(local76);
			local66 = Static505.method5536(local66, arg1);
			local76 = Static505.method5536(local76, arg1);
			if (local76 != local66 && Character.toUpperCase(local66) != Character.toUpperCase(local76)) {
				local66 = Character.toLowerCase(local66);
				local76 = Character.toLowerCase(local76);
				if (local66 != local76) {
					return Static122.method1828(arg1, local66) - Static122.method1828(arg1, local76);
				}
			}
		}
		@Pc(143) int local143 = Math.min(local8, local11);
		for (@Pc(145) int local145 = 0; local145 < local143; local145++) {
			if (arg1 == 2) {
				local13 = local8 - local145 - 1;
				local15 = local11 - local145 - 1;
			} else {
				local15 = local145;
				local13 = local145;
			}
			@Pc(174) char local174 = arg0.charAt(local13);
			@Pc(178) char local178 = arg2.charAt(local15);
			if (local174 != local178 && Character.toUpperCase(local174) != Character.toUpperCase(local178)) {
				local174 = Character.toLowerCase(local174);
				local178 = Character.toLowerCase(local178);
				if (local178 != local174) {
					return Static122.method1828(arg1, local174) - Static122.method1828(arg1, local178);
				}
			}
		}
		@Pc(223) int local223 = local8 - local11;
		if (local223 != 0) {
			return local223;
		}
		for (@Pc(232) int local232 = 0; local232 < local143; local232++) {
			@Pc(238) char local238 = arg0.charAt(local232);
			@Pc(242) char local242 = arg2.charAt(local232);
			if (local242 != local238) {
				return Static122.method1828(arg1, local238) - Static122.method1828(arg1, local242);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	public static void method5617() {
		Static581.anInterface16_1 = null;
		Static512.aClass126_22 = null;
		Static504.aClass117_7 = null;
		Static129.anInt6333 = -1;
		Static573.aClass117_9 = null;
		Static453.anInt7627 = -1;
		Static4.anInt33 = -1;
		Static142.aClass117_8 = null;
		Static363.anInt6417 = -1;
		Static311.anInterface16Array1 = null;
		Static583.anIntArray754 = null;
		Static185.aClass43_1.method869();
	}
}
