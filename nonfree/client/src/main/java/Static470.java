import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
	public static int anInt8805 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!dt;Lclient!oa;BLclient!kq;)V")
	public static void method7216(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(3) Class3_Sub32 arg2) {
		@Pc(8) Class37 local8 = arg0.method2134(arg1);
		if (local8 == null) {
			return;
		}
		@Pc(14) int local14 = local8.QA();
		if (local14 < local8.b()) {
			local14 = local8.b();
		}
		@Pc(30) int local30 = arg2.anInt5920;
		@Pc(37) int local37 = arg2.anInt5922;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(57) int local57;
		@Pc(83) int local83;
		if (arg0.aString30 != null) {
			local39 = Static200.aClass297_9.method7320(null, null, Static350.aStringArray26, arg0.aString30);
			for (local57 = 0; local57 < local39; local57++) {
				@Pc(62) String local62 = Static350.aStringArray26[local57];
				if (local57 < local39 - 1) {
					local62 = local62.substring(0, local62.length() - 4);
				}
				local83 = Static563.aClass247_11.method6144(local62);
				if (local83 > local41) {
					local41 = local83;
				}
			}
			local43 = Static563.aClass247_11.method6143() * local39 + Static563.aClass247_11.method6141() / 2;
		}
		local57 = local14 / 2 + arg2.anInt5920;
		@Pc(117) int local117 = arg2.anInt5922;
		if (local30 < local14 + Static87.anInt6918) {
			local30 = Static87.anInt6918;
			local57 = local14 / 2 + Static87.anInt6918 + local41 / 2 + 5 + 10;
		} else if (local30 > Static87.anInt6917 - local14) {
			local57 = Static87.anInt6917 - local41 / 2 - local14 / 2 - 5 - 10;
			local30 = Static87.anInt6917 - local14;
		}
		if (local37 < local14 + Static87.anInt6920) {
			local37 = Static87.anInt6920;
			local117 = local14 / 2 + Static87.anInt6920 + 10;
		} else if (Static87.anInt6921 - local14 < local37) {
			local117 = Static87.anInt6921 - local43 - local14 / 2 - 10;
			local37 = Static87.anInt6921 - local14;
		}
		local83 = (int) (Math.atan2((double) (local30 - arg2.anInt5920), (double) (local37 - arg2.anInt5922)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local8.method7075((float) local14 / 2.0F + (float) local30, (float) local14 / 2.0F + (float) local37, 4096, local83);
		@Pc(251) int local251 = -2;
		@Pc(253) int local253 = -2;
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		if (arg0.aString30 != null) {
			local251 = local57 - local41 / 2 - 5;
			local253 = local117;
			local255 = local251 + local41 + 10;
			local257 = Static563.aClass247_11.method6143() * local39 + local117 + 3;
			if (arg0.anInt2401 != 0) {
				arg1.method5341(arg0.anInt2401, local251, local257 - local117, local255 - local251, local117);
			}
			if (arg0.anInt2374 != 0) {
				arg1.method5300(local255 - local251, arg0.anInt2374, local251, local257 - local117, local117);
			}
			for (@Pc(326) int local326 = 0; local326 < local39; local326++) {
				@Pc(331) String local331 = Static350.aStringArray26[local326];
				if (local326 < local39 - 1) {
					local331 = local331.substring(0, local331.length() - 4);
				}
				Static563.aClass247_11.method6142(arg1, local331, local57, local117, arg0.anInt2395);
				local117 += Static563.aClass247_11.method6143();
			}
		}
		if (arg0.anInt2378 == -1 && arg0.aString30 == null) {
			return;
		}
		@Pc(382) Class3_Sub22 local382 = new Class3_Sub22(arg2);
		local14 >>= 0x1;
		local382.anInt4433 = local37 + local14;
		local382.anInt4431 = local30 + local14;
		local382.anInt4438 = local257;
		local382.anInt4430 = local251;
		local382.anInt4429 = local253;
		local382.anInt4434 = local255;
		local382.anInt4432 = local30 - local14;
		local382.anInt4428 = local37 - local14;
		Static493.aClass183_55.method4792(local382);
	}
}
