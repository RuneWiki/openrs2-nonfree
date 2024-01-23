import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
	public int anInt511;

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
	private int anInt508;

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "[Z")
	private boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "[I")
	public int[] anIntArray87;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt511 = arg0;
		@Pc(11) Class1_Sub9 local11 = new Class1_Sub9(arg1);
		this.anInt508 = local11.method895();
		this.anIntArrayArray12 = new int[this.anInt508][];
		this.aBooleanArray2 = new boolean[this.anInt508];
		this.anIntArray87 = new int[this.anInt508];
		for (@Pc(33) int local33 = 0; local33 < this.anInt508; local33++) {
			this.anIntArray87[local33] = local11.method895();
		}
		for (@Pc(49) int local49 = 0; local49 < this.anInt508; local49++) {
			this.aBooleanArray2[local49] = local11.method895() == 1;
		}
		for (@Pc(74) int local74 = 0; local74 < this.anInt508; local74++) {
			this.anIntArrayArray12[local74] = new int[local11.method895()];
		}
		for (@Pc(91) int local91 = 0; local91 < this.anInt508; local91++) {
			for (@Pc(95) int local95 = 0; local95 < this.anIntArrayArray12[local91].length; local95++) {
				this.anIntArrayArray12[local91][local95] = local11.method895();
			}
		}
	}
}
