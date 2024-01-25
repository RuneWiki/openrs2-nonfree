import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class5_Sub35 extends Class5 {

	@OriginalMember(owner = "client!maa", name = "s", descriptor = "I")
	public final int anInt5753;

	@OriginalMember(owner = "client!maa", name = "t", descriptor = "I")
	public final int anInt5757;

	@OriginalMember(owner = "client!maa", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!maa", name = "o", descriptor = "[Z")
	public final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!maa", name = "m", descriptor = "[I")
	public final int[] anIntArray334;

	@OriginalMember(owner = "client!maa", name = "l", descriptor = "[I")
	public final int[] anIntArray336;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(I[B)V")
	public Class5_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt5753 = arg0;
		@Pc(11) Class5_Sub36 local11 = new Class5_Sub36(arg1);
		this.anInt5757 = local11.method7291();
		this.anIntArrayArray40 = new int[this.anInt5757][];
		this.aBooleanArray16 = new boolean[this.anInt5757];
		this.anIntArray334 = new int[this.anInt5757];
		this.anIntArray336 = new int[this.anInt5757];
		for (@Pc(38) int local38 = 0; local38 < this.anInt5757; local38++) {
			this.anIntArray336[local38] = local11.method7291();
			if (this.anIntArray336[local38] == 6) {
				this.anIntArray336[local38] = 2;
			}
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt5757; local73++) {
			this.aBooleanArray16[local73] = local11.method7291() == 1;
		}
		for (@Pc(101) int local101 = 0; local101 < this.anInt5757; local101++) {
			this.anIntArray334[local101] = local11.method7333();
		}
		for (@Pc(125) int local125 = 0; local125 < this.anInt5757; local125++) {
			this.anIntArrayArray40[local125] = new int[local11.method7291()];
		}
		for (@Pc(146) int local146 = 0; local146 < this.anInt5757; local146++) {
			for (@Pc(152) int local152 = 0; local152 < this.anIntArrayArray40[local146].length; local152++) {
				this.anIntArrayArray40[local146][local152] = local11.method7291();
			}
		}
	}
}
