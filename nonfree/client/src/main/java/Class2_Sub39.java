import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class2_Sub39 extends Class2 {

	@OriginalMember(owner = "client!sm", name = "A", descriptor = "I")
	public final int anInt5371;

	@OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
	public final int anInt5370;

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "[[I")
	public final int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "[I")
	public final int[] anIntArray1068;

	@OriginalMember(owner = "client!sm", name = "z", descriptor = "[I")
	public final int[] anIntArray1069;

	@OriginalMember(owner = "client!sm", name = "B", descriptor = "[Z")
	public final boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt5371 = arg0;
		@Pc(9) Class2_Sub16 local9 = new Class2_Sub16(arg1);
		this.anInt5370 = local9.method5350();
		this.anIntArrayArray42 = new int[this.anInt5370][];
		this.anIntArray1068 = new int[this.anInt5370];
		this.anIntArray1069 = new int[this.anInt5370];
		this.aBooleanArray27 = new boolean[this.anInt5370];
		for (@Pc(36) int local36 = 0; local36 < this.anInt5370; local36++) {
			this.anIntArray1068[local36] = local9.method5350();
		}
		for (@Pc(55) int local55 = 0; local55 < this.anInt5370; local55++) {
			this.aBooleanArray27[local55] = local9.method5350() == 1;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt5370; local81++) {
			this.anIntArray1069[local81] = local9.method5312();
		}
		for (@Pc(96) int local96 = 0; local96 < this.anInt5370; local96++) {
			this.anIntArrayArray42[local96] = new int[local9.method5350()];
		}
		for (@Pc(112) int local112 = 0; local112 < this.anInt5370; local112++) {
			for (@Pc(115) int local115 = 0; local115 < this.anIntArrayArray42[local112].length; local115++) {
				this.anIntArrayArray42[local112][local115] = local9.method5350();
			}
		}
	}
}
