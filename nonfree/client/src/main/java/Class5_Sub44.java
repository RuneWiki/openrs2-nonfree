import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class5_Sub44 extends Class5 {

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
	public final int anInt7814;

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
	public final int anInt7816;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "[Z")
	public final boolean[] aBooleanArray32;

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "[I")
	public final int[] anIntArray590;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "[[I")
	public final int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "[I")
	public final int[] anIntArray589;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(I[B)V")
	public Class5_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt7814 = arg0;
		@Pc(11) Class5_Sub3 local11 = new Class5_Sub3(arg1);
		this.anInt7816 = local11.method4220();
		this.aBooleanArray32 = new boolean[this.anInt7816];
		this.anIntArray590 = new int[this.anInt7816];
		this.anIntArrayArray64 = new int[this.anInt7816][];
		this.anIntArray589 = new int[this.anInt7816];
		for (@Pc(38) int local38 = 0; local38 < this.anInt7816; local38++) {
			this.anIntArray590[local38] = local11.method4220();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt7816; local58++) {
			this.aBooleanArray32[local58] = local11.method4220() == 1;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt7816; local79++) {
			this.anIntArray589[local79] = local11.method4227();
		}
		for (@Pc(95) int local95 = 0; local95 < this.anInt7816; local95++) {
			this.anIntArrayArray64[local95] = new int[local11.method4220()];
		}
		for (@Pc(112) int local112 = 0; local112 < this.anInt7816; local112++) {
			for (@Pc(116) int local116 = 0; local116 < this.anIntArrayArray64[local112].length; local116++) {
				this.anIntArrayArray64[local112][local116] = local11.method4220();
			}
		}
	}
}
