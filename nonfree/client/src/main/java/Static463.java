import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "Z")
	public static boolean aBoolean571 = false;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)Z")
	public static boolean method6576(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z[BIBIILclient!ag;I)Lclient!ck;")
	public static Class52_Sub1_Sub1 method6577(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class12_Sub1 arg3) {
		if (arg3.aBoolean22 || Static119.method2029(arg1) && Static119.method2029(arg2)) {
			return new Class52_Sub1_Sub1(arg3, 3553, 6406, arg1, arg2, false, arg0, 6406);
		} else if (arg3.aBoolean21) {
			return new Class52_Sub1_Sub1(arg3, 34037, 6406, arg1, arg2, false, arg0, 6406);
		} else {
			return new Class52_Sub1_Sub1(arg3, 6406, arg1, arg2, Static200.method3428(arg1), Static200.method3428(arg2), arg0, 6406);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)I")
	public static int method6578(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 24;
		@Pc(30) int local30 = ((arg1 & 0xFF00) * local12 & 0xFF0000 | (arg1 & 0xFF00FF) * local12 & 0xFF00FF00) >>> 8;
		@Pc(35) int local35 = 255 - local12;
		return ((local35 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local35 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local30;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(III)V")
	public static void method6579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static300.method4703(arg0)) {
			Static49.method1137(Static249.aClass365ArrayArray3[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(II)Z")
	public static boolean method6580(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class1_Sub23 local10 = (Class1_Sub23) Static3.aClass361_1.method7854(); local10 != null; local10 = (Class1_Sub23) Static3.aClass361_1.method7853()) {
			if (Static83.method1702(local10.anInt5147) && (long) arg0 == local10.aLong215) {
				return true;
			}
		}
		return false;
	}
}
