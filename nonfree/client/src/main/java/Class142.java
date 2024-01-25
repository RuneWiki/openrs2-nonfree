import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class142 {

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "[I")
	public int[] anIntArray540;

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
	public int anInt4239 = -1;

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
	public int anInt4236 = -1;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILclient!eb;)V")
	public void method3948(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method3141();
			if (local5 == 0) {
				return;
			}
			this.method3949(local5, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILclient!eb;I)V")
	private void method3949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt4236 = arg1.method3115();
		} else if (arg0 == 2) {
			this.anIntArray540 = new int[arg1.method3141()];
			for (@Pc(31) int local31 = 0; local31 < this.anIntArray540.length; local31++) {
				this.anIntArray540[local31] = arg1.method3115();
			}
		} else if (arg0 == 3) {
			this.anInt4239 = arg1.method3141();
		}
	}
}
