import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!nda", name = "X", descriptor = "Lclient!jka;")
	public static Class6_Sub2_Sub11 aClass6_Sub2_Sub11_4;

	@OriginalMember(owner = "client!nda", name = "M", descriptor = "Lclient!qia;")
	public static Class6_Sub46 aClass6_Sub46_1 = null;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "([SIB)[S")
	public static short[] method6006(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(12) short[] local12 = new short[arg1];
		Static695.method5642(arg0, 0, local12, 0, arg1);
		return local12;
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)V")
	public static void method6007() {
		@Pc(7) Class320 local7 = null;
		try {
			@Pc(13) Class380 local13 = Static651.aClass122_38.method3356("");
			while (local13.anInt10067 == 0) {
				Static255.method4444(1L);
			}
			if (local13.anInt10067 == 1) {
				local7 = (Class320) local13.anObject25;
				@Pc(44) Class6_Sub15 local44 = Static687.aClass6_Sub44_33.method7084();
				local7.method7688(local44.anInt3174, local44.aByteArray20, 0);
			}
		} catch (@Pc(54) Exception local54) {
		}
		try {
			if (local7 != null) {
				local7.method7693();
			}
		} catch (@Pc(63) Exception local63) {
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!iga;ILclient!ha;Lclient!uja;)V")
	public static void method6008(@OriginalArg(0) Class6_Sub24 arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) Class361 arg2) {
		@Pc(10) Class49 local10 = arg2.method8528(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(17) int local17 = local10.method8988();
		if (local17 < local10.method8993()) {
			local17 = local10.method8993();
		}
		@Pc(33) int local33 = arg0.anInt4792;
		@Pc(36) int local36 = arg0.anInt4795;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(56) int local56;
		@Pc(79) int local79;
		if (arg2.aString117 != null) {
			local38 = Static574.aClass53_13.method812((Class49[]) null, (int[]) null, arg2.aString117, Static12.aStringArray4);
			for (local56 = 0; local56 < local38; local56++) {
				@Pc(62) String local62 = Static12.aStringArray4[local56];
				if (local38 - 1 > local56) {
					local62 = local62.substring(0, local62.length() - 4);
				}
				local79 = Static292.aClass259_3.method6287(local62);
				if (local79 > local40) {
					local40 = local79;
				}
			}
			local42 = local38 * Static292.aClass259_3.method6290() + Static292.aClass259_3.method6291() / 2;
		}
		local56 = local17 / 2 + arg0.anInt4792;
		if (local33 < local17 + Static627.anInt7271) {
			local56 = local17 / 2 + Static627.anInt7271 + local40 / 2 + 10 + 5;
			local33 = Static627.anInt7271;
		} else if (Static627.anInt7261 - local17 < local33) {
			local33 = Static627.anInt7261 - local17;
			local56 = Static627.anInt7261 - local17 / 2 - local40 / 2 - 10 - 5;
		}
		@Pc(170) int local170 = arg0.anInt4795;
		if (local36 < Static627.anInt7267 + local17) {
			local170 = local17 / 2 + Static627.anInt7267 + 10;
			local36 = Static627.anInt7267;
		} else if (local36 > Static627.anInt7270 - local17) {
			local170 = Static627.anInt7270 - local17 / 2 - local42 - 10;
			local36 = Static627.anInt7270 - local17;
		}
		local79 = (int) (Math.atan2((double) (local33 - arg0.anInt4792), (double) (local36 - arg0.anInt4795)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method8999((float) local17 / 2.0F + (float) local33, (float) local17 / 2.0F + (float) local36, 4096, local79);
		@Pc(251) int local251 = -2;
		@Pc(253) int local253 = -2;
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		if (arg2.aString117 != null) {
			local251 = local56 - local40 / 2 - 5;
			local253 = local170;
			local257 = Static292.aClass259_3.method6290() * local38 + local170 + 3;
			local255 = local251 + local40 + 10;
			if (arg2.anInt9808 != 0) {
				arg1.method6631(local255 - local251, local251, local257 - local170, arg2.anInt9808, local170);
			}
			if (arg2.anInt9817 != 0) {
				arg1.method6718(local257 - local170, local170, arg2.anInt9817, local255 - local251, local251);
			}
			for (@Pc(334) int local334 = 0; local334 < local38; local334++) {
				@Pc(340) String local340 = Static12.aStringArray4[local334];
				if (local38 - 1 > local334) {
					local340 = local340.substring(0, local340.length() - 4);
				}
				Static292.aClass259_3.method6293(arg1, local340, local56, local170, arg2.anInt9803);
				local170 += Static292.aClass259_3.method6290();
			}
		}
		if (arg2.anInt9805 == -1 && arg2.aString117 == null) {
			return;
		}
		local17 >>= 0x1;
		@Pc(395) Class6_Sub20 local395 = new Class6_Sub20(arg0);
		local395.anInt3459 = local257;
		local395.anInt3455 = local36 - local17;
		local395.anInt3463 = local17 + local36;
		local395.anInt3457 = local17 + local33;
		local395.anInt3454 = local251;
		local395.anInt3460 = local33 - local17;
		local395.anInt3456 = local253;
		local395.anInt3461 = local255;
		Static527.aClass340_67.method8131(local395);
	}
}
