import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!b", name = "Fb", descriptor = "Lclient!vc;")
	public static Class39 aClass39_1;

	@OriginalMember(owner = "client!b", name = "ob", descriptor = "I")
	public static int anInt183 = 0;

	@OriginalMember(owner = "client!b", name = "rb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_94 = Static59.method1195("::qa_op_test");

	@OriginalMember(owner = "client!b", name = "Bb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_95 = Static59.method1195("Fallen lassen");

	@OriginalMember(owner = "client!b", name = "Db", descriptor = "I")
	public static int anInt194 = 0;

	@OriginalMember(owner = "client!b", name = "Eb", descriptor = "J")
	public static long aLong9 = 0L;

	@OriginalMember(owner = "client!b", name = "Hb", descriptor = "Lclient!hd;")
	public static Class26 aClass26_1 = new Class26();

	@OriginalMember(owner = "client!b", name = "Kb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_97 = Static59.method1195("as it was used to break our rules)3");

	@OriginalMember(owner = "client!b", name = "Jb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_96 = aClass60_97;

	@OriginalMember(owner = "client!b", name = "Lb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_98 = Static59.method1195("");

	@OriginalMember(owner = "client!b", name = "Mb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_99 = Static59.method1195("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!b", name = "Nb", descriptor = "I")
	public static int anInt197 = 0;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
	public static void method124() {
		while (true) {
			if (Static79.aClass3_Sub12_Sub1_1.method1976(Static58.anInt1794) >= 11) {
				@Pc(23) int local23 = Static79.aClass3_Sub12_Sub1_1.method1982(11);
				if (local23 != 2047) {
					@Pc(30) boolean local30 = false;
					if (Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local23] == null) {
						Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local23] = new Class3_Sub1_Sub1_Sub3_Sub1();
						local30 = true;
						if (Static2.aClass3_Sub12Array1[local23] != null) {
							Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local23].method431(Static2.aClass3_Sub12Array1[local23]);
						}
					}
					Static14.anIntArray56[Static53.anInt1744++] = local23;
					@Pc(66) Class3_Sub1_Sub1_Sub3_Sub1 local66 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local23];
					local66.anInt1531 = Static34.anInt1183;
					@Pc(74) int local74 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
					if (local74 == 1) {
						Static46.anIntArray170[Static74.anInt2399++] = local23;
					}
					@Pc(92) int local92 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
					@Pc(99) int local99 = Static26.anIntArray122[Static79.aClass3_Sub12_Sub1_1.method1982(3)];
					if (local30) {
						local66.anInt1525 = local99;
					}
					@Pc(109) int local109 = Static79.aClass3_Sub12_Sub1_1.method1982(5);
					if (local109 > 15) {
						local109 -= 32;
					}
					@Pc(120) int local120 = Static79.aClass3_Sub12_Sub1_1.method1982(5);
					if (local120 > 15) {
						local120 -= 32;
					}
					local66.method1015(local92 == 1, local120 + Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0] - -local109);
					continue;
				}
			}
			Static79.aClass3_Sub12_Sub1_1.method1975();
			return;
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
	public static void method125() {
		Class3_Sub1_Sub1_Sub2.anIntArray25 = null;
		aClass60_94 = null;
		aClass26_1 = null;
		aClass60_98 = null;
		aClass39_1 = null;
		aClass60_95 = null;
		aClass60_99 = null;
		aClass60_96 = null;
		aClass60_97 = null;
	}

	@OriginalMember(owner = "client!b", name = "k", descriptor = "(I)V")
	public static void method126() {
		@Pc(5) Class26 local5 = aClass26_1;
		synchronized (aClass26_1) {
			Static129.anInt3467 = Static14.anInt433;
			Static122.anInt720 = Static129.anInt3463;
			Static12.anInt374 = Static103.anInt2989;
			Static112.anInt3110 = Static57.anInt3399;
			Static130.anInt3486 = Static103.anInt2998;
			Static84.anInt2576 = Static91.anInt2642;
			Static28.aLong106 = Static60.aLong63;
			Static57.anInt3399 = 0;
		}
	}
}
