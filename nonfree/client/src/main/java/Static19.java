import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bh", name = "W", descriptor = "[[[Lclient!eg;")
	public static Class1_Sub11[][][] aClass1_Sub11ArrayArrayArray2;

	@OriginalMember(owner = "client!bh", name = "db", descriptor = "I")
	public static int anInt398;

	@OriginalMember(owner = "client!bh", name = "eb", descriptor = "Lclient!pa;")
	public static Class86 aClass86_6;

	@OriginalMember(owner = "client!bh", name = "Y", descriptor = "[B")
	public static byte[] aByteArray2 = new byte[520];

	@OriginalMember(owner = "client!bh", name = "Z", descriptor = "Lclient!hh;")
	public static Class50 aClass50_157 = Static186.method3527("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!bh", name = "cb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_159 = Static186.method3527("Drop");

	@OriginalMember(owner = "client!bh", name = "ab", descriptor = "Lclient!hh;")
	public static Class50 aClass50_158 = aClass50_159;

	@OriginalMember(owner = "client!bh", name = "fb", descriptor = "I")
	public static int anInt399 = 0;

	@OriginalMember(owner = "client!bh", name = "gb", descriptor = "I")
	public static int anInt400 = 0;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)[Lclient!ne;")
	public static Class78[] method288() {
		@Pc(13) Class78[] local13 = new Class78[Static70.anInt1320];
		for (@Pc(15) int local15 = 0; local15 < Static70.anInt1320; local15++) {
			local13[local15] = new Class78_Sub1(Static204.anInt4108, Static146.anInt3070, Static169.anIntArray370[local15], Static228.anIntArray507[local15], Static8.anIntArray20[local15], Static101.anIntArray191[local15], Static191.aByteArrayArray11[local15], Static78.anIntArray127);
		}
		Static216.method3375();
		return local13;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method290(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static32.aClass81_1);
		arg0.removeFocusListener(Static32.aClass81_1);
		Static221.anInt4310 = -1;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V")
	public static void method292() {
		Static33.aClass92_1.method3385();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static203.aLongArray2[local15] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static179.aLongArray7[local29] = 0L;
		}
		Static45.anInt942 = 0;
	}
}
