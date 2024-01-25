import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!ss", name = "m", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_102 = new Class387(9, 7);

	@OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
	public static int anInt9321 = 0;

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "[I")
	public static final int[] anIntArray525 = new int[13];

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)Lclient!tia;")
	public static Class5_Sub50 method7994() {
		@Pc(6) Class5_Sub50 local6 = Static313.method4765();
		local6.anInt9624 = 0;
		local6.aClass387_108 = null;
		local6.aClass5_Sub23_Sub2_2 = new Class5_Sub23_Sub2(5000);
		return local6;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
	public static void method7995() {
		Static258.aClass89_1.method1619();
		Static205.aClass107_1.method4077();
		Static454.aClient1.method1239();
		Static24.aCanvas1.setBackground(Color.black);
		Static581.anInt9736 = -1;
		Static258.aClass89_1 = Static86.method1308(Static24.aCanvas1);
		Static205.aClass107_1 = Static564.method8143(Static24.aCanvas1);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)Z")
	public static boolean method7996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static126.method1774(arg0, arg1)) {
			return (arg0 & 0x9000) != 0 | Static52.method790(arg1, arg0) | Static489.method7066(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static402.method5909(arg1, arg0) | (arg0 & 0x2000) != 0 | Static93.method8793(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I")
	public static int method7998(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
