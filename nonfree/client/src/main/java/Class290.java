import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class290 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
	private int anInt8146;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "Lclient!oha;")
	public Class253 aClass253_1;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
	public int anInt8147;

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
	public int anInt8153;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!jp;II)V")
	private void method7119(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8146 = arg0.method8593();
		} else if (arg1 == 2) {
			this.anInt8153 = arg0.method8632();
			this.anInt8147 = arg0.method8632();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!jp;I)V")
	public void method7121(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8632();
			if (local17 == 0) {
				return;
			}
			this.method7119(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Lclient!eu;")
	public synchronized Class97 method7122() {
		@Pc(13) Class97 local13 = (Class97) this.aClass253_1.aClass165_49.method4389((long) this.anInt8146);
		if (local13 != null) {
			return local13;
		}
		local13 = Static682.method2754(this.aClass253_1.aClass15_111, this.anInt8146, 0);
		if (local13 != null) {
			this.aClass253_1.aClass165_49.method4392(local13, (long) this.anInt8146);
		}
		return local13;
	}
}
