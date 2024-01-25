import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!gaa", name = "w", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[8];

	@OriginalMember(owner = "client!gaa", name = "E", descriptor = "Lclient!os;")
	public static final Class258 aClass258_15 = new Class258(6, 1);

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!cea;I)V")
	public static void method5009(@OriginalArg(0) Class4_Sub9_Sub1 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static295.anInt5451; local11++) {
			@Pc(17) int local17 = Static136.anIntArray298[local11];
			@Pc(21) Class10_Sub1_Sub2_Sub2 local21 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local17];
			@Pc(25) int local25 = arg0.method6015();
			if ((local25 & 0x20) != 0) {
				local25 += arg0.method6015() << 8;
			}
			if ((local25 & 0x8000) != 0) {
				local25 += arg0.method6015() << 16;
			}
			Static148.method5909(local21, arg0, local25, local17);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5013(@OriginalArg(1) String arg0) {
		return Static495.method7452(tw.class, arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method5015(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class4_Sub7_Sub5 local15 = Static218.method3780(2, arg1);
		local15.method3066();
		local15.aString29 = arg0;
	}
}
