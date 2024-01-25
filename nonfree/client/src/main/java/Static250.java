import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
	public static int anInt4004;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
	public static int anInt4002 = -1;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!ha;Z)Lclient!da;")
	public static Class72 method3527(@OriginalArg(1) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(14) Class176 local14 = Static300.method4080(arg2, arg1, arg0);
		return local14 == null ? null : local14.aClass72_7;
	}
}
