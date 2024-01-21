import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
	public final int anInt2083;

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
	private final int anInt2084;

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "[I")
	public final int[] anIntArray213;

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ke", name = "C", descriptor = "[Z")
	private final boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2083 = arg0;
		@Pc(11) Class3_Sub4 local11 = new Class3_Sub4(arg1);
		this.anInt2084 = local11.method191();
		this.anIntArray213 = new int[this.anInt2084];
		this.anIntArrayArray20 = new int[this.anInt2084][];
		this.aBooleanArray12 = new boolean[this.anInt2084];
		for (@Pc(33) int local33 = 0; local33 < this.anInt2084; local33++) {
			this.anIntArray213[local33] = local11.method191();
		}
		for (@Pc(49) int local49 = 0; local49 < this.anInt2084; local49++) {
			this.aBooleanArray12[local49] = local11.method191() == 1;
		}
		for (@Pc(70) int local70 = 0; local70 < this.anInt2084; local70++) {
			this.anIntArrayArray20[local70] = new int[local11.method191()];
		}
		for (@Pc(91) int local91 = 0; local91 < this.anInt2084; local91++) {
			for (@Pc(95) int local95 = 0; local95 < this.anIntArrayArray20[local91].length; local95++) {
				this.anIntArrayArray20[local91][local95] = local11.method191();
			}
		}
	}
}
