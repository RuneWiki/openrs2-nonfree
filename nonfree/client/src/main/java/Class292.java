import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class292 {

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
	public int anInt8185 = 0;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
	public int anInt8186 = 0;

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
	public int anInt8189 = 2048;

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
	public int anInt8187 = 2048;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLclient!ie;)V")
	public void method6426(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6814();
			if (local5 == 0) {
				return;
			}
			this.method6428(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILclient!ie;I)V")
	private void method6428(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8186 = arg0.method6814();
		} else if (arg1 == 2) {
			this.anInt8189 = arg0.method6811();
		} else if (arg1 == 3) {
			this.anInt8187 = arg0.method6811();
		} else if (arg1 == 4) {
			this.anInt8185 = arg0.method6789();
		}
	}
}
