import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString246 = "Take";

	@OriginalMember(owner = "client!vo", name = "z", descriptor = "I")
	public static int anInt6550 = 0;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLclient!tj;)V")
	public static void method5522(@OriginalArg(1) Class122 arg0) {
		if (Static168.aBoolean192) {
			Static228.method3972(arg0);
		} else {
			Static283.method3807(arg0);
		}
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)I")
	public static int method5523() {
		if (Static168.aBoolean192 || Static170.anInt6279 <= 0) {
			@Pc(19) int local19 = Static192.anInt4000;
			@Pc(21) int local21 = Static221.anInt4562;
			@Pc(23) int local23 = Static277.anInt5536;
			@Pc(25) int local25 = Static86.anInt4285;
			@Pc(27) int local27 = Static260.anInt5197;
			if (local19 > local23 && local19 < local27 + local23) {
				@Pc(41) int local41 = -1;
				@Pc(60) int local60;
				for (@Pc(43) int local43 = 0; local43 < Static170.anInt6279; local43++) {
					if (Static74.aBoolean73) {
						local60 = (Static170.anInt6279 - local43 - 1) * 16 + local25 + 33;
						if (local21 > local60 - 13 && local60 + 3 >= local21) {
							local41 = local43;
						}
					} else {
						local60 = local25 + (-local43 + Static170.anInt6279 + -1) * 16 + 31;
						if (local21 > local60 - 13 && local21 <= local60 + 3) {
							local41 = local43;
						}
					}
				}
				if (local41 != -1) {
					local60 = 0;
					@Pc(126) Class137 local126 = new Class137(Static116.aClass127_12);
					for (@Pc(131) Class3_Sub26 local131 = (Class3_Sub26) local126.method3466(); local131 != null; local131 = (Class3_Sub26) local126.method3465()) {
						if (local60++ == local41) {
							return local131.anInt2735;
						}
					}
				}
			}
			return -1;
		} else if (Static309.aBoolean418 && Static192.aBooleanArray19[81] && Static170.anInt6279 > 2) {
			return ((Class3_Sub26) Static116.aClass127_12.aClass3_156.aClass3_247.aClass3_247).anInt2735;
		} else {
			return ((Class3_Sub26) Static116.aClass127_12.aClass3_156.aClass3_247).anInt2735;
		}
	}
}
