import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!jda", name = "N", descriptor = "I")
	public static int anInt4440;

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(III)I")
	public static int method3599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static31.anIntArray55[arg0 & 0x3] : Static283.anIntArray377[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!pu;Ljava/lang/String;ZI)Lclient!am;")
	public static Class13 method3600(@OriginalArg(0) Class270 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) int local10 = arg0.method5677(arg1);
		if (local10 == -1) {
			return new Class13(0);
		}
		@Pc(25) int[] local25 = arg0.method5699(local10);
		@Pc(31) Class13 local31 = new Class13(local25.length);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		while (true) {
			while (local33 < local31.anInt223) {
				@Pc(49) Class1_Sub35 local49 = new Class1_Sub35(arg0.method5704(local10, local25[local35++]));
				@Pc(55) int local55 = local49.method5804();
				@Pc(59) int local59 = local49.method5771();
				@Pc(63) int local63 = local49.method5750();
				if (!arg2 && local63 == 1) {
					local31.anInt223--;
				} else {
					local31.anIntArray26[local33] = local55;
					local31.anIntArray25[local33] = local59;
					local33++;
				}
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IB)Z")
	public static boolean method3602(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!we;)V")
	public static void method3603(@OriginalArg(1) Class356 arg0) {
		Static412.aClass356_1 = arg0;
	}
}
