import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "[Lclient!f;")
	public static Class49[] aClass49Array133;

	@OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
	public static int anInt6568;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray51 = new String[100];

	@OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
	public static final int anInt6569 = 1403;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!td;[[BB)V")
	public static void method5040(@OriginalArg(0) Class148_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(13) int local13 = Static342.aByteArrayArray41.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(21) byte[] local21 = arg1[local15];
			if (local21 != null) {
				@Pc(34) int local34 = (Static334.anIntArray331[local15] >> 8) * 64 - Static101.anInt6646;
				@Pc(45) int local45 = (Static334.anIntArray331[local15] & 0xFF) * 64 - Static278.anInt4392;
				Static15.method239();
				arg0.method4883(local21, Static213.aClass128_22, local34, local45, Static383.aClass247Array1);
			}
		}
	}
}
