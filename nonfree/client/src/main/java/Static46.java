import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!jb", name = "Ib", descriptor = "Lclient!l;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!jb", name = "Lb", descriptor = "Lclient!he;")
	public static Class11 aClass11_35;

	@OriginalMember(owner = "client!jb", name = "Nb", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_12;

	@OriginalMember(owner = "client!jb", name = "Qb", descriptor = "J")
	public static long aLong36;

	@OriginalMember(owner = "client!jb", name = "db", descriptor = "Lclient!va;")
	public static Class61 aClass61_535 = Static88.method1421("backhmid2");

	@OriginalMember(owner = "client!jb", name = "hb", descriptor = "I")
	public static int anInt1276 = 0;

	@OriginalMember(owner = "client!jb", name = "mb", descriptor = "Lclient!va;")
	public static Class61 aClass61_536 = Static88.method1421(":chalreq:");

	@OriginalMember(owner = "client!jb", name = "rb", descriptor = "Lclient!va;")
	public static Class61 aClass61_537 = Static88.method1421("::hiddenbuttontest");

	@OriginalMember(owner = "client!jb", name = "vb", descriptor = "I")
	public static int anInt1284 = 0;

	@OriginalMember(owner = "client!jb", name = "Tb", descriptor = "Lclient!va;")
	public static Class61 aClass61_538 = Static88.method1421("null");

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)Z")
	public static boolean method731() {
		return Static5.aClass13_1 != null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)I")
	public static int method732(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg1);
		return Static23.aClass10_Sub1_Sub9_1 != null && local11 == Static23.aClass10_Sub1_Sub9_1.aLong81 ? Static64.aClass10_Sub10_5.anInt1957 * 99 / (Static64.aClass10_Sub10_5.aByteArray9.length - Static23.aClass10_Sub1_Sub9_1.aByte2) + 1 : 0;
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V")
	public static void method733() {
		Static94.aClass15_35.method597();
		Static70.aClass10_Sub1_Sub1_Sub2_26.method873(0, 0);
		Static71.anIntArray208 = Static68.method998(Static71.anIntArray208);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!va;Lclient!va;Lclient!va;I)V")
	public static void method735(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) Class61 arg2) {
		Static15.aClass61_145 = arg2;
		Static15.aClass61_168 = arg1;
		Static15.aClass61_150 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(B)V")
	public static void method736() {
		aClass61_536 = null;
		aClass61_535 = null;
		aClass10_Sub1_Sub1_Sub2_12 = null;
		aClass11_35 = null;
		aClass61_538 = null;
		aClass35_1 = null;
		aClass61_537 = null;
	}
}
