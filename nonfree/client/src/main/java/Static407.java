import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "I")
	public static int anInt6820;

	@OriginalMember(owner = "client!nw", name = "j", descriptor = "F")
	public static float aFloat82;

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "Lclient!wd;")
	public static final Class384 aClass384_13 = new Class384();

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "Z")
	public static boolean aBoolean443 = false;

	@OriginalMember(owner = "client!nw", name = "k", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_262 = new Class179(125, 17);

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!oq;[Lclient!sca;)V")
	public static void method5839(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) Class6_Sub17[] arg1) {
		@Pc(6) int local6;
		if (Static47.aBoolean49) {
			local6 = arg0.method8450(arg1);
			Static576.aClass132_15.method7504(local6, arg1);
		}
		if (Static68.aClass12Array2 == Static289.aClass12Array3) {
			@Pc(28) int local28;
			if (arg0 instanceof Class2_Sub1_Sub1) {
				local6 = ((Class2_Sub1_Sub1) arg0).aShort118;
				local28 = ((Class2_Sub1_Sub1) arg0).aShort121;
			} else {
				local6 = arg0.anInt10006 >> Static185.anInt3178;
				local28 = arg0.anInt10001 >> Static185.anInt3178;
			}
			Static576.aClass132_15.EA(Static64.aClass12Array1[0].method7854(arg0.anInt10001, arg0.anInt10006), Static358.method5186(local6, local28), Static23.method584(local6, local28), Static524.method7855(local6, local28));
		}
		@Pc(64) Class2_Sub9 local64 = arg0.method8448(Static576.aClass132_15);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean702) {
			@Pc(72) Class2_Sub5[] local72 = local64.aClass2_Sub5Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class2_Sub5 local79 = local72[local74];
				if (local79.aBoolean124) {
					Static629.method8681(local79.anInt2083 + local79.anInt2085, local79.anInt2086 - local79.anInt2085, local79.anInt2084 + local79.anInt2085, local79.anInt2082 - local79.anInt2085);
				}
			}
		}
		if (local64.aBoolean590) {
			local64.aClass2_Sub1_20 = arg0;
			if (Static251.aBoolean272) {
				@Pc(119) Class115 local119 = Static663.aClass115_12;
				synchronized (Static663.aClass115_12) {
					Static663.aClass115_12.method2464(local64);
					return;
				}
			}
			Static663.aClass115_12.method2464(local64);
			return;
		}
		Static379.method5357(local64);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(B[B)V")
	public static void method5840(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class6_Sub23 local10 = new Class6_Sub23(arg0);
		@Pc(12) boolean local12 = false;
		while (true) {
			while (true) {
				@Pc(22) int local22 = local10.method8374();
				if (local22 == 0) {
					if (local12) {
						return;
					}
					if (Static145.anIntArray144 == null) {
						Static662.anIntArray705 = new int[4];
						Static332.anInt7618 = 4;
						Static145.anIntArray144 = new int[4];
					}
					for (local22 = 0; local22 < Static145.anIntArray144.length; local22++) {
						Static145.anIntArray144[local22] = 0;
						Static662.anIntArray705[local22] = local22 * 20;
					}
					return;
				}
				if (local22 == 1) {
					if (Static145.anIntArray144 == null) {
						Static332.anInt7618 = 4;
						Static662.anIntArray705 = new int[4];
						Static145.anIntArray144 = new int[4];
					}
					local12 = true;
					for (@Pc(44) int local44 = 0; local44 < Static145.anIntArray144.length; local44++) {
						Static145.anIntArray144[local44] = local10.method8395();
						Static662.anIntArray705[local44] = local10.method8395();
					}
				} else if (local22 == 2) {
					Static114.anInt2059 = local10.method8363();
				} else if (local22 == 3) {
					Static332.anInt7618 = local10.method8374();
					Static662.anIntArray705 = new int[Static332.anInt7618];
					Static145.anIntArray144 = new int[Static332.anInt7618];
				}
			}
		}
	}
}
