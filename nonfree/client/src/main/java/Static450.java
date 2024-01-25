import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "F")
	public static float aFloat190;

	@OriginalMember(owner = "client!rba", name = "n", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_115 = new Class90(90, 8);

	@OriginalMember(owner = "client!rba", name = "q", descriptor = "Z")
	public static boolean aBoolean604 = false;

	@OriginalMember(owner = "client!rba", name = "t", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject119 = null;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "([BB)V")
	public static void method6617(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub13 local8 = new Class4_Sub13(arg0);
		while (true) {
			@Pc(20) int local20 = local8.method7004();
			if (local20 == 0) {
				return;
			}
			if (local20 == 2) {
				Static405.anInt7854 = local8.method7054();
			}
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIII)V")
	public static void method6618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static511.anIntArrayArray56 != null) {
			Static511.anIntArrayArray56[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static565.aShortArrayArray14 != null) {
			Static565.aShortArrayArray14[arg0][arg1] = (short) arg3;
		}
		if (Static254.aByteArrayArray18 != null) {
			Static254.aByteArrayArray18[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
	public static void method6622() {
		for (@Pc(18) Class4_Sub51 local18 = (Class4_Sub51) Static322.aClass22_43.method895(); local18 != null; local18 = (Class4_Sub51) Static322.aClass22_43.method889()) {
			if (local18.anInt10470 == -1) {
				local18.anInt10466 = 0;
				if (local18.anInt10463 >= 0 && local18.anInt10474 >= 0 && Static338.anInt6508 > local18.anInt10463 && local18.anInt10474 < Static390.anInt7654) {
					Static573.method8078(local18);
				}
			} else {
				local18.method8193();
			}
		}
	}
}
