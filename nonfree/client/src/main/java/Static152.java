import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
	public static int anInt3752;

	@OriginalMember(owner = "client!fi", name = "M", descriptor = "[[I")
	public static final int[][] anIntArrayArray32 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!fi", name = "Y", descriptor = "[I")
	public static int[] anIntArray203 = null;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(B)V")
	public static void method3314() {
		@Pc(7) Class150 local7 = null;
		try {
			@Pc(18) Class376 local18 = Static379.aClass228_6.method5935("");
			while (local18.anInt10510 == 0) {
				Static500.method7308(1L);
			}
			if (local18.anInt10510 == 1) {
				local7 = (Class150) local18.anObject19;
				@Pc(43) Class3_Sub15 local43 = Static552.aClass3_Sub48_30.method7825();
				local7.method4656(local43.aByteArray106, 0, local43.anInt10282);
			}
		} catch (@Pc(53) Exception local53) {
		}
		try {
			if (local7 != null) {
				local7.method4653();
			}
		} catch (@Pc(60) Exception local60) {
		}
	}
}
