import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
	public final int anInt3446;

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
	private final int anInt3442;

	@OriginalMember(owner = "client!sh", name = "v", descriptor = "[Z")
	private final boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "[[I")
	public final int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!sh", name = "C", descriptor = "[I")
	public final int[] anIntArray322;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3446 = arg0;
		@Pc(11) Class2_Sub2 local11 = new Class2_Sub2(arg1);
		this.anInt3442 = local11.method1698();
		this.aBooleanArray20 = new boolean[this.anInt3442];
		this.anIntArrayArray35 = new int[this.anInt3442][];
		this.anIntArray322 = new int[this.anInt3442];
		for (@Pc(33) int local33 = 0; local33 < this.anInt3442; local33++) {
			this.anIntArray322[local33] = local11.method1698();
		}
		for (@Pc(49) int local49 = 0; local49 < this.anInt3442; local49++) {
			this.aBooleanArray20[local49] = local11.method1698() == 1;
		}
		for (@Pc(74) int local74 = 0; local74 < this.anInt3442; local74++) {
			this.anIntArrayArray35[local74] = new int[local11.method1698()];
		}
		for (@Pc(91) int local91 = 0; local91 < this.anInt3442; local91++) {
			for (@Pc(95) int local95 = 0; local95 < this.anIntArrayArray35[local91].length; local95++) {
				this.anIntArrayArray35[local91][local95] = local11.method1698();
			}
		}
	}
}
