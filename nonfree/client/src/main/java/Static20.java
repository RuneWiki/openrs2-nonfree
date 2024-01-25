import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
	public static int anInt870 = 0;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II[Lclient!vp;)V")
	public static void method832(@OriginalArg(0) int arg0, @OriginalArg(2) Class309[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class309 local9 = arg1[local3];
			if (local9 != null && arg0 == local9.anInt8764 && !Static62.method1751(local9)) {
				if (local9.anInt8802 == 0) {
					method832(local9.anInt8750, arg1);
					if (local9.lb != null) {
						method832(local9.anInt8750, local9.lb);
					}
					@Pc(47) Class1_Sub5 local47 = (Class1_Sub5) Static484.aClass174_32.method4422((long) local9.anInt8750);
					if (local47 != null) {
						Static136.method2912(local47.anInt1389);
					}
				}
				if (local9.anInt8802 == 6 && local9.anInt8766 != -1) {
					@Pc(70) Class280 local70 = Static6.aClass126_1.method3574(local9.anInt8766);
					if (local70 != null) {
						local9.anInt8791 += Static309.anInt5936;
						while (local9.anInt8791 > local70.anIntArray630[local9.anInt8738]) {
							local9.anInt8791 -= local70.anIntArray630[local9.anInt8738];
							local9.anInt8738++;
							if (local70.anIntArray629.length <= local9.anInt8738) {
								local9.anInt8738 -= local70.anInt8105;
								if (local9.anInt8738 < 0 || local70.anIntArray629.length <= local9.anInt8738) {
									local9.anInt8738 = 0;
								}
							}
							local9.anInt8776 = local9.anInt8738 + 1;
							if (local70.anIntArray629.length <= local9.anInt8776) {
								local9.anInt8776 -= local70.anInt8105;
								if (local9.anInt8776 < 0 || local70.anIntArray629.length <= local9.anInt8776) {
									local9.anInt8776 = -1;
								}
							}
							Static291.method4908(local9);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZI)Z")
	public static boolean method833(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static19.method826(arg0, arg1) | (arg1 & 0x70000) != 0 || Static309.method5130(arg1, arg0);
	}
}
