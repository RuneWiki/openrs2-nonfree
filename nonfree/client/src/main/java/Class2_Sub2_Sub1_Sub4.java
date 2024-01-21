import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class2_Sub2_Sub1_Sub4 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!hb", name = "fb", descriptor = "[I")
	public static int[] anIntArray118 = new int[2048];

	@OriginalMember(owner = "client!hb", name = "gb", descriptor = "[I")
	public static int[] anIntArray119 = new int[2048];

	@OriginalMember(owner = "client!hb", name = "qb", descriptor = "[I")
	public static int[] anIntArray122 = new int[2048];

	@OriginalMember(owner = "client!hb", name = "rb", descriptor = "[I")
	public static int[] anIntArray123 = new int[512];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray123[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray118[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray122[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray119[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
