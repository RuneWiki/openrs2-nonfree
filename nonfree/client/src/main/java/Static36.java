import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
	public static int anInt7704;

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
	public static int anInt7708;

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
	public static int anInt7705 = -1;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)Lclient!oe;")
	public static Class181 method5941(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class181 local7 = new Class181();
		local7.anInt4723 = -1;
		local7.anInt4725 = -1;
		local7.anInt4721 = arg1 + 5 + 1;
		local7.anInt4718 = arg0 + 1 + 5;
		local7.anIntArrayArray29 = new int[local7.anInt4718][local7.anInt4721];
		local7.method3877();
		return local7;
	}
}
