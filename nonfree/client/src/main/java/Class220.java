import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class220 {

	@OriginalMember(owner = "client!se", name = "e", descriptor = "[I")
	public int[] anIntArray421;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "I")
	public int anInt6292 = -1;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "I")
	public int anInt6293 = -1;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!md;I)V")
	public void method4992(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3737();
			if (local5 == 0) {
				return;
			}
			this.method4994(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!md;I)V")
	private void method4994(@OriginalArg(1) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6292 = arg0.method3711();
		} else if (arg1 == 2) {
			this.anIntArray421 = new int[arg0.method3737()];
			for (@Pc(37) int local37 = 0; local37 < this.anIntArray421.length; local37++) {
				this.anIntArray421[local37] = arg0.method3711();
			}
		} else if (arg1 == 3) {
			this.anInt6293 = arg0.method3737();
		}
	}
}
