import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "[Lclient!su;")
	public static Class224[] aClass224Array2;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_30 = new Class242("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString21 = "";

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "[I")
	public static final int[] anIntArray146 = new int[4096];

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!at;")
	public static Class14 method1682(@OriginalArg(1) Component arg0) {
		return new Class14_Sub1(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(32) int local32 = (Static369.aShort87 - Static410.aShort91) * local7 / 100 + Static410.aShort91;
		@Pc(38) int local38 = local32 * arg4 >> 8;
		@Pc(45) int local45 = 16384 - arg0 & 0x3FFF;
		@Pc(52) int local52 = 16384 - arg2 & 0x3FFF;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = local38;
		if (local45 != 0) {
			local56 = Class56.anIntArray119[local45] * -local38 >> 15;
			local58 = Class56.anIntArray120[local45] * local38 >> 15;
		}
		if (local52 != 0) {
			local54 = local58 * Class56.anIntArray119[local52] >> 15;
			local58 = local58 * Class56.anIntArray120[local52] >> 15;
		}
		Static142.anInt2687 = arg2;
		Static30.anInt696 = arg1 - local58;
		Static185.anInt6759 = 0;
		Static183.anInt3503 = arg0;
		Static292.anInt5287 = arg6 - local56;
		Static254.anInt4614 = arg5 - local54;
	}
}
