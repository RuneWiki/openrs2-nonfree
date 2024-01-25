import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!nw", name = "j", descriptor = "J")
	public static long aLong184;

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "Lclient!st;")
	public static final Class314 aClass314_109 = new Class314(64, -1);

	@OriginalMember(owner = "client!nw", name = "i", descriptor = "[I")
	public static final int[] anIntArray406 = new int[25];

	@OriginalMember(owner = "client!nw", name = "k", descriptor = "Z")
	public static boolean aBoolean505 = false;

	@OriginalMember(owner = "client!nw", name = "l", descriptor = "Lclient!baa;")
	public static final Class25 aClass25_29 = new Class25(512);

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILclient!tga;[[B)V")
	public static void method6078(@OriginalArg(1) Class83_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(8) int local8 = Static50.aByteArrayArray1.length;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(35) int local35 = (Static454.anIntArray476[local17] >> 8) * 64 - Static427.anInt7462;
				@Pc(46) int local46 = (Static454.anIntArray476[local17] & 0xFF) * 64 - Static22.anInt329;
				Static234.method3998();
				arg0.method7810(local23, local46, Static174.aClass237Array1, Static266.aClass82_8, local35);
			}
		}
	}
}
