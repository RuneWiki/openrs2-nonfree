import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "[J")
	public static final long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!cl", name = "P", descriptor = "Z")
	public static boolean aBoolean45 = false;

	@OriginalMember(owner = "client!cl", name = "R", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZIIIIFII)[[I")
	public static int[][] method673(@OriginalArg(6) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class7_Sub3_Sub4 local13 = new Class7_Sub3_Sub4();
		local13.anInt519 = (int) (arg0 * 4096.0F);
		local13.anInt525 = 8;
		local13.anInt530 = 4;
		local13.anInt522 = 3;
		local13.aBoolean19 = false;
		local13.method5593();
		Static27.method304(256, 64);
		for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
			local13.method413(local9[local54], local54);
		}
		return local9;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)V")
	public static void method676(@OriginalArg(1) int arg0) {
		@Pc(16) Class7_Sub4_Sub14 local16 = Static54.method750(arg0, 8);
		local16.method4710();
	}
}
