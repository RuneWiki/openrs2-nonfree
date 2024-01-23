import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "[I")
	public static int[] anIntArray447;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
	public static int anInt4427;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "[I")
	public static int[] anIntArray449;

	@OriginalMember(owner = "client!ak", name = "r", descriptor = "Lclient!kb;")
	public static Class83 aClass83_134;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "Lclient!di;")
	public static Class39 aClass39_2;

	@OriginalMember(owner = "client!ak", name = "t", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
	public static int anInt4425 = 0;

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "[I")
	public static int[] anIntArray448 = new int[4096];

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
	public static int anInt4429 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)C")
	public static char method3513(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(40) char local40 = Static194.aCharArray5[local7 - 128];
			if (local40 == '\u0000') {
				local40 = '?';
			}
			local7 = local40;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBLclient!im;)Lclient!ha;")
	public static Class1_Sub2_Sub9 method3514(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		@Pc(41) Class1_Sub2_Sub9 local41 = new Class1_Sub2_Sub9(arg0, arg1.method2611(), arg1.method2611(), arg1.method2610(), arg1.method2610(), arg1.method2655() == 1, arg1.method2655());
		@Pc(45) int local45 = arg1.method2655();
		for (@Pc(47) int local47 = 0; local47 < local45; local47++) {
			local41.aClass131_4.method3799(new Class1_Sub32(arg1.method2655(), arg1.method2655(), arg1.method2652(), arg1.method2652(), arg1.method2652(), arg1.method2652(), arg1.method2652(), arg1.method2652(), arg1.method2652(), arg1.method2652()));
		}
		local41.method1640();
		return local41;
	}
}
