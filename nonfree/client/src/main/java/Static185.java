import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!va", name = "N", descriptor = "[Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array11;

	@OriginalMember(owner = "client!va", name = "ab", descriptor = "Lclient!wb;")
	public static Class3_Sub25 aClass3_Sub25_1;

	@OriginalMember(owner = "client!va", name = "bb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!va", name = "cb", descriptor = "[[[Lclient!kf;")
	public static Class3_Sub15[][][] aClass3_Sub15ArrayArrayArray1;

	@OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
	public static final int anInt4185 = 4;

	@OriginalMember(owner = "client!va", name = "R", descriptor = "[I")
	public static final int[] anIntArray499 = new int[anInt4185];

	@OriginalMember(owner = "client!va", name = "S", descriptor = "I")
	public static int anInt4181 = 0;

	@OriginalMember(owner = "client!va", name = "W", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1637 = Static120.method1824("");

	@OriginalMember(owner = "client!va", name = "X", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1638 = Static120.method1824("floorshadows");

	@OriginalMember(owner = "client!va", name = "Y", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1639 = Static120.method1824("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!va", name = "Z", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1640 = aClass80_1637;

	@OriginalMember(owner = "client!va", name = "db", descriptor = "[[Lclient!mg;")
	public static final Class60[][] aClass60ArrayArray1 = new Class60[anInt4185][500];

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!bc;Lclient!bc;Z)V")
	public static void method2993(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		Static99.aClass1_15 = arg1;
		Static42.aClass1_8 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZIIII)V")
	public static void method2994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static34.anInt790 <= arg1 && arg1 <= Static17.anInt440) {
			@Pc(18) int local18 = Static61.method895(arg2, Static172.anInt3861, Static85.anInt1779);
			@Pc(24) int local24 = Static61.method895(arg3, Static172.anInt3861, Static85.anInt1779);
			Static149.method2389(local24, arg1, arg0, local18);
		}
	}
}
