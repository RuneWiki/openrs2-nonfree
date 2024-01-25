import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class3_Sub17 extends Class3 {

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	public final int anInt2561;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
	public final int anInt2565;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "[I")
	public final int[] anIntArray106;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "[Z")
	public final boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "[I")
	public final int[] anIntArray107;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "[[I")
	public final int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2561 = arg0;
		@Pc(11) Class3_Sub3 local11 = new Class3_Sub3(arg1);
		this.anInt2565 = local11.method4225();
		this.anIntArray106 = new int[this.anInt2565];
		this.aBooleanArray7 = new boolean[this.anInt2565];
		this.anIntArray107 = new int[this.anInt2565];
		this.anIntArrayArray12 = new int[this.anInt2565][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt2565; local38++) {
			this.anIntArray106[local38] = local11.method4225();
			if (this.anIntArray106[local38] == 6) {
				this.anIntArray106[local38] = 2;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt2565; local71++) {
			this.aBooleanArray7[local71] = local11.method4225() == 1;
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt2565; local92++) {
			this.anIntArray107[local92] = local11.method4221();
		}
		for (@Pc(108) int local108 = 0; local108 < this.anInt2565; local108++) {
			this.anIntArrayArray12[local108] = new int[local11.method4225()];
		}
		for (@Pc(129) int local129 = 0; local129 < this.anInt2565; local129++) {
			for (@Pc(133) int local133 = 0; local133 < this.anIntArrayArray12[local129].length; local133++) {
				this.anIntArrayArray12[local129][local133] = local11.method4225();
			}
		}
	}
}
