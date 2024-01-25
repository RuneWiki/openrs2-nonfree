import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "Z")
	public static boolean aBoolean79 = true;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
	public static int anInt797 = -1;

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
	public static int anInt799 = 0;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)Lclient!wg;")
	public static Class211 method942(@OriginalArg(0) int arg0) {
		@Pc(5) Class119 local5 = Static322.aClass119_196;
		@Pc(16) Class211 local16;
		synchronized (Static322.aClass119_196) {
			local16 = (Class211) Static322.aClass119_196.method3311((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(43) byte[] local43 = Static78.aClass191_51.method5459(Static322.method5640(arg0), Static31.method771(arg0));
		local16 = new Class211();
		if (local43 != null) {
			local16.method5942(new Class2_Sub10(local43));
		}
		@Pc(58) Class119 local58 = Static322.aClass119_196;
		synchronized (Static322.aClass119_196) {
			Static322.aClass119_196.method3308(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIII)V")
	public static void method943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class146 local8 = Static86.method1928(arg4, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray33 != null) {
			@Pc(18) Class2_Sub44 local18 = new Class2_Sub44();
			local18.anObjectArray35 = local8.anObjectArray33;
			local18.aClass146_18 = local8;
			Static72.method1646(local18);
		}
		Static133.anInt2765 = arg3;
		Static139.anInt2893 = local8.anInt4478;
		Static7.anInt157 = arg4;
		Static273.anInt5579 = arg2;
		Static48.anInt1094 = arg1;
		Static256.anInt5081 = arg5;
		Static262.aBoolean479 = true;
		Static326.anInt6614 = arg0;
		Static152.method2932(local8);
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIIIIII)V")
	public static void method944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static247.anInt4860 = arg3;
		Static297.anInt6012 = arg1;
		Static153.anInt3160 = arg2;
		Static274.anInt5614 = arg4;
		Static351.anInt5281 = arg5;
		Static154.anInt6530 = arg0;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public static void method945() {
		Static95.anInt6378 = 0;
		Static322.anInt6489 = 0;
		Static283.method5086();
		Static131.method2635();
		Static146.method2861();
		@Pc(30) int local30;
		for (@Pc(24) int local24 = 0; local24 < Static322.anInt6489; local24++) {
			local30 = Static159.anIntArray272[local24];
			if (Static212.anInt4090 != Static37.aClass62_Sub1_Sub2_Sub1Array1[local30].anInt5333) {
				if (Static37.aClass62_Sub1_Sub2_Sub1Array1[local30].aClass186_1.method5203()) {
					Static18.method667(Static37.aClass62_Sub1_Sub2_Sub1Array1[local30]);
				}
				Static37.aClass62_Sub1_Sub2_Sub1Array1[local30].method4723(null);
				Static37.aClass62_Sub1_Sub2_Sub1Array1[local30] = null;
			}
		}
		if (Static269.aClass2_Sub10_Sub1_3.anInt4807 != Static71.anInt1574) {
			throw new RuntimeException("gnp1 pos:" + Static269.aClass2_Sub10_Sub1_3.anInt4807 + " psize:" + Static71.anInt1574);
		}
		for (local30 = 0; local30 < Static169.anInt3463; local30++) {
			if (Static37.aClass62_Sub1_Sub2_Sub1Array1[Static98.anIntArray215[local30]] == null) {
				throw new RuntimeException("gnp2 pos:" + local30 + " size:" + Static169.anInt3463);
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
	public static void method946() {
		Static211.anInt4078 = -3;
		Static95.anInt6375 = 1;
		Static122.anInt4371 = 0;
		Static263.anInt5385 = 0;
		Static15.anInt383 = 0;
		Static210.aBoolean362 = false;
		Static99.anInt2256 = -1;
	}
}
