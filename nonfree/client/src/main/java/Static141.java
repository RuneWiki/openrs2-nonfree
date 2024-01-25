import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
	public static int anInt2881;

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!r;)I")
	public static int method2424(@OriginalArg(1) Class16_Sub1_Sub5 arg0) {
		if (arg0.anInt6080 == 0) {
			return 0;
		}
		@Pc(49) int local49;
		@Pc(56) int local56;
		if (arg0.anInt6034 != -1) {
			@Pc(19) Class16_Sub1_Sub5 local19 = null;
			if (arg0.anInt6034 < 32768) {
				local19 = Static143.aClass16_Sub1_Sub5_Sub2Array1[arg0.anInt6034];
			} else if (arg0.anInt6034 >= 32768) {
				local19 = Static267.aClass16_Sub1_Sub5_Sub1Array1[arg0.anInt6034 - 32768];
			}
			if (local19 != null) {
				local49 = arg0.anInt6893 - local19.anInt6893;
				local56 = arg0.anInt6892 - local19.anInt6892;
				if (local49 != 0 || local56 != 0) {
					arg0.method4743((int) (Math.atan2((double) local49, (double) local56) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class16_Sub1_Sub5_Sub1) {
			@Pc(152) Class16_Sub1_Sub5_Sub1 local152 = (Class16_Sub1_Sub5_Sub1) arg0;
			if (local152.anInt4323 != -1 && (local152.anInt6086 == 0 || local152.anInt6085 > 0)) {
				local152.method4743(local152.anInt4323);
				local152.anInt4323 = -1;
			}
		} else if (arg0 instanceof Class16_Sub1_Sub5_Sub2) {
			@Pc(82) Class16_Sub1_Sub5_Sub2 local82 = (Class16_Sub1_Sub5_Sub2) arg0;
			if (local82.anInt6089 != -1 && (local82.anInt6086 == 0 || local82.anInt6085 > 0)) {
				local49 = local82.anInt6893 - (local82.anInt6089 - Static180.anInt3453 - Static180.anInt3453) * 64;
				local56 = local82.anInt6892 - (local82.anInt6095 - Static86.anInt1771 - Static86.anInt1771) * 64;
				if (local49 != 0 || local56 != 0) {
					local82.method4743((int) (Math.atan2((double) local49, (double) local56) * 2607.5945876176133D) & 0x3FFF);
				}
				local82.anInt6089 = -1;
			}
		}
		return arg0.method4750();
	}
}
