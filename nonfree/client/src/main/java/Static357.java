import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "Lclient!wn;")
	public static Class349 aClass349_12;

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "[Lclient!xa;")
	public static Class71[] aClass71Array41;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "Lclient!kf;")
	public static final Class171 aClass171_12 = new Class171(1);

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "[I")
	public static final int[] anIntArray465 = new int[1000];

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
	public static void method5351() {
		@Pc(5) Class330 local5 = Static180.aClass330_22;
		synchronized (Static180.aClass330_22) {
			Static180.aClass330_22.method7678();
		}
		local5 = Static395.aClass330_46;
		synchronized (Static395.aClass330_46) {
			Static395.aClass330_46.method7678();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(III)V")
	public static void method5353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class133 local7 = Static113.aClass133ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass15_Sub4_2 != null) {
			local7.aClass15_Sub4_2 = null;
		}
		if (local7.aClass15_Sub4_1 != null) {
			local7.aClass15_Sub4_1 = null;
		}
	}
}
