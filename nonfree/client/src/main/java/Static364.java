import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!lha", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString94 = "";

	@OriginalMember(owner = "client!lha", name = "g", descriptor = "Lclient!uj;")
	public static final Class371 aClass371_4 = new Class371("LIVE", "", "", 0);

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!wka;I)I")
	public static int method5201(@OriginalArg(0) Class19_Sub1_Sub3_Sub2 arg0) {
		if (arg0.anInt7818 == 0) {
			return 0;
		}
		@Pc(63) int local63;
		@Pc(56) int local56;
		if (arg0.anInt7780 != -1) {
			@Pc(15) Class19_Sub1_Sub3_Sub2 local15 = null;
			if (arg0.anInt7780 < 32768) {
				@Pc(43) Class3_Sub13 local43 = (Class3_Sub13) Static612.aClass136_44.method3503((long) arg0.anInt7780);
				if (local43 != null) {
					local15 = local43.aClass19_Sub1_Sub3_Sub2_Sub1_2;
				}
			} else if (arg0.anInt7780 >= 32768) {
				local15 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[arg0.anInt7780 - 32768];
			}
			if (local15 != null) {
				local56 = arg0.anInt11204 - local15.anInt11204;
				local63 = arg0.anInt11211 - local15.anInt11211;
				if (local56 != 0 || local63 != 0) {
					arg0.method6604((int) (Math.atan2((double) local56, (double) local63) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class19_Sub1_Sub3_Sub2_Sub2) {
			@Pc(179) Class19_Sub1_Sub3_Sub2_Sub2 local179 = (Class19_Sub1_Sub3_Sub2_Sub2) arg0;
			if (local179.anInt7825 != -1 && (local179.anInt7824 == 0 || local179.anInt7821 > 0)) {
				local179.method6604(local179.anInt7825);
				local179.anInt7825 = -1;
			}
		} else if (arg0 instanceof Class19_Sub1_Sub3_Sub2_Sub1) {
			@Pc(98) Class19_Sub1_Sub3_Sub2_Sub1 local98 = (Class19_Sub1_Sub3_Sub2_Sub1) arg0;
			if (local98.anInt4137 != -1 && (local98.anInt7824 == 0 || local98.anInt7821 > 0)) {
				local56 = local98.anInt11204 - (local98.anInt4137 - Static714.anInt11156 - Static714.anInt11156) * 256;
				local63 = local98.anInt11211 - (local98.anInt4140 - Static339.anInt5859 - Static339.anInt5859) * 256;
				if (local56 != 0 || local63 != 0) {
					local98.method6604((int) (Math.atan2((double) local56, (double) local63) * 2607.5945876176133D) & 0x3FFF);
				}
				local98.anInt4137 = -1;
			}
		}
		return arg0.method6602();
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!ka;Lclient!js;ILclient!js;)V")
	public static void method5202(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(3) Class100 arg2) {
		if (arg2.method8961() && arg1.method8961()) {
			@Pc(12) Class26 local12 = arg2.aClass26_4;
			@Pc(15) Class26 local15 = arg1.aClass26_4;
			arg0.method5229(arg2.anInt10720, arg2.aClass396_8.aClass3_Sub4_Sub15_2, arg2.aClass396_8.anInt10996, arg1.aClass396_8.aClass3_Sub4_Sub15_1, local15.anIntArray52[arg1.anInt10735], arg2.aClass396_8.aClass3_Sub4_Sub15_1, arg2.aClass396_8.anInt10993, arg1.aClass396_8.anInt10993, arg1.anInt10720, local12.anIntArray52[arg2.anInt10735], local12.aBooleanArray1, arg1.aClass396_8.anInt10996, arg1.aClass396_8.aClass3_Sub4_Sub15_2, local15.aBoolean61 | local12.aBoolean61);
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(JJ)J")
	public static long method5204(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "([I[II[[BB[[BI[B)I")
	public static int method5205(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(18) int local18 = arg0[arg2];
		@Pc(25) int local25 = local18 + arg1[arg2];
		@Pc(29) int local29 = arg0[arg5];
		@Pc(35) int local35 = arg1[arg5] + local29;
		@Pc(37) int local37 = local18;
		if (local29 > local18) {
			local37 = local29;
		}
		@Pc(48) int local48 = local25;
		if (local25 > local35) {
			local48 = local35;
		}
		@Pc(63) int local63 = arg6[arg2] & 0xFF;
		if (local63 > (arg6[arg5] & 0xFF)) {
			local63 = arg6[arg5] & 0xFF;
		}
		@Pc(80) byte[] local80 = arg3[arg2];
		@Pc(84) byte[] local84 = arg4[arg5];
		@Pc(88) int local88 = local37 - local18;
		@Pc(92) int local92 = local37 - local29;
		for (@Pc(94) int local94 = local37; local94 < local48; local94++) {
			@Pc(108) int local108 = local80[local88++] + local84[local92++];
			if (local63 > local108) {
				local63 = local108;
			}
		}
		return -local63;
	}
}
