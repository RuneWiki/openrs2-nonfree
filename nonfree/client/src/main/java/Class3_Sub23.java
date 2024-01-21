import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class3_Sub23 extends Class3 {

	@OriginalMember(owner = "client!v", name = "v", descriptor = "I")
	public final int anInt3978;

	@OriginalMember(owner = "client!v", name = "x", descriptor = "I")
	private final int anInt3979;

	@OriginalMember(owner = "client!v", name = "F", descriptor = "[Z")
	private final boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!v", name = "A", descriptor = "[I")
	public final int[] anIntArray665;

	@OriginalMember(owner = "client!v", name = "B", descriptor = "[[I")
	public final int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3978 = arg0;
		@Pc(9) Class3_Sub8 local9 = new Class3_Sub8(arg1);
		this.anInt3979 = local9.method1545();
		this.aBooleanArray20 = new boolean[this.anInt3979];
		this.anIntArray665 = new int[this.anInt3979];
		this.anIntArrayArray34 = new int[this.anInt3979][];
		for (@Pc(31) int local31 = 0; local31 < this.anInt3979; local31++) {
			this.anIntArray665[local31] = local9.method1545();
		}
		for (@Pc(50) int local50 = 0; local50 < this.anInt3979; local50++) {
			this.aBooleanArray20[local50] = local9.method1545() == 1;
		}
		for (@Pc(76) int local76 = 0; local76 < this.anInt3979; local76++) {
			this.anIntArrayArray34[local76] = new int[local9.method1545()];
		}
		for (@Pc(96) int local96 = 0; local96 < this.anInt3979; local96++) {
			for (@Pc(99) int local99 = 0; local99 < this.anIntArrayArray34[local96].length; local99++) {
				this.anIntArrayArray34[local96][local99] = local9.method1545();
			}
		}
	}
}
