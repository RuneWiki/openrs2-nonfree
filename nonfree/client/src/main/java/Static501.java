import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "J")
	public static long aLong220;

	@OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
	public static int anInt7936 = 7000;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
	public static int anInt7929 = anInt7936;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "Z")
	public static boolean aBoolean551 = false;

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "Z")
	public static final boolean aBoolean552 = false;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)I")
	public static int method6574() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static566.aClass92_6.aBoolean172 && !Static566.aClass92_6.aBoolean170) {
			local7 = true;
			if (Static395.aClass3_Sub28_1.anInt4590 < 512 && Static395.aClass3_Sub28_1.anInt4590 != 0) {
				local7 = false;
			}
			if (Static126.aString34.startsWith("win")) {
				local9 = true;
				local11 = true;
			} else {
				local9 = true;
			}
		}
		if (Static574.aBoolean646) {
			local7 = false;
		}
		if (Static353.aBoolean419) {
			local11 = false;
		}
		if (Static594.aBoolean666) {
			local9 = false;
		}
		if (!local7 && !local9 && !local11) {
			return Static621.method8396();
		}
		@Pc(63) int local63 = -1;
		@Pc(65) int local65 = -1;
		if (local7) {
			try {
				local63 = Static434.method5948(1000, 2);
			} catch (@Pc(82) Exception local82) {
			}
		}
		@Pc(85) int local85 = -1;
		if (local11) {
			try {
				local85 = Static434.method5948(1000, 3);
				if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() == 3) {
					@Pc(103) Class72 local103 = Static119.aClass95_4.method8064();
					@Pc(108) long local108 = local103.aLong51 & 0xFFFFFFFFFFFFL;
					@Pc(111) int local111 = local103.anInt1975;
					if (local111 == 4318) {
						local9 &= local108 >= 64425238954L;
					} else if (local111 == 4098) {
						local9 &= local108 >= 60129613779L;
					}
				}
			} catch (@Pc(147) Exception local147) {
			}
		}
		if (local9) {
			try {
				local65 = Static434.method5948(1000, 1);
			} catch (@Pc(157) Exception local157) {
			}
		}
		if (local63 == -1 && local65 == -1 && local85 == -1) {
			return Static621.method8396();
		}
		local65 = (int) ((float) local65 * 1.1F);
		local85 = (int) ((float) local85 * 1.1F);
		if (local63 > local85 && local63 > local65) {
			return Static310.method4468(local63);
		} else if (local85 <= local65) {
			return Static301.method2679(1, local65);
		} else {
			return Static301.method2679(3, local85);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)I")
	public static int method6575(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (local12 + arg1) / arg0 - local12;
	}
}
