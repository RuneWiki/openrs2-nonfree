import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!jb", name = "cb", descriptor = "[I")
	public static int[] anIntArray286;

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)Lclient!jq;")
	public static Class4_Sub5_Sub2 method2660(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class174 local11 = Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class4_Sub5_Sub2 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(27) Class84 local27 = local11.aClass84_3; local27 != null; local27 = local27.aClass84_2) {
			@Pc(31) Class4_Sub5 local31 = local27.aClass4_Sub5_1;
			if (local31 instanceof Class4_Sub5_Sub2) {
				@Pc(37) Class4_Sub5_Sub2 local37 = (Class4_Sub5_Sub2) local31;
				@Pc(47) int local47 = (local37.method4807() - 1) * 64 + 60;
				@Pc(55) int local55 = local37.anInt6631 - local47 >> 7;
				@Pc(63) int local63 = local37.anInt6632 - local47 >> 7;
				@Pc(70) int local70 = local47 + local37.anInt6631 >> 7;
				@Pc(78) int local78 = local37.anInt6632 + local47 >> 7;
				if (arg1 >= local55 && local63 <= arg2 && local70 >= arg1 && arg2 <= local78) {
					@Pc(115) int local115 = (local78 + 1 - arg2) * (local70 + 1 - arg1);
					if (local19 < local115) {
						local17 = local37;
						local19 = local115;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2664(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local6; local15++) {
			local13 = (local13 << 5) + Static338.method6009(arg0.charAt(local15)) - local13;
		}
		return local13;
	}
}
