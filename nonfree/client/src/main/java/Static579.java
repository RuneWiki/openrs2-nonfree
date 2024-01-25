import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!uga", name = "G", descriptor = "Ljava/lang/Object;")
	public static Object anObject23;

	@OriginalMember(owner = "client!uga", name = "D", descriptor = "Lclient!al;")
	public static final Class17 aClass17_5 = new Class17("runescape", 0);

	@OriginalMember(owner = "client!uga", name = "F", descriptor = "I")
	public static int anInt9466 = 0;

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(ILclient!vda;)I")
	public static int method8032(@OriginalArg(1) Class2_Sub7_Sub20 arg0) {
		@Pc(12) String local12 = Static36.method872(arg0);
		return Static551.aClass183_13.method4454(local12, Static402.aClass31Array11);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(ILclient!aa;Lclient!iea;IBILclient!ria;I)V")
	public static void method8033(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class303 arg5, @OriginalArg(7) int arg6) {
		if (arg2 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static407.anInt6909 == 4) {
			local14 = (int) Static225.aFloat85 & 0x3FFF;
		} else {
			local14 = Static463.anInt7491 + (int) Static225.aFloat85 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg5.anInt7914 / 2, arg5.anInt7971 / 2) + 10;
		@Pc(43) int local43 = arg4 * arg4 + arg0 * arg0;
		if (local35 * local35 < local43) {
			return;
		}
		@Pc(53) int local53 = Class290.anIntArray546[local14];
		@Pc(57) int local57 = Class290.anIntArray547[local14];
		if (Static407.anInt6909 != 4) {
			local57 = local57 * 256 / (Static594.anInt9866 + 256);
			local53 = local53 * 256 / (Static594.anInt9866 + 256);
		}
		@Pc(96) int local96 = local53 * arg4 + arg0 * local57 >> 14;
		@Pc(107) int local107 = arg4 * local57 - arg0 * local53 >> 14;
		arg2.method8805(arg5.anInt7914 / 2 + arg3 + local96 - arg2.method8788() / 2, -local107 + arg5.anInt7971 / 2 + arg6 - arg2.method8807() / 2, arg1, arg3, arg6);
	}
}
