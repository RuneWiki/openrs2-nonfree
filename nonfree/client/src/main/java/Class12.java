import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	private int anInt576;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	private int anInt577;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(ILclient!mb;)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt577 = arg1.method468();
			this.anIntArray157 = new int[this.anInt577];
			this.anIntArrayArray11 = new int[this.anInt577][];
			if (arg0 != this.anInt576) {
				throw new NullPointerException();
			}
			for (@Pc(27) int local27 = 0; local27 < this.anInt577; local27++) {
				this.anIntArray157[local27] = arg1.method468();
			}
			for (@Pc(42) int local42 = 0; local42 < this.anInt577; local42++) {
				@Pc(47) int local47 = arg1.method468();
				this.anIntArrayArray11[local42] = new int[local47];
				for (@Pc(55) int local55 = 0; local55 < local47; local55++) {
					this.anIntArrayArray11[local42][local55] = arg1.method468();
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("85988, " + arg0 + ", " + arg1 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}
}
