import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "I")
	public static int anInt10803;

	@OriginalMember(owner = "client!uw", name = "h", descriptor = "F")
	public static float aFloat199;

	@OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
	public static int anInt10809 = 0;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(BLclient!vi;)[I")
	public static int[] method9236(@OriginalArg(1) Class2_Sub52 arg0) {
		@Pc(10) Class2_Sub8 local10 = new Class2_Sub8(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			local13[local23] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method5170(10);
		local10.method5194(local13[0]);
		local10.method5194(local13[1]);
		local10.method5194(local13[2]);
		local10.method5194(local13[3]);
		for (@Pc(68) int local68 = 0; local68 < 10; local68++) {
			local10.method5194((int) (Math.random() * 9.9999999E7D));
		}
		local10.method5192((int) (Math.random() * 9.9999999E7D));
		local10.method5200(Static669.aBigInteger6, Static632.aBigInteger3);
		arg0.aClass2_Sub8_Sub2_2.method5160(local10.lb, local10.anInt5725, 0);
		return local13;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IB)V")
	public static void method9238(@OriginalArg(0) int arg0) {
		Static561.anInt9735 = arg0;
		Static656.aClass22_68.method461();
	}
}
