import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!he", name = "O", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!he", name = "z", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_41 = new Class257(40, 8);

	@OriginalMember(owner = "client!he", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!he", name = "P", descriptor = "[I")
	public static final int[] anIntArray253 = new int[500];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BIIIIII)V")
	public static void method3687(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static64.method1712(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg2;
		@Pc(35) int local35 = -arg2;
		@Pc(37) int local37 = local15;
		@Pc(40) int local40 = -local15;
		@Pc(42) int local42 = -1;
		@Pc(69) int local69;
		@Pc(77) int local77;
		@Pc(86) int local86;
		@Pc(94) int local94;
		if (arg5 >= Static444.anInt8258 && arg5 <= Static188.anInt4410) {
			@Pc(60) int[] local60 = Static632.anIntArrayArray65[arg5];
			local69 = Static132.method2911(Static251.anInt9634, arg1 - arg2, Static366.anInt6946);
			local77 = Static132.method2911(Static251.anInt9634, arg2 + arg1, Static366.anInt6946);
			local86 = Static132.method2911(Static251.anInt9634, arg1 - local15, Static366.anInt6946);
			local94 = Static132.method2911(Static251.anInt9634, arg1 + local15, Static366.anInt6946);
			Static36.method1264(local60, local69, arg3, local86);
			Static36.method1264(local60, local86, arg0, local94);
			Static36.method1264(local60, local94, arg3, local77);
		}
		@Pc(114) int local114 = -1;
		while (local24 > local10) {
			local42 += 2;
			local114 += 2;
			local35 += local42;
			local40 += local114;
			if (local40 >= 0 && local37 >= 1) {
				local37--;
				local40 -= local37 << 1;
				Static209.anIntArray264[local37] = local10;
			}
			local10++;
			@Pc(253) int local253;
			@Pc(262) int local262;
			@Pc(273) int[] local273;
			@Pc(162) int local162;
			if (local35 >= 0) {
				local24--;
				local35 -= local24 << 1;
				local162 = arg5 - local24;
				local69 = arg5 + local24;
				if (local69 >= Static444.anInt8258 && local162 <= Static188.anInt4410) {
					if (local15 <= local24) {
						local77 = Static132.method2911(Static251.anInt9634, arg1 + local10, Static366.anInt6946);
						local86 = Static132.method2911(Static251.anInt9634, arg1 - local10, Static366.anInt6946);
						if (local69 <= Static188.anInt4410) {
							Static36.method1264(Static632.anIntArrayArray65[local69], local86, arg3, local77);
						}
						if (local162 >= Static444.anInt8258) {
							Static36.method1264(Static632.anIntArrayArray65[local162], local86, arg3, local77);
						}
					} else {
						local77 = Static209.anIntArray264[local24];
						local86 = Static132.method2911(Static251.anInt9634, arg1 + local10, Static366.anInt6946);
						local94 = Static132.method2911(Static251.anInt9634, arg1 - local10, Static366.anInt6946);
						local253 = Static132.method2911(Static251.anInt9634, arg1 + local77, Static366.anInt6946);
						local262 = Static132.method2911(Static251.anInt9634, arg1 - local77, Static366.anInt6946);
						if (Static188.anInt4410 >= local69) {
							local273 = Static632.anIntArrayArray65[local69];
							Static36.method1264(local273, local94, arg3, local262);
							Static36.method1264(local273, local262, arg0, local253);
							Static36.method1264(local273, local253, arg3, local86);
						}
						if (local162 >= Static444.anInt8258) {
							local273 = Static632.anIntArrayArray65[local162];
							Static36.method1264(local273, local94, arg3, local262);
							Static36.method1264(local273, local262, arg0, local253);
							Static36.method1264(local273, local253, arg3, local86);
						}
					}
				}
			}
			local162 = arg5 - local10;
			local69 = local10 + arg5;
			if (Static444.anInt8258 <= local69 && Static188.anInt4410 >= local162) {
				local77 = arg1 + local24;
				local86 = arg1 - local24;
				if (Static251.anInt9634 <= local77 && local86 <= Static366.anInt6946) {
					local77 = Static132.method2911(Static251.anInt9634, local77, Static366.anInt6946);
					local86 = Static132.method2911(Static251.anInt9634, local86, Static366.anInt6946);
					if (local10 >= local15) {
						if (local69 <= Static188.anInt4410) {
							Static36.method1264(Static632.anIntArrayArray65[local69], local86, arg3, local77);
						}
						if (Static444.anInt8258 <= local162) {
							Static36.method1264(Static632.anIntArrayArray65[local162], local86, arg3, local77);
						}
					} else {
						local94 = local37 >= local10 ? local37 : Static209.anIntArray264[local10];
						local253 = Static132.method2911(Static251.anInt9634, arg1 + local94, Static366.anInt6946);
						local262 = Static132.method2911(Static251.anInt9634, arg1 - local94, Static366.anInt6946);
						if (local69 <= Static188.anInt4410) {
							local273 = Static632.anIntArrayArray65[local69];
							Static36.method1264(local273, local86, arg3, local262);
							Static36.method1264(local273, local262, arg0, local253);
							Static36.method1264(local273, local253, arg3, local77);
						}
						if (local162 >= Static444.anInt8258) {
							local273 = Static632.anIntArrayArray65[local162];
							Static36.method1264(local273, local86, arg3, local262);
							Static36.method1264(local273, local262, arg0, local253);
							Static36.method1264(local273, local253, arg3, local77);
						}
					}
				}
			}
		}
	}
}
