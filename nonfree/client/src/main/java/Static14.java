import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!c", name = "Ib", descriptor = "Lclient!ja;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!c", name = "Rb", descriptor = "[I")
	public static int[] anIntArray65;

	@OriginalMember(owner = "client!c", name = "mb", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[1000][];

	@OriginalMember(owner = "client!c", name = "vb", descriptor = "Lclient!i;")
	public static Class32 aClass32_11 = new Class32(64);

	@OriginalMember(owner = "client!c", name = "Eb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_161 = Static2.method59("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!c", name = "Fb", descriptor = "I")
	public static final int anInt417 = 20;

	@OriginalMember(owner = "client!c", name = "Kb", descriptor = "[I")
	public static int[] anIntArray64 = new int[1000];

	@OriginalMember(owner = "client!c", name = "Nb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_162 = Static2.method59("::errortest");

	@OriginalMember(owner = "client!c", name = "Pb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_163 = Static2.method59("Abbrechen");

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)Lclient!pa;")
	public static Class2_Sub1_Sub11 method244(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub11 local10 = (Class2_Sub1_Sub11) aClass32_11.method887((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static4.aClass11_3.method383(arg0, 16);
		local10 = new Class2_Sub1_Sub11();
		if (local20 != null) {
			local10.method1317(new Class2_Sub17(local20));
		}
		aClass32_11.method880(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public static void method247() {
		aClass32_11 = null;
		anIntArray65 = null;
		aClass28_1 = null;
		aByteArrayArray3 = null;
		aClass80_163 = null;
		aClass80_162 = null;
		aClass80_161 = null;
		anIntArray64 = null;
	}
}
