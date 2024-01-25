import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!ml", name = "P", descriptor = "F")
	public static float aFloat131;

	@OriginalMember(owner = "client!ml", name = "bb", descriptor = "I")
	public static int anInt5882;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_42 = new Class277(5);

	@OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
	public static int anInt5880 = -1;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!os;IILclient!pq;)V")
	public static void method5328(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class229 arg2) {
		@Pc(13) Class1_Sub33 local13 = new Class1_Sub33();
		local13.anInt5388 = arg0.method4487();
		local13.anInt5389 = arg0.method4481();
		local13.aClass311Array1 = new Class311[local13.anInt5388];
		local13.anIntArray439 = new int[local13.anInt5388];
		local13.anIntArray440 = new int[local13.anInt5388];
		local13.aClass311Array2 = new Class311[local13.anInt5388];
		local13.anIntArray441 = new int[local13.anInt5388];
		local13.aByteArrayArrayArray11 = new byte[local13.anInt5388][][];
		for (@Pc(55) int local55 = 0; local55 < local13.anInt5388; local55++) {
			try {
				@Pc(61) int local61 = arg0.method4487();
				@Pc(88) String local88;
				@Pc(92) String local92;
				@Pc(96) int local96;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local88 = arg0.method4491();
					local92 = arg0.method4491();
					local96 = 0;
					if (local61 == 1) {
						local96 = arg0.method4481();
					}
					local13.anIntArray441[local55] = local61;
					local13.anIntArray440[local55] = local96;
					local13.aClass311Array1[local55] = arg2.method6073(local92, Static47.method5116(local88));
				} else if (local61 == 3 || local61 == 4) {
					local88 = arg0.method4491();
					local92 = arg0.method4491();
					local96 = arg0.method4487();
					@Pc(99) String[] local99 = new String[local96];
					for (@Pc(101) int local101 = 0; local101 < local96; local101++) {
						local99[local101] = arg0.method4491();
					}
					@Pc(116) byte[][] local116 = new byte[local96][];
					@Pc(127) int local127;
					if (local61 == 3) {
						for (@Pc(121) int local121 = 0; local121 < local96; local121++) {
							local127 = arg0.method4481();
							local116[local121] = new byte[local127];
							arg0.method4505(local116[local121], local127);
						}
					}
					local13.anIntArray441[local55] = local61;
					@Pc(152) Class[] local152 = new Class[local96];
					for (local127 = 0; local127 < local96; local127++) {
						local152[local127] = Static47.method5116(local99[local127]);
					}
					local13.aClass311Array2[local55] = arg2.method6061(local152, local92, Static47.method5116(local88));
					local13.aByteArrayArrayArray11[local55] = local116;
				}
			} catch (@Pc(227) ClassNotFoundException local227) {
				local13.anIntArray439[local55] = -1;
			} catch (@Pc(234) SecurityException local234) {
				local13.anIntArray439[local55] = -2;
			} catch (@Pc(241) NullPointerException local241) {
				local13.anIntArray439[local55] = -3;
			} catch (@Pc(248) Exception local248) {
				local13.anIntArray439[local55] = -4;
			} catch (@Pc(255) Throwable local255) {
				local13.anIntArray439[local55] = -5;
			}
		}
		Static71.aClass295_8.method7533(local13);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBI)Z")
	public static boolean method5329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
