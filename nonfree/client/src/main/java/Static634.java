import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	public static int anInt9767;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!nca;Lclient!rha;Lclient!hia;Lclient!nca;Lclient!nca;I)Z")
	public static boolean method8626(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class2_Sub23_Sub5 arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) Class254 arg3, @OriginalArg(4) Class254 arg4) {
		Static442.aClass2_Sub23_Sub5_3 = arg1;
		Static59.aClass254_33 = arg3;
		Static161.aClass70_1 = arg2;
		Static160.anIntArray200 = new int[16];
		Static357.aClass254_101 = arg4;
		Static60.aClass254_34 = arg0;
		for (@Pc(26) int local26 = 0; local26 < 16; local26++) {
			Static160.anIntArray200[local26] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
	public static int method8627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 >>> 31;
		return (arg1 + local14) / arg0 - local14;
	}
}
