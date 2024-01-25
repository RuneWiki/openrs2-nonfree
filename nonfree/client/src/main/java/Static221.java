import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!nq;")
	public static Class144 aClass144_70;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!nq;")
	public static Class144 aClass144_71;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!bo;")
	public static Class30 aClass30_4;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!nq;")
	public static Class144 aClass144_72;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	public static int anInt4493 = 0;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
	public static int anInt4500 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method3948() {
		for (@Pc(10) Class11_Sub24 local10 = (Class11_Sub24) Static21.aClass16_15.method193(); local10 != null; local10 = (Class11_Sub24) Static21.aClass16_15.method188()) {
			if (local10.anInt2696 > 0) {
				local10.anInt2696--;
			}
			if (local10.anInt2696 != 0) {
				if (local10.anInt2698 > 0) {
					local10.anInt2698--;
				}
				if (local10.anInt2698 == 0 && local10.anInt2702 >= 1 && local10.anInt2699 >= 1 && Static24.anInt454 - 2 >= local10.anInt2702 && local10.anInt2699 <= Static240.anInt4832 - 2 && (local10.anInt2704 < 0 || Static307.method4212(local10.anInt2704, local10.anInt2694))) {
					Static90.method4108(local10.anInt2705, -1, local10.anInt2699, local10.anInt2693, local10.anInt2704, local10.anInt2702, local10.anInt2694, local10.anInt2700);
					local10.anInt2698 = -1;
					if (local10.anInt2704 == local10.anInt2697 && local10.anInt2697 == -1) {
						local10.method5701();
					} else if (local10.anInt2697 == local10.anInt2704 && local10.anInt2703 == local10.anInt2693 && local10.anInt2694 == local10.anInt2706) {
						local10.method5701();
					}
				}
			} else if (local10.anInt2697 < 0 || Static307.method4212(local10.anInt2697, local10.anInt2706)) {
				Static90.method4108(local10.anInt2705, -1, local10.anInt2699, local10.anInt2703, local10.anInt2697, local10.anInt2702, local10.anInt2706, local10.anInt2700);
				local10.method5701();
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BZ)V")
	public static void method3950(@OriginalArg(1) boolean arg0) {
		@Pc(9) byte local9;
		@Pc(11) byte[][] local11;
		if (arg0) {
			local9 = 1;
			local11 = Static245.aByteArrayArray49;
		} else {
			local11 = Static178.aByteArrayArray25;
			local9 = 4;
		}
		@Pc(20) int local20 = local11.length;
		@Pc(36) int local36;
		@Pc(48) int local48;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(26) int[] local26 = null;
			@Pc(30) byte[] local30 = local11[local22];
			local36 = Static157.anIntArray201[local22] >> 8;
			@Pc(42) int local42 = Static157.anIntArray201[local22] & 0xFF;
			local48 = local36 * 64 - Static182.anInt3662;
			@Pc(55) int local55 = local42 * 64 - Static169.anInt6312;
			if (local30 != null) {
				Static168.method2723();
				local26 = Static44.method664(local9, arg0, Static169.anInt6312, local55, Static211.aClass92Array1, local48, Static107.aClass129_4, Static182.anInt3662, local30);
			}
			if (!arg0 && Static16.anInt277 / 8 == local36 && local42 == Static19.anInt1986 / 8) {
				if (local26 == null) {
					Static162.aClass39_1 = null;
				} else {
					Static162.aClass39_1 = Static326.method4978(local26[0], local26[2], local26[3], local26[1]);
					Static82.anInt1503 = local26[4];
				}
			}
		}
		for (@Pc(128) int local128 = 0; local128 < local20; local128++) {
			@Pc(146) int local146 = (Static157.anIntArray201[local128] >> 8) * 64 - Static182.anInt3662;
			local36 = (Static157.anIntArray201[local128] & 0xFF) * 64 - Static169.anInt6312;
			@Pc(161) byte[] local161 = local11[local128];
			if (local161 == null && Static19.anInt1986 < 800) {
				Static168.method2723();
				for (local48 = 0; local48 < local9; local48++) {
					Static87.method1248(local36, 64, local48, local146, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBLclient!ko;Ljava/awt/Canvas;Lclient!ja;I)Lclient!uo;")
	public static Class129 method3951(@OriginalArg(0) int arg0, @OriginalArg(2) Class118 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface2 arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(11) Class local11 = Class.forName("Class129_Sub2");
			@Pc(57) Constructor local57 = local11.getConstructor(Canvas.class, ja.class, Integer.TYPE, Integer.TYPE, ko.class);
			return (Class129) local57.newInstance(arg2, arg3, Integer.valueOf(arg4), new Integer(arg0), arg1);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}
}
