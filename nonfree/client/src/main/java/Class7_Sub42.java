import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class7_Sub42 extends Class7 {

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
	public final int anInt6645;

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
	public final int anInt6643;

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "[I")
	public final int[] anIntArray846;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "[I")
	public final int[] anIntArray845;

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "[Z")
	public final boolean[] aBooleanArray32;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(I[B)V")
	public Class7_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt6645 = arg0;
		@Pc(9) Class7_Sub3 local9 = new Class7_Sub3(arg1);
		this.anInt6643 = local9.method2772();
		this.anIntArrayArray58 = new int[this.anInt6643][];
		this.anIntArray846 = new int[this.anInt6643];
		this.anIntArray845 = new int[this.anInt6643];
		this.aBooleanArray32 = new boolean[this.anInt6643];
		for (@Pc(36) int local36 = 0; local36 < this.anInt6643; local36++) {
			this.anIntArray845[local36] = local9.method2772();
		}
		for (@Pc(51) int local51 = 0; local51 < this.anInt6643; local51++) {
			this.aBooleanArray32[local51] = local9.method2772() == 1;
		}
		for (@Pc(77) int local77 = 0; local77 < this.anInt6643; local77++) {
			this.anIntArray846[local77] = local9.method2764();
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt6643; local92++) {
			this.anIntArrayArray58[local92] = new int[local9.method2772()];
		}
		for (@Pc(108) int local108 = 0; local108 < this.anInt6643; local108++) {
			for (@Pc(111) int local111 = 0; local111 < this.anIntArrayArray58[local108].length; local111++) {
				this.anIntArrayArray58[local108][local111] = local9.method2772();
			}
		}
	}
}
