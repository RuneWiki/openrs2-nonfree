import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!uca", name = "E", descriptor = "I")
	public static int anInt8693;

	@OriginalMember(owner = "client!uca", name = "I", descriptor = "Z")
	public static final boolean aBoolean634 = false;

	@OriginalMember(owner = "client!uca", name = "W", descriptor = "I")
	public static int anInt8706 = 0;

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(B)V")
	public static void method7172() {
		Static468.aClass326_46.method7230();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILclient!io;)V")
	public static void method7173(@OriginalArg(1) Class1_Sub20 arg0) {
		if (arg0.aByteArray52.length - arg0.anInt5238 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method4393();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray52.length - arg0.anInt5238 < 2) {
			return;
		}
		@Pc(46) int local46 = arg0.method4426();
		if (arg0.aByteArray52.length - arg0.anInt5238 < local46 * 6) {
			return;
		}
		for (@Pc(60) int local60 = 0; local60 < local46; local60++) {
			@Pc(74) int local74 = arg0.method4426();
			@Pc(78) int local78 = arg0.method4371();
			if (Static475.anIntArray530.length > local74 && Static412.aBooleanArray23[local74] && (Static359.aClass245_1.method5572(local74).aChar4 != '1' || local78 >= -1 && local78 <= 1)) {
				Static475.anIntArray530[local74] = local78;
			}
		}
	}

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "(I)J")
	public static long method7175() {
		return Static375.aClass92_1.method4209();
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(IIIIIII)V")
	public static void method7176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static370.method5402(arg3);
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg3 - arg2;
		if (local21 < 0) {
			local21 = 0;
		}
		@Pc(30) int local30 = arg3;
		@Pc(33) int local33 = -arg3;
		@Pc(35) int local35 = local21;
		@Pc(38) int local38 = -local21;
		@Pc(40) int local40 = -1;
		@Pc(42) int local42 = -1;
		@Pc(46) int[] local46 = Static478.anIntArrayArray51[arg1];
		@Pc(51) int local51 = arg4 - local21;
		@Pc(55) int local55 = local21 + arg4;
		Static250.method4000(local51, local46, arg4 - arg3, arg5);
		Static250.method4000(local55, local46, local51, arg0);
		Static250.method4000(arg3 + arg4, local46, local55, arg5);
		while (local30 > local16) {
			local42 += 2;
			local40 += 2;
			local33 += local40;
			local38 += local42;
			if (local38 >= 0 && local35 >= 1) {
				Static580.anIntArray626[local35] = local16;
				local35--;
				local38 -= local35 << 1;
			}
			local16++;
			@Pc(124) int[] local124;
			@Pc(131) int[] local131;
			@Pc(135) int local135;
			@Pc(140) int local140;
			@Pc(145) int local145;
			@Pc(150) int local150;
			@Pc(154) int local154;
			if (local33 >= 0) {
				local30--;
				if (local30 < local21) {
					local124 = Static478.anIntArrayArray51[arg1 + local30];
					local131 = Static478.anIntArrayArray51[arg1 - local30];
					local135 = Static580.anIntArray626[local30];
					local140 = arg4 + local16;
					local145 = arg4 - local16;
					local150 = arg4 + local135;
					local154 = arg4 - local135;
					Static250.method4000(local154, local124, local145, arg5);
					Static250.method4000(local150, local124, local154, arg0);
					Static250.method4000(local140, local124, local150, arg5);
					Static250.method4000(local154, local131, local145, arg5);
					Static250.method4000(local150, local131, local154, arg0);
					Static250.method4000(local140, local131, local150, arg5);
				} else {
					local124 = Static478.anIntArrayArray51[arg1 + local30];
					local131 = Static478.anIntArrayArray51[arg1 - local30];
					local135 = arg4 + local16;
					local140 = arg4 - local16;
					Static250.method4000(local135, local124, local140, arg5);
					Static250.method4000(local135, local131, local140, arg5);
				}
				local33 -= local30 << 1;
			}
			local124 = Static478.anIntArrayArray51[arg1 + local16];
			local131 = Static478.anIntArrayArray51[arg1 - local16];
			local135 = arg4 + local30;
			local140 = arg4 - local30;
			if (local21 <= local16) {
				Static250.method4000(local135, local124, local140, arg5);
				Static250.method4000(local135, local131, local140, arg5);
			} else {
				local145 = local35 >= local16 ? local35 : Static580.anIntArray626[local16];
				local150 = local145 + arg4;
				local154 = arg4 - local145;
				Static250.method4000(local154, local124, local140, arg5);
				Static250.method4000(local150, local124, local154, arg0);
				Static250.method4000(local135, local124, local150, arg5);
				Static250.method4000(local154, local131, local140, arg5);
				Static250.method4000(local150, local131, local154, arg0);
				Static250.method4000(local135, local131, local150, arg5);
			}
		}
	}
}
