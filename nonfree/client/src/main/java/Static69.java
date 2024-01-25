import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_17 = new Class70(64);

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "Ljava/lang/String;")
	public static final String aString24 = "purple:";

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "[I")
	public static final int[] anIntArray55 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
	public static int anInt484 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!wm;Z)V")
	public static void method417(@OriginalArg(0) Class6_Sub12 arg0) {
		if (arg0.aClass6_Sub11_5 != null) {
			arg0.aClass6_Sub11_5.anInt2219 = 0;
		}
		arg0.aBoolean416 = false;
		for (@Pc(23) Class6_Sub12 local23 = arg0.method5652(); local23 != null; local23 = arg0.method5655()) {
			method417(local23);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[Ljava/lang/String;BI)Ljava/lang/String;")
	public static String method420(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(18) String local18 = arg1[arg0];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(29) int local29 = arg0 + arg2;
			@Pc(31) int local31 = 0;
			for (@Pc(41) int local41 = arg0; local41 < local29; local41++) {
				@Pc(47) String local47 = arg1[local41];
				if (local47 == null) {
					local31 += 4;
				} else {
					local31 += local47.length();
				}
			}
			@Pc(66) StringBuffer local66 = new StringBuffer(local31);
			for (@Pc(68) int local68 = arg0; local68 < local29; local68++) {
				@Pc(74) String local74 = arg1[local68];
				if (local74 == null) {
					local66.append("null");
				} else {
					local66.append(local74);
				}
			}
			return local66.toString();
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
	public static void method421() {
		@Pc(1) Class70 local1 = Static267.aClass70_84;
		synchronized (Static267.aClass70_84) {
			Static267.aClass70_84.method1399();
		}
		local1 = Static336.aClass70_105;
		synchronized (Static336.aClass70_105) {
			Static336.aClass70_105.method1399();
		}
	}
}
