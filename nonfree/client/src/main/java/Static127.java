import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "[Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3[] aClass8_Sub1_Sub3_Sub3Array40;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1378 = Static56.method816(" )2> ");

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1379 = Static56.method816("(Y<)4col>");

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "Lclient!m;")
	public static Class49 aClass49_14 = new Class49();

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1380 = Static56.method816("(Udns");

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1381 = Static56.method816("Passwort: ");

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "[J")
	public static long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
	public static void method1980(@OriginalArg(1) int arg0) {
		if (!Static100.method1458(arg0)) {
			return;
		}
		@Pc(14) Class8_Sub24[] local14 = Static44.aClass8_Sub24ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class8_Sub24 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt3147 = 0;
				local22.anInt3158 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B[Lclient!wf;I)V")
	public static void method1981(@OriginalArg(1) Class8_Sub24[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class8_Sub24 local9 = arg0[local3];
			if (local9 != null && local9.anInt3166 == arg1 && (!local9.aBoolean117 || !Static5.method38(local9))) {
				if (local9.anInt3145 == 0) {
					if (!local9.aBoolean117 && Static5.method38(local9) && local9 != Static15.aClass8_Sub24_4) {
						continue;
					}
					method1981(arg0, local9.anInt3124);
					if (local9.aClass8_Sub24Array2 != null) {
						method1981(local9.aClass8_Sub24Array2, local9.anInt3124);
					}
					@Pc(60) Class8_Sub7 local60 = (Class8_Sub7) Static31.aClass7_3.method45((long) local9.anInt3124);
					if (local60 != null) {
						Static46.method685(local60.anInt954);
					}
				}
				if (local9.anInt3145 == 6) {
					@Pc(90) int local90;
					if (local9.anInt3144 != -1 || local9.anInt3105 != -1) {
						@Pc(85) boolean local85 = Static17.method260(local9);
						if (local85) {
							local90 = local9.anInt3105;
						} else {
							local90 = local9.anInt3144;
						}
						if (local90 != -1) {
							@Pc(103) Class8_Sub1_Sub6 local103 = Static47.method733(local90);
							local9.anInt3158 += Static69.anInt1683;
							while (local103.anIntArray76[local9.anInt3147] < local9.anInt3158) {
								local9.anInt3158 -= local103.anIntArray76[local9.anInt3147];
								local9.anInt3147++;
								if (local9.anInt3147 >= local103.anIntArray79.length) {
									local9.anInt3147 -= local103.anInt724;
									if (local9.anInt3147 < 0 || local103.anIntArray79.length <= local9.anInt3147) {
										local9.anInt3147 = 0;
									}
								}
								Static40.method608(local9);
							}
						}
					}
					if (local9.anInt3159 != 0 && !local9.aBoolean117) {
						local90 = local9.anInt3159 << 16 >> 16;
						@Pc(191) int local191 = local9.anInt3159 >> 16;
						local90 *= Static69.anInt1683;
						local9.anInt3160 = local9.anInt3160 + local90 & 0x7FF;
						@Pc(207) int local207 = local191 * Static69.anInt1683;
						local9.anInt3101 = local9.anInt3101 + local207 & 0x7FF;
						Static40.method608(local9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!ic;Lclient!dd;Lclient!ic;)[Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3[] method1982(@OriginalArg(1) Class34 arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) Class34 arg2) {
		@Pc(16) int local16 = arg1.method1164(arg0);
		@Pc(22) int local22 = arg1.method1159(local16, arg2);
		return Static10.method110(local16, arg1, local22);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public static void method1983() {
		aClass34_1378 = null;
		aClass34_1380 = null;
		aClass8_Sub1_Sub3_Sub3Array40 = null;
		aLongArray7 = null;
		aClass34_1381 = null;
		aClass34_1379 = null;
		aClass49_14 = null;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILclient!dd;)Z")
	public static boolean method1984(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1) {
		@Pc(8) byte[] local8 = arg1.method1157(arg0);
		if (local8 == null) {
			return false;
		} else {
			Static124.method1964(local8);
			return true;
		}
	}
}
