import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
	public static int anInt3124;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!tf;")
	public static final Class340 aClass340_22 = new Class340();

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	public static int anInt3123 = -1;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
	public static int anInt3128 = -1;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Z")
	public static boolean method2925(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!ob;I)Z")
	public static boolean method2926(@OriginalArg(0) Class260 arg0) {
		try {
			return Static287.method4707(arg0);
		} catch (@Pc(18) IOException local18) {
			if (Static37.anInt498 == 9) {
				arg0.aClass141_1 = null;
				return false;
			} else {
				Static578.method8055();
				return true;
			}
		} catch (@Pc(32) Exception local32) {
			@Pc(107) String local107 = "T2 - " + (arg0.aClass322_128 == null ? -1 : arg0.aClass322_128.method7719()) + "," + (arg0.aClass322_126 == null ? -1 : arg0.aClass322_126.method7719()) + "," + (arg0.aClass322_129 == null ? -1 : arg0.aClass322_129.method7719()) + " - " + arg0.anInt7198 + "," + (Static50.anInt606 + Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray263[0]) + "," + (Static404.anInt7039 + Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray264[0]) + " - ";
			for (@Pc(109) int local109 = 0; arg0.anInt7198 > local109 && local109 < 50; local109++) {
				local107 = local107 + arg0.aClass6_Sub15_Sub1_2.aByteArray20[local109] + ",";
			}
			Static550.method7785(local32, local107);
			Static166.method3296(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;I[BI)I")
	public static int method2927(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(22) int local22 = Static672.method8908(arg0.charAt(local12));
			@Pc(41) int local41 = local10 <= local12 + 1 ? -1 : Static672.method8908(arg0.charAt(local12 + 1));
			@Pc(59) int local59 = local12 + 2 >= local10 ? -1 : Static672.method8908(arg0.charAt(local12 + 2));
			@Pc(79) int local79 = local12 + 3 < local10 ? Static672.method8908(arg0.charAt(local12 + 3)) : -1;
			arg2[arg1++] = (byte) (local22 << 2 | local41 >>> 4);
			if (local59 == -1) {
				break;
			}
			arg2[arg1++] = (byte) (local59 >>> 2 | (local41 & 0xF) << 4);
			if (local79 == -1) {
				break;
			}
			arg2[arg1++] = (byte) (local79 | (local59 & 0x3) << 6);
		}
		return arg1;
	}
}
