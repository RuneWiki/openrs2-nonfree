import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
	public static int anInt3426;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public static void method2860(@OriginalArg(0) Canvas arg0) {
		@Pc(11) Dimension local11 = arg0.getSize();
		Static15.method230(local11.width, local11.height);
		if (Static491.anInt8078 == 1) {
			Static361.aClass95_9.method6950(arg0, Static61.anInt1162, Static158.anInt2827);
		} else {
			Static361.aClass95_9.method6950(arg0, Static325.anInt5186, Static482.anInt7691);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Z")
	public static boolean method2861() {
		@Pc(10) Class2_Sub17 local10 = (Class2_Sub17) Static568.aClass109_66.method2325();
		if (local10 == null) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < local10.anInt3528; local21++) {
			if (local10.aClass108Array2[local21] != null && local10.aClass108Array2[local21].anInt2766 == 0) {
				return false;
			}
			if (local10.aClass108Array1[local21] != null && local10.aClass108Array1[local21].anInt2766 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIBIIILclient!ha;)Lclient!ka;")
	public static Class182 method2862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class95 arg5) {
		@Pc(6) long local6 = (long) arg1;
		@Pc(12) Class182 local12 = (Class182) Static575.aClass32_82.method630(local6);
		if (local12 == null) {
			@Pc(27) Class186 local27 = Static439.method6023(Static519.aClass380_116, arg1);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt4702 < 13) {
				local27.method3992();
			}
			local12 = arg5.method6938(local27, 2055, Static197.anInt3365, 64, 768);
			Static575.aClass32_82.method629(local12, local6);
		}
		local12 = local12.method6208((byte) 2, 2055, true);
		if (arg4 != 0) {
			local12.a(arg4);
		}
		if (arg2 != 0) {
			local12.FA(arg2);
		}
		if (arg0 != 0) {
			local12.VA(arg0);
		}
		if (arg3 != 0) {
			local12.H(0, arg3, 0);
		}
		return local12;
	}
}
