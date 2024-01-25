import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!tr", name = "z", descriptor = "I")
	public static int anInt6981;

	@OriginalMember(owner = "client!tr", name = "C", descriptor = "Lclient!gs;")
	public static Class100 aClass100_2;

	@OriginalMember(owner = "client!tr", name = "F", descriptor = "Lclient!sc;")
	public static Class223 aClass223_8;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Lclient!sj;")
	public static Class225 method5600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class225 local7 = new Class225();
		local7.anInt6528 = arg0 + 5 + 1;
		local7.anInt6535 = -1;
		local7.anInt6523 = -1;
		local7.anInt6532 = arg1 + 1 + 5;
		local7.anIntArrayArray159 = new int[local7.anInt6532][local7.anInt6528];
		local7.method5185();
		return local7;
	}
}
