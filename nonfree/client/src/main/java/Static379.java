import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "Lclient!nj;")
	public static final Class171 aClass171_51 = new Class171(64);

	@OriginalMember(owner = "client!th", name = "d", descriptor = "I")
	public static int anInt6422 = 104;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "I")
	public static int anInt6423 = 0;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
	public static final int[] anIntArray547 = new int[13];

	@OriginalMember(owner = "client!th", name = "h", descriptor = "[[B")
	public static final byte[][] aByteArrayArray49 = new byte[50][];

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	public static int anInt6425 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!mg;III)Lclient!om;")
	public static Class2_Sub5_Sub12 method5081(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class2_Sub23 local14 = new Class2_Sub23(arg0.method3696(arg1, arg2));
		@Pc(47) Class2_Sub5_Sub12 local47 = new Class2_Sub5_Sub12(arg1, local14.method5494(), local14.method5494(), local14.method5508(), local14.method5508(), local14.method5495() == 1, local14.method5495(), local14.method5495());
		@Pc(51) int local51 = local14.method5495();
		for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
			local47.aClass14_38.method300(new Class2_Sub28(local14.method5495(), local14.method5500(), local14.method5500(), local14.method5500(), local14.method5500(), local14.method5500(), local14.method5500(), local14.method5500(), local14.method5500()));
		}
		local47.method4136();
		return local47;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIB)V")
	public static void method5082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(40) String local40 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local40);
		Static443.method5711(true, local40);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BIIIIIII)V")
	public static void method5083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static8.anInt223 <= arg6 && arg2 <= Static184.anInt3600 && Static430.anInt7123 <= arg0 && arg4 <= Static181.anInt3543) {
			Static276.method4065(arg0, arg1, arg5, arg6, arg4, arg3, arg2);
		} else {
			Static76.method1393(arg3, arg0, arg1, arg4, arg6, arg5, arg2);
		}
	}
}
