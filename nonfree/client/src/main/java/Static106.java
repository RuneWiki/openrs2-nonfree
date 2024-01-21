import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!s", name = "r", descriptor = "I")
	public static int anInt2742;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!r;")
	private static Class61 aClass61_823 = Static129.method2060("Click to switch");

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!r;")
	public static Class61 aClass61_824 = aClass61_823;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!s", name = "p", descriptor = "Lclient!r;")
	public static Class61 aClass61_825 = Static129.method2060("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!s", name = "s", descriptor = "Lclient!r;")
	public static Class61 aClass61_826 = Static129.method2060("p12_full");

	@OriginalMember(owner = "client!s", name = "t", descriptor = "Lclient!r;")
	public static Class61 aClass61_827 = Static129.method2060("null");

	@OriginalMember(owner = "client!s", name = "u", descriptor = "Lclient!r;")
	public static Class61 aClass61_828 = Static129.method2060("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!s", name = "v", descriptor = "I")
	public static int anInt2743 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BIIZ)V")
	public static void method1766(@OriginalArg(3) boolean arg0) {
		Static37.aBoolean28 = arg0;
		Static78.anInt1981 = 22050;
		Static115.anInt2988 = 2;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method1767() {
		aClass61_824 = null;
		aBigInteger1 = null;
		aClass61_828 = null;
		aClass61_827 = null;
		aClass61_825 = null;
		aClass61_823 = null;
		aClass61_826 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)Lclient!w;")
	public static Class5_Sub2_Sub17 method1769(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub2_Sub17 local10 = (Class5_Sub2_Sub17) Static82.aClass29_20.method766((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static77.aClass26_16.method1038(12, arg0);
		local10 = new Class5_Sub2_Sub17();
		if (local25 != null) {
			local10.method2064(new Class5_Sub14(local25));
		}
		local10.method2068();
		Static82.aClass29_20.method762(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	public static void method1770() {
		@Pc(5) Object local5 = Static77.anObject4;
		synchronized (Static77.anObject4) {
			if (Static32.anInt954 != 0) {
				Static32.anInt954 = 1;
				try {
					Static77.anObject4.wait();
				} catch (@Pc(18) InterruptedException local18) {
				}
			}
		}
	}
}
