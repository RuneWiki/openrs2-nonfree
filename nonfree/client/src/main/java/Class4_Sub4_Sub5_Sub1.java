import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class4_Sub4_Sub5_Sub1 extends Class4_Sub4_Sub5 {

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "[I")
	public static int[] anIntArray119 = new int[2048];

	@OriginalMember(owner = "client!gb", name = "eb", descriptor = "[I")
	public static int[] anIntArray123 = new int[2048];

	@OriginalMember(owner = "client!gb", name = "V", descriptor = "[I")
	public static int[] anIntArray120 = new int[512];

	@OriginalMember(owner = "client!gb", name = "N", descriptor = "[I")
	public static int[] anIntArray118 = new int[2048];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray120[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray123[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray118[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray119[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
