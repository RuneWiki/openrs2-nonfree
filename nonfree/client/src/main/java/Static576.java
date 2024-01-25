import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "Lclient!nn;")
	public static final Class216 aClass216_17 = new Class216(6, 16);

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "Z")
	public static boolean aBoolean669 = false;

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "[I")
	public static final int[] anIntArray730 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "F")
	public static float aFloat205 = 1.0F;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method7845(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static249.anInt4108 > 0) {
			local18 = Static332.aByteArrayArray19[--Static249.anInt4108];
			Static332.aByteArrayArray19[Static249.anInt4108] = null;
			return local18;
		} else if (arg0 == 5000 && Static490.anInt8195 > 0) {
			local18 = Static57.aByteArrayArray2[--Static490.anInt8195];
			Static57.aByteArrayArray2[Static490.anInt8195] = null;
			return local18;
		} else if (arg0 == 30000 && Static104.anInt1940 > 0) {
			local18 = Static512.aByteArrayArray27[--Static104.anInt1940];
			Static512.aByteArrayArray27[Static104.anInt1940] = null;
			return local18;
		} else {
			if (Static361.aByteArrayArrayArray15 != null) {
				for (@Pc(71) int local71 = 0; local71 < Static518.anIntArray387.length; local71++) {
					if (arg0 == Static518.anIntArray387[local71] && Static58.anIntArray64[local71] > 0) {
						@Pc(94) byte[] local94 = Static361.aByteArrayArrayArray15[local71][--Static58.anIntArray64[local71]];
						Static361.aByteArrayArrayArray15[local71][Static58.anIntArray64[local71]] = null;
						return local94;
					}
				}
			}
			return new byte[arg0];
		}
	}
}
