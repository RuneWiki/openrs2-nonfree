import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)V")
	public static void method5094() {
		@Pc(1) Class223 local1 = Static476.aClass223_57;
		synchronized (Static476.aClass223_57) {
			Static476.aClass223_57.method4933(5);
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIILclient!lw;)V")
	public static void method5097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10_Sub5 arg3) {
		@Pc(4) Class100 local4 = Static279.method4433(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass10_Sub5_1 = arg3;
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!rba;IIII)V")
	public static void method5099(@OriginalArg(0) Class4_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg0.aClass4_Sub9_Sub1_3.method5963(arg2);
		arg0.aClass4_Sub9_Sub1_3.method6012(arg1);
		arg0.aClass4_Sub9_Sub1_3.method5984(arg3);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(III)Z")
	public static boolean method5100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
