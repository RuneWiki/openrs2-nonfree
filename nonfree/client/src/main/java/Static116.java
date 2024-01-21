import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
	public static int anInt2761;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "[Lclient!sd;")
	public static Class73[] aClass73Array18 = new Class73[100];

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
	public static int anInt2760 = 0;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
	public static int anInt2763 = 0;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
	public static int anInt2764 = 0;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "B")
	public static byte aByte7 = 0;

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "[I")
	public static int[] anIntArray302 = new int[100];

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
	public static void method2044() {
		aClass73Array18 = null;
		anIntArray302 = null;
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
	public static void method2045() {
		for (@Pc(14) Class3_Sub10 local14 = (Class3_Sub10) Static29.aClass72_11.method2401(); local14 != null; local14 = (Class3_Sub10) Static29.aClass72_11.method2407()) {
			if (local14.anInt989 == -1) {
				local14.anInt997 = 0;
				Static14.method233(local14);
			} else {
				local14.method2783();
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
	public static void method2046(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		@Pc(16) Class3_Sub1_Sub11 local16 = (Class3_Sub1_Sub11) Static79.aClass16_8.method554(local10);
		if (local16 != null) {
			Static123.aClass50_2.method1600(local16);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)Lclient!sd;")
	public static Class73 method2047(@OriginalArg(1) int arg0) {
		@Pc(7) Class73 local7 = new Class73();
		local7.anInt3356 = 0;
		local7.aByteArray36 = new byte[arg0];
		return local7;
	}
}
