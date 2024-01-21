import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!ha;")
	public static Class25_Sub1 aClass25_Sub1_1;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!ad;")
	public static Class5 aClass5_6 = new Class5();

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_262 = Static59.method1195("Please contact customer support)3");

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_263 = Static59.method1195("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!qf;")
	public static Class60 aClass60_264 = Static59.method1195("backhmid1");

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!wd;")
	public static Class82 aClass82_1 = new Class82(32);

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_265 = Static59.method1195("m");

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_266 = Static59.method1195("An");

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_267 = aClass60_262;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_268 = Static59.method1195("mapback");

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	public static int anInt739 = 0;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_269 = Static59.method1195("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Lclient!dc;")
	public static Class3_Sub1_Sub3 method483(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub3 local10 = (Class3_Sub1_Sub3) Static19.aClass17_54.method643((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static120.aClass25_33.method931(arg0, 3);
		local10 = new Class3_Sub1_Sub3();
		if (local28 != null) {
			local10.method545(new Class3_Sub12(local28));
		}
		Static19.aClass17_54.method644((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!la;I)Lclient!qf;")
	public static Class60 method484(@OriginalArg(0) Class3_Sub12 arg0) {
		return Static60.method1215(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	public static void method485() {
		aClass60_268 = null;
		aClass82_1 = null;
		aClass60_263 = null;
		aClass60_265 = null;
		aClass60_264 = null;
		aClass25_Sub1_1 = null;
		aClass60_266 = null;
		aClass60_267 = null;
		aClass60_269 = null;
		aClass5_6 = null;
		aClass60_262 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BIB)I")
	public static int method486(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static96.method1804(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!jb;IZ)Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 method489(@OriginalArg(0) int arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2) {
		return Static55.method1140(arg2, arg0, arg1) ? Static38.method872() : null;
	}
}
