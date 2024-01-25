import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uja")
public final class Class3_Sub52 extends Class3 {

	@OriginalMember(owner = "client!uja", name = "i", descriptor = "I")
	public final int anInt9522;

	@OriginalMember(owner = "client!uja", name = "q", descriptor = "I")
	public final int anInt9526;

	@OriginalMember(owner = "client!uja", name = "r", descriptor = "[Z")
	public final boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!uja", name = "m", descriptor = "[[I")
	public final int[][] anIntArrayArray100;

	@OriginalMember(owner = "client!uja", name = "p", descriptor = "[I")
	public final int[] anIntArray623;

	@OriginalMember(owner = "client!uja", name = "o", descriptor = "[I")
	public final int[] anIntArray622;

	@OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub52(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt9522 = arg0;
		@Pc(11) Class3_Sub17 local11 = new Class3_Sub17(arg1);
		this.anInt9526 = local11.method4888();
		this.aBooleanArray27 = new boolean[this.anInt9526];
		this.anIntArrayArray100 = new int[this.anInt9526][];
		this.anIntArray623 = new int[this.anInt9526];
		this.anIntArray622 = new int[this.anInt9526];
		for (@Pc(38) int local38 = 0; local38 < this.anInt9526; local38++) {
			this.anIntArray622[local38] = local11.method4888();
			if (this.anIntArray622[local38] == 6) {
				this.anIntArray622[local38] = 2;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt9526; local71++) {
			this.aBooleanArray27[local71] = local11.method4888() == 1;
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt9526; local92++) {
			this.anIntArray623[local92] = local11.method4858();
		}
		for (@Pc(108) int local108 = 0; local108 < this.anInt9526; local108++) {
			this.anIntArrayArray100[local108] = new int[local11.method4888()];
		}
		for (@Pc(129) int local129 = 0; local129 < this.anInt9526; local129++) {
			for (@Pc(133) int local133 = 0; local133 < this.anIntArrayArray100[local129].length; local133++) {
				this.anIntArrayArray100[local129][local133] = local11.method4888();
			}
		}
	}
}
