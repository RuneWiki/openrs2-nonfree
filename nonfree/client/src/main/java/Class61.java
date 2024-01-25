import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class61 {

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
	public int anInt2098;

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "Lclient!mm;")
	public Class210 aClass210_1;

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
	private int anInt2105;

	@OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
	public int anInt2107;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)Lclient!wt;")
	public synchronized Class365 method1825() {
		@Pc(13) Class365 local13 = (Class365) this.aClass210_1.aClass342_126.method7684((long) this.anInt2105);
		if (local13 != null) {
			return local13;
		}
		local13 = Static607.method8163(this.aClass210_1.aClass284_102, this.anInt2105, 0);
		if (local13 != null) {
			this.aClass210_1.aClass342_126.method7683(local13, (long) this.anInt2105);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IILclient!ie;)V")
	private void method1826(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt2105 = arg1.method6811();
		} else if (arg0 == 2) {
			this.anInt2098 = arg1.method6814();
			this.anInt2107 = arg1.method6814();
			return;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!ie;B)V")
	public void method1829(@OriginalArg(0) Class3_Sub26 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6814();
			if (local11 == 0) {
				return;
			}
			this.method1826(local11, arg0);
		}
	}
}
