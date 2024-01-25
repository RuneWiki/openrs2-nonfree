import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "[I")
	public static int[] anIntArray91 = new int[4];

	@OriginalMember(owner = "client!bv", name = "v", descriptor = "Lclient!io;")
	public static final Class152 aClass152_2 = new Class152(4, 1);

	@OriginalMember(owner = "client!bv", name = "w", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_26 = new Class268(10, 0);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)I")
	public static int method1052(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(II)V")
	public static void method1054(@OriginalArg(1) int arg0) {
		Static270.anInt5360 = arg0;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
	public static void method1055() {
		Static155.anInt2829 = 1;
		Static19.anInt323 = -1;
		if (Static362.aString82 == null) {
			Static319.method5323(35);
		} else {
			@Pc(31) Class6_Sub40 local31 = new Class6_Sub40(Static549.method7972(Static414.method6517(Static362.aString82)));
			@Pc(35) long local35 = local31.method8603();
			Static492.aLong220 = local31.method8603();
			Static269.method4786("", true, Static340.method5776(local35));
		}
	}
}
