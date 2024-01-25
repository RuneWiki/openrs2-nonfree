import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
	public static int anInt4585;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Z")
	public static boolean aBoolean336 = false;

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
	public static int anInt4584 = 0;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "[I")
	public static final int[] anIntArray378 = new int[200];

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZII)Lclient!iaa;")
	public static Class138 method3897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class138 local7 = new Class138();
		local7.anInt3999 = -1;
		local7.anInt4009 = arg1 + 5 + 1;
		local7.anInt4005 = arg0 + 1 + 5;
		local7.anInt4008 = -1;
		local7.anIntArrayArray35 = new int[local7.anInt4005][local7.anInt4009];
		local7.method3441();
		return local7;
	}
}
