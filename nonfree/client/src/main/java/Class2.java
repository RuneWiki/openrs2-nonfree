import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class2 {

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "[I")
	public int[] anIntArray1;

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
	public int anInt5 = -1;

	@OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
	public int anInt12 = -1;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!wq;I)V")
	public void method21(@OriginalArg(0) Class5_Sub36 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7291();
			if (local5 == 0) {
				return;
			}
			this.method24(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IZLclient!wq;)V")
	private void method24(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		if (arg0 == 1) {
			this.anInt12 = arg1.method7333();
		} else if (arg0 == 2) {
			this.anIntArray1 = new int[arg1.method7291()];
			for (@Pc(48) int local48 = 0; local48 < this.anIntArray1.length; local48++) {
				this.anIntArray1[local48] = arg1.method7333();
			}
		} else if (arg0 == 3) {
			this.anInt5 = arg1.method7291();
			return;
		}
	}
}
