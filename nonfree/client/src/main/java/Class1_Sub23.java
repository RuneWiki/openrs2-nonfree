import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
	public int anInt3551;

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
	private int anInt3557;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "[Z")
	public boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "[I")
	public int[] anIntArray310;

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3551 = arg0;
		@Pc(11) Class1_Sub26 local11 = new Class1_Sub26(arg1);
		this.anInt3557 = local11.method2945();
		this.aBooleanArray22 = new boolean[this.anInt3557];
		this.anIntArray310 = new int[this.anInt3557];
		this.anIntArrayArray34 = new int[this.anInt3557][];
		for (@Pc(33) int local33 = 0; local33 < this.anInt3557; local33++) {
			this.anIntArray310[local33] = local11.method2945();
		}
		for (@Pc(49) int local49 = 0; local49 < this.anInt3557; local49++) {
			this.aBooleanArray22[local49] = local11.method2945() == 1;
		}
		for (@Pc(70) int local70 = 0; local70 < this.anInt3557; local70++) {
			this.anIntArrayArray34[local70] = new int[local11.method2945()];
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt3557; local87++) {
			for (@Pc(91) int local91 = 0; local91 < this.anIntArrayArray34[local87].length; local91++) {
				this.anIntArrayArray34[local87][local91] = local11.method2945();
			}
		}
	}
}
