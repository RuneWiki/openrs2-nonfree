import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "Lclient!am;")
	public static Class11 aClass11_47;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray7 = new byte[1000][];

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1878(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static98.aClass53_3);
		arg0.addMouseMotionListener(Static98.aClass53_3);
		arg0.addFocusListener(Static98.aClass53_3);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
	public static void method1879() {
		for (@Pc(14) Class4_Sub1_Sub2 local14 = (Class4_Sub1_Sub2) Static146.aClass130_70.method3499(); local14 != null; local14 = (Class4_Sub1_Sub2) Static146.aClass130_70.method3512()) {
			@Pc(19) Class2_Sub2_Sub5 local19 = local14.aClass2_Sub2_Sub5_1;
			if (Static279.anInt5645 != local19.aByte73 || Static342.anInt6706 > local19.anInt4681) {
				local14.method5667();
				local19.method3841();
			} else if (Static342.anInt6706 >= local19.anInt4660) {
				if (local19.lb > 0) {
					@Pc(44) Class2_Sub2_Sub1_Sub2 local44 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local19.lb - 1];
					if (local44 != null && local44.anInt6465 >= 0 && Static92.anInt2048 * 128 > local44.anInt6465 && local44.anInt6466 >= 0 && local44.anInt6466 < Static290.anInt5893 * 128) {
						local19.method3843(Static342.anInt6706, Static119.method2125(local44.anInt6465, local44.anInt6466, local19.aByte73) - local19.anInt4678, local44.anInt6466, local44.anInt6465);
					}
				}
				if (local19.lb < 0) {
					@Pc(100) int local100 = -local19.lb - 1;
					@Pc(107) Class2_Sub2_Sub1_Sub1 local107;
					if (local100 == Static321.anInt6343) {
						local107 = Static110.aClass2_Sub2_Sub1_Sub1_1;
					} else {
						local107 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local100];
					}
					if (local107 != null && local107.anInt6465 >= 0 && local107.anInt6465 < Static92.anInt2048 * 128 && local107.anInt6466 >= 0 && Static290.anInt5893 * 128 > local107.anInt6466) {
						local19.method3843(Static342.anInt6706, Static119.method2125(local107.anInt6465, local107.anInt6466, local19.aByte73) - local19.anInt4678, local107.anInt6466, local107.anInt6465);
					}
				}
				local19.method3838(Static106.anInt2370);
				Static242.method4205(local19, true);
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIBI)V")
	public static void method1880(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class121[] local7 = Static190.aClass121Array1;
		for (@Pc(14) int local14 = 0; local14 < local7.length; local14++) {
			@Pc(20) Class121 local20 = local7[local14];
			if (local20 != null && local20.anInt3844 == 2) {
				Static50.method927(local20.anInt3840 + (local20.anInt3845 - Static81.anInt1732 << 7), arg1 >> 1, arg2 >> 1, local20.anInt3838 * 2, local20.anInt3837 + (local20.anInt3841 - Static10.anInt231 << 7));
				if (Static257.anIntArray436[0] > -1 && Static342.anInt6706 % 20 < 10) {
					Static220.aClass60Array10[local20.anInt3848].method5675(arg3 + Static257.anIntArray436[0] - 12, Static257.anIntArray436[1] + -28 + arg0);
				}
			}
		}
	}
}
