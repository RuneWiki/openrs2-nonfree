import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ds", name = "T", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_18 = new Class212(4, 4);

	@OriginalMember(owner = "client!ds", name = "Y", descriptor = "I")
	public static int anInt1842 = 0;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Lclient!vv;")
	public static Class82_Sub1 method1626() {
		Static117.anInt4903 = 0;
		return Static8.method77();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!ul;Lclient!wn;II)V")
	public static void method1629(@OriginalArg(0) Class255 arg0, @OriginalArg(1) Class4_Sub20 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class4_Sub35 local9 = new Class4_Sub35();
		local9.anInt6333 = arg1.method4614();
		local9.anInt6335 = arg1.method4595();
		local9.anIntArray509 = new int[local9.anInt6333];
		local9.aClass87Array1 = new Class87[local9.anInt6333];
		local9.aClass87Array2 = new Class87[local9.anInt6333];
		local9.aByteArrayArrayArray10 = new byte[local9.anInt6333][][];
		local9.anIntArray511 = new int[local9.anInt6333];
		local9.anIntArray510 = new int[local9.anInt6333];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt6333; local56++) {
			try {
				@Pc(62) int local62 = arg1.method4614();
				@Pc(79) String local79;
				@Pc(83) String local83;
				@Pc(85) int local85;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local79 = arg1.method4624();
					local83 = arg1.method4624();
					local85 = 0;
					if (local62 == 1) {
						local85 = arg1.method4595();
					}
					local9.anIntArray511[local56] = local62;
					local9.anIntArray509[local56] = local85;
					local9.aClass87Array2[local56] = arg0.method5841(Static208.method3675(local79), local83);
				} else if (local62 == 3 || local62 == 4) {
					local79 = arg1.method4624();
					local83 = arg1.method4624();
					local85 = arg1.method4614();
					@Pc(142) String[] local142 = new String[local85];
					for (@Pc(144) int local144 = 0; local144 < local85; local144++) {
						local142[local144] = arg1.method4624();
					}
					@Pc(159) byte[][] local159 = new byte[local85][];
					@Pc(174) int local174;
					if (local62 == 3) {
						for (@Pc(166) int local166 = 0; local166 < local85; local166++) {
							local174 = arg1.method4595();
							local159[local166] = new byte[local174];
							arg1.method4566(local174, local159[local166]);
						}
					}
					local9.anIntArray511[local56] = local62;
					@Pc(203) Class[] local203 = new Class[local85];
					for (local174 = 0; local174 < local85; local174++) {
						local203[local174] = Static208.method3675(local142[local174]);
					}
					local9.aClass87Array1[local56] = arg0.method5824(local83, Static208.method3675(local79), local203);
					local9.aByteArrayArrayArray10[local56] = local159;
				}
			} catch (@Pc(238) ClassNotFoundException local238) {
				local9.anIntArray510[local56] = -1;
			} catch (@Pc(245) SecurityException local245) {
				local9.anIntArray510[local56] = -2;
			} catch (@Pc(252) NullPointerException local252) {
				local9.anIntArray510[local56] = -3;
			} catch (@Pc(259) Exception local259) {
				local9.anIntArray510[local56] = -4;
			} catch (@Pc(266) Throwable local266) {
				local9.anIntArray510[local56] = -5;
			}
		}
		Static210.aClass91_27.method2587(local9);
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(II)[B")
	public static byte[] method1630(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub1_Sub7 local12 = (Class4_Sub1_Sub7) Static314.aClass181_43.method4420((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
				@Pc(47) int local47 = 255 - local40;
				@Pc(52) int local52 = Static127.method2396(local23, local47);
				@Pc(56) byte local56 = local17[local52];
				local17[local52] = local17[local47];
				local17[local47] = local17[511 - local40] = local56;
			}
			local12 = new Class4_Sub1_Sub7(local17);
			Static314.aClass181_43.method4421((long) arg0, local12);
		}
		return local12.aByteArray26;
	}
}
