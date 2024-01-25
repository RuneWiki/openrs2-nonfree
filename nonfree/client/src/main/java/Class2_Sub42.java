import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class2_Sub42 extends Class2 {

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
	public final int anInt7021;

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
	public final int anInt7022;

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "[[I")
	public final int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "[I")
	public final int[] anIntArray587;

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "[I")
	public final int[] anIntArray586;

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "[Z")
	public final boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt7021 = arg0;
		@Pc(11) Class2_Sub24 local11 = new Class2_Sub24(arg1);
		this.anInt7022 = local11.method5732();
		this.anIntArrayArray64 = new int[this.anInt7022][];
		this.anIntArray587 = new int[this.anInt7022];
		this.anIntArray586 = new int[this.anInt7022];
		this.aBooleanArray29 = new boolean[this.anInt7022];
		for (@Pc(38) int local38 = 0; local38 < this.anInt7022; local38++) {
			this.anIntArray587[local38] = local11.method5732();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt7022; local58++) {
			this.aBooleanArray29[local58] = local11.method5732() == 1;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt7022; local81++) {
			this.anIntArray586[local81] = local11.method5753();
		}
		for (@Pc(101) int local101 = 0; local101 < this.anInt7022; local101++) {
			this.anIntArrayArray64[local101] = new int[local11.method5732()];
		}
		for (@Pc(122) int local122 = 0; local122 < this.anInt7022; local122++) {
			for (@Pc(126) int local126 = 0; local126 < this.anIntArrayArray64[local122].length; local126++) {
				this.anIntArrayArray64[local122][local126] = local11.method5732();
			}
		}
	}
}
