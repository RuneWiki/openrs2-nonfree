import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class124 {

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "I")
	public int anInt3426;

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "Z")
	public boolean aBoolean220;

	@OriginalMember(owner = "client!gea", name = "e", descriptor = "I")
	public int anInt3428;

	@OriginalMember(owner = "client!gea", name = "h", descriptor = "I")
	public int anInt3431;

	@OriginalMember(owner = "client!gea", name = "i", descriptor = "I")
	public int anInt3432;

	@OriginalMember(owner = "client!gea", name = "p", descriptor = "I")
	public int anInt3436;

	@OriginalMember(owner = "client!gea", name = "k", descriptor = "I")
	public int anInt3433 = 8;

	@OriginalMember(owner = "client!gea", name = "f", descriptor = "I")
	public int anInt3429 = 16777215;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILclient!sl;I)V")
	private void method3083(@OriginalArg(1) Class3_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3433 = arg0.method4221();
		} else if (arg1 == 2) {
			this.aBoolean220 = true;
		} else if (arg1 == 3) {
			this.anInt3426 = arg0.method4209();
			this.anInt3436 = arg0.method4209();
			this.anInt3428 = arg0.method4209();
		} else if (arg1 == 4) {
			this.anInt3432 = arg0.method4225();
		} else if (arg1 == 5) {
			this.anInt3431 = arg0.method4221();
		} else if (arg1 == 6) {
			this.anInt3429 = arg0.method4204();
			return;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!sl;I)V")
	public void method3084(@OriginalArg(0) Class3_Sub3 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4225();
			if (local13 == 0) {
				return;
			}
			this.method3083(arg0, local13);
		}
	}
}
