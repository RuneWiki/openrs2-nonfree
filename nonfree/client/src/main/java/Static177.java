import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
	public static int anInt3430;

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "[I")
	public static final int[] anIntArray224 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!it;)I")
	public static int method2779(@OriginalArg(1) Class4_Sub2_Sub2 arg0) {
		if (arg0.anInt6462 == 0) {
			return 0;
		}
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (arg0.anInt6481 != -1) {
			@Pc(19) Class4_Sub2_Sub2 local19 = null;
			if (arg0.anInt6481 < 32768) {
				local19 = Static4.aClass4_Sub2_Sub2_Sub2Array1[arg0.anInt6481];
			} else if (arg0.anInt6481 >= 32768) {
				local19 = Static129.aClass4_Sub2_Sub2_Sub1Array27[arg0.anInt6481 - 32768];
			}
			if (local19 != null) {
				local53 = arg0.anInt7117 - local19.anInt7117;
				local59 = arg0.anInt7111 - local19.anInt7111;
				if (local53 != 0 || local59 != 0) {
					arg0.method5124((int) (Math.atan2((double) local53, (double) local59) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class4_Sub2_Sub2_Sub1) {
			@Pc(161) Class4_Sub2_Sub2_Sub1 local161 = (Class4_Sub2_Sub2_Sub1) arg0;
			if (local161.anInt5733 != -1 && (local161.anInt6524 == 0 || local161.anInt6526 > 0)) {
				local161.method5124(local161.anInt5733);
				local161.anInt5733 = -1;
			}
		} else if (arg0 instanceof Class4_Sub2_Sub2_Sub2) {
			@Pc(91) Class4_Sub2_Sub2_Sub2 local91 = (Class4_Sub2_Sub2_Sub2) arg0;
			if (local91.anInt6540 != -1 && (local91.anInt6524 == 0 || local91.anInt6526 > 0)) {
				local53 = local91.anInt7117 - (local91.anInt6540 - Static173.anInt3340 - Static173.anInt3340) * 64;
				local59 = local91.anInt7111 - (local91.anInt6529 - Static379.anInt6721 - Static379.anInt6721) * 64;
				if (local53 != 0 || local59 != 0) {
					local91.method5124((int) (Math.atan2((double) local53, (double) local59) * 2607.5945876176133D) & 0x3FFF);
				}
				local91.anInt6540 = -1;
			}
		}
		return arg0.method5119();
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2780(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)Z")
	public static boolean method2783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x60000) != 0 | Static417.method5650(arg0, arg1) || Static7.method161(arg0, arg1) || Static204.method3163(arg1, arg0);
	}
}
