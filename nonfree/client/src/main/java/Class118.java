import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class118 {

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
	public int anInt3920 = 0;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ie;I)V")
	public void method3183(@OriginalArg(0) Class3_Sub26 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method6814();
			if (local8 == 0) {
				return;
			}
			this.method3185(local8, arg0);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILclient!ie;)V")
	private void method3185(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 5) {
			this.anInt3920 = arg1.method6811();
		}
	}
}
