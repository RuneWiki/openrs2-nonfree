import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class365 {

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
	public int anInt9924;

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
	private int anInt9926;

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
	public int anInt9929;

	@OriginalMember(owner = "client!vw", name = "j", descriptor = "Lclient!dea;")
	public Class67 aClass67_2;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)Lclient!oia;")
	public synchronized Class251 method8427() {
		@Pc(18) Class251 local18 = (Class251) this.aClass67_2.aClass136_17.method3134((long) this.anInt9926);
		if (local18 != null) {
			return local18;
		}
		local18 = Static656.method6331(this.aClass67_2.aClass343_53, this.anInt9926, 0);
		if (local18 != null) {
			this.aClass67_2.aClass136_17.method3135(local18, (long) this.anInt9926);
		}
		return local18;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILclient!dc;)V")
	public void method8429(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method5633();
			if (local12 == 0) {
				return;
			}
			this.method8430(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILclient!dc;I)V")
	private void method8430(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt9926 = arg1.method5610();
		} else if (arg0 == 2) {
			this.anInt9924 = arg1.method5633();
			this.anInt9929 = arg1.method5633();
		}
	}
}
