import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class102 {

	@OriginalMember(owner = "client!m", name = "b", descriptor = "[I")
	public int[] anIntArray271;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	public int anInt3304 = -1;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "I")
	public int anInt3305 = -1;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLclient!pi;I)V")
	public void method2608(@OriginalArg(1) Class4_Sub24 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method3110();
			if (local5 == 0) {
				return;
			}
			this.method2611(arg0, arg1, local5);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!pi;III)V")
	private void method2611(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt3304 = arg0.method3085();
		} else if (arg2 == 2) {
			this.anIntArray271 = new int[arg0.method3110()];
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray271.length; local27++) {
				this.anIntArray271[local27] = arg0.method3085();
			}
		} else if (arg2 == 3) {
			this.anInt3305 = arg0.method3110();
		}
	}
}
