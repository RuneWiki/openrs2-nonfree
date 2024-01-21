import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
	public static int anInt481;

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
	public static int anInt484;

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "Z")
	public static final boolean aBoolean18 = false;

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "Lclient!rf;")
	public static Class70 aClass70_174 = Static49.method1293("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "[Lclient!rf;")
	public static Class70[] aClass70Array5 = new Class70[100];

	@OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
	public static int anInt491 = 0;

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "Lclient!rf;")
	public static Class70 aClass70_175 = Static49.method1293("me");

	@OriginalMember(owner = "client!bh", name = "eb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_178 = Static49.method1293("Bad session id)3");

	@OriginalMember(owner = "client!bh", name = "Y", descriptor = "Lclient!rf;")
	public static Class70 aClass70_176 = aClass70_178;

	@OriginalMember(owner = "client!bh", name = "Z", descriptor = "Lclient!rf;")
	public static Class70 aClass70_177 = Static49.method1293("p12_full");

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
	public static void method407() {
		aClass70_176 = null;
		aClass70_175 = null;
		aClass70_177 = null;
		aClass70Array5 = null;
		aClass70_174 = null;
		aClass70_178 = null;
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)Lclient!pf;")
	public static Class1_Sub1_Sub1_Sub3 method408() {
		@Pc(3) Class1_Sub1_Sub1_Sub3 local3 = new Class1_Sub1_Sub1_Sub3();
		local3.anInt3507 = Static53.anIntArray173[0];
		local3.anIntArray334 = Static150.anIntArray375;
		local3.aByteArray42 = Static179.aByteArrayArray10[0];
		local3.anInt3504 = Static101.anIntArray272[0];
		local3.anInt3502 = Static119.anIntArray319[0];
		local3.anInt3503 = Static182.anInt4532;
		local3.anInt3506 = Static95.anIntArray257[0];
		local3.anInt3505 = Static74.anInt2262;
		Static111.method2288();
		return local3;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(JB)V")
	public static void method409(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static25.anInt695; local18++) {
			if (Static120.aLongArray7[local18] == arg0) {
				Static25.anInt695--;
				for (@Pc(40) int local40 = local18; local40 < Static25.anInt695; local40++) {
					Static120.aLongArray7[local40] = Static120.aLongArray7[local40 + 1];
					Static51.aClass70Array8[local40] = Static51.aClass70Array8[local40 + 1];
				}
				Static102.anInt2901 = Static58.anInt1875;
				Static131.aClass1_Sub9_Sub1_3.method1283(128);
				Static131.aClass1_Sub9_Sub1_3.method1263(arg0);
				return;
			}
		}
	}
}
