import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
	public final int anInt2910;

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
	private final int anInt2908;

	@OriginalMember(owner = "client!ve", name = "N", descriptor = "[I")
	public final int[] anIntArray345;

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "[[I")
	public final int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2910 = arg0;
		@Pc(11) Class2_Sub9 local11 = new Class2_Sub9(arg1);
		this.anInt2908 = local11.method640();
		this.anIntArray345 = new int[this.anInt2908];
		this.anIntArrayArray28 = new int[this.anInt2908][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2908; local28++) {
			this.anIntArray345[local28] = local11.method640();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt2908; local44++) {
			this.anIntArrayArray28[local44] = new int[local11.method640()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt2908; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray28[local61].length; local65++) {
				this.anIntArrayArray28[local61][local65] = local11.method640();
			}
		}
	}
}
