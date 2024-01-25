import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
	public static int anInt8620;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZILclient!vaa;I)J")
	public static long method7064(@OriginalArg(1) int arg0, @OriginalArg(2) Interface18 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class36 local16 = Static308.aClass96_4.method2274(arg1.method7467());
		@Pc(42) long local42 = (long) (arg1.method7465() << 14 | arg0 << 7 | arg2 | arg1.method7469() << 20 | 0x40000000);
		if (local16.anInt992 == 0) {
			local42 |= local9;
		}
		if (local16.anInt991 == 1) {
			local42 |= local5;
		}
		if (local16.aBoolean52) {
			local42 |= local7;
		}
		return local42 | (long) arg1.method7467() << 32;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public static void method7066() {
		if (Static264.aBoolean359) {
			return;
		}
		if (Static544.aClass1_Sub22_Sub1_1.aBoolean389) {
			Static50.aFloat13 = (int) Static50.aFloat13 - 17 & 0xFFFFFFF0;
		} else {
			Static285.aFloat109 += (-Static285.aFloat109 - 12.0F) / 2.0F;
		}
		Static282.aBoolean555 = true;
		Static264.aBoolean359 = true;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZIZ)I")
	public static int method7068(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class1_Sub18 local13 = Static7.method282(arg2, arg1);
		if (local13 == null) {
			return 0;
		} else if (arg0 >= 0 && local13.anIntArray255.length > arg0) {
			return local13.anIntArray255[arg0];
		} else {
			return 0;
		}
	}
}
