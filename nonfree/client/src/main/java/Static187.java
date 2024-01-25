import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!md", name = "r", descriptor = "I")
	public static int anInt4073;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "[S")
	public static final short[] aShortArray58 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method3424() {
		@Pc(5) Class53 local5 = Static98.aClass53_3;
		synchronized (Static98.aClass53_3) {
			Static93.anInt2052++;
			Static136.anInt3094 = Static288.anInt5834;
			Static38.anInt830 = Static157.anInt3516;
			Static184.anInt4055 = Static83.anInt1765;
			Static9.anInt6461 = Static342.anInt6703;
			Static65.anInt1361 = Static169.anInt3741;
			Static237.anInt4924 = Static140.anInt3163;
			Static266.aLong199 = Static146.aLong114;
			Static342.anInt6703 = 0;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIZI)V")
	public static void method3426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (Static266.method4641(arg1)) {
			Static163.method3129(arg2, Static158.aClass72ArrayArray1[arg1], -1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)Lclient!pi;")
	public static Class155 method3427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class102[] local7 = null;
		@Pc(18) Class123 local18 = Static36.method674(arg1);
		if (local18.anIntArray339 != null) {
			local7 = new Class102[local18.anIntArray339.length];
			for (@Pc(28) int local28 = 0; local28 < local7.length; local28++) {
				@Pc(39) Class64 local39 = Static349.method5643(local18.anIntArray339[local28]);
				local7[local28] = new Class102(local39.anInt1651, local39.anInt1648, local39.anInt1647, local39.anInt1649, local39.anInt1650, local39.anInt1646, local39.anInt1656, local39.aBoolean128);
			}
		}
		return new Class155(local18.anInt3944, local7, local18.anInt3942, arg0, arg2, arg3);
	}
}
