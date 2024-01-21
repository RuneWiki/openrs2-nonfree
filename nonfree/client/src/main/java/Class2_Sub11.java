import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
	public final int anInt1404;

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
	private final int anInt1405;

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "[[I")
	public final int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "[I")
	public final int[] anIntArray225;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1404 = arg0;
		@Pc(11) Class2_Sub6 local11 = new Class2_Sub6(arg1);
		this.anInt1405 = local11.method665();
		this.anIntArrayArray46 = new int[this.anInt1405][];
		this.anIntArray225 = new int[this.anInt1405];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1405; local28++) {
			this.anIntArray225[local28] = local11.method665();
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt1405; local48++) {
			this.anIntArrayArray46[local48] = new int[local11.method665()];
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt1405; local69++) {
			for (@Pc(73) int local73 = 0; local73 < this.anIntArrayArray46[local69].length; local73++) {
				this.anIntArrayArray46[local69][local73] = local11.method665();
			}
		}
	}
}
