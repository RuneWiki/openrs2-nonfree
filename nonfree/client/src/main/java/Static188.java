import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!ht", name = "D", descriptor = "Lclient!hba;")
	public static final Class121 aClass121_2 = new Class121(1);

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(III)Z")
	public static boolean method3617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static349.anInt6412; local1++) {
			@Pc(6) Class192 local6 = Static79.aClass192Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt5943 == 1) {
				local15 = local6.anInt5937 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt5944 + (local6.anInt5948 * local15 >> 8);
					local37 = local6.anInt5947 + (local6.anInt5945 * local15 >> 8);
					local47 = local6.anInt5930 + (local6.anInt5938 * local15 >> 8);
					local57 = local6.anInt5942 + (local6.anInt5933 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5943 == 2) {
				local15 = arg0 - local6.anInt5937;
				if (local15 > 0) {
					local27 = local6.anInt5944 + (local6.anInt5948 * local15 >> 8);
					local37 = local6.anInt5947 + (local6.anInt5945 * local15 >> 8);
					local47 = local6.anInt5930 + (local6.anInt5938 * local15 >> 8);
					local57 = local6.anInt5942 + (local6.anInt5933 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5943 == 3) {
				local15 = local6.anInt5944 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt5937 + (local6.anInt5931 * local15 >> 8);
					local37 = local6.anInt5949 + (local6.anInt5932 * local15 >> 8);
					local47 = local6.anInt5930 + (local6.anInt5938 * local15 >> 8);
					local57 = local6.anInt5942 + (local6.anInt5933 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5943 == 4) {
				local15 = arg2 - local6.anInt5944;
				if (local15 > 0) {
					local27 = local6.anInt5937 + (local6.anInt5931 * local15 >> 8);
					local37 = local6.anInt5949 + (local6.anInt5932 * local15 >> 8);
					local47 = local6.anInt5930 + (local6.anInt5938 * local15 >> 8);
					local57 = local6.anInt5942 + (local6.anInt5933 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5943 == 5) {
				local15 = arg1 - local6.anInt5930;
				if (local15 > 0) {
					local27 = local6.anInt5937 + (local6.anInt5931 * local15 >> 8);
					local37 = local6.anInt5949 + (local6.anInt5932 * local15 >> 8);
					local47 = local6.anInt5944 + (local6.anInt5948 * local15 >> 8);
					local57 = local6.anInt5947 + (local6.anInt5945 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)Z")
	public static boolean method3621(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}
}
