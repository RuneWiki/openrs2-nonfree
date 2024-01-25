import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
	public final int anInt3096;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
	public final int anInt3093;

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!hl", name = "x", descriptor = "[I")
	public final int[] anIntArray278;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "[I")
	public final int[] anIntArray277;

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "[Z")
	public final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3096 = arg0;
		@Pc(11) Class2_Sub23 local11 = new Class2_Sub23(arg1);
		this.anInt3093 = local11.method5495();
		this.anIntArrayArray29 = new int[this.anInt3093][];
		this.anIntArray278 = new int[this.anInt3093];
		this.anIntArray277 = new int[this.anInt3093];
		this.aBooleanArray16 = new boolean[this.anInt3093];
		for (@Pc(38) int local38 = 0; local38 < this.anInt3093; local38++) {
			this.anIntArray278[local38] = local11.method5495();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt3093; local58++) {
			this.aBooleanArray16[local58] = local11.method5495() == 1;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt3093; local81++) {
			this.anIntArray277[local81] = local11.method5500();
		}
		for (@Pc(97) int local97 = 0; local97 < this.anInt3093; local97++) {
			this.anIntArrayArray29[local97] = new int[local11.method5495()];
		}
		for (@Pc(118) int local118 = 0; local118 < this.anInt3093; local118++) {
			for (@Pc(122) int local122 = 0; local122 < this.anIntArrayArray29[local118].length; local122++) {
				this.anIntArrayArray29[local118][local122] = local11.method5495();
			}
		}
	}
}
