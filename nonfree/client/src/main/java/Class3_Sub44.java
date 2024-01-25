import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class3_Sub44 extends Class3 {

	@OriginalMember(owner = "client!sfa", name = "p", descriptor = "I")
	public final int anInt8918;

	@OriginalMember(owner = "client!sfa", name = "q", descriptor = "I")
	public final int anInt8919;

	@OriginalMember(owner = "client!sfa", name = "t", descriptor = "[Z")
	public final boolean[] aBooleanArray36;

	@OriginalMember(owner = "client!sfa", name = "n", descriptor = "[I")
	public final int[] anIntArray580;

	@OriginalMember(owner = "client!sfa", name = "u", descriptor = "[I")
	public final int[] anIntArray581;

	@OriginalMember(owner = "client!sfa", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray71;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt8918 = arg0;
		@Pc(9) Class3_Sub7 local9 = new Class3_Sub7(arg1);
		this.anInt8919 = local9.method6538();
		this.aBooleanArray36 = new boolean[this.anInt8919];
		this.anIntArray580 = new int[this.anInt8919];
		this.anIntArray581 = new int[this.anInt8919];
		this.anIntArrayArray71 = new int[this.anInt8919][];
		for (@Pc(36) int local36 = 0; local36 < this.anInt8919; local36++) {
			this.anIntArray580[local36] = local9.method6538();
			if (this.anIntArray580[local36] == 6) {
				this.anIntArray580[local36] = 2;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < this.anInt8919; local64++) {
			this.aBooleanArray36[local64] = local9.method6538() == 1;
		}
		for (@Pc(84) int local84 = 0; local84 < this.anInt8919; local84++) {
			this.anIntArray581[local84] = local9.method6535();
		}
		for (@Pc(103) int local103 = 0; local103 < this.anInt8919; local103++) {
			this.anIntArrayArray71[local103] = new int[local9.method6538()];
		}
		for (@Pc(119) int local119 = 0; local119 < this.anInt8919; local119++) {
			for (@Pc(122) int local122 = 0; local122 < this.anIntArrayArray71[local119].length; local122++) {
				this.anIntArrayArray71[local119][local122] = local9.method6538();
			}
		}
	}
}
