import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_25 = new Class264(30);

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
	public static void method3476() {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static26.anInt462; local13++) {
			for (@Pc(17) int local17 = 0; local17 < Static445.anInt6140; local17++) {
				if (Static454.method6568(local13, Static486.aClass58ArrayArrayArray2, local11, true, local17)) {
					local11++;
				}
				if (local11 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZIZI)V")
	public static void method3477(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static636.method8885(Static372.aClass217_Sub1Array1.length - 1, arg1, arg3, 0, arg0, arg2);
		Static538.anInt9252 = 0;
		Static419.aClass14_Sub4_2 = null;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
	public static void method3478() {
		Static421.aBoolean520 = true;
	}
}
