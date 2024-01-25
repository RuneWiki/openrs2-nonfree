import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class2_Sub47 extends Class2 {

	@OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
	public final int anInt7599;

	@OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
	public final int anInt7600;

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "[[I")
	public final int[][] anIntArrayArray188;

	@OriginalMember(owner = "client!wo", name = "v", descriptor = "[I")
	public final int[] anIntArray627;

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "[I")
	public final int[] anIntArray626;

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "[Z")
	public final boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub47(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt7599 = arg0;
		@Pc(9) Class2_Sub17 local9 = new Class2_Sub17(arg1);
		this.anInt7600 = local9.method6138();
		this.anIntArrayArray188 = new int[this.anInt7600][];
		this.anIntArray627 = new int[this.anInt7600];
		this.anIntArray626 = new int[this.anInt7600];
		this.aBooleanArray25 = new boolean[this.anInt7600];
		for (@Pc(36) int local36 = 0; local36 < this.anInt7600; local36++) {
			this.anIntArray626[local36] = local9.method6138();
		}
		for (@Pc(55) int local55 = 0; local55 < this.anInt7600; local55++) {
			this.aBooleanArray25[local55] = local9.method6138() == 1;
		}
		for (@Pc(75) int local75 = 0; local75 < this.anInt7600; local75++) {
			this.anIntArray627[local75] = local9.method6148();
		}
		for (@Pc(90) int local90 = 0; local90 < this.anInt7600; local90++) {
			this.anIntArrayArray188[local90] = new int[local9.method6138()];
		}
		for (@Pc(106) int local106 = 0; local106 < this.anInt7600; local106++) {
			for (@Pc(109) int local109 = 0; local109 < this.anIntArrayArray188[local106].length; local109++) {
				this.anIntArrayArray188[local106][local109] = local9.method6138();
			}
		}
	}
}
