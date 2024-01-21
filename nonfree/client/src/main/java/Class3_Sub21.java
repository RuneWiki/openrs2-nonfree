import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
	public final int anInt3413;

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
	private final int anInt3416;

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "[I")
	public final int[] anIntArray369;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3413 = arg0;
		@Pc(11) Class3_Sub12 local11 = new Class3_Sub12(arg1);
		this.anInt3416 = local11.method1354();
		this.anIntArrayArray36 = new int[this.anInt3416][];
		this.anIntArray369 = new int[this.anInt3416];
		for (@Pc(28) int local28 = 0; local28 < this.anInt3416; local28++) {
			this.anIntArray369[local28] = local11.method1354();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt3416; local44++) {
			this.anIntArrayArray36[local44] = new int[local11.method1354()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt3416; local65++) {
			for (@Pc(69) int local69 = 0; local69 < this.anIntArrayArray36[local65].length; local69++) {
				this.anIntArrayArray36[local65][local69] = local11.method1354();
			}
		}
	}
}
