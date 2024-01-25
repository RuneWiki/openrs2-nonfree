import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "Lclient!jm;")
	public static Class124 aClass124_3;

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "Lclient!l;")
	public static Class11 aClass11_9;

	@OriginalMember(owner = "client!kl", name = "q", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_50 = new Class253(42, 3);

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
	public static int anInt2504 = 0;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
	public static void method2088() {
		@Pc(7) int local7 = Static36.anInt647;
		@Pc(9) int[] local9 = Static362.anIntArray533;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class26_Sub2_Sub4_Sub2 local19 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt7075 > 0) {
				local19.anInt7075--;
				if (local19.anInt7075 == 0) {
					local19.aString68 = null;
				}
			}
		}
		for (@Pc(45) int local45 = 0; local45 < Static56.anInt943; local45++) {
			@Pc(51) int local51 = Static228.anIntArray347[local45];
			@Pc(55) Class26_Sub2_Sub4_Sub1 local55 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local51];
			if (local55 != null && local55.anInt7075 > 0) {
				local55.anInt7075--;
				if (local55.anInt7075 == 0) {
					local55.aString68 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IJ)V")
	public static void method2089(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static203.method2904(arg0 - 1L);
			Static203.method2904(1L);
		} else {
			Static203.method2904(arg0);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!gk;I)Lclient!hg;")
	public static Class60_Sub1 method2091(@OriginalArg(0) Class7_Sub14 arg0) {
		return new Class60_Sub1(arg0.method3961(), arg0.method3961(), arg0.method3961(), arg0.method3961(), arg0.method3975(), arg0.method3975(), arg0.method3981());
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)Lclient!lf;")
	public static Class26_Sub3 method2092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class223 local7 = Static19.aClass223ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass26_Sub3_1;
	}
}
