import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!op", name = "G", descriptor = "[I")
	public static final int[] anIntArray389 = new int[2];

	@OriginalMember(owner = "client!op", name = "K", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_116 = new Class171(118, 0);

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIBILjava/lang/String;I)V")
	public static void method6012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class34_Sub10 local7 = new Class34_Sub10();
		local7.anInt10691 = arg3;
		local7.aString114 = arg5;
		local7.anInt10688 = Static122.anInt2190 + arg0;
		local7.anInt10690 = arg6;
		local7.anInt10687 = arg4;
		local7.anInt10692 = arg1;
		local7.anInt10689 = arg2;
		Static111.aClass317_1.method6890(local7);
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(III)V")
	public static void method6013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static281.aClass91_7.method1849(Static114.aClass84_24.method1729(Static654.anInt10668));
		@Pc(64) int local64;
		@Pc(36) int local36;
		if (Static599.aBoolean544) {
			for (@Pc(20) Class3_Sub5_Sub13 local20 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5459(); local20 != null; local20 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5453()) {
				if (local20.anInt6245 == 1) {
					local36 = Static648.method8707((Class3_Sub5_Sub18) local20.aClass243_10.aClass3_Sub5_44.aClass3_Sub5_66);
				} else {
					local36 = Static556.method7324(local20);
				}
				if (local36 > local13) {
					local13 = local36;
				}
			}
			local64 = Static610.anInt10153 * 16 + 21;
			local13 += 8;
			Static204.anInt3590 = Static610.anInt10153 * 16 + (Static653.aBoolean735 ? 26 : 22);
		} else {
			for (@Pc(83) Class3_Sub5_Sub18 local83 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6603(); local83 != null; local83 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6605()) {
				local36 = Static648.method8707(local83);
				if (local36 > local13) {
					local13 = local36;
				}
			}
			Static204.anInt3590 = (Static653.aBoolean735 ? 26 : 22) + Static166.anInt3037 * 16;
			local64 = Static166.anInt3037 * 16 + 21;
			local13 += 8;
		}
		@Pc(124) int local124 = arg0 - local13 / 2;
		if (local13 + local124 > Static531.anInt8327) {
			local124 = Static531.anInt8327 - local13;
		}
		if (local124 < 0) {
			local124 = 0;
		}
		local36 = arg1;
		if (Static13.anInt306 < arg1 + local64) {
			local36 = Static13.anInt306 - local64;
		}
		Static517.anInt8133 = local124;
		if (local36 < 0) {
			local36 = 0;
		}
		Static532.aBoolean580 = true;
		Static508.anInt8006 = local36;
		Static532.anInt8336 = local13;
	}
}
