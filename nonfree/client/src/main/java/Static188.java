import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "J")
	public static long aLong113;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
	public static int anInt3434;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_51 = new Class242(45, 3);

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	public static int anInt3431 = 1;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	public static int anInt3433 = -1;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method2695(@OriginalArg(1) Class1_Sub19 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static256.aClass115_3 != null) {
			@Pc(22) int local22;
			try {
				Static256.aClass115_3.method2294(0L);
				Static256.aClass115_3.method2293(local8);
				for (local22 = 0; local22 < 24 && local8[local22] == 0; local22++) {
				}
				if (local22 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local22 = 0; local22 < 24; local22++) {
					local8[local22] = -1;
				}
			}
		}
		arg0.method2921(local8, 24);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)I")
	public static int method2697(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static276.anIntArray354[arg0 & 0x3] : 256;
	}
}
