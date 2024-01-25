import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!si", name = "k", descriptor = "Lclient!dh;")
	public static final Class62 aClass62_15 = new Class62("stellardawn", 1);

	@OriginalMember(owner = "client!si", name = "l", descriptor = "[I")
	public static final int[] anIntArray612 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!si", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray100 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!si", name = "s", descriptor = "I")
	public static int anInt10102 = -1;

	@OriginalMember(owner = "client!si", name = "t", descriptor = "Z")
	public static boolean aBoolean849 = false;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	public static void method8298(@OriginalArg(1) int arg0) {
		if (Static263.method4883(arg0)) {
			Static282.method4633(-1, Static85.aClass108ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!tha;B[[B)V")
	public static void method8301(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(16) int local16 = Static166.aByteArrayArray8.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(24) byte[] local24 = arg1[local18];
			if (local24 != null) {
				@Pc(37) int local37 = (Static475.anIntArray531[local18] >> 8) * 64 - Static446.anInt8090;
				@Pc(47) int local47 = (Static475.anIntArray531[local18] & 0xFF) * 64 - Static124.anInt3150;
				Static14.method8598();
				arg0.method7715(local24, Static334.aClass291Array20, Static47.aClass33_3, local37, local47);
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V")
	public static void method8303(@OriginalArg(0) int arg0) {
		if (Static565.anInt9608 == 0) {
			Static522.aClass3_Sub7_Sub5_4.method6043(arg0);
		} else {
			Static458.anInt8332 = arg0;
		}
	}
}
