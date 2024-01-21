import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
	public final int anInt86;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
	private final int anInt94;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "[[I")
	public final int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "[I")
	public final int[] anIntArray12;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt86 = arg0;
		@Pc(11) Class3_Sub11 local11 = new Class3_Sub11(arg1);
		this.anInt94 = local11.method1421();
		this.anIntArrayArray8 = new int[this.anInt94][];
		this.anIntArray12 = new int[this.anInt94];
		for (@Pc(28) int local28 = 0; local28 < this.anInt94; local28++) {
			this.anIntArray12[local28] = local11.method1421();
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt94; local48++) {
			this.anIntArrayArray8[local48] = new int[local11.method1421()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt94; local65++) {
			for (@Pc(69) int local69 = 0; local69 < this.anIntArrayArray8[local65].length; local69++) {
				this.anIntArrayArray8[local65][local69] = local11.method1421();
			}
		}
	}
}
