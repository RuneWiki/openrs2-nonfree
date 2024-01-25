import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_334 = new Class196(36, 12);

	@OriginalMember(owner = "client!sf", name = "A", descriptor = "Z")
	public static final boolean aBoolean764 = false;

	@OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
	public static int anInt10371 = 0;

	@OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
	public static int anInt10372 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!sf;[Lclient!jw;)V")
	public static void method8659(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) Class5_Sub3[] arg1) {
		@Pc(6) int local6;
		if (Static246.aBoolean276) {
			local6 = arg0.method8649(arg1);
			Static267.aClass143_6.method6210(local6, arg1);
		}
		if (Static176.aClass88Array1 == Static298.aClass88Array3) {
			@Pc(28) int local28;
			if (arg0 instanceof Class41_Sub1_Sub1) {
				local6 = ((Class41_Sub1_Sub1) arg0).aShort109;
				local28 = ((Class41_Sub1_Sub1) arg0).aShort108;
			} else {
				local6 = arg0.anInt10366 >> Static138.anInt2287;
				local28 = arg0.anInt10367 >> Static138.anInt2287;
			}
			Static267.aClass143_6.EA(Static230.aClass88Array2[0].method8753(arg0.anInt10366, arg0.anInt10367), Static462.method6848(local6, local28), Static166.method2459(local6, local28), Static484.method7068(local6, local28));
		}
		@Pc(64) Class41_Sub3 local64 = arg0.method8648(Static267.aClass143_6);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean762) {
			@Pc(72) Class41_Sub9[] local72 = local64.aClass41_Sub9Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class41_Sub9 local79 = local72[local74];
				if (local79.aBoolean648) {
					Static430.method7439(local79.anInt8966 - local79.anInt8962, local79.anInt8963 + local79.anInt8962, local79.anInt8965 - local79.anInt8962, local79.anInt8964 + local79.anInt8962);
				}
			}
		}
		if (local64.aBoolean258) {
			local64.aClass41_Sub1_10 = arg0;
			if (Static362.aBoolean459) {
				@Pc(119) Class89 local119 = Static508.aClass89_1;
				synchronized (Static508.aClass89_1) {
					Static508.aClass89_1.method1909(local64);
					return;
				}
			}
			Static508.aClass89_1.method1909(local64);
			return;
		}
		Static492.method5401(local64);
	}
}
