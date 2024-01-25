import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "[Lclient!jw;")
	public static final Class3_Sub5[] aClass3_Sub5Array2 = new Class3_Sub5[8];

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)V")
	public static void method2376() {
		Static517.anInt8136 = -1;
		Static681.anInt10651 = -1;
		Static306.anInt4920 = 0;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(JIZ)Lclient!w;")
	public static Class3_Sub7_Sub21 method2378(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class3_Sub7_Sub21 local14 = (Class3_Sub7_Sub21) Static379.aClass313_29.method7104((long) arg1 << 56 | arg0);
		if (local14 == null) {
			local14 = new Class3_Sub7_Sub21(arg1, arg0);
			Static379.aClass313_29.method7107(local14.aLong345, local14);
		}
		return local14;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IB[S)[S")
	public static short[] method2379(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(13) short[] local13 = new short[arg0];
		Static732.method6319(arg1, 0, local13, 0, arg0);
		return local13;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)Z")
	public static boolean method2380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | Static261.method3654(arg0, arg1) || Static148.method2490(arg1, arg0);
	}
}
