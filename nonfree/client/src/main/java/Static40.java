import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
	public static int anInt989;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "Z")
	public static boolean aBoolean64 = true;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)V")
	public static void method737(@OriginalArg(1) int arg0) {
		@Pc(4) Class2_Sub8_Sub10 local4 = Static92.method1633(7, arg0);
		local4.method2043();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)V")
	public static void method739() {
		Static141.aClass157_26.method4034(5);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!oe;)V")
	public static void method740(@OriginalArg(1) Class2_Sub16 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static47.aClass130_1 != null) {
			try {
				@Pc(14) int local14 = 0;
				Static47.aClass130_1.method3491(0L);
				Static47.aClass130_1.method3500(local8);
				while (local14 < 24 && local8[local14] == 0) {
					local14++;
				}
				if (local14 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(44) Exception local44) {
				for (@Pc(46) int local46 = 0; local46 < 24; local46++) {
					local8[local46] = -1;
				}
			}
		}
		arg0.method2178(local8, 24);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	public static void method741() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static293.aBooleanArray23[local3] = true;
		}
	}
}
