import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Lclient!wi;")
	public static final Class268 aClass268_44 = new Class268(4);

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "F")
	public static float aFloat87 = 0.0F;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	public static int anInt5320 = 0;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "[I")
	public static final int[] anIntArray332 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!l;)Lclient!qa;")
	public static Class167 method4386(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface7 arg2) {
		return new Class167_Sub2(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!hi;")
	public static Class1_Sub2 method4388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class227 local7 = Static389.aClass227ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class114 local14 = local7.aClass114_2; local14 != null; local14 = local14.aClass114_1) {
			@Pc(18) Class1_Sub2 local18 = local14.aClass1_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort108 == arg1 && local18.aShort107 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
	public static void method4389(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static211.aFloat4 = 3.0F;
		} else if (arg0 == 50) {
			Static211.aFloat4 = 4.0F;
		} else if (arg0 == 75) {
			Static211.aFloat4 = 6.0F;
		} else if (arg0 == 100) {
			Static211.aFloat4 = 8.0F;
		} else if (arg0 == 200) {
			Static211.aFloat4 = 16.0F;
		}
		Static280.anInt4669 = -1;
		Static280.anInt4669 = -1;
	}
}
