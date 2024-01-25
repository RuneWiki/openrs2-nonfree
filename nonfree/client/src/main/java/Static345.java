import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString136;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "[J")
	public static final long[] aLongArray14 = new long[100];

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
	public static final int[] anIntArray370 = new int[14];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5258(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class4_Sub6_Sub5 local8 = Static396.method6079(arg0, 3);
		local8.method2303();
		local8.aString45 = arg1;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBIIIIILclient!r;I)V")
	public static void method5259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class7 arg6, @OriginalArg(8) int arg7) {
		@Pc(15) Interface21 local15 = (Interface21) Static497.method7181(arg4, arg0, arg5);
		@Pc(24) Class233 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(40) int local40;
		if (local15 != null) {
			local24 = Static103.aClass298_1.method6822(local15.method7281());
			local30 = local15.method7283() & 0x3;
			local34 = local15.method7280();
			if (local24.anInt6701 == -1) {
				local40 = arg1;
				if (local24.anInt6681 > 0) {
					local40 = arg2;
				}
				if (local34 == 0 || local34 == 2) {
					if (local30 == 0) {
						arg6.method7789(arg7, arg3, 4, local40);
					} else if (local30 == 1) {
						arg6.method7809(arg7, 4, local40, arg3);
					} else if (local30 == 2) {
						arg6.method7789(arg7, arg3 + 3, 4, local40);
					} else if (local30 == 3) {
						arg6.method7809(arg7 + 3, 4, local40, arg3);
					}
				}
				if (local34 == 3) {
					if (local30 == 0) {
						arg6.method7825(1, 1, arg7, local40, arg3);
					} else if (local30 == 1) {
						arg6.method7825(1, 1, arg7, local40, arg3 + 3);
					} else if (local30 == 2) {
						arg6.method7825(1, 1, arg7 + 3, local40, arg3 + 3);
					} else if (local30 == 3) {
						arg6.method7825(1, 1, arg7 + 3, local40, arg3);
					}
				}
				if (local34 == 2) {
					if (local30 == 0) {
						arg6.method7809(arg7, 4, local40, arg3);
					} else if (local30 == 1) {
						arg6.method7789(arg7, arg3 + 3, 4, local40);
					} else if (local30 == 2) {
						arg6.method7809(arg7 + 3, 4, local40, arg3);
					} else if (local30 == 3) {
						arg6.method7789(arg7, arg3, 4, local40);
					}
				}
			} else {
				Static16.method4947(arg7, arg6, arg3, local30, local24);
			}
		}
		local15 = (Interface21) Static36.method1049(arg4, arg0, arg5, sw.class);
		if (local15 != null) {
			local24 = Static103.aClass298_1.method6822(local15.method7281());
			local30 = local15.method7283() & 0x3;
			local34 = local15.method7280();
			if (local24.anInt6701 != -1) {
				Static16.method4947(arg7, arg6, arg3, local30, local24);
			} else if (local34 == 9) {
				local40 = -1118482;
				if (local24.anInt6681 > 0) {
					local40 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg6.method7844(arg3 + 3, local40, arg7 + 3, arg7, arg3);
				} else {
					arg6.method7844(arg3 + 3, local40, arg7, arg7 + 3, arg3);
				}
			}
		}
		local15 = (Interface21) Static570.method8016(arg4, arg0, arg5);
		if (local15 == null) {
			return;
		}
		local24 = Static103.aClass298_1.method6822(local15.method7281());
		local30 = local15.method7283() & 0x3;
		if (local24.anInt6701 != -1) {
			Static16.method4947(arg7, arg6, arg3, local30, local24);
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIB)Z")
	public static boolean method5260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
