import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
	public final int anInt738;

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
	private final int anInt743;

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "[I")
	public final int[] anIntArray142;

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "[[I")
	public final int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt738 = arg0;
		@Pc(11) Class2_Sub3 local11 = new Class2_Sub3(arg1);
		this.anInt743 = local11.method1708();
		this.anIntArray142 = new int[this.anInt743];
		this.anIntArrayArray10 = new int[this.anInt743][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt743; local28++) {
			this.anIntArray142[local28] = local11.method1708();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt743; local44++) {
			this.anIntArrayArray10[local44] = new int[local11.method1708()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt743; local65++) {
			for (@Pc(69) int local69 = 0; local69 < this.anIntArrayArray10[local65].length; local69++) {
				this.anIntArrayArray10[local65][local69] = local11.method1708();
			}
		}
	}
}
