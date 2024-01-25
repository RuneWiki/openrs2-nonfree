import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_22 = new Class244(29, 3);

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "[S")
	public static final short[] aShortArray38 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!ku;")
	public static final Class139 aClass139_13 = new Class139(260);

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	public static int anInt1627 = 0;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Lclient!uj;")
	public static Class28_Sub3 method1315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class48 local7 = Static69.aClass48ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass28_Sub3_2;
	}
}
