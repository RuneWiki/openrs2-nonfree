import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class183 {

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
	public int anInt5819;

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
	private int anInt5820;

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
	public int anInt5822;

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "Lclient!ff;")
	public Class88 aClass88_2;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!rt;I)V")
	public void method4852(@OriginalArg(0) Class3_Sub27 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7548();
			if (local13 == 0) {
				return;
			}
			this.method4853(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!rt;IZ)V")
	private void method4853(@OriginalArg(0) Class3_Sub27 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5820 = arg0.method7591();
		} else if (arg1 == 2) {
			this.anInt5819 = arg0.method7548();
			this.anInt5822 = arg0.method7548();
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)Lclient!af;")
	public synchronized Class9 method4855() {
		@Pc(18) Class9 local18 = (Class9) this.aClass88_2.aClass125_20.method3512((long) this.anInt5820);
		if (local18 != null) {
			return local18;
		}
		local18 = Static551.method531(this.aClass88_2.aClass161_26, this.anInt5820, 0);
		if (local18 != null) {
			this.aClass88_2.aClass125_20.method3519((long) this.anInt5820, local18);
		}
		return local18;
	}
}
