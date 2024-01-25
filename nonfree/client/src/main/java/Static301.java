import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
	public static int anInt5392;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ga;ILclient!dr;IILjava/awt/Canvas;)Lclient!ya;")
	public static Class49 method4323(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Canvas arg4) {
		return new Class49_Sub2(arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
	public static void method4324() {
		@Pc(7) int local7 = Static337.anInt5822;
		@Pc(9) int[] local9 = Static203.anIntArray384;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class3_Sub2_Sub1_Sub2 local19 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt6151 > 0) {
				local19.anInt6151--;
				if (local19.anInt6151 == 0) {
					local19.aString54 = null;
				}
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static62.anInt1371; local57++) {
			@Pc(63) int local63 = Static173.anIntArray307[local57];
			@Pc(67) Class3_Sub2_Sub1_Sub1 local67 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local63];
			if (local67 != null && local67.anInt6151 > 0) {
				local67.anInt6151--;
				if (local67.anInt6151 == 0) {
					local67.aString54 = null;
				}
			}
		}
	}
}
