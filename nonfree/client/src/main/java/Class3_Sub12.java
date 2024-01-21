import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
	public final int anInt2561;

	@OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
	private final int anInt2563;

	@OriginalMember(owner = "client!tc", name = "I", descriptor = "[[I")
	public final int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "[I")
	public final int[] anIntArray277;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2561 = arg0;
		@Pc(11) Class3_Sub8 local11 = new Class3_Sub8(arg1);
		this.anInt2563 = local11.method1803();
		this.anIntArrayArray27 = new int[this.anInt2563][];
		this.anIntArray277 = new int[this.anInt2563];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2563; local28++) {
			this.anIntArray277[local28] = local11.method1803();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt2563; local44++) {
			this.anIntArrayArray27[local44] = new int[local11.method1803()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt2563; local65++) {
			for (@Pc(69) int local69 = 0; local69 < this.anIntArrayArray27[local65].length; local69++) {
				this.anIntArrayArray27[local65][local69] = local11.method1803();
			}
		}
	}
}
