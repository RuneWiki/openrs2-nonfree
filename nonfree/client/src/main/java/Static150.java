import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!sg", name = "U", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_19;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1953 = Static122.method531("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
	public static int anInt3579 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1954 = Static122.method531("Service unavailable)3");

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
	public static int anInt3582 = 0;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
	public static int anInt3587 = 0;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1955 = Static122.method531("M");

	@OriginalMember(owner = "client!sg", name = "B", descriptor = "[Lclient!sd;")
	public static Class73[] aClass73Array25 = new Class73[100];

	@OriginalMember(owner = "client!sg", name = "C", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1956 = aClass73_1954;

	@OriginalMember(owner = "client!sg", name = "N", descriptor = "[[B")
	public static byte[][] aByteArrayArray10 = new byte[1000][];

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!vd;)Z")
	public static boolean method2584(@OriginalArg(1) Class83 arg0) {
		if (arg0.anIntArray392 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray392.length; local12++) {
			@Pc(19) int local19 = Static33.method613(arg0, local12);
			@Pc(24) int local24 = arg0.anIntArray395[local12];
			if (arg0.anIntArray392[local12] == 2) {
				if (local19 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray392[local12] == 3) {
				if (local19 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray392[local12] == 4) {
				if (local19 == local24) {
					return false;
				}
			} else if (local19 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Z")
	public static boolean method2586(@OriginalArg(0) int arg0) {
		if (Static175.aBooleanArray18[arg0]) {
			return true;
		} else if (Static63.aClass13_12.method368(arg0)) {
			@Pc(23) int local23 = Static63.aClass13_12.method353(arg0);
			if (local23 == 0) {
				Static175.aBooleanArray18[arg0] = true;
				return true;
			}
			if (Static57.aClass83ArrayArray1[arg0] == null) {
				Static57.aClass83ArrayArray1[arg0] = new Class83[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static57.aClass83ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static63.aClass13_12.method348(arg0, local45);
					if (local59 != null) {
						Static57.aClass83ArrayArray1[arg0][local45] = new Class83();
						Static57.aClass83ArrayArray1[arg0][local45].anInt3676 = (arg0 << 16) + local45;
						if (local59[0] == -1) {
							Static57.aClass83ArrayArray1[arg0][local45].method2659(new Class3_Sub12(local59));
						} else {
							Static57.aClass83ArrayArray1[arg0][local45].method2655(new Class3_Sub12(local59));
						}
					}
				}
			}
			Static175.aBooleanArray18[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public static void method2591() {
		if (Static42.aClass2_2 != null) {
			Static42.aClass2_2.method12();
			Static42.aClass2_2 = null;
		}
		Static19.method377();
		Static119.aClass35_1.method1178();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static41.aClass60Array1[local18].method2147();
		}
		System.gc();
		Static47.method1372();
		Static164.anInt3564 = -1;
		Static44.aBoolean70 = false;
		Static136.method2236();
		Static78.method1320(10);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!f;IZ)Z")
	public static boolean method2592(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method347(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static113.method2037(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)Lclient!nc;")
	public static Class3_Sub1_Sub14 method2596(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub14 local10 = (Class3_Sub1_Sub14) Static5.aClass7_2.method183((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static166.method2606(arg0, Static55.aClass13_11, Static179.aClass13_35);
		if (local10 != null) {
			Static5.aClass7_2.method186(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
	public static void method2597() {
		aClass73_1953 = null;
		aClass73_1954 = null;
		aClass73Array25 = null;
		aClass73_1956 = null;
		aClass73_1955 = null;
		aClass13_Sub1_19 = null;
		aByteArrayArray10 = null;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
	public static void method2601() {
		for (@Pc(13) Class3_Sub13 local13 = (Class3_Sub13) Static91.aClass16_9.method551(); local13 != null; local13 = (Class3_Sub13) Static91.aClass16_9.method552()) {
			@Pc(18) int local18 = local13.anInt1133;
			if (method2586(local18)) {
				@Pc(26) boolean local26 = true;
				@Pc(30) Class83[] local30 = Static57.aClass83ArrayArray1[local18];
				for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
					if (local30[local32] != null) {
						local26 = local30[local32].aBoolean257;
						break;
					}
				}
				if (!local26) {
					@Pc(56) int local56 = (int) local13.aLong183;
					@Pc(60) Class83 local60 = Static80.method1396(local56);
					if (local60 != null) {
						Static60.method1104(local60);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIII)V")
	public static void method2603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) Class3_Sub16 local19 = (Class3_Sub16) Static69.aClass16_6.method554((long) arg3);
		if (local19 == null) {
			local19 = new Class3_Sub16();
			Static69.aClass16_6.method546(local19, (long) arg3);
		}
		if (arg1 >= local19.anIntArray307.length) {
			@Pc(41) int[] local41 = new int[arg1 + 1];
			@Pc(46) int[] local46 = new int[arg1 + 1];
			for (@Pc(48) int local48 = 0; local48 < local19.anIntArray307.length; local48++) {
				local41[local48] = local19.anIntArray307[local48];
				local46[local48] = local19.anIntArray306[local48];
			}
			for (@Pc(78) int local78 = local19.anIntArray307.length; local78 < arg1; local78++) {
				local41[local78] = -1;
				local46[local78] = 0;
			}
			local19.anIntArray307 = local41;
			local19.anIntArray306 = local46;
		}
		local19.anIntArray307[arg1] = arg0;
		local19.anIntArray306[arg1] = arg2;
	}
}
