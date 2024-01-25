import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class3_Sub15 extends Class3 {

	@OriginalMember(owner = "client!ega", name = "l", descriptor = "I")
	public final int anInt2693;

	@OriginalMember(owner = "client!ega", name = "s", descriptor = "I")
	public final int anInt2697;

	@OriginalMember(owner = "client!ega", name = "j", descriptor = "[I")
	public final int[] anIntArray169;

	@OriginalMember(owner = "client!ega", name = "p", descriptor = "[I")
	public final int[] anIntArray171;

	@OriginalMember(owner = "client!ega", name = "m", descriptor = "[Z")
	public final boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!ega", name = "k", descriptor = "[[I")
	public final int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2693 = arg0;
		@Pc(11) Class3_Sub9 local11 = new Class3_Sub9(arg1);
		this.anInt2697 = local11.method5633();
		this.anIntArray169 = new int[this.anInt2697];
		this.anIntArray171 = new int[this.anInt2697];
		this.aBooleanArray7 = new boolean[this.anInt2697];
		this.anIntArrayArray11 = new int[this.anInt2697][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt2697; local38++) {
			this.anIntArray169[local38] = local11.method5633();
			if (this.anIntArray169[local38] == 6) {
				this.anIntArray169[local38] = 2;
			}
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt2697; local65++) {
			this.aBooleanArray7[local65] = local11.method5633() == 1;
		}
		for (@Pc(88) int local88 = 0; local88 < this.anInt2697; local88++) {
			this.anIntArray171[local88] = local11.method5610();
		}
		for (@Pc(104) int local104 = 0; local104 < this.anInt2697; local104++) {
			this.anIntArrayArray11[local104] = new int[local11.method5633()];
		}
		for (@Pc(121) int local121 = 0; local121 < this.anInt2697; local121++) {
			for (@Pc(125) int local125 = 0; local125 < this.anIntArrayArray11[local121].length; local125++) {
				this.anIntArrayArray11[local121][local125] = local11.method5633();
			}
		}
	}
}
