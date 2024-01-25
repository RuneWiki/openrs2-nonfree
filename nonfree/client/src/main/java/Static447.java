import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!rda", name = "M", descriptor = "I")
	public static int anInt8540;

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)Lclient!kq;")
	public static Class3_Sub32 method7001() {
		if (Static87.aClass183_42 == null || Static282.aClass327_1 == null) {
			return null;
		}
		for (@Pc(20) Class3_Sub32 local20 = (Class3_Sub32) Static282.aClass327_1.method7864(); local20 != null; local20 = (Class3_Sub32) Static282.aClass327_1.method7864()) {
			@Pc(27) Class70 local27 = Static87.aClass10_4.method400(local20.anInt5918);
			if (local27 != null && local27.aBoolean182 && local27.method2132(Static87.anInterface15_2)) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!oa;II)V")
	public static void method7002(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static322.aClass15_10 = arg0;
		Static198.aClass167ArrayArray1 = new Class167[arg1][arg2];
		if (Static365.anIntArray462 != null) {
			Static407.aClass108_7 = Static15.method462(Static365.anIntArray462[1], Static365.anIntArray462[0], Static365.anIntArray462[3], Static365.anIntArray462[2], Static365.anIntArray462[4], Static365.anIntArray462[5]);
		}
		Static305.aClass167_6 = new Class167();
		Static354.method5892();
	}
}
