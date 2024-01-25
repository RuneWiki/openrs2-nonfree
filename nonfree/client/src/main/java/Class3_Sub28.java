import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class3_Sub28 extends Class3 {

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
	public final int anInt4003;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
	public final int anInt4001;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "[I")
	public final int[] anIntArray261;

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "[[I")
	public final int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "[Z")
	public final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "[I")
	public final int[] anIntArray260;

	static {
		new Class189(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4003 = arg0;
		@Pc(9) Class3_Sub7 local9 = new Class3_Sub7(arg1);
		this.anInt4001 = local9.method2582();
		this.anIntArray261 = new int[this.anInt4001];
		this.anIntArrayArray27 = new int[this.anInt4001][];
		this.aBooleanArray16 = new boolean[this.anInt4001];
		this.anIntArray260 = new int[this.anInt4001];
		for (@Pc(36) int local36 = 0; local36 < this.anInt4001; local36++) {
			this.anIntArray260[local36] = local9.method2582();
		}
		for (@Pc(51) int local51 = 0; local51 < this.anInt4001; local51++) {
			this.aBooleanArray16[local51] = local9.method2582() == 1;
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt4001; local73++) {
			this.anIntArray261[local73] = local9.method2588();
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt4001; local92++) {
			this.anIntArrayArray27[local92] = new int[local9.method2582()];
		}
		for (@Pc(112) int local112 = 0; local112 < this.anInt4001; local112++) {
			for (@Pc(115) int local115 = 0; local115 < this.anIntArrayArray27[local112].length; local115++) {
				this.anIntArrayArray27[local112][local115] = local9.method2582();
			}
		}
	}
}
