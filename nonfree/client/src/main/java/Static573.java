import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!vv", name = "n", descriptor = "I")
	public static int anInt9405;

	@OriginalMember(owner = "client!vv", name = "o", descriptor = "I")
	public static int anInt9406;

	@OriginalMember(owner = "client!vv", name = "x", descriptor = "I")
	public static int anInt9415;

	@OriginalMember(owner = "client!vv", name = "y", descriptor = "I")
	public static int anInt9416 = 0;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)Lclient!mf;")
	public static Class4_Sub4 method7681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class276 local7 = Static270.aClass276ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class4_Sub4 local14 = local7.aClass4_Sub4_1;
			local7.aClass4_Sub4_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)Lclient!ek;")
	public static Class6_Sub2_Sub6 method7682() {
		return Static217.aClass6_Sub2_Sub6_2;
	}

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "(I)V")
	public static void method7683() {
		if (Static557.anInt9206 == 3) {
			Static449.method6350(4);
		} else if (Static557.anInt9206 == 7) {
			Static449.method6350(8);
		} else if (Static557.anInt9206 == 10) {
			Static449.method6350(11);
		}
	}
}
