import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class198 {

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "[I")
	public int[] anIntArray281;

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
	public int anInt5782 = -1;

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
	public int anInt5783 = -1;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILclient!un;)V")
	private void method4884(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt5783 = arg1.method4936();
		} else if (arg0 == 2) {
			this.anIntArray281 = new int[arg1.method4905()];
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray281.length; local27++) {
				this.anIntArray281[local27] = arg1.method4936();
			}
		} else if (arg0 == 3) {
			this.anInt5782 = arg1.method4905();
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!un;Z)V")
	public void method4885(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4905();
			if (local9 == 0) {
				return;
			}
			this.method4884(local9, arg0);
		}
	}
}
