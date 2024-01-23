import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
	public int anInt2840;

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
	public int anInt2841;

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "[Z")
	public boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "[I")
	public int[] anIntArray234;

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "[I")
	public int[] anIntArray236;

	@OriginalMember(owner = "client!ki", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2840 = arg0;
		@Pc(11) Class1_Sub14 local11 = new Class1_Sub14(arg1);
		this.anInt2841 = local11.method2595();
		this.aBooleanArray29 = new boolean[this.anInt2841];
		this.anIntArray234 = new int[this.anInt2841];
		this.anIntArray236 = new int[this.anInt2841];
		this.anIntArrayArray15 = new int[this.anInt2841][];
		@Pc(38) int local38;
		for (local38 = 0; local38 < this.anInt2841; local38++) {
			this.anIntArray236[local38] = local11.method2595();
		}
		for (local38 = 0; local38 < this.anInt2841; local38++) {
			this.aBooleanArray29[local38] = local11.method2595() == 1;
		}
		for (local38 = 0; local38 < this.anInt2841; local38++) {
			this.anIntArray234[local38] = local11.method2593();
		}
		for (local38 = 0; local38 < this.anInt2841; local38++) {
			this.anIntArrayArray15[local38] = new int[local11.method2595()];
		}
		for (local38 = 0; local38 < this.anInt2841; local38++) {
			for (@Pc(128) int local128 = 0; local128 < this.anIntArrayArray15[local38].length; local128++) {
				this.anIntArrayArray15[local38][local128] = local11.method2595();
			}
		}
	}
}
