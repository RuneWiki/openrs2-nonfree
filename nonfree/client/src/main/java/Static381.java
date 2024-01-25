import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7900(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static444.method6416(Static42.aClass186_15);
			Static192.aClass1_Sub13_Sub2_1.method3060(Static443.method6412(arg0));
			Static192.aClass1_Sub13_Sub2_1.method3061(arg0);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!pp;I)V")
	public static void method7904(@OriginalArg(0) Class1_Sub37 arg0) {
		if (Static313.aClass206ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface17 local8 = null;
		if (arg0.anInt6621 == 0) {
			local8 = (Interface17) Static503.method7224(arg0.anInt6619, arg0.anInt6624, arg0.anInt6615);
		}
		if (arg0.anInt6621 == 1) {
			local8 = (Interface17) Static313.method5162(arg0.anInt6619, arg0.anInt6624, arg0.anInt6615);
		}
		if (arg0.anInt6621 == 2) {
			local8 = (Interface17) Static52.method1507(arg0.anInt6619, arg0.anInt6624, arg0.anInt6615, up.class);
		}
		if (arg0.anInt6621 == 3) {
			local8 = (Interface17) Static167.method3276(arg0.anInt6619, arg0.anInt6624, arg0.anInt6615);
		}
		if (local8 == null) {
			arg0.anInt6616 = 0;
			arg0.anInt6613 = -1;
			arg0.anInt6617 = 0;
		} else {
			arg0.anInt6613 = local8.method7172();
			arg0.anInt6617 = local8.method7176();
			arg0.anInt6616 = local8.method7173();
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)I")
	public static int method7907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = 0;
		while (arg0 > 0) {
			local5 = arg1 & 0x1 | local5 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local5;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)Lclient!fp;")
	public static Class91 method7909(@OriginalArg(1) int arg0) {
		@Pc(6) Class91[] local6 = Static351.method5592();
		for (@Pc(16) int local16 = 0; local16 < local6.length; local16++) {
			@Pc(21) Class91 local21 = local6[local16];
			if (arg0 == local21.anInt3293) {
				return local21;
			}
		}
		return null;
	}
}
