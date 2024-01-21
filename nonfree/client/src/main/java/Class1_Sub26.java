import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
	public final int anInt4426;

	@OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
	private final int anInt4425;

	@OriginalMember(owner = "client!wa", name = "G", descriptor = "[[I")
	public final int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "[I")
	public final int[] anIntArray360;

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "[Z")
	private final boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4426 = arg0;
		@Pc(11) Class1_Sub14 local11 = new Class1_Sub14(arg1);
		this.anInt4425 = local11.method3010();
		this.anIntArrayArray33 = new int[this.anInt4425][];
		this.anIntArray360 = new int[this.anInt4425];
		this.aBooleanArray19 = new boolean[this.anInt4425];
		for (@Pc(33) int local33 = 0; local33 < this.anInt4425; local33++) {
			this.anIntArray360[local33] = local11.method3010();
		}
		for (@Pc(49) int local49 = 0; local49 < this.anInt4425; local49++) {
			this.aBooleanArray19[local49] = local11.method3010() == 1;
		}
		for (@Pc(74) int local74 = 0; local74 < this.anInt4425; local74++) {
			this.anIntArrayArray33[local74] = new int[local11.method3010()];
		}
		for (@Pc(91) int local91 = 0; local91 < this.anInt4425; local91++) {
			for (@Pc(95) int local95 = 0; local95 < this.anIntArrayArray33[local91].length; local95++) {
				this.anIntArrayArray33[local91][local95] = local11.method3010();
			}
		}
	}
}
