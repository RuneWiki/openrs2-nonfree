import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class2_Sub45 extends Class2 {

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
	public final int anInt8599;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
	public final int anInt8601;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "[[I")
	public final int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "[I")
	public final int[] anIntArray590;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "[Z")
	public final boolean[] aBooleanArray44;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "[I")
	public final int[] anIntArray591;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt8599 = arg0;
		@Pc(9) Class2_Sub34 local9 = new Class2_Sub34(arg1);
		this.anInt8601 = local9.method6904();
		this.anIntArrayArray78 = new int[this.anInt8601][];
		this.anIntArray590 = new int[this.anInt8601];
		this.aBooleanArray44 = new boolean[this.anInt8601];
		this.anIntArray591 = new int[this.anInt8601];
		for (@Pc(36) int local36 = 0; local36 < this.anInt8601; local36++) {
			this.anIntArray591[local36] = local9.method6904();
			if (this.anIntArray591[local36] == 6) {
				this.anIntArray591[local36] = 2;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < this.anInt8601; local64++) {
			this.aBooleanArray44[local64] = local9.method6904() == 1;
		}
		for (@Pc(86) int local86 = 0; local86 < this.anInt8601; local86++) {
			this.anIntArray590[local86] = local9.method6884();
		}
		for (@Pc(105) int local105 = 0; local105 < this.anInt8601; local105++) {
			this.anIntArrayArray78[local105] = new int[local9.method6904()];
		}
		for (@Pc(125) int local125 = 0; local125 < this.anInt8601; local125++) {
			for (@Pc(128) int local128 = 0; local128 < this.anIntArrayArray78[local125].length; local128++) {
				this.anIntArrayArray78[local125][local128] = local9.method6904();
			}
		}
	}
}
