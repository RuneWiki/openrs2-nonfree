import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public static int anInt4754;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	public static int anInt4755;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Z")
	public static boolean aBoolean379 = false;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_75 = new Class37(8);

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	public static int anInt4756 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method4127() {
		Static25.aClass11_1.method5107();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static69.aLongArray5[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static51.aLongArray4[local24] = 0L;
		}
		Static44.anInt1167 = 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Lclient!ep;")
	public static Class1_Sub2_Sub3 method4128(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub3 local10 = (Class1_Sub2_Sub3) Static191.aClass88_7.method1652((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static189.aClass134_135.method3009(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static305.method5285(local20);
			Static191.aClass88_7.method1651((long) arg0, local10);
			return local10;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III[B)Z")
	public static boolean method4129(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class1_Sub21 local12 = new Class1_Sub21(arg2);
		@Pc(19) int local19 = -1;
		label68: while (true) {
			@Pc(23) int local23 = local12.method5695();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(66) int local66;
				@Pc(103) Class79 local103;
				do {
					@Pc(70) int local70;
					@Pc(74) int local74;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local12.method5699();
										if (local42 == 0) {
											continue label68;
										}
										local12.method5720();
									}
									local42 = local12.method5699();
									if (local42 == 0) {
										continue label68;
									}
									local34 += local42 - 1;
									@Pc(54) int local54 = local34 & 0x3F;
									@Pc(60) int local60 = local34 >> 6 & 0x3F;
									local66 = local12.method5720() >> 2;
									local70 = local60 + arg0;
									local74 = arg1 + local54;
								} while (local70 <= 0);
							} while (local74 <= 0);
						} while (local70 >= Static43.anInt1151 - 1);
					} while (Static260.anInt5348 - 1 <= local74);
					local103 = Static129.method2097(local19);
				} while (local66 == 22 && !Static341.aBoolean543 && local103.anInt1863 == 0 && local103.anInt1881 != 1 && !local103.aBoolean143);
				local36 = true;
				if (!local103.method1566()) {
					local7 = false;
					Static73.anInt957++;
				}
			}
		}
	}
}
