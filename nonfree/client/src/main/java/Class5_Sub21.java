import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class5_Sub21 extends Class5 {

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
	public final int anInt3191;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
	public final int anInt3192;

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "[Z")
	public final boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "[I")
	public final int[] anIntArray182;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "[I")
	public final int[] anIntArray181;

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I[B)V")
	public Class5_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3191 = arg0;
		@Pc(11) Class5_Sub15 local11 = new Class5_Sub15(arg1);
		this.anInt3192 = local11.method5539();
		this.aBooleanArray11 = new boolean[this.anInt3192];
		this.anIntArray182 = new int[this.anInt3192];
		this.anIntArray181 = new int[this.anInt3192];
		this.anIntArrayArray21 = new int[this.anInt3192][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt3192; local38++) {
			this.anIntArray182[local38] = local11.method5539();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt3192; local58++) {
			this.aBooleanArray11[local58] = local11.method5539() == 1;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt3192; local81++) {
			this.anIntArray181[local81] = local11.method5598();
		}
		for (@Pc(101) int local101 = 0; local101 < this.anInt3192; local101++) {
			this.anIntArrayArray21[local101] = new int[local11.method5539()];
		}
		for (@Pc(118) int local118 = 0; local118 < this.anInt3192; local118++) {
			for (@Pc(122) int local122 = 0; local122 < this.anIntArrayArray21[local118].length; local122++) {
				this.anIntArrayArray21[local118][local122] = local11.method5539();
			}
		}
	}
}
