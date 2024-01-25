import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "Lclient!iga;")
	public static final Class159 aClass159_5 = new Class159(2, -1);

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[8];

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_74 = new Class179(70, 1);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)Lclient!bq;")
	public static Class2_Sub1_Sub3 method1398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static441.aClass351ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass2_Sub1_Sub3_1 == null ? null : local7.aClass2_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V")
	public static void method1399(@OriginalArg(1) int arg0) {
		if (Static560.anInt1380 == 1) {
			Static557.anInt9345 = arg0;
		} else if (Static560.anInt1380 == 2) {
			Static182.anInt3145 = arg0;
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)I")
	public static int method1403(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
