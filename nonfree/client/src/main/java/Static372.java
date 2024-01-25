import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!nea", name = "D", descriptor = "Lclient!eq;")
	public static Class97 aClass97_95;

	@OriginalMember(owner = "client!nea", name = "I", descriptor = "I")
	public static int anInt6644 = 0;

	@OriginalMember(owner = "client!nea", name = "L", descriptor = "[C")
	public static final char[] aCharArray9 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)V")
	public static void method5609(@OriginalArg(0) int arg0) {
		Static304.anInt5622 = arg0;
		Static92.anInt1857 = -1;
		Static92.anInt1857 = -1;
		Static466.method3730();
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BLclient!wk;)Z")
	public static boolean method5610(@OriginalArg(1) Interface27 arg0) {
		@Pc(10) Class350 local10 = Static619.aClass281_4.method6734(arg0.method8326());
		if (local10.anInt9637 == -1) {
			return true;
		} else {
			@Pc(28) Class375 local28 = Static509.aClass139_3.method3442(local10.anInt9637);
			return local28.anInt10173 == -1 ? true : local28.method8498();
		}
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)V")
	public static void method5611() {
		Static571.anInt9395 = 0;
		for (@Pc(16) int local16 = 0; local16 < 2048; local16++) {
			Static624.aClass2_Sub34Array1[local16] = null;
			Static99.aByteArray24[local16] = 1;
			Static428.aClass85Array1[local16] = null;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!d;IILjava/awt/Canvas;)Lclient!ha;")
	public static Class87 method5613(@OriginalArg(0) Interface6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		return new Class87_Sub2(arg2, arg0, arg1);
	}
}
