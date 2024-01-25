import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
	public final int anInt4608;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
	public final int anInt4614;

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "[I")
	public final int[] anIntArray592;

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "[Z")
	public final boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "[I")
	public final int[] anIntArray591;

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "[[I")
	public final int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4608 = arg0;
		@Pc(11) Class1_Sub7 local11 = new Class1_Sub7(arg1);
		this.anInt4614 = local11.method3141();
		this.anIntArray592 = new int[this.anInt4614];
		this.aBooleanArray25 = new boolean[this.anInt4614];
		this.anIntArray591 = new int[this.anInt4614];
		this.anIntArrayArray49 = new int[this.anInt4614][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt4614; local38++) {
			this.anIntArray592[local38] = local11.method3141();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt4614; local54++) {
			this.aBooleanArray25[local54] = local11.method3141() == 1;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt4614; local81++) {
			this.anIntArray591[local81] = local11.method3115();
		}
		for (@Pc(101) int local101 = 0; local101 < this.anInt4614; local101++) {
			this.anIntArrayArray49[local101] = new int[local11.method3141()];
		}
		for (@Pc(122) int local122 = 0; local122 < this.anInt4614; local122++) {
			for (@Pc(126) int local126 = 0; local126 < this.anIntArrayArray49[local122].length; local126++) {
				this.anIntArrayArray49[local122][local126] = local11.method3141();
			}
		}
	}
}
