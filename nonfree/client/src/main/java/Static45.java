import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!le;")
	public static Class1_Sub8_Sub2 aClass1_Sub8_Sub2_1;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!u;")
	public static Class76 aClass76_41;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "[Lclient!pf;")
	public static Class1_Sub1_Sub1_Sub3[] aClass1_Sub1_Sub1_Sub3Array3;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Lclient!u;")
	public static Class76 aClass76_42;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "Lclient!ue;")
	public static Class76_Sub1 aClass76_Sub1_4;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Lclient!rf;")
	private static Class70 aClass70_490 = Static49.method1293("flash1:");

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Lclient!rf;")
	public static Class70 aClass70_489 = aClass70_490;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	public static int anInt1478 = 0;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_491 = aClass70_490;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "Lclient!rf;")
	public static Class70 aClass70_492 = Static49.method1293("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
	public static volatile int anInt1480 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIII)V")
	public static void method1104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) long local10 = Static5.method186(arg0, arg2, arg4);
		@Pc(27) int local27;
		@Pc(37) int local37;
		@Pc(39) int local39;
		@Pc(53) int local53;
		@Pc(60) int local60;
		if (local10 != 0L) {
			local27 = (int) local10 >> 20 & 0x3;
			@Pc(30) int[] local30 = Static60.aClass1_Sub1_Sub1_Sub4_7.anIntArray374;
			local37 = (int) local10 >> 14 & 0x1F;
			local39 = arg3;
			local53 = (52736 - arg4 * 512) * 4 + arg2 * 4 + 24624;
			local60 = Integer.MAX_VALUE & (int) (local10 >>> 32);
			if (local10 > 0L) {
				local39 = arg1;
			}
			@Pc(72) Class1_Sub1_Sub7 local72 = Static176.method3433(local60);
			if (local72.anInt1844 == -1) {
				if (local37 == 0 || local37 == 2) {
					if (local27 == 0) {
						local30[local53] = local39;
						local30[local53 + 512] = local39;
						local30[local53 + 1024] = local39;
						local30[local53 + 1536] = local39;
					} else if (local27 == 1) {
						local30[local53] = local39;
						local30[local53 + 1] = local39;
						local30[local53 + 2] = local39;
						local30[local53 + 3] = local39;
					} else if (local27 == 2) {
						local30[local53 + 3] = local39;
						local30[local53 + 3 + 512] = local39;
						local30[local53 + 1027] = local39;
						local30[local53 + 3 + 1536] = local39;
					} else if (local27 == 3) {
						local30[local53 + 1536] = local39;
						local30[local53 + 1536 + 1] = local39;
						local30[local53 + 2 + 1536] = local39;
						local30[local53 + 1536 + 3] = local39;
					}
				}
				if (local37 == 3) {
					if (local27 == 0) {
						local30[local53] = local39;
					} else if (local27 == 1) {
						local30[local53 + 3] = local39;
					} else if (local27 == 2) {
						local30[local53 + 1536 + 3] = local39;
					} else if (local27 == 3) {
						local30[local53 + 1536] = local39;
					}
				}
				if (local37 == 2) {
					if (local27 == 3) {
						local30[local53] = local39;
						local30[local53 + 512] = local39;
						local30[local53 + 1024] = local39;
						local30[local53 + 1536] = local39;
					} else if (local27 == 0) {
						local30[local53] = local39;
						local30[local53 + 1] = local39;
						local30[local53 + 2] = local39;
						local30[local53 + 3] = local39;
					} else if (local27 == 1) {
						local30[local53 + 3] = local39;
						local30[local53 + 512 + 3] = local39;
						local30[local53 + 3 + 1024] = local39;
						local30[local53 + 1536 + 3] = local39;
					} else if (local27 == 2) {
						local30[local53 + 1536] = local39;
						local30[local53 + 1 + 1536] = local39;
						local30[local53 + 2 + 1536] = local39;
						local30[local53 + 1539] = local39;
					}
				}
			} else {
				@Pc(82) Class1_Sub1_Sub1_Sub3 local82 = Static4.aClass1_Sub1_Sub1_Sub3Array2[local72.anInt1844];
				if (local82 != null) {
					@Pc(95) int local95 = (local72.anInt1818 * 4 - local82.anInt3504) / 2;
					@Pc(106) int local106 = (local72.anInt1813 * 4 - local82.anInt3507) / 2;
					local82.method2618(local95 + arg2 * 4 + 48, 48 - -((-arg4 + 104 - local72.anInt1813) * 4) + local106);
				}
			}
		}
		local10 = Static8.method248(arg0, arg2, arg4);
		if (local10 != 0L) {
			local27 = (int) local10 >> 20 & 0x3;
			local39 = Integer.MAX_VALUE & (int) (local10 >>> 32);
			local37 = (int) local10 >> 14 & 0x1F;
			@Pc(479) Class1_Sub1_Sub7 local479 = Static176.method3433(local39);
			@Pc(511) int local511;
			if (local479.anInt1844 != -1) {
				@Pc(488) Class1_Sub1_Sub1_Sub3 local488 = Static4.aClass1_Sub1_Sub1_Sub3Array2[local479.anInt1844];
				if (local488 != null) {
					local60 = (local479.anInt1818 * 4 - local488.anInt3504) / 2;
					local511 = (local479.anInt1813 * 4 - local488.anInt3507) / 2;
					local488.method2618(arg2 * 4 + local60 + 48, (-local479.anInt1813 + -arg4 + 104) * 4 + 48 + local511);
				}
			} else if (local37 == 9) {
				local53 = 15658734;
				if (local10 > 0L) {
					local53 = 15597568;
				}
				@Pc(555) int[] local555 = Static60.aClass1_Sub1_Sub1_Sub4_7.anIntArray374;
				local511 = (103 - arg4) * 2048 + arg2 * 4 + 24624;
				if (local27 == 0 || local27 == 2) {
					local555[local511 + 1536] = local53;
					local555[local511 + 1025] = local53;
					local555[local511 + 2 + 512] = local53;
					local555[local511 + 3] = local53;
				} else {
					local555[local511] = local53;
					local555[local511 + 512 + 1] = local53;
					local555[local511 + 1024 + 2] = local53;
					local555[local511 + 3 + 1536] = local53;
				}
			}
		}
		local10 = Static44.method1099(arg0, arg2, arg4);
		if (local10 == 0L) {
			return;
		}
		local27 = Integer.MAX_VALUE & (int) (local10 >>> 32);
		@Pc(654) Class1_Sub1_Sub7 local654 = Static176.method3433(local27);
		if (local654.anInt1844 == -1) {
			return;
		}
		@Pc(664) Class1_Sub1_Sub1_Sub3 local664 = Static4.aClass1_Sub1_Sub1_Sub3Array2[local654.anInt1844];
		if (local664 != null) {
			@Pc(677) int local677 = (local654.anInt1818 * 4 - local664.anInt3504) / 2;
			local53 = (local654.anInt1813 * 4 - local664.anInt3507) / 2;
			local664.method2618(local677 + arg2 * 4 + 48, (-arg4 + 104 + -local654.anInt1813) * 4 + 48 + local53);
			return;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public static void method1105() {
		aClass70_489 = null;
		aClass76_Sub1_4 = null;
		aClass1_Sub8_Sub2_1 = null;
		aClass76_41 = null;
		aClass70_492 = null;
		aClass1_Sub1_Sub1_Sub3Array3 = null;
		aClass70_490 = null;
		aClass70_491 = null;
		aClass76_42 = null;
	}
}
