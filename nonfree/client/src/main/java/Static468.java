import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "[B")
	public static final byte[] aByteArray78 = new byte[520];

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "[I")
	public static final int[] anIntArray451 = new int[14];

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IILclient!ha;BLclient!ga;)V")
	public static void method6906(@OriginalArg(2) Class143 arg0, @OriginalArg(4) Class124 arg1) {
		Static653.aClass124_104.method2567();
		if (Static208.aBoolean514) {
			return;
		}
		for (@Pc(22) Class5_Sub40 local22 = (Class5_Sub40) arg1.method2572(); local22 != null; local22 = (Class5_Sub40) arg1.method2569()) {
			@Pc(29) Class262 local29 = Static407.aClass218_3.method5163(local22.anInt7515);
			if (Static180.method2644(local29)) {
				@Pc(41) boolean local41 = Static503.method7251(local22, arg0, local29);
				if (local41) {
					Static425.method6448(arg0, local22, local29);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IZLclient!wq;I)V")
	public static void method6908(@OriginalArg(0) int arg0, @OriginalArg(2) Class394 arg1, @OriginalArg(3) int arg2) {
		if (Static610.aClass394_12 != null || Static423.aBoolean549 || (arg1 == null || Static530.method7400(arg1) == null)) {
			return;
		}
		Static610.aClass394_12 = arg1;
		Static96.aClass394_1 = Static530.method7400(arg1);
		Static512.anInt8633 = 0;
		Static133.aBoolean153 = false;
		Static546.anInt8936 = arg0;
		Static127.anInt2189 = arg2;
	}
}
