import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
	public static int anInt1602;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!gd;")
	public static Class23 aClass23_854 = Static15.method178("Verbindung mit Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	public static int anInt1596 = 0;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	public static int anInt1598 = 0;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	public static int anInt1599 = -1;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!gd;")
	private static Class23 aClass23_855 = Static15.method178("Add friend");

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "[B")
	public static byte[] aByteArray9 = new byte[520];

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "Lclient!gd;")
	private static Class23 aClass23_857 = Static15.method178("shake:");

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Lclient!gd;")
	public static Class23 aClass23_856 = aClass23_857;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Lclient!gd;")
	public static Class23 aClass23_858 = aClass23_855;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!gd;")
	public static Class23 aClass23_859 = Static15.method178(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public static int anInt1601 = 500;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Lclient!gd;")
	private static Class23 aClass23_861 = Static15.method178("flash3:");

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Lclient!gd;")
	public static Class23 aClass23_860 = aClass23_861;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[Lclient!q;[BIII)V")
	public static void method980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			for (@Pc(4) int local4 = 0; local4 < 64; local4++) {
				for (local7 = 0; local7 < 64; local7++) {
					if (arg4 + local4 > 0 && arg4 + local4 < 103 && local7 + arg1 > 0 && local7 + arg1 < 103) {
						arg2[local1].anIntArrayArray44[local4 + arg4][arg1 + local7] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(93) Class1_Sub5 local93 = new Class1_Sub5(arg3);
		for (local7 = 0; local7 < 4; local7++) {
			for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
				for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
					Static97.method1646(local93, arg4 + local98, arg0, arg5, local101 + arg1, 0, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public static void method981() {
		aClass23_854 = null;
		aClass23_860 = null;
		aClass23_857 = null;
		aClass23_859 = null;
		aClass23_861 = null;
		aClass23_856 = null;
		aClass23_855 = null;
		aClass23_858 = null;
		aByteArray9 = null;
	}
}
