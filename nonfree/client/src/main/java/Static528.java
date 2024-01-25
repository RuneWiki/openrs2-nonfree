import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
	public static void method7588() {
		Static450.aBoolean531 = true;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIII)V")
	public static void method7589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static84.anInt1440 = arg0;
		Static292.anInt4769 = arg3;
		Static78.anInt1306 = arg1;
		Static195.anInt3390 = arg2;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZ[IZILclient!pea;)Lclient!mm;")
	public static Class35_Sub3_Sub1 method7590(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class121_Sub3 arg3) {
		if (arg3.aBoolean457 || Static392.method5808(arg2) && Static392.method5808(arg0)) {
			return new Class35_Sub3_Sub1(arg3, 3553, arg2, arg0, false, arg1);
		} else if (arg3.aBoolean464) {
			return new Class35_Sub3_Sub1(arg3, 34037, arg2, arg0, false, arg1);
		} else {
			return new Class35_Sub3_Sub1(arg3, arg2, arg0, Static516.method7313(arg2), Static516.method7313(arg0), arg1);
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BZ)I")
	public static int method7591(@OriginalArg(1) boolean arg0) {
		if (Static380.anIntArray555 == null) {
			return 0;
		} else if (arg0 || Static400.aClass191Array2 == null) {
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < Static380.anIntArray555.length; local27++) {
				@Pc(33) int local33 = Static380.anIntArray555[local27];
				if (Static251.aClass251_87.method5859(local33)) {
					local25++;
				}
				if (Static15.aClass251_139.method5859(local33)) {
					local25++;
				}
			}
			return local25;
		} else {
			return Static380.anIntArray555.length * 2;
		}
	}
}
