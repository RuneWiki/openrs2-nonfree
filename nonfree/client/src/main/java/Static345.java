import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static345 {

	@OriginalMember(owner = "client!rn", name = "x", descriptor = "I")
	public static int anInt6217;

	@OriginalMember(owner = "client!rn", name = "y", descriptor = "I")
	public static int anInt6218;

	@OriginalMember(owner = "client!rn", name = "A", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray13 = new int[2][][];

	@OriginalMember(owner = "client!rn", name = "D", descriptor = "Lclient!ak;")
	public static final Class10 aClass10_17 = new Class10(2, 4, 4, 0);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BII)I")
	public static int method5184(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static91.anIntArray119[arg1 & 0x3] : 256;
	}
}
