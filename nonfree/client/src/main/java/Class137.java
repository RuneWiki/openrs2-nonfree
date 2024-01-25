import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class137 {

	@OriginalMember(owner = "client!he", name = "e", descriptor = "[I")
	public int[] anIntArray376;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "I")
	public int anInt3967 = -1;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "I")
	public int anInt3968 = -1;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!eh;I)V")
	public void method3460(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6015();
			if (local13 == 0) {
				return;
			}
			this.method3461(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!eh;II)V")
	private void method3461(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3968 = arg0.method5982();
		} else if (arg1 == 2) {
			this.anIntArray376 = new int[arg0.method6015()];
			for (@Pc(31) int local31 = 0; local31 < this.anIntArray376.length; local31++) {
				this.anIntArray376[local31] = arg0.method5982();
			}
		} else if (arg1 == 3) {
			this.anInt3967 = arg0.method6015();
		}
	}
}
