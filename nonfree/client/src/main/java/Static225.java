import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
	public static int anInt4944;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	public static int anInt4946;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_76 = new Class2(45, 4);

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	public static int anInt4941 = 0;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_77 = new Class2(48, 8);

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "[I")
	public static final int[] anIntArray441 = new int[500];

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "Lclient!gn;")
	public static final Class94 aClass94_22 = new Class94(8, 4);

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "Z")
	public static boolean aBoolean310 = false;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!ok;)I")
	public static int method3917(@OriginalArg(1) Class178 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3848(Static59.anInt1066)) {
			local5++;
		}
		if (arg0.method3848(Static382.anInt6131)) {
			local5++;
		}
		return local5;
	}
}
