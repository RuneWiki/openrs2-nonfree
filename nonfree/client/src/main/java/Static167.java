import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Lclient!dh;")
	public static final Class64 aClass64_5 = new Class64("", 15);

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!ge;)V")
	public static void method3552(@OriginalArg(1) Class1_Sub6 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static197.aClass307_6 != null) {
			@Pc(27) int local27;
			try {
				Static197.aClass307_6.method7175(0L);
				Static197.aClass307_6.method7178(local13);
				for (local27 = 0; local27 < 24 && local13[local27] == 0; local27++) {
				}
				if (local27 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local27 = 0; local27 < 24; local27++) {
					local13[local27] = -1;
				}
			}
		}
		arg0.method3940(local13, 24);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3553(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static234.anInt4709; local11++) {
			if (arg0.equalsIgnoreCase(Static528.aStringArray43[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IILclient!raa;Lclient!ov;IILclient!qa;Lclient!bl;)V")
	public static void method3556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub39 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class122 arg5, @OriginalArg(7) Class30 arg6) {
		@Pc(20) int local20 = arg2.anInt7252 - arg0 / 2 - 5;
		@Pc(24) int local24 = arg4 + 2;
		if (arg6.anInt875 != 0) {
			arg5.method7265(arg6.anInt875, arg4 + arg1 * arg3.method5327() + 1 - local24, local20, arg0 + 10, local24);
		}
		if (arg6.anInt897 != 0) {
			arg5.method7223(local20, arg4 + arg1 * arg3.method5327() + 1 - local24, arg0 + 10, arg6.anInt897, local24);
		}
		@Pc(81) int local81 = arg6.anInt872;
		if (arg2.aBoolean521 && arg6.anInt885 != -1) {
			local81 = arg6.anInt885;
		}
		for (@Pc(94) int local94 = 0; local94 < arg1; local94++) {
			@Pc(100) String local100 = Static101.aStringArray40[local94];
			if (local94 < arg1 - 1) {
				local100 = local100.substring(0, local100.length() - 4);
			}
			arg3.method5325(arg5, local100, arg2.anInt7252, arg4, local81);
			arg4 += arg3.method5327();
		}
	}
}
