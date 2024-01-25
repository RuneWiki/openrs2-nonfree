import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
	public static int anInt7325;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "[I")
	public static final int[] anIntArray399 = new int[1];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public static void method6139() {
		Static70.method1231();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Z)V")
	public static void method6140(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static611.method8284(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static375.method6256(local7);
			local7 = Static268.method3987("%3a", ":", local7);
			local7 = Static268.method3987("%40", "@", local7);
			local7 = Static268.method3987("%26", "&", local7);
			local7 = Static268.method3987("%23", "#", local7);
			if (Static60.anApplet1 != null) {
				@Pc(102) Class338 local102 = Static114.aClass92_1.method1879(new URL(Static60.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static525.anInt8304 + "&u=" + (Static168.aString44 == null ? String.valueOf(Static172.aLong86) : Static168.aString44) + "&v1=" + Static126.aString38 + "&v2=" + Static126.aString40 + "&e=" + local7));
				while (local102.anInt9321 == 0) {
					Static26.method592(1L);
				}
				if (local102.anInt9321 == 1) {
					@Pc(120) DataInputStream local120 = (DataInputStream) local102.anObject18;
					local120.read();
					local120.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BIII)I")
	public static int method6141(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 / arg1;
		@Pc(18) int local18 = arg1 - 1 & arg2;
		@Pc(22) int local22 = arg0 / arg1;
		@Pc(28) int local28 = arg0 & arg1 - 1;
		@Pc(33) int local33 = Static226.method3389(local12, local22);
		@Pc(40) int local40 = Static226.method3389(local12 + 1, local22);
		@Pc(49) int local49 = Static226.method3389(local12, local22 + 1);
		@Pc(60) int local60 = Static226.method3389(local12 + 1, local22 + 1);
		@Pc(69) int local69 = Static649.method8727(local40, arg1, local18, local33);
		@Pc(76) int local76 = Static649.method8727(local60, arg1, local18, local49);
		return Static649.method8727(local76, arg1, local28, local69);
	}
}
