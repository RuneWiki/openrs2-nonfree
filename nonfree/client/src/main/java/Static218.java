import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
	public static int anInt4453;

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
	public static int anInt4454 = 0;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)Z")
	public static boolean method3955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static29.anInt638; local1++) {
			@Pc(6) Class183 local6 = Static118.aClass183Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt5659 == 1) {
				local15 = local6.anInt5656 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt5653 + (local6.anInt5669 * local15 >> 8);
					local37 = local6.anInt5666 + (local6.anInt5673 * local15 >> 8);
					local47 = local6.anInt5661 + (local6.anInt5658 * local15 >> 8);
					local57 = local6.anInt5654 + (local6.anInt5670 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5659 == 2) {
				local15 = arg0 - local6.anInt5656;
				if (local15 > 0) {
					local27 = local6.anInt5653 + (local6.anInt5669 * local15 >> 8);
					local37 = local6.anInt5666 + (local6.anInt5673 * local15 >> 8);
					local47 = local6.anInt5661 + (local6.anInt5658 * local15 >> 8);
					local57 = local6.anInt5654 + (local6.anInt5670 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5659 == 3) {
				local15 = local6.anInt5653 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt5656 + (local6.anInt5665 * local15 >> 8);
					local37 = local6.anInt5663 + (local6.anInt5671 * local15 >> 8);
					local47 = local6.anInt5661 + (local6.anInt5658 * local15 >> 8);
					local57 = local6.anInt5654 + (local6.anInt5670 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5659 == 4) {
				local15 = arg2 - local6.anInt5653;
				if (local15 > 0) {
					local27 = local6.anInt5656 + (local6.anInt5665 * local15 >> 8);
					local37 = local6.anInt5663 + (local6.anInt5671 * local15 >> 8);
					local47 = local6.anInt5661 + (local6.anInt5658 * local15 >> 8);
					local57 = local6.anInt5654 + (local6.anInt5670 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5659 == 5) {
				local15 = arg1 - local6.anInt5661;
				if (local15 > 0) {
					local27 = local6.anInt5656 + (local6.anInt5665 * local15 >> 8);
					local37 = local6.anInt5663 + (local6.anInt5671 * local15 >> 8);
					local47 = local6.anInt5653 + (local6.anInt5669 * local15 >> 8);
					local57 = local6.anInt5666 + (local6.anInt5673 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZLclient!mq;)Z")
	public static boolean method3956(@OriginalArg(1) Class136 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean329) {
			return false;
		} else if (!arg0.method3851()) {
			return false;
		} else if (Static346.aClass43_37.method1273((long) arg0.anInt4272) == null) {
			return Static5.aClass43_15.method1273((long) arg0.anInt4248) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLclient!tj;IIIZI)V")
	public static void method3957(@OriginalArg(1) Class193 arg0, @OriginalArg(4) int arg1, @OriginalArg(6) int arg2) {
		Static317.aClass193_100 = arg0;
		Static235.anInt4754 = arg2;
		Static23.anInt458 = 0;
		Static261.anInt5280 = 1;
		Static254.anInt2745 = 2;
		Static16.anInt334 = arg1;
		Static51.aBoolean100 = false;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)[B")
	public static byte[] method3958(@OriginalArg(1) int arg0) {
		@Pc(19) Class4_Sub4_Sub19 local19 = (Class4_Sub4_Sub19) Static152.aClass124_6.method3525((long) arg0);
		if (local19 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(52) int local52 = 255 - local45;
				@Pc(57) int local57 = Static355.method5668(local30, local52);
				@Pc(61) byte local61 = local24[local57];
				local24[local57] = local24[local52];
				local24[local52] = local24[511 - local45] = local61;
			}
			local19 = new Class4_Sub4_Sub19(local24);
			Static152.aClass124_6.method3528(local19, (long) arg0);
		}
		return local19.aByteArray80;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLclient!sp;)Ljava/lang/String;")
	public static String method3959(@OriginalArg(1) Class4_Sub39 arg0) {
		return arg0.aString59 == null || arg0.aString59.length() <= 0 ? arg0.aString60 : arg0.aString60 + Static44.aClass159_66.method4311(Static180.anInt3835) + arg0.aString59;
	}
}
