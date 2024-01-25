import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class69 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!fk;")
	public Class86 aClass86_1;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	public int anInt1557;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	public int anInt1558;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
	private int anInt1560;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)Lclient!dt;")
	public synchronized Class63 method1239() {
		@Pc(13) Class63 local13 = (Class63) this.aClass86_1.aClass151_53.method3288((long) this.anInt1560);
		if (local13 != null) {
			return local13;
		}
		local13 = Static457.method1163(this.aClass86_1.aClass109_27, this.anInt1560, 0);
		if (local13 != null) {
			this.aClass86_1.aClass151_53.method3291((long) this.anInt1560, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!ti;)V")
	public void method1240(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4548();
			if (local9 == 0) {
				return;
			}
			this.method1242(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ti;II)V")
	private void method1242(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1560 = arg0.method4498();
		} else if (arg1 == 2) {
			this.anInt1558 = arg0.method4548();
			this.anInt1557 = arg0.method4548();
		}
	}
}
