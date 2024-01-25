import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cq", name = "u", descriptor = "Lclient!kca;")
	public static Class189 aClass189_2;

	@OriginalMember(owner = "client!cq", name = "v", descriptor = "I")
	public static int anInt1566;

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
	public static final int anInt1555 = Static415.method5946(1600);

	@OriginalMember(owner = "client!cq", name = "q", descriptor = "I")
	public static int anInt1562 = -1;

	@OriginalMember(owner = "client!cq", name = "w", descriptor = "Lclient!gba;")
	public static Class115 aClass115_2 = null;

	@OriginalMember(owner = "client!cq", name = "E", descriptor = "[I")
	public static final int[] anIntArray202 = new int[32];

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)Lclient!wh;")
	public static Class10_Sub3 method1334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static309.aClass100ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class10_Sub3 local14 = local7.aClass10_Sub3_1;
			local7.aClass10_Sub3_1 = null;
			return local14;
		}
	}
}
