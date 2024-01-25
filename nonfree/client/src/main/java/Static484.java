import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
	public static int anInt8272;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_289 = new Class179(40, 4);

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "([Ljava/lang/String;IIB)Ljava/lang/String;")
	public static String method7046(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(18) String local18 = arg0[arg1];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(29) int local29 = arg2 + arg1;
			@Pc(31) int local31 = 0;
			for (@Pc(38) int local38 = arg1; local38 < local29; local38++) {
				@Pc(44) String local44 = arg0[local38];
				if (local44 == null) {
					local31 += 4;
				} else {
					local31 += local44.length();
				}
			}
			@Pc(67) StringBuffer local67 = new StringBuffer(local31);
			for (@Pc(69) int local69 = arg1; local69 < local29; local69++) {
				@Pc(75) String local75 = arg0[local69];
				if (local75 == null) {
					local67.append("null");
				} else {
					local67.append(local75);
				}
			}
			return local67.toString();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILclient!gs;)V")
	public static void method7047(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub23_Sub1 arg1) {
		Static96.anInt1738 = 0;
		Static121.aBoolean131 = false;
		Static230.method3328(arg1);
		Static662.method9005(arg1);
		if (Static121.aBoolean131) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt9901) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt9901 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)Z")
	public static boolean method7048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public static void method7050() {
		Static83.aClass132_3.method7471(Static449.aFloat116, Static560.aFloat10, Static499.aFloat160);
	}
}
