import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
	public static int anInt5531;

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "[S")
	public static final short[] aShortArray103 = new short[] { 11, 17, 5, 12, 48, 6, 3, 10 };

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
	public static int anInt5529 = 255;

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
	public static int anInt5530 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Z")
	public static boolean method4780(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
	public static void method4781() {
		Static48.aClass69_1.method2265();
		Static311.aClass129_1.method2998();
		if (Static31.aClass167_1 != null) {
			Static31.aClass167_1.method5461(Static257.aCanvas4);
		}
		Static387.aClient1.method757();
		Static257.aCanvas4.setBackground(Color.black);
		Static244.anInt4347 = -1;
		Static48.aClass69_1 = Static57.method3257(Static257.aCanvas4);
		Static311.aClass129_1 = Static315.method4661(Static257.aCanvas4);
		if (Static31.aClass167_1 != null) {
			Static31.aClass167_1.method5462(Static257.aCanvas4);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method4783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class251 local7 = Static64.aClass251ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class46 local13 = local7.aClass46_3; local13 != null; local13 = local13.aClass46_1) {
			@Pc(17) Class1_Sub5 local17 = local13.aClass1_Sub5_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort96 == arg1 && local17.aShort97 == arg2) {
				Static297.method4435(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lclient!ks;")
	public static Class2_Sub10_Sub11 method4784(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub10_Sub11 local15 = (Class2_Sub10_Sub11) Static364.aClass166_5.method3688((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static305.aClass171_80.method3745(arg0, 0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local15 = Static131.method2581(local25);
			Static364.aClass166_5.method3693((long) arg0, local15);
			return local15;
		}
	}
}
