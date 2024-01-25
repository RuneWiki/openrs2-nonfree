import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	public static int anInt3;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "I")
	public static int anInt12;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	public static int anInt4 = 0;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	public static int anInt6 = 0;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	public static int anInt8 = 0;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IBI)Lclient!dl;")
	public static Class49 method1(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class49 local7 = new Class49();
		local7.anInt1413 = -1;
		local7.anInt1404 = arg1 + 6;
		local7.anInt1408 = arg0 + 6;
		local7.anInt1400 = -1;
		local7.anIntArrayArray7 = new int[local7.anInt1408][local7.anInt1404];
		local7.method1236();
		return local7;
	}
}
