import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
	public final int anInt1664;

	@OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
	private final int anInt1666;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "[[I")
	public final int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "[Z")
	private final boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!ia", name = "P", descriptor = "[I")
	public final int[] anIntArray89;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1664 = arg0;
		@Pc(9) Class3_Sub4 local9 = new Class3_Sub4(arg1);
		this.anInt1666 = local9.method1278();
		this.anIntArrayArray8 = new int[this.anInt1666][];
		this.aBooleanArray5 = new boolean[this.anInt1666];
		this.anIntArray89 = new int[this.anInt1666];
		for (@Pc(31) int local31 = 0; local31 < this.anInt1666; local31++) {
			this.anIntArray89[local31] = local9.method1278();
		}
		for (@Pc(50) int local50 = 0; local50 < this.anInt1666; local50++) {
			this.aBooleanArray5[local50] = local9.method1278() == 1;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt1666; local72++) {
			this.anIntArrayArray8[local72] = new int[local9.method1278()];
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt1666; local92++) {
			for (@Pc(95) int local95 = 0; local95 < this.anIntArrayArray8[local92].length; local95++) {
				this.anIntArrayArray8[local92][local95] = local9.method1278();
			}
		}
	}
}
