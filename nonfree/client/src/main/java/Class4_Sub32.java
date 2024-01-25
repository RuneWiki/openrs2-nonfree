import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class4_Sub32 extends Class4 {

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
	public final int anInt4984;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	public final int anInt4981;

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "[I")
	public final int[] anIntArray318;

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "[[I")
	public final int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "[Z")
	public final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!nk", name = "r", descriptor = "[I")
	public final int[] anIntArray320;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4984 = arg0;
		@Pc(11) Class4_Sub12 local11 = new Class4_Sub12(arg1);
		this.anInt4981 = local11.method2490();
		this.anIntArray318 = new int[this.anInt4981];
		this.anIntArrayArray42 = new int[this.anInt4981][];
		this.aBooleanArray16 = new boolean[this.anInt4981];
		this.anIntArray320 = new int[this.anInt4981];
		for (@Pc(38) int local38 = 0; local38 < this.anInt4981; local38++) {
			this.anIntArray318[local38] = local11.method2490();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt4981; local54++) {
			this.aBooleanArray16[local54] = local11.method2490() == 1;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt4981; local81++) {
			this.anIntArray320[local81] = local11.method2536();
		}
		for (@Pc(101) int local101 = 0; local101 < this.anInt4981; local101++) {
			this.anIntArrayArray42[local101] = new int[local11.method2490()];
		}
		for (@Pc(118) int local118 = 0; local118 < this.anInt4981; local118++) {
			for (@Pc(122) int local122 = 0; local122 < this.anIntArrayArray42[local118].length; local122++) {
				this.anIntArrayArray42[local118][local122] = local11.method2490();
			}
		}
	}
}
