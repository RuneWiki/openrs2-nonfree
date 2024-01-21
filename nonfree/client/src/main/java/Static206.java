import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	public static int anInt4387;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "I")
	public static int anInt4395;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	public static int anInt4385 = 0;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2572 = Static118.method2249("");

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	public static final int anInt4389 = 2301979;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "[J")
	public static final long[] aLongArray10 = new long[200];

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;)Lclient!oc;")
	public static Class65 method3275(@OriginalArg(1) String arg0) {
		@Pc(11) byte[] local11;
		try {
			local11 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(13) UnsupportedEncodingException local13) {
			local11 = arg0.getBytes();
		}
		@Pc(24) Class65 local24 = new Class65();
		local24.anInt3190 = 0;
		local24.aByteArray37 = local11;
		for (@Pc(32) int local32 = 0; local32 < local11.length; local32++) {
			if (local11[local32] != 0) {
				local11[local24.anInt3190++] = local11[local32];
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BIIII)V")
	public static void method3277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static71.anInt1744 <= arg1 - arg2 && Static23.anInt685 >= arg2 + arg1 && anInt4385 <= arg3 - arg2 && arg2 + arg3 <= Static133.anInt3309) {
			Static178.method3020(arg1, arg2, arg3, arg0);
		} else {
			Static26.method474(arg3, arg0, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Z")
	public static boolean method3278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static191.anIntArrayArrayArray8[arg0][arg1][arg2];
		if (local7 == -Static11.anInt255) {
			return false;
		} else if (local7 == Static11.anInt255) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static9.method165(local22 + 1, anIntArrayArrayArray10[arg0][arg1][arg2], local26 + 1) && Static9.method165(local22 + 128 - 1, anIntArrayArrayArray10[arg0][arg1 + 1][arg2], local26 + 1) && Static9.method165(local22 + 128 - 1, anIntArrayArrayArray10[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static9.method165(local22 + 1, anIntArrayArrayArray10[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static191.anIntArrayArrayArray8[arg0][arg1][arg2] = Static11.anInt255;
				return true;
			} else {
				Static191.anIntArrayArrayArray8[arg0][arg1][arg2] = -Static11.anInt255;
				return false;
			}
		}
	}
}
