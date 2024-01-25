import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class6_Sub38 extends Class6 {

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
	public final int anInt6952;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	public final int anInt6951;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "[I")
	public final int[] anIntArray513;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "[Z")
	public final boolean[] aBooleanArray30;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "[I")
	public final int[] anIntArray512;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt6952 = arg0;
		@Pc(11) Class6_Sub21 local11 = new Class6_Sub21(arg1);
		this.anInt6951 = local11.method6069();
		this.anIntArray513 = new int[this.anInt6951];
		this.aBooleanArray30 = new boolean[this.anInt6951];
		this.anIntArrayArray64 = new int[this.anInt6951][];
		this.anIntArray512 = new int[this.anInt6951];
		for (@Pc(38) int local38 = 0; local38 < this.anInt6951; local38++) {
			this.anIntArray513[local38] = local11.method6069();
			if (this.anIntArray513[local38] == 6) {
				this.anIntArray513[local38] = 2;
			}
		}
		for (@Pc(67) int local67 = 0; local67 < this.anInt6951; local67++) {
			this.aBooleanArray30[local67] = local11.method6069() == 1;
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt6951; local92++) {
			this.anIntArray512[local92] = local11.method6003();
		}
		for (@Pc(108) int local108 = 0; local108 < this.anInt6951; local108++) {
			this.anIntArrayArray64[local108] = new int[local11.method6069()];
		}
		for (@Pc(129) int local129 = 0; local129 < this.anInt6951; local129++) {
			for (@Pc(133) int local133 = 0; local133 < this.anIntArrayArray64[local129].length; local133++) {
				this.anIntArrayArray64[local129][local133] = local11.method6069();
			}
		}
	}
}
