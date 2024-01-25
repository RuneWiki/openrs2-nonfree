import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!qd", name = "A", descriptor = "Lclient!uja;")
	public static Class352 aClass352_41;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_252 = new Class359(9, 2);

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_253 = new Class359(11, 2);

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLclient!kj;Lclient!ha;Lclient!ek;)V")
	public static void method8948(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) Class103 arg2) {
		@Pc(8) Class50 local8 = arg2.method2497(arg1);
		if (local8 == null) {
			return;
		}
		@Pc(14) int local14 = local8.method6002();
		if (local8.method5992() > local14) {
			local14 = local8.method5992();
		}
		@Pc(30) int local30 = arg0.anInt5979;
		@Pc(33) int local33 = arg0.anInt5985;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(53) int local53;
		@Pc(79) int local79;
		if (arg2.aString17 != null) {
			local35 = Static258.aClass247_9.method5768(arg2.aString17, (int[]) null, Static205.aStringArray12, (Class50[]) null);
			for (local53 = 0; local53 < local35; local53++) {
				@Pc(58) String local58 = Static205.aStringArray12[local53];
				if (local35 - 1 > local53) {
					local58 = local58.substring(0, local58.length() - 4);
				}
				local79 = Static603.aClass127_10.method3091(local58);
				if (local37 < local79) {
					local37 = local79;
				}
			}
			local39 = local35 * Static603.aClass127_10.method3090() + Static603.aClass127_10.method3094() / 2;
		}
		local53 = arg0.anInt5979 + local14 / 2;
		@Pc(112) int local112 = arg0.anInt5985;
		if (Static330.anInt765 + local14 > local30) {
			local53 = Static330.anInt765 + local14 / 2 + local37 / 2 + 10 + 5;
			local30 = Static330.anInt765;
		} else if (Static330.anInt758 - local14 < local30) {
			local53 = Static330.anInt758 - local14 / 2 - local37 / 2 - 5 - 10;
			local30 = Static330.anInt758 - local14;
		}
		if (Static330.anInt757 + local14 > local33) {
			local112 = local14 / 2 + Static330.anInt757 + 10;
			local33 = Static330.anInt757;
		} else if (local33 > Static330.anInt762 - local14) {
			local33 = Static330.anInt762 - local14;
			local112 = Static330.anInt762 - local14 / 2 - local39 - 10;
		}
		local79 = (int) (Math.atan2((double) (local30 - arg0.anInt5979), (double) (local33 - arg0.anInt5985)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local8.method5988((float) local14 / 2.0F + (float) local30, (float) local14 / 2.0F + (float) local33, 4096, local79);
		@Pc(253) int local253 = -2;
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		if (arg2.aString17 != null) {
			local255 = local112;
			local253 = local53 - local37 / 2 - 5;
			local259 = Static603.aClass127_10.method3090() * local35 + local112 + 3;
			local257 = local253 + local37 + 10;
			if (arg2.anInt2793 != 0) {
				arg1.method6900(local253, local112, local257 - local253, arg2.anInt2793, local259 - local112);
			}
			if (arg2.anInt2809 != 0) {
				arg1.method6943(local253, local257 - local253, local259 - local112, local112, arg2.anInt2809);
			}
			for (@Pc(326) int local326 = 0; local326 < local35; local326++) {
				@Pc(331) String local331 = Static205.aStringArray12[local326];
				if (local326 < local35 - 1) {
					local331 = local331.substring(0, local331.length() - 4);
				}
				Static603.aClass127_10.method3092(arg1, local331, local53, local112, arg2.anInt2797);
				local112 += Static603.aClass127_10.method3090();
			}
		}
		if (arg2.anInt2810 == -1 && arg2.aString17 == null) {
			return;
		}
		@Pc(387) Class5_Sub48 local387 = new Class5_Sub48(arg0);
		local14 >>= 0x1;
		local387.anInt8582 = local253;
		local387.anInt8589 = local255;
		local387.anInt8594 = local33 - local14;
		local387.anInt8590 = local30 + local14;
		local387.anInt8584 = local14 + local33;
		local387.anInt8593 = local259;
		local387.anInt8588 = local257;
		local387.anInt8586 = local30 - local14;
		Static38.aClass114_4.method2807(local387);
	}
}
