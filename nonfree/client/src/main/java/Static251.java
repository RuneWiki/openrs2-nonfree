import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
	public static int anInt4344;

	@OriginalMember(owner = "client!mn", name = "A", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!mn", name = "D", descriptor = "Lclient!ri;")
	public static Class207 aClass207_2;

	@OriginalMember(owner = "client!mn", name = "F", descriptor = "Lclient!vb;")
	public static Class251 aClass251_7;

	@OriginalMember(owner = "client!mn", name = "z", descriptor = "Lclient!ko;")
	public static final Class142 aClass142_26 = new Class142();

	@OriginalMember(owner = "client!mn", name = "B", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_216 = new Class12(28, 6);

	@OriginalMember(owner = "client!mn", name = "C", descriptor = "[I")
	public static final int[] anIntArray343 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!mn", name = "E", descriptor = "Lclient!nc;")
	public static final Class171 aClass171_3 = new Class171(1);

	@OriginalMember(owner = "client!mn", name = "G", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_217 = new Class12(103, 0);

	@OriginalMember(owner = "client!mn", name = "H", descriptor = "Lclient!nk;")
	public static final Class174 aClass174_6 = new Class174("WTRC", 1);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BILclient!m;Ljava/awt/Canvas;)Lclient!qa;")
	public static Class121 method3597(@OriginalArg(1) int arg0, @OriginalArg(2) Interface5 arg1, @OriginalArg(3) Canvas arg2) {
		return new Class121_Sub1(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	public static void method3599() {
		for (@Pc(10) Class1_Sub21 local10 = (Class1_Sub21) Static280.aClass142_29.method3199(); local10 != null; local10 = (Class1_Sub21) Static280.aClass142_29.method3198()) {
			if (local10.anInt3370 == -1) {
				local10.anInt3375 = 0;
				if (local10.anInt3367 >= 0 && local10.anInt3366 >= 0 && local10.anInt3367 < Static80.anInt6558 && local10.anInt3366 < Static104.anInt2048) {
					Static38.method506(local10);
				}
			} else {
				local10.method5965();
			}
		}
	}
}
