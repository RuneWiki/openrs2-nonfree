import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class182 {

	@OriginalMember(owner = "client!si", name = "i", descriptor = "[I")
	public int[] anIntArray455;

	@OriginalMember(owner = "client!si", name = "h", descriptor = "I")
	public int anInt5868 = -1;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "I")
	public int anInt5863 = -1;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IILclient!ef;)V")
	public void method4936(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		while (true) {
			@Pc(11) int local11 = arg1.method3124();
			if (local11 == 0) {
				return;
			}
			this.method4937(local11, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIILclient!ef;)V")
	private void method4937(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub12 arg2) {
		if (arg0 == 1) {
			this.anInt5868 = arg2.method3104();
		} else if (arg0 == 2) {
			this.anIntArray455 = new int[arg2.method3124()];
			for (@Pc(40) int local40 = 0; local40 < this.anIntArray455.length; local40++) {
				this.anIntArray455[local40] = arg2.method3104();
			}
		} else if (arg0 == 3) {
			this.anInt5863 = arg2.method3124();
		}
	}
}
