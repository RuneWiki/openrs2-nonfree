import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class2_Sub49 extends Class2 {

	@OriginalMember(owner = "client!we", name = "o", descriptor = "I")
	public final int anInt9262;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "I")
	public final int anInt9260;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "[[I")
	public final int[][] anIntArrayArray83;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "[Z")
	public final boolean[] aBooleanArray38;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "[I")
	public final int[] anIntArray713;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "[I")
	public final int[] anIntArray714;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub49(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt9262 = arg0;
		@Pc(11) Class2_Sub29 local11 = new Class2_Sub29(arg1);
		this.anInt9260 = local11.method5170();
		this.anIntArrayArray83 = new int[this.anInt9260][];
		this.aBooleanArray38 = new boolean[this.anInt9260];
		this.anIntArray713 = new int[this.anInt9260];
		this.anIntArray714 = new int[this.anInt9260];
		for (@Pc(38) int local38 = 0; local38 < this.anInt9260; local38++) {
			this.anIntArray713[local38] = local11.method5170();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt9260; local58++) {
			this.aBooleanArray38[local58] = local11.method5170() == 1;
		}
		for (@Pc(85) int local85 = 0; local85 < this.anInt9260; local85++) {
			this.anIntArray714[local85] = local11.method5229();
		}
		for (@Pc(105) int local105 = 0; local105 < this.anInt9260; local105++) {
			this.anIntArrayArray83[local105] = new int[local11.method5170()];
		}
		for (@Pc(122) int local122 = 0; local122 < this.anInt9260; local122++) {
			for (@Pc(126) int local126 = 0; local126 < this.anIntArrayArray83[local122].length; local126++) {
				this.anIntArrayArray83[local122][local126] = local11.method5170();
			}
		}
	}
}
