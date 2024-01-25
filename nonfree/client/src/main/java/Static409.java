import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
	public static int anInt1458 = 0;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Lclient!ui;")
	public static final Class329 aClass329_9 = new Class329(12, 0, 1, 0);

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
	public static int anInt1461 = 0;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLclient!k;Lclient!ri;)V")
	public static void method1336(@OriginalArg(1) Class168 arg0, @OriginalArg(2) Class284 arg1) {
		Static463.aClass284_128 = arg1;
		Static216.aClass168_5 = arg0;
		Static550.aString250 = "";
		if (Class3_Sub6_Sub26.aString220.startsWith("win")) {
			Static550.aString250 = Static550.aString250 + "windows/";
		} else if (Class3_Sub6_Sub26.aString220.startsWith("linux")) {
			Static550.aString250 = Static550.aString250 + "linux/";
		} else if (Class3_Sub6_Sub26.aString220.startsWith("mac")) {
			Static550.aString250 = Static550.aString250 + "macos/";
		}
		if (Static216.aClass168_5.aBoolean335) {
			Static550.aString250 = Static550.aString250 + "msjava/";
		} else if (Class3_Sub6_Sub26.aString219.startsWith("amd64") || Class3_Sub6_Sub26.aString219.startsWith("x86_64")) {
			Static550.aString250 = Static550.aString250 + "x86_64/";
		} else if (Class3_Sub6_Sub26.aString219.startsWith("i386") || Class3_Sub6_Sub26.aString219.startsWith("i486") || Class3_Sub6_Sub26.aString219.startsWith("i586") || Class3_Sub6_Sub26.aString219.startsWith("x86")) {
			Static550.aString250 = Static550.aString250 + "x86/";
		} else if (Class3_Sub6_Sub26.aString219.startsWith("ppc")) {
			Static550.aString250 = Static550.aString250 + "ppc/";
		} else {
			Static550.aString250 = Static550.aString250 + "universal/";
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([BIIIII[BII)V")
	public static void method1338(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(22) int local22 = -(arg5 & 0x3);
		for (@Pc(25) int local25 = -arg1; local25 < 0; local25++) {
			@Pc(33) int local33;
			for (@Pc(29) int local29 = local10; local29 < 0; local29++) {
				local33 = arg7++;
				arg6[local33] += arg0[arg2++];
				@Pc(45) int local45 = arg7++;
				arg6[local45] += arg0[arg2++];
				@Pc(57) int local57 = arg7++;
				arg6[local57] += arg0[arg2++];
				@Pc(69) int local69 = arg7++;
				arg6[local69] += arg0[arg2++];
			}
			for (@Pc(84) int local84 = local22; local84 < 0; local84++) {
				local33 = arg7++;
				arg6[local33] += arg0[arg2++];
			}
			arg7 += arg4;
			arg2 += arg3;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Z")
	public static boolean method1339(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
