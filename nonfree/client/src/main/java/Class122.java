import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class122 {

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "[I")
	public int[] anIntArray261;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	public int anInt3084 = -1;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
	public int anInt3083 = -1;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!hw;I)V")
	private void method2541(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt3084 = arg1.method6148();
		} else if (arg0 == 2) {
			this.anIntArray261 = new int[arg1.method6138()];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray261.length; local21++) {
				this.anIntArray261[local21] = arg1.method6148();
			}
		} else if (arg0 == 3) {
			this.anInt3083 = arg1.method6138();
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLclient!hw;)V")
	public void method2542(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6138();
			if (local5 == 0) {
				return;
			}
			this.method2541(local5, arg0);
		}
	}
}
