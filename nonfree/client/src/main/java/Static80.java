import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!e", name = "C", descriptor = "I")
	public static int anInt2001;

	@OriginalMember(owner = "client!e", name = "J", descriptor = "I")
	public static int anInt2007 = 0;

	@OriginalMember(owner = "client!e", name = "L", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_36 = new Class119(96, 1);

	@OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
	public static int anInt2013 = -1;

	@OriginalMember(owner = "client!e", name = "R", descriptor = "I")
	public static int anInt2014 = 0;

	@OriginalMember(owner = "client!e", name = "T", descriptor = "I")
	public static int anInt2016 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
	public static void method1553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static263.aClass118ArrayArrayArray2 == null) {
			return;
		}
		@Pc(21) long local21 = (long) (arg2 | arg1 << 28 | arg0 << 14);
		@Pc(27) Class3_Sub39 local27 = (Class3_Sub39) Static441.aClass11_43.method324(local21);
		if (local27 == null) {
			Static115.method1910(arg1, arg2, arg0);
			return;
		}
		@Pc(41) Class3_Sub22 local41 = (Class3_Sub22) local27.aClass243_40.method5208();
		if (local41 == null) {
			Static115.method1910(arg1, arg2, arg0);
			return;
		}
		@Pc(55) Class7_Sub5_Sub1 local55 = (Class7_Sub5_Sub1) Static115.method1910(arg1, arg2, arg0);
		if (local55 == null) {
			local55 = new Class7_Sub5_Sub1();
		} else {
			local55.anInt6739 = local55.anInt6738 = -1;
		}
		local55.anInt6749 = local41.anInt3745;
		local55.anInt6750 = local41.anInt3744;
		label44: while (true) {
			@Pc(82) Class3_Sub22 local82 = (Class3_Sub22) local27.aClass243_40.method5203();
			if (local82 == null) {
				break;
			}
			if (local82.anInt3744 != local55.anInt6750) {
				local55.anInt6739 = local82.anInt3744;
				local55.anInt6743 = local82.anInt3745;
				while (true) {
					@Pc(107) Class3_Sub22 local107 = (Class3_Sub22) local27.aClass243_40.method5203();
					if (local107 == null) {
						break label44;
					}
					if (local55.anInt6750 != local107.anInt3744 && local55.anInt6739 != local107.anInt3744) {
						local55.anInt6747 = local107.anInt3745;
						local55.anInt6738 = local107.anInt3744;
					}
				}
			}
		}
		@Pc(148) int local148 = Static231.method3482(arg1, (arg2 << 7) + 64, (arg0 << 7) - -64);
		Static40.method780(arg1, arg2, arg0, local148, local55);
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(B)V")
	public static void method1554() {
		Static158.anInt3162 = 0;
		Static184.aClass243_21.method5200();
		Static184.aClass243_21.method5198(Static375.aClass3_Sub14_3);
		Static158.anInt3162++;
	}
}
