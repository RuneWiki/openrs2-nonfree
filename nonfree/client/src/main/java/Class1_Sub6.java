import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
	public int anInt1362;

	@OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
	public int anInt1368;

	@OriginalMember(owner = "client!dj", name = "D", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "[I")
	public int[] anIntArray140;

	@OriginalMember(owner = "client!dj", name = "I", descriptor = "[I")
	public int[] anIntArray141;

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "[Z")
	public boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1362 = arg0;
		@Pc(11) Class1_Sub16 local11 = new Class1_Sub16(arg1);
		this.anInt1368 = local11.method2655();
		this.anIntArrayArray8 = new int[this.anInt1368][];
		this.anIntArray140 = new int[this.anInt1368];
		this.anIntArray141 = new int[this.anInt1368];
		this.aBooleanArray3 = new boolean[this.anInt1368];
		@Pc(38) int local38;
		for (local38 = 0; local38 < this.anInt1368; local38++) {
			this.anIntArray141[local38] = local11.method2655();
		}
		for (local38 = 0; local38 < this.anInt1368; local38++) {
			this.aBooleanArray3[local38] = local11.method2655() == 1;
		}
		for (local38 = 0; local38 < this.anInt1368; local38++) {
			this.anIntArray140[local38] = local11.method2652();
		}
		for (local38 = 0; local38 < this.anInt1368; local38++) {
			this.anIntArrayArray8[local38] = new int[local11.method2655()];
		}
		for (local38 = 0; local38 < this.anInt1368; local38++) {
			for (@Pc(128) int local128 = 0; local128 < this.anIntArrayArray8[local38].length; local128++) {
				this.anIntArrayArray8[local38][local128] = local11.method2655();
			}
		}
	}
}
