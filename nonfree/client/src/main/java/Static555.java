import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!sv", name = "S", descriptor = "I")
	public static int anInt9355;

	@OriginalMember(owner = "client!sv", name = "K", descriptor = "[[I")
	public static int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)Lclient!ib;")
	public static Class5_Sub23 method8020() {
		@Pc(8) Class5_Sub23 local8 = new Class5_Sub23(518);
		Static109.anIntArray96 = new int[4];
		Static109.anIntArray96[2] = (int) (Math.random() * 9.9999999E7D);
		Static109.anIntArray96[3] = (int) (Math.random() * 9.9999999E7D);
		Static109.anIntArray96[0] = (int) (Math.random() * 9.9999999E7D);
		Static109.anIntArray96[1] = (int) (Math.random() * 9.9999999E7D);
		local8.method8502(10);
		local8.method8486(Static109.anIntArray96[0]);
		local8.method8486(Static109.anIntArray96[1]);
		local8.method8486(Static109.anIntArray96[2]);
		local8.method8486(Static109.anIntArray96[3]);
		return local8;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)Z")
	public static boolean method8023(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
