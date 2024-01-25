import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
	public static int anInt5880;

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString48;

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
	public static int anInt5890;

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
	public static int anInt5882 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!bn;B)I")
	public static int method4924(@OriginalArg(0) Class3_Sub2_Sub1 arg0) {
		if (arg0.anInt6571 == 0) {
			return 0;
		}
		@Pc(47) int local47;
		@Pc(53) int local53;
		if (arg0.anInt6569 != -1) {
			@Pc(15) Class3_Sub2_Sub1 local15 = null;
			if (arg0.anInt6569 < 32768) {
				local15 = Static308.aClass3_Sub2_Sub1_Sub1Array1[arg0.anInt6569];
			} else if (arg0.anInt6569 >= 32768) {
				local15 = Static374.aClass3_Sub2_Sub1_Sub2Array1[arg0.anInt6569 - 32768];
			}
			if (local15 != null) {
				local47 = arg0.anInt7202 - local15.anInt7202;
				local53 = arg0.anInt7207 - local15.anInt7207;
				if (local47 != 0 || local53 != 0) {
					arg0.method5523((int) (Math.atan2((double) local47, (double) local53) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class3_Sub2_Sub1_Sub2) {
			@Pc(89) Class3_Sub2_Sub1_Sub2 local89 = (Class3_Sub2_Sub1_Sub2) arg0;
			if (local89.anInt6626 != -1 && (local89.anInt6613 == 0 || local89.anInt6612 > 0)) {
				local89.method5523(local89.anInt6626);
				local89.anInt6626 = -1;
			}
		} else if (arg0 instanceof Class3_Sub2_Sub1_Sub1) {
			@Pc(118) Class3_Sub2_Sub1_Sub1 local118 = (Class3_Sub2_Sub1_Sub1) arg0;
			if (local118.anInt1667 != -1 && (local118.anInt6613 == 0 || local118.anInt6612 > 0)) {
				local47 = local118.anInt7202 - (local118.anInt1667 - Static2.anInt6396 - Static2.anInt6396) * 64;
				local53 = local118.anInt7207 - (local118.anInt1665 - Static348.anInt6273 - Static348.anInt6273) * 64;
				if (local47 != 0 || local53 != 0) {
					local118.method5523((int) (Math.atan2((double) local47, (double) local53) * 2607.5945876176133D) & 0x3FFF);
				}
				local118.anInt1667 = -1;
			}
		}
		return arg0.method5525();
	}
}
