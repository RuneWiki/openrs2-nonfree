import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
	public static int anInt458 = 765;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
	public static int anInt459 = 0;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "Z")
	public static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIII)V")
	public static void method458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static154.method3163(true, false, local35);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIILclient!pe;)V")
	public static void method459(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class278 arg4) {
		@Pc(5) Class2_Sub49 local5 = null;
		for (@Pc(10) Class2_Sub49 local10 = (Class2_Sub49) Static545.aClass271_58.method7177(); local10 != null; local10 = (Class2_Sub49) Static545.aClass271_58.method7175()) {
			if (local10.anInt10506 == arg3 && local10.anInt10499 == arg0 && arg1 == local10.anInt10505 && local10.anInt10502 == arg2) {
				local5 = local10;
				break;
			}
		}
		if (local5 == null) {
			local5 = new Class2_Sub49();
			local5.anInt10505 = arg1;
			local5.anInt10506 = arg3;
			local5.anInt10499 = arg0;
			local5.anInt10502 = arg2;
			Static545.aClass271_58.method7174(local5);
		}
		local5.aClass278_2 = arg4;
		local5.aBoolean767 = true;
		local5.aBoolean768 = false;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V")
	public static void method460(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(10, (long) arg0);
		local9.method2489();
	}
}
