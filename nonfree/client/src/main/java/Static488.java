import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "Lclient!e;")
	public static Interface4 anInterface4_13;

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
	public static final int anInt8707 = -1;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
	public static final int anInt8711 = 4;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZI)I")
	public static int method7161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class3_Sub5 local8 = Static480.method7117(arg2, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray117.length) {
			return local8.anIntArray117[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
	public static void method7162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class290 local7 = Static279.aClass290ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass6_Sub4_3 != null) {
			local7.aClass6_Sub4_3 = null;
		}
		if (local7.aClass6_Sub4_2 != null) {
			local7.aClass6_Sub4_2 = null;
		}
	}
}
