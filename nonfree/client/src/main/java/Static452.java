import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "Lclient!ua;")
	public static Class3_Sub5_Sub4 aClass3_Sub5_Sub4_3;

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString67;

	@OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
	public static int anInt7626 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BII)Z")
	public static boolean method5952(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(B)J")
	public static long method5955() {
		return Static286.aClass44_2.method3068();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)Lclient!ef;")
	public static Class61 method5957(@OriginalArg(1) int arg0) {
		@Pc(6) Class61[] local6 = Static320.method4374();
		for (@Pc(13) int local13 = 0; local13 < local6.length; local13++) {
			if (local6[local13].anInt2100 == arg0) {
				return local6[local13];
			}
		}
		return null;
	}
}
