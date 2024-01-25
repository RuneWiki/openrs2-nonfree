import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
	public static int anInt6399;

	@OriginalMember(owner = "client!nq", name = "C", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_60 = new Class77(1, 3);

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!gn;[[BI)V")
	public static void method5353(@OriginalArg(0) Class119_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int local12 = Static344.aByteArrayArray18.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(20) byte[] local20 = arg1[local14];
			if (local20 != null) {
				@Pc(33) int local33 = (Static443.anIntArray607[local14] >> 8) * 64 - Static61.anInt1459;
				@Pc(44) int local44 = (Static443.anIntArray607[local14] & 0xFF) * 64 - Static203.anInt4534;
				Static365.method5697();
				arg0.method3343(Static510.aClass184Array1, Static243.aClass42_4, local33, local44, local20);
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(III)Z")
	public static boolean method5354(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)Ljava/lang/String;")
	public static String method5355() {
		return Static389.aBoolean533 || Static294.aClass12_Sub20_2 == null ? "" : Static294.aClass12_Sub20_2.aString40;
	}
}
