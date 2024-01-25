import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
	public static int anInt1116;

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_12 = new Class90(103, 19);

	@OriginalMember(owner = "client!bb", name = "V", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "Lclient!wea;")
	public static final Class357 aClass357_4 = new Class357();

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "[F")
	public static final float[] aFloatArray20 = new float[4];

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "[I")
	public static final int[] anIntArray28 = new int[5];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!rca;Lclient!r;Lclient!fu;I)V")
	public static void method959(@OriginalArg(0) Class288 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Class4_Sub20 arg2) {
		@Pc(10) Class88 local10 = arg0.method6633(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.E();
		if (local16 < local10.u()) {
			local16 = local10.u();
		}
		@Pc(32) int local32 = arg2.anInt3259;
		@Pc(35) int local35 = arg2.anInt3260;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(57) int local57;
		@Pc(80) int local80;
		if (arg0.aString177 != null) {
			local37 = Static174.aClass198_8.method4763(null, Static86.aStringArray6, null, arg0.aString177);
			for (local57 = 0; local57 < local37; local57++) {
				@Pc(63) String local63 = Static86.aStringArray6[local57];
				if (local37 - 1 > local57) {
					local63 = local63.substring(0, local63.length() - 4);
				}
				local80 = Static233.aClass202_3.method4810(local63);
				if (local39 < local80) {
					local39 = local80;
				}
			}
			local41 = local37 * Static233.aClass202_3.method4811() + Static233.aClass202_3.method4814() / 2;
		}
		local57 = local16 / 2 + arg2.anInt3259;
		if (local16 + Static572.anInt10060 > local32) {
			local32 = Static572.anInt10060;
			local57 = local39 / 2 + local16 / 2 + Static572.anInt10060 + 10 + 5;
		} else if (Static572.anInt10055 - local16 < local32) {
			local57 = Static572.anInt10055 - local39 / 2 - local16 / 2 - 10 - 5;
			local32 = Static572.anInt10055 - local16;
		}
		@Pc(172) int local172 = arg2.anInt3260;
		if (Static572.anInt10053 + local16 > local35) {
			local172 = Static572.anInt10053 + local16 / 2 + 10;
			local35 = Static572.anInt10053;
		} else if (local35 > Static572.anInt10063 - local16) {
			local35 = Static572.anInt10063 - local16;
			local172 = Static572.anInt10063 - local16 / 2 - local41 - 10;
		}
		local80 = (int) (Math.atan2((double) (local32 - arg2.anInt3259), (double) (local35 - arg2.anInt3260)) / 3.141592653589793D * (double) 32767) & 0xFFFF;
		local10.method8050((float) local16 / 2.0F + (float) local32, (float) local16 / 2.0F + (float) local35, 4096, local80);
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		if (arg0.aString177 != null) {
			local257 = local172;
			local255 = local57 - local39 / 2 - 5;
			local261 = local172 + local37 * Static233.aClass202_3.method4811() + 3;
			local259 = local39 + local255 + 10;
			if (arg0.anInt8606 != 0) {
				arg1.method7825(local261 - local172, -local255 + local259, local172, arg0.anInt8606, local255);
			}
			if (arg0.anInt8595 != 0) {
				arg1.method7800(local172, local259 - local255, arg0.anInt8595, local261 - local172, local255);
			}
			for (@Pc(330) int local330 = 0; local330 < local37; local330++) {
				@Pc(336) String local336 = Static86.aStringArray6[local330];
				if (local37 - 1 > local330) {
					local336 = local336.substring(0, local336.length() - 4);
				}
				Static233.aClass202_3.method4812(arg1, local336, local57, local172, arg0.anInt8589);
				local172 += Static233.aClass202_3.method4811();
			}
		}
		if (arg0.anInt8577 == -1 && arg0.aString177 == null) {
			return;
		}
		@Pc(380) Class4_Sub4 local380 = new Class4_Sub4(arg2);
		local16 >>= 0x1;
		local380.anInt1190 = local16 + local32;
		local380.anInt1200 = local35 - local16;
		local380.anInt1193 = local32 - local16;
		local380.anInt1191 = local255;
		local380.anInt1196 = local257;
		local380.anInt1195 = local259;
		local380.anInt1194 = local35 + local16;
		local380.anInt1192 = local261;
		Static308.aClass22_40.method894(local380);
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V")
	public static void method960() {
		if (Static348.aFileOutputStream1 != null) {
			try {
				Static348.aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		Static348.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIII)V")
	public static void method961(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static266.anInt5352 = arg0;
		Static92.anInt8624 = arg3;
		Static428.anInt8187 = arg2;
		Static58.anInt1551 = arg1;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
	public static void method963(@OriginalArg(1) int arg0) {
		Static340.anInt6538 = arg0;
		Static219.aClass167_17.method3961();
	}
}
