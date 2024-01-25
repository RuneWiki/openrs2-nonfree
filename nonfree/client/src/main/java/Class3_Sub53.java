import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sga")
public final class Class3_Sub53 extends Class3 {

	@OriginalMember(owner = "client!sga", name = "j", descriptor = "I")
	public final int anInt8954;

	@OriginalMember(owner = "client!sga", name = "p", descriptor = "I")
	public final int anInt8952;

	@OriginalMember(owner = "client!sga", name = "t", descriptor = "[Z")
	public final boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!sga", name = "k", descriptor = "[I")
	public final int[] anIntArray653;

	@OriginalMember(owner = "client!sga", name = "i", descriptor = "[I")
	public final int[] anIntArray654;

	@OriginalMember(owner = "client!sga", name = "s", descriptor = "[[I")
	public final int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub53(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt8954 = arg0;
		@Pc(11) Class3_Sub2 local11 = new Class3_Sub2(arg1);
		this.anInt8952 = local11.method2048(255);
		this.aBooleanArray24 = new boolean[this.anInt8952];
		this.anIntArray653 = new int[this.anInt8952];
		this.anIntArray654 = new int[this.anInt8952];
		this.anIntArrayArray47 = new int[this.anInt8952][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt8952; local38++) {
			this.anIntArray653[local38] = local11.method2048(255);
			if (this.anIntArray653[local38] == 6) {
				this.anIntArray653[local38] = 2;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt8952; local71++) {
			this.aBooleanArray24[local71] = local11.method2048(255) == 1;
		}
		for (@Pc(101) int local101 = 0; local101 < this.anInt8952; local101++) {
			this.anIntArray654[local101] = local11.method2028(-14795);
		}
		for (@Pc(121) int local121 = 0; local121 < this.anInt8952; local121++) {
			this.anIntArrayArray47[local121] = new int[local11.method2048(255)];
		}
		for (@Pc(142) int local142 = 0; local142 < this.anInt8952; local142++) {
			for (@Pc(148) int local148 = 0; local148 < this.anIntArrayArray47[local142].length; local148++) {
				this.anIntArrayArray47[local142][local148] = local11.method2048(255);
			}
		}
	}
}
