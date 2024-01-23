import java.awt.Image;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "B")
	public static byte aByte16;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_37;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1319 = Static186.method3527("Attack");

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1317 = aClass50_1319;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1318 = Static186.method3527("(U4");

	@OriginalMember(owner = "client!u", name = "j", descriptor = "I")
	public static int anInt4118 = -1;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "[I")
	public static int[] anIntArray467 = new int[200];

	@OriginalMember(owner = "client!u", name = "o", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1320 = Static186.method3527(")2");

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Lclient!ne;")
	public static Class78 method3253() {
		@Pc(25) Class78_Sub1 local25 = new Class78_Sub1(Static204.anInt4108, Static146.anInt3070, Static169.anIntArray370[0], Static228.anIntArray507[0], Static8.anIntArray20[0], Static101.anIntArray191[0], Static191.aByteArrayArray11[0], Static78.anIntArray127);
		Static216.method3375();
		return local25;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)I")
	public static int method3255() {
		return ((Static146.anInt3076 == 0 ? 0 : 1) << 22) + ((Static152.anInt3168 == 0 ? 0 : 1) << 21) + ((Static172.anInt3511 == 0 ? 0 : 1) << 20) + ((Static70.aBoolean65 ? 1 : 0) << 15) + ((Static129.aBoolean113 ? 1 : 0) << 13) + ((Static214.anInt4250 & 0x3) << 11) + ((Static148.aBoolean130 ? 1 : 0) << 9) + ((Static24.aBoolean14 ? 1 : 0) << 5) + ((Static1.aBoolean1 ? 1 : 0) << 3) + (Static231.anInt4421 & 0x7) + ((Static34.aBoolean18 ? 1 : 0) << 4) + ((Static205.aBoolean196 ? 1 : 0) << 6) + ((Static125.aBoolean111 ? 1 : 0) << 7) + ((Static207.anInt4148 & 0x3) << 17) - (-((Static74.aBoolean69 ? 1 : 0) << 8) - (((Static35.aBoolean27 ? 1 : 0) << 10) + ((Static137.aBoolean119 ? 1 : 0) << 16))) + ((Static151.aBoolean134 ? 1 : 0) << 19);
	}
}
