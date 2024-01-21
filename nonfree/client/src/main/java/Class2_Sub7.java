import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
	public final int anInt615;

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
	private final int anInt614;

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "[[I")
	public final int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "[I")
	public final int[] anIntArray64;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt615 = arg0;
		@Pc(11) Class2_Sub10 local11 = new Class2_Sub10(arg1);
		this.anInt614 = local11.method1514();
		this.anIntArrayArray6 = new int[this.anInt614][];
		this.anIntArray64 = new int[this.anInt614];
		for (@Pc(28) int local28 = 0; local28 < this.anInt614; local28++) {
			this.anIntArray64[local28] = local11.method1514();
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt614; local48++) {
			this.anIntArrayArray6[local48] = new int[local11.method1514()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt614; local65++) {
			for (@Pc(69) int local69 = 0; local69 < this.anIntArrayArray6[local65].length; local69++) {
				this.anIntArrayArray6[local65][local69] = local11.method1514();
			}
		}
	}
}
