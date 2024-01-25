import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class256 {

	@OriginalMember(owner = "client!or", name = "c", descriptor = "I")
	public int anInt7318;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "I")
	public int anInt7324;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "I")
	public int anInt7325;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BLclient!dc;)V")
	public void method6441(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5633();
			if (local11 == 0) {
				return;
			}
			this.method6443(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!dc;I)V")
	private void method6443(@OriginalArg(1) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7324 = arg0.method5610();
			this.anInt7325 = arg0.method5633();
			this.anInt7318 = arg0.method5633();
		}
	}
}
