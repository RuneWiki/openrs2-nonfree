import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "J")
	public static long aLong274;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Lclient!th;")
	public static Class338 aClass338_14;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "Lclient!uq;")
	public static Class362 aClass362_141;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "Lclient!fea;")
	public static final Class112 aClass112_46 = new Class112();

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "[S")
	public static short[] aShortArray136 = new short[256];

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "[Lclient!bea;")
	public static final Class3_Sub5_Sub3[] aClass3_Sub5_Sub3Array12 = new Class3_Sub5_Sub3[14];

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "Lclient!sw;")
	public static final Class330 aClass330_7 = new Class330();

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_146 = new Class171(28, -2);

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "Lclient!uo;")
	public static final Class361 aClass361_7 = new Class361();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(JB)V")
	public static void method8045(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static82.anInt1511;
		@Pc(23) int local23;
		@Pc(31) int local31;
		if (Static365.anInt6231 != local11) {
			local23 = local11 - Static365.anInt6231;
			local31 = (int) ((long) local23 * arg0 / 320L);
			if (local23 > 0) {
				if (local31 == 0) {
					local31 = 1;
				} else if (local23 < local31) {
					local31 = local23;
				}
			} else if (local31 == 0) {
				local31 = -1;
			} else if (local31 < local23) {
				local31 = local23;
			}
			Static365.anInt6231 += local31;
		}
		@Pc(70) int local70 = Static8.anInt108;
		if (local70 != Static434.anInt7081) {
			local23 = local70 - Static434.anInt7081;
			local31 = (int) ((long) local23 * arg0 / 320L);
			if (local23 > 0) {
				if (local31 == 0) {
					local31 = 1;
				} else if (local31 > local23) {
					local31 = local23;
				}
			} else if (local31 == 0) {
				local31 = -1;
			} else if (local23 > local31) {
				local31 = local23;
			}
			Static434.anInt7081 += local31;
		}
		Static318.aFloat81 += (float) arg0 * Static560.aFloat177 / 40.0F * 8.0F;
		Static376.aFloat104 += Static209.aFloat66 * (float) arg0 / 40.0F * 8.0F;
		Static563.method7420();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/awt/Canvas;IIILclient!uq;ILclient!d;)Lclient!ha;")
	public static synchronized Class95 method8049(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class362 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Interface2 arg6) {
		if (arg3 == 0) {
			return Static365.method5253(arg6, arg0, arg1, arg5);
		} else if (arg3 == 2) {
			return Static465.method6211(arg0, arg1, arg6, arg5);
		} else if (arg3 == 1) {
			return Static172.method2748(arg2, arg0, arg6);
		} else if (arg3 == 5) {
			return Static111.method1723(arg6, arg0, arg4, arg2);
		} else if (arg3 == 3) {
			return Static685.method6291(arg2, arg0, arg6, arg4);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
