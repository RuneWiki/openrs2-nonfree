import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!us", name = "m", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_106 = new Class96("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!us", name = "t", descriptor = "Lclient!og;")
	public static final Class182 aClass182_5 = new Class182("LIVE", 0);

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIII)V")
	public static void method5614(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static248.method3569(Static357.anInt6537, Static85.anInt1517, arg3);
		@Pc(22) int local22 = Static248.method3569(Static357.anInt6537, Static85.anInt1517, arg4);
		@Pc(28) int local28 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg0);
		@Pc(34) int local34 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg2);
		for (@Pc(36) int local36 = local11; local36 <= local22; local36++) {
			Static23.method323(Static283.anIntArrayArray30[local36], local28, arg1, local34);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIIII)V")
	public static void method5615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class41 local3 = new Class41();
		local3.anInt753 = arg1 >> Static58.anInt1051;
		local3.anInt768 = arg2 >> Static58.anInt1051;
		local3.anInt758 = arg3 >> Static58.anInt1051;
		local3.anInt749 = arg4 >> Static58.anInt1051;
		local3.anInt754 = arg0;
		local3.anInt757 = arg1;
		local3.anInt765 = arg2;
		local3.anInt763 = arg3;
		local3.anInt755 = arg4;
		local3.anInt766 = arg5;
		local3.anInt761 = arg6;
		Static264.aClass41Array2[Static208.anInt3763++] = local3;
	}
}
