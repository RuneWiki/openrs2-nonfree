import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "Lclient!bi;")
	public static Class23 aClass23_5;

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_181 = new Class189("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "[I")
	public static final int[] anIntArray376 = new int[1000];

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "([[BILclient!hu;)V")
	public static void method4426(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class105_Sub1 arg1) {
		@Pc(13) int local13 = Static29.aByteArrayArray18.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(21) byte[] local21 = arg0[local15];
			if (local21 != null) {
				@Pc(34) int local34 = (Static81.anIntArray204[local15] >> 8) * 64 - Static223.anInt7618;
				@Pc(44) int local44 = (Static81.anIntArray204[local15] & 0xFF) * 64 - Static57.anInt5085;
				Static170.method2751();
				arg1.method2679(local34, local44, local21, Static382.aClass29Array3, Static121.aClass172_3);
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)Z")
	public static boolean method4427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static169.anInt5820; local1++) {
			@Pc(6) Class155 local6 = Static269.aClass155Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt4772 == 1) {
				local15 = local6.anInt4776 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt4773 + (local6.anInt4774 * local15 >> 8);
					local37 = local6.anInt4784 + (local6.anInt4775 * local15 >> 8);
					local47 = local6.anInt4781 + (local6.anInt4789 * local15 >> 8);
					local57 = local6.anInt4786 + (local6.anInt4777 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4772 == 2) {
				local15 = arg0 - local6.anInt4776;
				if (local15 > 0) {
					local27 = local6.anInt4773 + (local6.anInt4774 * local15 >> 8);
					local37 = local6.anInt4784 + (local6.anInt4775 * local15 >> 8);
					local47 = local6.anInt4781 + (local6.anInt4789 * local15 >> 8);
					local57 = local6.anInt4786 + (local6.anInt4777 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4772 == 3) {
				local15 = local6.anInt4773 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt4776 + (local6.anInt4771 * local15 >> 8);
					local37 = local6.anInt4788 + (local6.anInt4782 * local15 >> 8);
					local47 = local6.anInt4781 + (local6.anInt4789 * local15 >> 8);
					local57 = local6.anInt4786 + (local6.anInt4777 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4772 == 4) {
				local15 = arg2 - local6.anInt4773;
				if (local15 > 0) {
					local27 = local6.anInt4776 + (local6.anInt4771 * local15 >> 8);
					local37 = local6.anInt4788 + (local6.anInt4782 * local15 >> 8);
					local47 = local6.anInt4781 + (local6.anInt4789 * local15 >> 8);
					local57 = local6.anInt4786 + (local6.anInt4777 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4772 == 5) {
				local15 = arg1 - local6.anInt4781;
				if (local15 > 0) {
					local27 = local6.anInt4776 + (local6.anInt4771 * local15 >> 8);
					local37 = local6.anInt4788 + (local6.anInt4782 * local15 >> 8);
					local47 = local6.anInt4773 + (local6.anInt4774 * local15 >> 8);
					local57 = local6.anInt4784 + (local6.anInt4775 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZLclient!vr;IZILclient!vr;)I")
	public static int method4428(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class117_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class117_Sub1 arg5) {
		@Pc(10) int local10 = Static309.method4310(arg2, arg5, arg1, arg3);
		if (local10 != 0) {
			return arg3 ? -local10 : local10;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(39) int local39 = Static309.method4310(arg4, arg5, arg1, arg0);
			return arg0 ? -local39 : local39;
		}
	}
}
