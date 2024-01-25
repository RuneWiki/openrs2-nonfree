import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class11_Sub43 extends Class11 {

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	public final int anInt6573;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
	public final int anInt6574;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "[I")
	public final int[] anIntArray542;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "[Z")
	public final boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "[[I")
	public final int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
	public final int[] anIntArray543;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I[B)V")
	public Class11_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt6573 = arg0;
		@Pc(11) Class11_Sub25 local11 = new Class11_Sub25(arg1);
		this.anInt6574 = local11.method5185();
		this.anIntArray542 = new int[this.anInt6574];
		this.aBooleanArray27 = new boolean[this.anInt6574];
		this.anIntArrayArray78 = new int[this.anInt6574][];
		this.anIntArray543 = new int[this.anInt6574];
		for (@Pc(38) int local38 = 0; local38 < this.anInt6574; local38++) {
			this.anIntArray543[local38] = local11.method5185();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt6574; local54++) {
			this.aBooleanArray27[local54] = local11.method5185() == 1;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt6574; local81++) {
			this.anIntArray542[local81] = local11.method5187();
		}
		for (@Pc(97) int local97 = 0; local97 < this.anInt6574; local97++) {
			this.anIntArrayArray78[local97] = new int[local11.method5185()];
		}
		for (@Pc(114) int local114 = 0; local114 < this.anInt6574; local114++) {
			for (@Pc(118) int local118 = 0; local118 < this.anIntArrayArray78[local114].length; local118++) {
				this.anIntArrayArray78[local114][local118] = local11.method5185();
			}
		}
	}
}
