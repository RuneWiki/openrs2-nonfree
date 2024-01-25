import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!vaa", name = "t", descriptor = "I")
	public static int anInt7639;

	@OriginalMember(owner = "client!vaa", name = "v", descriptor = "I")
	public static int anInt7641 = 0;

	@OriginalMember(owner = "client!vaa", name = "y", descriptor = "I")
	public static int anInt7644 = 0;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BLclient!pl;)I")
	public static int method6448(@OriginalArg(1) Class9_Sub1_Sub1_Sub2 arg0) {
		if (arg0.anInt6383 == 0) {
			return 0;
		}
		@Pc(64) int local64;
		@Pc(58) int local58;
		if (arg0.anInt6463 != -1) {
			@Pc(20) Class9_Sub1_Sub1_Sub2 local20 = null;
			if (arg0.anInt6463 < 32768) {
				@Pc(32) Class3_Sub39 local32 = (Class3_Sub39) Static243.aClass310_16.method6601((long) arg0.anInt6463);
				if (local32 != null) {
					local20 = local32.aClass9_Sub1_Sub1_Sub2_Sub1_2;
				}
			} else if (arg0.anInt6463 >= 32768) {
				local20 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[arg0.anInt6463 - 32768];
			}
			if (local20 != null) {
				local58 = arg0.anInt8975 - local20.anInt8975;
				local64 = arg0.anInt8980 - local20.anInt8980;
				if (local58 != 0 || local64 != 0) {
					arg0.method5557((int) (Math.atan2((double) local58, (double) local64) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class9_Sub1_Sub1_Sub2_Sub2) {
			@Pc(162) Class9_Sub1_Sub1_Sub2_Sub2 local162 = (Class9_Sub1_Sub1_Sub2_Sub2) arg0;
			if (local162.anInt6497 != -1 && (local162.anInt6468 == 0 || local162.anInt6467 > 0)) {
				local162.method5557(local162.anInt6497);
				local162.anInt6497 = -1;
			}
		} else if (arg0 instanceof Class9_Sub1_Sub1_Sub2_Sub1) {
			@Pc(93) Class9_Sub1_Sub1_Sub2_Sub1 local93 = (Class9_Sub1_Sub1_Sub2_Sub1) arg0;
			if (local93.anInt515 != -1 && (local93.anInt6468 == 0 || local93.anInt6467 > 0)) {
				local58 = local93.anInt8975 - (local93.anInt515 - Static529.anInt8344 - Static529.anInt8344) * 256;
				local64 = local93.anInt8980 - (local93.anInt509 - Static463.anInt7588 - Static463.anInt7588) * 256;
				if (local58 != 0 || local64 != 0) {
					local93.method5557((int) (Math.atan2((double) local58, (double) local64) * 2607.5945876176133D) & 0x3FFF);
				}
				local93.anInt515 = -1;
			}
		}
		return arg0.method5558();
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(III)B")
	public static byte method6449(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)V")
	public static void method6450(@OriginalArg(1) int arg0) {
		if (Static87.method1968(arg0)) {
			Static248.method7738(-1, Static59.aClass203ArrayArray3[arg0]);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(BII)Z")
	public static boolean method6451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
