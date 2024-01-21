import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString6;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1504 = Static151.method2243("<col=ff9040>");

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "Lclient!lc;")
	public static Class58 aClass58_15 = new Class58(512);

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "[I")
	public static final int[] anIntArray391 = new int[100];

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1505 = Static151.method2243("details)3dat");

	@OriginalMember(owner = "client!wb", name = "cb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1506 = Static151.method2243(":assist:");

	@OriginalMember(owner = "client!wb", name = "db", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1507 = Static151.method2243("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!wb", name = "eb", descriptor = "[I")
	public static int[] anIntArray395 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
	public static int anInt4378 = 0;

	@OriginalMember(owner = "client!wb", name = "hb", descriptor = "I")
	public static int anInt4379 = 0;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(B)[Lclient!vi;")
	public static Class2_Sub1_Sub2[] method3053() {
		@Pc(8) Class2_Sub1_Sub2[] local8 = new Class2_Sub1_Sub2[Static208.anInt4345];
		for (@Pc(15) int local15 = 0; local15 < Static208.anInt4345; local15++) {
			@Pc(25) int local25 = Static138.anIntArray256[local15] * Static86.anIntArray298[local15];
			@Pc(29) byte[] local29 = Static8.aByteArrayArray1[local15];
			@Pc(32) int[] local32 = new int[local25];
			for (@Pc(34) int local34 = 0; local34 < local25; local34++) {
				local32[local34] = Static108.anIntArray222[local29[local34] & 0xFF];
			}
			local8[local15] = new Class2_Sub1_Sub2_Sub1(Static138.anInt2900, Static127.anInt2808, Static19.anIntArray38[local15], Static25.anIntArray57[local15], Static86.anIntArray298[local15], Static138.anIntArray256[local15], local32);
		}
		Static169.method2456();
		return local8;
	}
}
