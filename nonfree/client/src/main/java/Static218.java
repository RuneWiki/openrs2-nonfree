import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "[Lclient!fq;")
	public static Class34_Sub1[] aClass34_Sub1Array2;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!vba;")
	public static final Class366 aClass366_4 = new Class366();

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
	public static int anInt3740 = 0;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	public static int anInt3743 = -1;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[16];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I")
	public static int method3191() {
		if (Static532.aBoolean580) {
			return 6;
		} else if (Static562.aClass3_Sub5_Sub18_7 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static562.aClass3_Sub5_Sub18_7.anInt9217;
			if (Static97.method1618(local19)) {
				return 1;
			} else if (Static413.method5631(local19)) {
				return 2;
			} else if (Static210.method3123(local19)) {
				return 3;
			} else if (Static475.method6321(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
	public static void method3192() {
		if (Static268.aFileOutputStream1 != null) {
			try {
				Static268.aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		Static268.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([JIII[I)V")
	public static void method3193(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(18) int local18 = (arg1 + arg2) / 2;
		@Pc(20) int local20 = arg2;
		@Pc(24) long local24 = arg0[local18];
		arg0[local18] = arg0[arg1];
		arg0[arg1] = local24;
		@Pc(38) int local38 = arg3[local18];
		arg3[local18] = arg3[arg1];
		arg3[arg1] = local38;
		@Pc(58) int local58 = ~local24 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg2; local60 < arg1; local60++) {
			if (arg0[local60] < (long) (local60 & local58) + local24) {
				@Pc(81) long local81 = arg0[local60];
				arg0[local60] = arg0[local20];
				arg0[local20] = local81;
				@Pc(95) int local95 = arg3[local60];
				arg3[local60] = arg3[local20];
				arg3[local20++] = local95;
			}
		}
		arg0[arg1] = arg0[local20];
		arg0[local20] = local24;
		arg3[arg1] = arg3[local20];
		arg3[local20] = local38;
		method3193(arg0, local20 - 1, arg2, arg3);
		method3193(arg0, arg1, local20 + 1, arg3);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!ofa;)V")
	public static void method3194(@OriginalArg(1) Class265 arg0) {
		if (arg0.anInt7046 == Static493.anInt7812) {
			Static89.aBooleanArray7[arg0.anInt7018] = true;
		}
	}
}
