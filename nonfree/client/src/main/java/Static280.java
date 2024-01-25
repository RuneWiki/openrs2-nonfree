import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!ro", name = "I", descriptor = "Lclient!sp;")
	public static Class191 aClass191_2;

	@OriginalMember(owner = "client!ro", name = "L", descriptor = "I")
	public static int anInt5460;

	@OriginalMember(owner = "client!ro", name = "V", descriptor = "Lclient!ct;")
	public static Class30 aClass30_83;

	@OriginalMember(owner = "client!ro", name = "P", descriptor = "I")
	public static int anInt5464 = 0;

	@OriginalMember(owner = "client!ro", name = "W", descriptor = "I")
	public static int anInt5470 = 1;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(ILclient!ct;)V")
	public static void method5006(@OriginalArg(1) Class30 arg0) {
		Static65.aClass30_86 = arg0;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(IB)I")
	public static int method5007(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!va;I)V")
	public static void method5008(@OriginalArg(0) Class11_Sub2_Sub6 arg0) {
		@Pc(9) int local9 = arg0.anInt6779 - Static51.anInt1301;
		@Pc(21) int local21 = arg0.anInt6751 * 128 + arg0.method5894() * 64;
		@Pc(40) int local40 = arg0.anInt6737 * 128 + arg0.method5894() * 64;
		arg0.anInt6726 += (local40 - arg0.anInt6726) / local9;
		arg0.anInt6729 += (local21 - arg0.anInt6729) / local9;
		arg0.anInt6797 = 0;
		if (arg0.anInt6767 == 0) {
			arg0.method5890(8192);
		}
		if (arg0.anInt6767 == 1) {
			arg0.method5890(12288);
		}
		if (arg0.anInt6767 == 2) {
			arg0.method5890(0);
		}
		if (arg0.anInt6767 == 3) {
			arg0.method5890(4096);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLclient!bn;)V")
	public static void method5009(@OriginalArg(1) Class18 arg0) {
		Static339.aClass1_Sub7_Sub2_4.method2163(arg0.method697());
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIZLclient!gt;II)Ljava/awt/Frame;")
	public static Frame method5010(@OriginalArg(1) int arg0, @OriginalArg(3) Class75 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method2365()) {
			return null;
		}
		@Pc(17) Class134[] local17 = Static154.method2926(arg1);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (local17[local25].anInt3972 == arg3 && local17[local25].anInt3973 == arg0 && (!local23 || arg2 < local17[local25].anInt3968)) {
				arg2 = local17[local25].anInt3968;
				local23 = true;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(94) Class121 local94 = arg1.method2356(arg2, arg3, arg0);
		while (local94.anInt3693 == 0) {
			Static135.method2737(10L);
		}
		@Pc(114) Frame local114 = (Frame) local94.anObject2;
		if (local114 == null) {
			return null;
		} else if (local94.anInt3693 == 2) {
			Static187.method3509(arg1, local114);
			return null;
		} else {
			return local114;
		}
	}
}
