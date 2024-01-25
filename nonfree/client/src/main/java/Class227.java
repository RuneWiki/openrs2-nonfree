import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class227 {

	@OriginalMember(owner = "client!na", name = "e", descriptor = "[I")
	public int[] anIntArray362;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "I")
	public int anInt6536 = -1;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public int anInt6539 = -1;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ek;I)V")
	public void method5175(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7004();
			if (local5 == 0) {
				return;
			}
			this.method5176(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILclient!ek;)V")
	private void method5176(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt6539 = arg1.method7054();
		} else if (arg0 == 2) {
			this.anIntArray362 = new int[arg1.method7004()];
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray362.length; local24++) {
				this.anIntArray362[local24] = arg1.method7054();
			}
		} else if (arg0 == 3) {
			this.anInt6536 = arg1.method7004();
		}
	}
}
