import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	public static int anInt4575;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "[I")
	public static int[] anIntArray377;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "Lclient!laa;")
	public static final Class179 aClass179_3 = new Class179(6, 0, 4, 2);

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "[I")
	public static int[] anIntArray376 = new int[2];

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)I")
	public static int method3888(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public static void method3889() {
		if (Static375.anInt9162 == 9) {
			Static436.method6188(5);
		} else if (Static375.anInt9162 == 5 || Static375.anInt9162 == 6) {
			Static436.method6188(3);
		} else if (Static375.anInt9162 == 12) {
			Static436.method6188(3);
		}
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V")
	public static void method3890() {
		if (Static85.aFrame1 != null) {
			return;
		}
		@Pc(19) Container local19;
		if (Static435.aFrame2 != null) {
			local19 = Static435.aFrame2;
		} else if (Static198.anApplet1 == null) {
			local19 = Static576.anApplet_Sub1_1;
		} else {
			local19 = Static198.anApplet1;
		}
		Static258.anInt4672 = local19.getSize().width;
		Static460.anInt8100 = local19.getSize().height;
		@Pc(41) Insets local41;
		if (Static435.aFrame2 == local19) {
			local41 = Static435.aFrame2.getInsets();
			Static258.anInt4672 -= local41.right + local41.left;
			Static460.anInt8100 -= local41.top + local41.bottom;
		}
		if (Static278.method4179() == 1) {
			Static201.anInt3846 = (Static258.anInt4672 - Static168.anInt3084) / 2;
			Static154.anInt2867 = Static112.anInt1892;
			Static367.anInt6719 = Static168.anInt3084;
			Static223.anInt4111 = 0;
		} else {
			Static550.method7684();
		}
		if (Static338.aClass45_6 != Static101.aClass45_4) {
			@Pc(90) boolean local90;
			if (Static367.anInt6719 < 1024 && Static154.anInt2867 < 768) {
				local90 = true;
			} else {
				local90 = false;
			}
		}
		Static77.aCanvas1.setSize(Static367.anInt6719, Static154.anInt2867);
		if (Static554.aClass90_12 != null) {
			Static554.aClass90_12.method7526(Static77.aCanvas1);
		}
		if (local19 == Static435.aFrame2) {
			local41 = Static435.aFrame2.getInsets();
			Static77.aCanvas1.setLocation(Static201.anInt3846 + local41.left, local41.top + Static223.anInt4111);
		} else {
			Static77.aCanvas1.setLocation(Static201.anInt3846, Static223.anInt4111);
		}
		if (Static152.anInt1936 != -1) {
			Static20.method306(true);
		}
		Static540.method7136();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)Z")
	public static boolean method3892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIILclient!faa;)V")
	public static void method3893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class97 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray24 != null) {
			@Pc(17) Class6_Sub1 local17 = new Class6_Sub1();
			local17.anObjectArray1 = arg2.anObjectArray24;
			local17.aClass97_2 = arg2;
			Static199.method3316(local17);
		}
		Static208.anInt3948 = arg2.anInt2607;
		Static152.anInt1934 = arg2.anInt2678;
		Static540.aBoolean580 = true;
		Static291.anInt5333 = arg2.anInt2692;
		Static544.anInt7475 = arg0;
		Static427.anInt7590 = arg2.anInt2604;
		Static96.anInt7891 = arg2.anInt2675;
		Static243.anInt4471 = arg1;
		Static479.method6666(arg2);
	}
}
