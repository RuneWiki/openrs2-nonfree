import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!er", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString18 = null;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "Z")
	public static boolean aBoolean182 = false;

	@OriginalMember(owner = "client!er", name = "g", descriptor = "I")
	private static int anInt2750 = 0;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)[B")
	public static byte[] method2561(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub4_Sub10 local12 = (Class3_Sub4_Sub10) Static365.aClass357_2.method8390((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
				@Pc(47) int local47 = 255 - local40;
				@Pc(52) int local52 = Static522.method7729(local23, local47);
				@Pc(56) byte local56 = local17[local52];
				local17[local52] = local17[local47];
				local17[local47] = local17[511 - local40] = local56;
			}
			local12 = new Class3_Sub4_Sub10(local17);
			Static365.aClass357_2.method8392((long) arg0, local12);
		}
		return local12.aByteArray49;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!jw;Z[[[BIB)Z")
	public static boolean method2562(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static574.aBoolean676) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt8916 >> Static308.anInt5834;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt8911 >> Static308.anInt5834;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class4_Sub1_Sub2) {
			local10 = ((Class4_Sub1_Sub2) arg0).aShort117;
			local17 = ((Class4_Sub1_Sub2) arg0).aShort119;
			local8 = ((Class4_Sub1_Sub2) arg0).aShort118;
			local15 = ((Class4_Sub1_Sub2) arg0).aShort116;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte124 < Static442.anInt7929 && local38 >= Static573.anInt9445 && local38 < Static505.anInt8726 && local41 >= Static376.anInt7040 && local41 < Static322.anInt6055) {
					if ((arg2 == null || arg0.aByte123 < arg3 || arg2[arg0.aByte123][local38][local41] != arg4) && arg0.method7694() && !arg0.method7701()) {
						return false;
					}
					if (!arg1 && local38 >= Static626.anInt10075 - 16 && local38 <= Static626.anInt10075 + 16 && local41 >= Static386.anInt7210 - 16 && local41 <= Static386.anInt7210 + 16) {
						if (Static557.aBoolean669) {
							Static280.aClass291Array1[anInt2750++].method7266(arg0);
							anInt2750 %= Static57.anInt1567;
						} else {
							arg0.method7699(Static232.aClass5_8);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III)Z")
	public static boolean method2563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static315.method5167(arg0, arg1) | Static108.method2180(arg0, arg1) | Static368.method5984(arg0, arg1)) & Static291.method4635(arg1, arg0);
	}
}
