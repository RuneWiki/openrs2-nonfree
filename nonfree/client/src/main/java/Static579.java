import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IILclient!dfa;)V")
	public static void method8022(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub15_Sub1 arg1) {
		Static420.anInt7818 = 0;
		Static477.aBoolean726 = false;
		Static463.method6942(arg1);
		Static260.method4860(arg1);
		if (Static477.aBoolean726) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt10282 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt10282 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIILclient!kha;)Lclient!id;")
	public static Class142 method8023(@OriginalArg(2) int arg0, @OriginalArg(3) Class181 arg1) {
		@Pc(9) byte[] local9 = arg1.method5023(arg0, 0);
		return local9 == null ? null : new Class142(local9);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method8024(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static500.aClass274Array2 == Static524.aClass274Array3) {
			return;
		}
		@Pc(10) int local10 = Static445.aClass274Array1[arg1].method8043(arg3, arg2);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class274 local23 = Static445.aClass274Array1[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method8043(arg3, arg2), arg3, 0, false);
				}
			}
		}
	}
}
