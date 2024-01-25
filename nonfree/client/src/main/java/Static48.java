import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
	public static int anInt1285 = 500;

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
	public static int anInt1286 = -2;

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	public static int anInt1289 = 0;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V")
	public static void method1202(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static188.method3210(6, arg0);
		local8.method925();
		local8.anInt852 = arg1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)J")
	public static synchronized long method1203() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static580.aLong249) {
			Static251.aLong113 += Static580.aLong249 - local10;
		}
		Static580.aLong249 = local10;
		return Static251.aLong113 + local10;
	}
}
