import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class157 {

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "[I")
	public int[] anIntArray213;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
	public int anInt3996 = -1;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
	public int anInt3994 = -1;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!dh;I)V")
	public void method3193(@OriginalArg(0) Class1_Sub11 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method4463();
			if (local12 == 0) {
				return;
			}
			this.method3194(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BILclient!dh;)V")
	private void method3194(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt3996 = arg1.method4485();
		} else if (arg0 == 2) {
			this.anIntArray213 = new int[arg1.method4463()];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray213.length; local19++) {
				this.anIntArray213[local19] = arg1.method4485();
			}
		} else if (arg0 == 3) {
			this.anInt3994 = arg1.method4463();
		}
	}
}
