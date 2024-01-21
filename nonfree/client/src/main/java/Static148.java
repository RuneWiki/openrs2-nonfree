import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
	public static int anInt3046 = 0;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_895 = Static181.method2795(":");

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_896 = Static181.method2795("");

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIILclient!ae;II)V")
	public static void method2317(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg4 * arg4 + arg5 * arg5;
		if (local15 > 360000) {
			return;
		}
		@Pc(29) int local29 = Math.min(arg3.anInt157 / 2, arg3.anInt100 / 2);
		if (local15 <= local29 * local29) {
			Static120.method2084(arg3, arg4, arg0, arg2, Static190.aClass2_Sub2_Sub17Array11[arg1], arg5);
			return;
		}
		local29 -= 10;
		@Pc(52) int local52 = Static210.anInt4184 + Static124.anInt2528 & 0x7FF;
		@Pc(56) int local56 = Class16.anIntArray39[local52];
		@Pc(64) int local64 = local56 * 256 / (Static59.anInt1449 + 256);
		@Pc(68) int local68 = Class16.anIntArray44[local52];
		@Pc(76) int local76 = local68 * 256 / (Static59.anInt1449 + 256);
		@Pc(86) int local86 = local76 * arg4 + arg5 * local64 >> 16;
		@Pc(96) int local96 = local64 * arg4 - local76 * arg5 >> 16;
		@Pc(102) double local102 = Math.atan2((double) local86, (double) local96);
		@Pc(109) int local109 = (int) ((double) local29 * Math.sin(local102));
		@Pc(116) int local116 = (int) ((double) local29 * Math.cos(local102));
		((Class2_Sub2_Sub17_Sub1) Static86.aClass2_Sub2_Sub17Array5[arg1]).method1934(local109 + arg0 + arg3.anInt157 / 2 - 10, arg2 - -(arg3.anInt100 / 2) - (local116 + 10), local102);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method2319(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static206.aClass100_1);
		arg0.addMouseMotionListener(Static206.aClass100_1);
		arg0.addFocusListener(Static206.aClass100_1);
	}
}
