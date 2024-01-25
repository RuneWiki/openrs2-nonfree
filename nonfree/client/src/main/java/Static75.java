import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "Lclient!he;")
	public static Class100 aClass100_12;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_25 = new Class267("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)[B")
	public static byte[] method1488(@OriginalArg(1) int arg0) {
		@Pc(17) Class6_Sub2_Sub3 local17 = (Class6_Sub2_Sub3) Static440.aClass243_5.method5962((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(49) int local49 = 255 - local43;
				@Pc(54) int local54 = Static267.method4083(local28, local49);
				@Pc(58) byte local58 = local22[local54];
				local22[local54] = local22[local49];
				local22[local49] = local22[511 - local43] = local58;
			}
			local17 = new Class6_Sub2_Sub3(local22);
			Static440.aClass243_5.method5960(local17, (long) arg0);
		}
		return local17.aByteArray28;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)Z")
	public static boolean method1489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static127.anInt2702; local1++) {
			@Pc(6) Class16 local6 = Static183.aClass16Array3[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt522 == 1) {
				local15 = local6.anInt512 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt511 + (local6.anInt516 * local15 >> 8);
					local37 = local6.anInt528 + (local6.anInt527 * local15 >> 8);
					local47 = local6.anInt510 + (local6.anInt525 * local15 >> 8);
					local57 = local6.anInt517 + (local6.anInt515 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt522 == 2) {
				local15 = arg0 - local6.anInt512;
				if (local15 > 0) {
					local27 = local6.anInt511 + (local6.anInt516 * local15 >> 8);
					local37 = local6.anInt528 + (local6.anInt527 * local15 >> 8);
					local47 = local6.anInt510 + (local6.anInt525 * local15 >> 8);
					local57 = local6.anInt517 + (local6.anInt515 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt522 == 3) {
				local15 = local6.anInt511 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt512 + (local6.anInt523 * local15 >> 8);
					local37 = local6.anInt526 + (local6.anInt518 * local15 >> 8);
					local47 = local6.anInt510 + (local6.anInt525 * local15 >> 8);
					local57 = local6.anInt517 + (local6.anInt515 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt522 == 4) {
				local15 = arg2 - local6.anInt511;
				if (local15 > 0) {
					local27 = local6.anInt512 + (local6.anInt523 * local15 >> 8);
					local37 = local6.anInt526 + (local6.anInt518 * local15 >> 8);
					local47 = local6.anInt510 + (local6.anInt525 * local15 >> 8);
					local57 = local6.anInt517 + (local6.anInt515 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt522 == 5) {
				local15 = arg1 - local6.anInt510;
				if (local15 > 0) {
					local27 = local6.anInt512 + (local6.anInt523 * local15 >> 8);
					local37 = local6.anInt526 + (local6.anInt518 * local15 >> 8);
					local47 = local6.anInt511 + (local6.anInt516 * local15 >> 8);
					local57 = local6.anInt528 + (local6.anInt527 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
	public static void method1490(@OriginalArg(1) int arg0) {
		Static368.anIntArray396 = new int[arg0];
		Static280.anIntArray336 = new int[arg0];
		Static222.anIntArray293 = new int[arg0];
		Static332.anIntArray390 = new int[arg0];
		Static263.anIntArray322 = new int[arg0];
	}
}
