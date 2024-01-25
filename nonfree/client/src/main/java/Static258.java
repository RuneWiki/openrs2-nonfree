import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
	public static int anInt5088;

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
	public static int anInt5090;

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "Z")
	public static boolean aBoolean423 = true;

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
	public static int anInt5091 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIILclient!de;ILclient!vg;II)V")
	public static void method4530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class46 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class201 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg6 * arg6 + arg1 * arg1;
		if (arg0 < local12) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg5.anInt6505 / 2, arg5.anInt6510 / 2);
		if (local12 <= local35 * local35) {
			Static334.method5777(arg5, arg6, arg1, Static24.aClass95Array16[arg4], arg3, arg7, arg2);
			return;
		}
		local35 -= 10;
		@Pc(54) int local54;
		if (Static53.anInt992 == 4) {
			local54 = (int) Static164.aFloat24 & 0x3FFF;
		} else {
			local54 = (int) Static164.aFloat24 + Static170.anInt3407 & 0x3FFF;
		}
		@Pc(65) int local65 = Class187.anIntArray571[local54];
		@Pc(69) int local69 = Class187.anIntArray570[local54];
		if (Static53.anInt992 != 4) {
			local65 = local65 * 256 / (Static9.anInt191 + 256);
			local69 = local69 * 256 / (Static9.anInt191 + 256);
		}
		@Pc(99) int local99 = arg1 * local65 + local69 * arg6 >> 15;
		@Pc(110) int local110 = arg1 * local69 - local65 * arg6 >> 15;
		@Pc(116) double local116 = Math.atan2((double) local99, (double) local110);
		@Pc(123) int local123 = (int) ((double) local35 * Math.sin(local116));
		@Pc(130) int local130 = (int) (Math.cos(local116) * (double) local35);
		Static203.aClass95Array12[arg4].method5505((float) local123 + (float) arg5.anInt6505 / 2.0F + (float) arg7, (float) arg5.anInt6510 / 2.0F + (float) arg2 - (float) local130, 4096, (int) (-local116 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
	public static void method4531() {
		for (@Pc(8) Class5_Sub7 local8 = (Class5_Sub7) Static296.aClass103_138.method2756(); local8 != null; local8 = (Class5_Sub7) Static296.aClass103_138.method2748()) {
			if (local8.aBoolean33) {
				local8.method409();
			}
		}
		for (@Pc(32) Class5_Sub7 local32 = (Class5_Sub7) Static143.aClass103_70.method2756(); local32 != null; local32 = (Class5_Sub7) Static143.aClass103_70.method2748()) {
			if (local32.aBoolean33) {
				local32.method409();
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([[II)V")
	public static void method4532(@OriginalArg(0) int[][] arg0) {
		Static129.anIntArrayArray46 = arg0;
	}
}
