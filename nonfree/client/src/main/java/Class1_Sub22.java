import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
	public final int anInt3516;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
	private final int anInt3514;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "[I")
	public final int[] anIntArray403;

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "[Z")
	private final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3516 = arg0;
		@Pc(9) Class1_Sub14 local9 = new Class1_Sub14(arg1);
		this.anInt3514 = local9.method1738();
		this.anIntArray403 = new int[this.anInt3514];
		this.aBooleanArray16 = new boolean[this.anInt3514];
		this.anIntArrayArray34 = new int[this.anInt3514][];
		for (@Pc(31) int local31 = 0; local31 < this.anInt3514; local31++) {
			this.anIntArray403[local31] = local9.method1738();
		}
		for (@Pc(50) int local50 = 0; local50 < this.anInt3514; local50++) {
			this.aBooleanArray16[local50] = local9.method1738() == 1;
		}
		for (@Pc(74) int local74 = 0; local74 < this.anInt3514; local74++) {
			this.anIntArrayArray34[local74] = new int[local9.method1738()];
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt3514; local94++) {
			for (@Pc(97) int local97 = 0; local97 < this.anIntArrayArray34[local94].length; local97++) {
				this.anIntArrayArray34[local94][local97] = local9.method1738();
			}
		}
	}
}
