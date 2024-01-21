import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
	public final int anInt1471;

	@OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
	private final int anInt1472;

	@OriginalMember(owner = "client!gg", name = "F", descriptor = "[I")
	public final int[] anIntArray166;

	@OriginalMember(owner = "client!gg", name = "H", descriptor = "[[I")
	public final int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1471 = arg0;
		@Pc(11) Class2_Sub11 local11 = new Class2_Sub11(arg1);
		this.anInt1472 = local11.method1461();
		this.anIntArray166 = new int[this.anInt1472];
		this.anIntArrayArray21 = new int[this.anInt1472][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1472; local28++) {
			this.anIntArray166[local28] = local11.method1461();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt1472; local44++) {
			this.anIntArrayArray21[local44] = new int[local11.method1461()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt1472; local65++) {
			for (@Pc(69) int local69 = 0; local69 < this.anIntArrayArray21[local65].length; local69++) {
				this.anIntArrayArray21[local65][local69] = local11.method1461();
			}
		}
	}
}
