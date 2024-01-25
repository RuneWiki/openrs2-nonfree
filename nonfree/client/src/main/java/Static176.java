import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "Lclient!ts;")
	public static Class114 aClass114_2;

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
	public static int anInt3800;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
	public static int anInt3801;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "J")
	public static long aLong122 = -1L;

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
	public static int anInt3803 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([BI)Lclient!pe;")
	public static Class1_Sub4_Sub18 method3471(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class1_Sub4_Sub18 local9 = new Class1_Sub4_Sub18();
		@Pc(14) Class1_Sub8 local14 = new Class1_Sub8(arg0);
		local14.anInt5182 = local14.aByteArray81.length - 2;
		@Pc(25) int local25 = local14.method4556();
		@Pc(36) int local36 = local14.aByteArray81.length - local25 - 12 - 2;
		local14.anInt5182 = local36;
		@Pc(43) int local43 = local14.method4545();
		local9.anInt4798 = local14.method4556();
		local9.anInt4796 = local14.method4556();
		local9.anInt4794 = local14.method4556();
		local9.anInt4797 = local14.method4556();
		@Pc(72) int local72 = local14.method4532();
		@Pc(80) int local80;
		@Pc(86) int local86;
		if (local72 > 0) {
			local9.aClass197Array1 = new Class197[local72];
			for (local80 = 0; local80 < local72; local80++) {
				local86 = local14.method4556();
				@Pc(93) Class197 local93 = new Class197(Static194.method3745(local86));
				local9.aClass197Array1[local80] = local93;
				while (local86-- > 0) {
					@Pc(104) int local104 = local14.method4545();
					@Pc(108) int local108 = local14.method4545();
					local93.method5166(new Class1_Sub13(local108), (long) local104);
				}
			}
		}
		local14.anInt5182 = 0;
		local9.aString49 = local14.method4512();
		local9.aStringArray50 = new String[local43];
		local9.anIntArray431 = new int[local43];
		local9.anIntArray430 = new int[local43];
		local80 = 0;
		while (local14.anInt5182 < local36) {
			local86 = local14.method4556();
			if (local86 == 3) {
				local9.aStringArray50[local80] = local14.method4534().intern();
			} else if (local86 >= 100 || local86 == 21 || local86 == 38 || local86 == 39) {
				local9.anIntArray431[local80] = local14.method4532();
			} else {
				local9.anIntArray431[local80] = local14.method4545();
			}
			local9.anIntArray430[local80++] = local86;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!bb;ILclient!uo;IZ)V")
	public static void method3472(@OriginalArg(0) Class16 arg0, @OriginalArg(2) Class32 arg1) {
		Static280.aClass16_32.method421();
		if (Static194.aBoolean383) {
			return;
		}
		for (@Pc(25) Class1_Sub27 local25 = (Class1_Sub27) arg0.method410(); local25 != null; local25 = (Class1_Sub27) arg0.method419()) {
			@Pc(32) Class139 local32 = Static255.method4606(local25.anInt4777);
			if (Static356.method5684(local32)) {
				@Pc(44) boolean local44 = Static13.method379(local25, local32, arg1);
				if (local44) {
					Static304.method5123(local25, local32, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/lang/String;ZLclient!ak;)V")
	public static void method3473(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class9 arg2) {
		@Pc(20) int local20 = Static195.aClass63_5.method1752(arg0, 250, null);
		@Pc(29) int local29 = Static195.aClass63_5.method1750(arg0, null, 250) * 13;
		Static208.aClass32_11.method2241(6, 6, local20 + 4 + 4, local29 + 8, -16777216, 0);
		Static208.aClass32_11.method2200(6, 6, local20 + 8, local29 - -4 + 4, -1, 0);
		arg2.method5014(1, null, local29, 10, 0, -1, null, local20, 1, arg0, 0, 10, 0, -1, null);
		Static8.method5018(local29 + 4 + 4, local20 + 4 + 4, 6, 6);
		if (arg1) {
			Static208.aClass32_11.method2209();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!wo;I)V")
	public static void method3474(@OriginalArg(0) Class216 arg0) {
		Static356.aClass216_99 = arg0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!wo;)V")
	public static void method3475(@OriginalArg(1) Class216 arg0) {
		Static166.anInt3592 = 0;
		Static230.anInt4755 = 0;
		Static140.aClass217_5 = new Class217();
		Static324.aClass8_Sub2_Sub1_Sub1Array2 = new Class8_Sub2_Sub1_Sub1[1024];
		Static269.method4740(arg0);
		Static343.method5444(arg0);
	}
}
