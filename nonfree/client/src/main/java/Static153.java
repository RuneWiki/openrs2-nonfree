import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
	public static int anInt5628;

	@OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
	public static final int anInt5629 = 2;

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
	public static int anInt5631 = -1;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!bs;)V")
	public static void method4538(@OriginalArg(1) Class7_Sub8 arg0) {
		if (arg0.aClass7_Sub31_5 != null) {
			arg0.aClass7_Sub31_5.anInt4156 = 0;
		}
		arg0.aBoolean403 = false;
		for (@Pc(22) Class7_Sub8 local22 = arg0.method4866(); local22 != null; local22 = arg0.method4872()) {
			method4538(local22);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)I")
	public static int method4539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = arg0 & 0x1 | local12 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local12;
	}
}
