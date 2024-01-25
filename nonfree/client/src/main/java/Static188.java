import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
	public static int anInt3856;

	@OriginalMember(owner = "client!mb", name = "U", descriptor = "[[Lclient!ms;")
	public static Class137[][] aClass137ArrayArray1;

	@OriginalMember(owner = "client!mb", name = "K", descriptor = "Lclient!kh;")
	public static final Class11_Sub25 aClass11_Sub25_5 = new Class11_Sub25(new byte[5000]);

	@OriginalMember(owner = "client!mb", name = "M", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_36 = new Class26(64);

	@OriginalMember(owner = "client!mb", name = "R", descriptor = "[I")
	public static final int[] anIntArray298 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "Lclient!ms;")
	public static Class137 aClass137_11 = null;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	public static void method3465(@OriginalArg(0) int arg0) {
		@Pc(10) Class11_Sub4_Sub12 local10 = Static35.method512(9, arg0);
		local10.method3864();
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)Lclient!ms;")
	public static Class137 method3467(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class137 local9 = Static166.method2688(arg0);
		if (arg1 == -1) {
			return local9;
		} else if (local9 == null || local9.aClass137Array2 == null || arg1 >= local9.aClass137Array2.length) {
			return null;
		} else {
			return local9.aClass137Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZILjava/lang/String;Ljava/lang/String;ZJIIZ)V")
	public static void method3468(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class11_Sub25 local30 = new Class11_Sub25(128);
		local30.method5186(10);
		local30.method5204((arg9 ? 1 : 0) | (arg1 ? 2 : 0) | (arg5 ? 4 : 0));
		local30.method5178(arg6);
		local30.method5168(local8[0]);
		local30.method5173(arg4);
		local30.method5168(local8[1]);
		local30.method5204(Static96.anInt1755);
		local30.method5186(arg0);
		local30.method5186(arg8);
		local30.method5168(local8[2]);
		local30.method5204(arg2);
		local30.method5204(arg7);
		local30.method5168(local8[3]);
		local30.method5181(Static108.aBigInteger2, Static57.aBigInteger1);
		@Pc(122) Class11_Sub25 local122 = new Class11_Sub25(350);
		local122.method5173(arg3);
		@Pc(134) int local134 = 8 - Static350.method5658(arg3) % 8;
		for (@Pc(136) int local136 = 0; local136 < local134; local136++) {
			local122.method5186((int) (Math.random() * 255.0D));
		}
		local122.method5172(local8);
		Static313.aClass11_Sub25_Sub1_5.anInt6076 = 0;
		Static313.aClass11_Sub25_Sub1_5.method5186(22);
		Static313.aClass11_Sub25_Sub1_5.method5204(local122.anInt6076 + local30.anInt6076 + 2);
		Static313.aClass11_Sub25_Sub1_5.method5204(567);
		Static313.aClass11_Sub25_Sub1_5.method5226(local30.aByteArray93, local30.anInt6076);
		Static313.aClass11_Sub25_Sub1_5.method5226(local122.aByteArray93, local122.anInt6076);
		Static2.anInt9 = 0;
		Static41.anInt740 = 0;
		Static90.anInt4649 = -3;
		Static136.anInt6476 = 1;
	}
}
