import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!qda", name = "l", descriptor = "D")
	public static double aDouble15;

	@OriginalMember(owner = "client!qda", name = "t", descriptor = "[I")
	public static int[] anIntArray513;

	@OriginalMember(owner = "client!qda", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString63;

	@OriginalMember(owner = "client!qda", name = "q", descriptor = "Lclient!cha;")
	public static final Class55 aClass55_12 = new Class55(1, 8);

	@OriginalMember(owner = "client!qda", name = "v", descriptor = "D")
	public static double aDouble16 = -1.0D;

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(III)Lclient!je;")
	public static Class175 method6506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class175 local12 = new Class175();
		local12.anInt4875 = -1;
		local12.anInt4861 = arg0 + 5 + 1;
		local12.anInt4866 = -1;
		local12.anInt4867 = arg1 + 1 + 5;
		local12.anIntArrayArray48 = new int[local12.anInt4867][local12.anInt4861];
		local12.method4286();
		return local12;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)Lclient!wo;")
	public static Class2_Sub49 method6507() {
		@Pc(7) Class82 local7 = null;
		@Pc(13) Class2_Sub49 local13 = new Class2_Sub49(Static51.aClass17_2, 0);
		try {
			@Pc(24) Class319 local24 = Static265.aClass286_3.method6570("");
			while (local24.anInt8562 == 0) {
				Static440.method6322(1L);
			}
			if (local24.anInt8562 == 1) {
				local7 = (Class82) local24.anObject19;
				@Pc(49) byte[] local49 = new byte[(int) local7.method2009()];
				@Pc(63) int local63;
				for (@Pc(51) int local51 = 0; local51 < local49.length; local51 += local63) {
					local63 = local7.method2008(local49, local51, local49.length - local51);
					if (local63 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class2_Sub49(new Class2_Sub17(local49), Static51.aClass17_2, 0);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (local7 != null) {
				local7.method2011();
			}
		} catch (@Pc(103) Exception local103) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "(I)V")
	public static void method6509() {
		Static28.aClass13_87.L(Static532.anInt8558, Static305.aClass2_Sub49_15.aClass33_Sub23_1.method7242() == 1 ? Static185.anInt3702 + 256 << 2 : -1, 0);
	}
}
