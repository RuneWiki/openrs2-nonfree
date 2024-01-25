import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_24 = new Class133(58, 8);

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
	public static int anInt1004 = 0;

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
	public static int anInt1006 = -1;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(III[B)I")
	public static int method950(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(14) int local14 = -1;
		for (@Pc(16) int local16 = arg0; local16 < arg1; local16++) {
			local14 = local14 >>> 8 ^ Class155.anIntArray445[(local14 ^ arg2[local16]) & 0xFF];
		}
		return ~local14;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "([Ljava/lang/String;B[S)V")
	public static void method951(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static20.method727(arg0, arg1, arg0.length - 1, 0);
	}
}
