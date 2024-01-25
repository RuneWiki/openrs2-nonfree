import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Lclient!mg;")
	public static Class160 aClass160_74;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Lclient!mg;")
	public static Class160 aClass160_75;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
	public static int anInt6578 = 0;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
	public static int anInt6579 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([BIII)I")
	public static int method5208(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg1; local14 < arg2; local14++) {
			local12 = local12 >>> 8 ^ Class247.anIntArray582[(arg0[local14] ^ local12) & 0xFF];
		}
		return ~local12;
	}
}
