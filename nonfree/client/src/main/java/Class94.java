import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class94 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "Lclient!qs;")
	public Class194 aClass194_1;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "I")
	public int anInt2372;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "I")
	private int anInt2373;

	@OriginalMember(owner = "client!h", name = "p", descriptor = "I")
	public int anInt2379;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)Lclient!ua;")
	public synchronized Class224 method2254() {
		@Pc(13) Class224 local13 = (Class224) this.aClass194_1.aClass154_43.method3751((long) this.anInt2373);
		if (local13 != null) {
			return local13;
		}
		local13 = Static404.method5304(this.aClass194_1.aClass71_72, this.anInt2373, 0);
		if (local13 != null) {
			this.aClass194_1.aClass154_43.method3745((long) this.anInt2373, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!lk;I)V")
	public void method2258(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4240();
			if (local5 == 0) {
				return;
			}
			this.method2261(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!lk;B)V")
	private void method2261(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt2373 = arg1.method4245();
		} else if (arg0 == 2) {
			this.anInt2372 = arg1.method4240();
			this.anInt2379 = arg1.method4240();
		}
	}
}
