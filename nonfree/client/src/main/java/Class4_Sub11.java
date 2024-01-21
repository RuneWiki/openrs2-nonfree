import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
	public final int anInt1091;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
	private final int anInt1087;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "[I")
	public final int[] anIntArray125;

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "[[I")
	public final int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1091 = arg0;
		@Pc(11) Class4_Sub10 local11 = new Class4_Sub10(arg1);
		this.anInt1087 = local11.method599();
		this.anIntArray125 = new int[this.anInt1087];
		this.anIntArrayArray8 = new int[this.anInt1087][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1087; local28++) {
			this.anIntArray125[local28] = local11.method599();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt1087; local44++) {
			this.anIntArrayArray8[local44] = new int[local11.method599()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt1087; local65++) {
			for (@Pc(69) int local69 = 0; local69 < this.anIntArrayArray8[local65].length; local69++) {
				this.anIntArrayArray8[local65][local69] = local11.method599();
			}
		}
	}
}
