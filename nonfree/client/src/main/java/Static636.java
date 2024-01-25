import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
	public static int anInt10648;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "Lclient!om;")
	public static Class57 aClass57_4;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_186 = new Class268(76, 0);

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "[I")
	public static final int[] anIntArray642 = new int[2];

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "Lclient!bh;")
	public static final Class35 aClass35_7 = new Class35("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public static void method8949(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static563.method8109(local6.width, local6.height);
		if (Static469.anInt8256 == 1) {
			Static117.aClass100_5.method8769(arg0, Static164.anInt3399, Static320.anInt6116);
		} else {
			Static117.aClass100_5.method8769(arg0, Static609.anInt10076, Static8.anInt159);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)V")
	public static void method8951(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static347.anInt6542 <= arg1 && Static553.anInt9425 >= arg1) {
			@Pc(20) int local20 = Static384.method6192(Static567.anInt9578, Static100.anInt10042, arg3);
			@Pc(26) int local26 = Static384.method6192(Static567.anInt9578, Static100.anInt10042, arg0);
			Static368.method5826(local20, local26, arg2, arg1);
		}
	}
}
