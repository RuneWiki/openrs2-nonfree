import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "F")
	public static float aFloat126;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
	public static int anInt3883;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_40 = new Class215(35, 3);

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)I")
	public static int method3176() {
		return 16;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V")
	public static void method3177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class102 local10 = new Class102(16);
		for (@Pc(20) Class4_Sub18 local20 = (Class4_Sub18) Static440.aClass102_40.method2705(); local20 != null; local20 = (Class4_Sub18) Static440.aClass102_40.method2704()) {
			local20.method5684();
			@Pc(31) int local31 = (int) (local20.aLong224 >> 28);
			@Pc(41) int local41 = (int) (local20.aLong224 >> 14 & 0x3FFFL) - arg1;
			@Pc(49) int local49 = (int) (local20.aLong224 & 0x3FFFL) - arg0;
			if (local49 >= 0 && local41 >= 0 && local49 < Static326.anInt5666 && Static283.anInt5187 > local41) {
				local10.method2703((long) (local31 << 28 | local41 << 14 | local49), local20);
			}
		}
		Static440.aClass102_40 = local10;
	}
}
