import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!iv", name = "r", descriptor = "I")
	public static int anInt4730;

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!iv", name = "t", descriptor = "Lclient!db;")
	public static final Class64 aClass64_207 = new Class64(96, 8);

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "Lclient!jv;")
	public static final Class182 aClass182_4 = new Class182("", 14);

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B[[BLclient!eda;)V")
	public static void method3998(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class85_Sub1 arg1) {
		@Pc(8) int local8 = Static220.aByteArrayArray18.length;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) byte[] local24 = arg0[local18];
			if (local24 != null) {
				@Pc(37) int local37 = (Static380.anIntArray543[local18] >> 8) * 64 - Static373.anInt6695;
				@Pc(48) int local48 = (Static380.anIntArray543[local18] & 0xFF) * 64 - Static6.anInt97;
				Static464.method6712();
				arg1.method2395(local24, Static15.aClass84Array1, Static185.aClass66_14, local37, local48);
			}
		}
	}
}
