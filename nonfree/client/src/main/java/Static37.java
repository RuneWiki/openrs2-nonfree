import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bga", name = "o", descriptor = "Lclient!kha;")
	public static Class181 aClass181_5;

	@OriginalMember(owner = "client!bga", name = "k", descriptor = "I")
	public static int anInt703 = -50;

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)Lclient!ha;")
	public static Class33 method726(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2) {
		return new Class33_Sub3(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IZI)V")
	public static void method727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub1_Sub21 local13 = Static57.method8561(arg1, 17);
		local13.method8631();
		local13.anInt10489 = arg0;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!kha;IIIIJZI)V")
	public static void method729(@OriginalArg(0) Class181 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) long arg2, @OriginalArg(7) int arg3) {
		Static218.aClass3_Sub7_Sub5_1 = null;
		Static459.aLong211 = arg2;
		Static458.anInt8332 = arg1;
		Static370.anInt7046 = 10000;
		Static135.anInt3494 = 0;
		Static627.anInt10354 = arg3;
		Static369.anInt7034 = 0;
		Static110.aClass181_22 = arg0;
		Static565.anInt9608 = 1;
		Static618.aBoolean861 = false;
	}
}
