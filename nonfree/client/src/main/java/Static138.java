import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "Z")
	public static boolean aBoolean215;

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
	public static int anInt3079;

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
	public static int anInt3075 = 3353893;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IJ)V")
	public static void method2475(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static180.method3214(arg0 - 1L);
			Static180.method3214(1L);
		} else {
			Static180.method3214(arg0);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	public static void method2476() {
		@Pc(6) Class177 local6 = Static56.aClass177_1;
		synchronized (Static56.aClass177_1) {
			Static307.anInt5933 = Static53.anInt1321;
			Static131.anInt3016 = Static175.anInt3854;
			Static155.anInt3470++;
			Static281.anInt5551 = Static9.anInt3021;
			Static98.anInt2337 = Static12.anInt248;
			Static86.anInt2010 = Static247.anInt1732;
			Static252.anInt4933 = Static2.anInt65;
			Static82.aLong70 = Static229.aLong173;
			Static12.anInt248 = 0;
		}
	}
}
