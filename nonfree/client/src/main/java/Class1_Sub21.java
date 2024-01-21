import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
	public final int anInt2766;

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
	private final int anInt2764;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "[I")
	public final int[] anIntArray476;

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "[[I")
	public final int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2766 = arg0;
		@Pc(11) Class1_Sub12 local11 = new Class1_Sub12(arg1);
		this.anInt2764 = local11.method1190();
		this.anIntArray476 = new int[this.anInt2764];
		this.anIntArrayArray30 = new int[this.anInt2764][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2764; local28++) {
			this.anIntArray476[local28] = local11.method1190();
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt2764; local48++) {
			this.anIntArrayArray30[local48] = new int[local11.method1190()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt2764; local65++) {
			for (@Pc(69) int local69 = 0; local69 < this.anIntArrayArray30[local65].length; local69++) {
				this.anIntArrayArray30[local65][local69] = local11.method1190();
			}
		}
	}
}
