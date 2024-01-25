import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fw", name = "l", descriptor = "Lclient!ew;")
	public static final Class98 aClass98_55 = new Class98("", 18);

	@OriginalMember(owner = "client!fw", name = "B", descriptor = "I")
	public static int anInt10647 = -1;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BII)Z")
	public static boolean method9035(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZIII)I")
	public static int method9041(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub38 local8 = Static478.method7058(arg2, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && local8.anIntArray364.length > arg1) {
			return local8.anIntArray364[arg1];
		} else {
			return -1;
		}
	}
}
