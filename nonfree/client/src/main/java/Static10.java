import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
	public static int anInt166 = 0;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZI[Ljava/lang/String;I[S)V")
	public static void method153(@OriginalArg(1) int arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg2) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) String local16 = arg1[local10];
		arg1[local10] = arg1[arg0];
		arg1[arg0] = local16;
		@Pc(30) short local30 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg0; local42++) {
			if (local16 == null || arg1[local42] != null && (local42 & 0x1) > arg1[local42].compareTo(local16)) {
				@Pc(63) String local63 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12] = local63;
				@Pc(77) short local77 = arg3[local42];
				arg3[local42] = arg3[local12];
				arg3[local12++] = local77;
			}
		}
		arg1[arg0] = arg1[local12];
		arg1[local12] = local16;
		arg3[arg0] = arg3[local12];
		arg3[local12] = local30;
		method153(local12 - 1, arg1, arg2, arg3);
		method153(arg0, arg1, local12 + 1, arg3);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII)I")
	public static int method154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static245.aClass18Array14 == null) {
			return 0;
		}
		@Pc(15) int local15 = arg1 >> 9;
		@Pc(19) int local19 = arg0 >> 9;
		if (local15 < 0 || local19 < 0 || local15 > Static222.anInt4533 - 1 || local19 > Static668.anInt11370 - 1) {
			return 0;
		}
		@Pc(41) int local41 = arg2;
		if (arg2 < 3 && (Static96.aByteArrayArrayArray10[1][local15][local19] & 0x2) != 0) {
			local41 = arg2 + 1;
		}
		return Static245.aClass18Array14[local41].method8542(arg0, arg1);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "()V")
	public static void method155() {
		for (@Pc(1) int local1 = 0; local1 < Static549.aClass314Array1.length; local1++) {
			Static549.aClass314Array1[local1].method7993();
		}
		Static549.aClass314Array1 = null;
	}
}
