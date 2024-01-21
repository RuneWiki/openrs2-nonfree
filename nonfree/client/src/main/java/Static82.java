import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!kc", name = "yb", descriptor = "Lclient!dd;")
	public static Class17 aClass17_11 = new Class17(64);

	@OriginalMember(owner = "client!kc", name = "Cb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_613 = Static38.method685(")2");

	@OriginalMember(owner = "client!kc", name = "Db", descriptor = "Lclient!ai;")
	public static Class6 aClass6_614 = Static38.method685("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!kc", name = "Eb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_615 = Static38.method685(" <col=ffffff>");

	@OriginalMember(owner = "client!kc", name = "Fb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_616 = Static38.method685(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
	public static void method1316(@OriginalArg(0) int arg0) {
		if (Static36.method641(arg0)) {
			Static31.method539(Static180.aClass87ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!me;B)V")
	public static void method1318(@OriginalArg(0) Class2_Sub13 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static180.aClass38_5 != null) {
			@Pc(22) int local22;
			try {
				Static180.aClass38_5.method1161(0L);
				local22 = 0;
				Static180.aClass38_5.method1155(local8);
				while (local22 < 24 && local8[local22] == 0) {
					local22++;
				}
				if (local22 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(50) Exception local50) {
				for (local22 = 0; local22 < 24; local22++) {
					local8[local22] = -1;
				}
			}
		}
		arg0.method1420(24, local8);
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	public static void method1320() {
		aClass17_11 = null;
		aClass6_613 = null;
		aClass6_615 = null;
		aClass6_616 = null;
		aClass6_614 = null;
	}
}
