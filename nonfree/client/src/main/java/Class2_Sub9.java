import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
	public int anInt873;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
	public int anInt870;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "[I")
	public int[] anIntArray75;

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "[Z")
	public boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt873 = arg0;
		@Pc(11) Class2_Sub16 local11 = new Class2_Sub16(arg1);
		this.anInt870 = local11.method2146();
		this.anIntArrayArray3 = new int[this.anInt870][];
		this.anIntArray76 = new int[this.anInt870];
		this.anIntArray75 = new int[this.anInt870];
		this.aBooleanArray1 = new boolean[this.anInt870];
		@Pc(38) int local38;
		for (local38 = 0; local38 < this.anInt870; local38++) {
			this.anIntArray75[local38] = local11.method2146();
		}
		for (local38 = 0; local38 < this.anInt870; local38++) {
			this.aBooleanArray1[local38] = local11.method2146() == 1;
		}
		for (local38 = 0; local38 < this.anInt870; local38++) {
			this.anIntArray76[local38] = local11.method2130();
		}
		for (local38 = 0; local38 < this.anInt870; local38++) {
			this.anIntArrayArray3[local38] = new int[local11.method2146()];
		}
		for (local38 = 0; local38 < this.anInt870; local38++) {
			for (@Pc(128) int local128 = 0; local128 < this.anIntArrayArray3[local38].length; local128++) {
				this.anIntArrayArray3[local38][local128] = local11.method2146();
			}
		}
	}
}
