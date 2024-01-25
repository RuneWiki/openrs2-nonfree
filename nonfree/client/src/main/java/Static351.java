import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!op", name = "b", descriptor = "Lclient!ra;")
	public static Class27 aClass27_5;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "B")
	public static byte aByte76;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "[Lclient!kc;")
	public static final Class159[] aClass159Array1 = new Class159[2048];

	@OriginalMember(owner = "client!op", name = "n", descriptor = "I")
	public static int anInt6430 = 0;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method5584(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) long local8 = 0L;
		for (@Pc(18) int local18 = 0; local18 < local6; local18++) {
			local8 = (local8 << 5) + (long) arg0.charAt(local18) - local8;
		}
		return local8;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IILclient!tt;ZIII)V")
	public static void method5589(@OriginalArg(1) int arg0, @OriginalArg(2) Class280 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static205.anInt4329 >= 50 || (arg1 == null || arg1.anIntArrayArray75 == null || arg5 >= arg1.anIntArrayArray75.length || arg1.anIntArrayArray75[arg5] == null)) {
			return;
		}
		@Pc(34) int local34 = arg1.anIntArrayArray75[arg5][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(63) int local63;
		if (arg1.anIntArrayArray75[arg5].length > 1) {
			local63 = (int) ((double) arg1.anIntArrayArray75[arg5].length * Math.random());
			if (local63 > 0) {
				local38 = arg1.anIntArrayArray75[arg5][local63];
			}
		}
		@Pc(81) int local81 = local34 & 0x1F;
		if (local81 == 0) {
			if (arg2) {
				Static470.method5653(local38, 255, 0, local44);
			}
		} else if (Static89.aClass1_Sub28_Sub1_1.anInt4913 != 0) {
			local63 = arg0 - 64 >> 7;
			@Pc(108) int local108 = arg4 - 64 >> 7;
			Static41.aClass67Array1[Static205.anInt4329++] = new Class67((byte) 1, local38, local44, 0, 255, local81 + (local108 << 8) + (arg3 << 24) + (local63 << 16));
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(B)[Lclient!fp;")
	public static Class91[] method5592() {
		return new Class91[] { Static374.aClass91_31, Static434.aClass91_28, Static266.aClass91_18 };
	}
}
