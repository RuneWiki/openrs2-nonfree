import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "[I")
	public static int[] anIntArray25;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "I")
	public static int anInt277;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "Lclient!on;")
	public static Class121 aClass121_1;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "Lclient!lj;")
	public static Class1_Sub5_Sub6 aClass1_Sub5_Sub6_1;

	@OriginalMember(owner = "client!an", name = "f", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!an", name = "k", descriptor = "I")
	public static int anInt282 = -2;

	@OriginalMember(owner = "client!an", name = "l", descriptor = "Z")
	public static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)[Lclient!nc;")
	public static Class115[] method186() {
		if (Static197.aClass115Array1 == null) {
			@Pc(12) Class115[] local12 = Static225.method3627(Static222.aClass176_3);
			@Pc(16) Class115[] local16 = new Class115[local12.length];
			@Pc(18) int local18 = 0;
			label56: for (@Pc(20) int local20 = 0; local20 < local12.length; local20++) {
				@Pc(32) Class115 local32 = local12[local20];
				if ((local32.anInt3481 <= 0 || local32.anInt3481 >= 24) && local32.anInt3479 >= 800 && local32.anInt3482 >= 600) {
					for (@Pc(60) int local60 = 0; local60 < local18; local60++) {
						@Pc(71) Class115 local71 = local16[local60];
						if (local32.anInt3479 == local71.anInt3479 && local32.anInt3482 == local71.anInt3482) {
							if (local32.anInt3481 > local71.anInt3481) {
								local16[local60] = local32;
							}
							continue label56;
						}
					}
					local16[local18] = local32;
					local18++;
				}
			}
			Static197.aClass115Array1 = new Class115[local18];
			Static317.method1048(local16, 0, Static197.aClass115Array1, 0, local18);
			@Pc(122) int[] local122 = new int[Static197.aClass115Array1.length];
			for (@Pc(124) int local124 = 0; local124 < Static197.aClass115Array1.length; local124++) {
				@Pc(132) Class115 local132 = Static197.aClass115Array1[local124];
				local122[local124] = local132.anInt3482 * local132.anInt3479;
			}
			Static62.method1106(Static197.aClass115Array1, local122);
		}
		return Static197.aClass115Array1;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLclient!nm;)V")
	public static void method187(@OriginalArg(1) Class119 arg0) {
		Static292.aClass119_91 = arg0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)I")
	public static int method188(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)I")
	public static int method189(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(29) int local29 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCF) >>> 2);
		@Pc(37) int local37 = (local29 >>> 4) + local29 & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}
}
