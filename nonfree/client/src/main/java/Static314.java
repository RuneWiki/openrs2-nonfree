import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static314 {

	@OriginalMember(owner = "client!po", name = "N", descriptor = "Lclient!ui;")
	public static Class248 aClass248_7;

	@OriginalMember(owner = "client!po", name = "Q", descriptor = "[S")
	public static short[] aShortArray100;

	@OriginalMember(owner = "client!po", name = "K", descriptor = "Lclient!ia;")
	public static final Class1_Sub3 aClass1_Sub3_7 = new Class1_Sub3(new byte[5000]);

	@OriginalMember(owner = "client!po", name = "O", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(III)I")
	public static int method4500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static330.anIntArray571[arg0 & 0x3] : 256;
	}
}
