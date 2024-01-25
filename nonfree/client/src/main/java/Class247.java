import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class247 {

	@OriginalMember(owner = "client!op", name = "h", descriptor = "I")
	private int anInt7645;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "I")
	public int anInt7646;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "Lclient!aq;")
	public Class19 aClass19_2;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "I")
	public int anInt7648;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)Lclient!tw;")
	public synchronized Class331 method6451() {
		@Pc(18) Class331 local18 = (Class331) this.aClass19_2.aClass94_3.method2960((long) this.anInt7645);
		if (local18 != null) {
			return local18;
		}
		local18 = Static655.method7892(this.aClass19_2.aClass223_7, this.anInt7645, 0);
		if (local18 != null) {
			this.aClass19_2.aClass94_3.method2963((long) this.anInt7645, local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!ji;I)V")
	private void method6454(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt7645 = arg1.method8220();
		} else if (arg0 == 2) {
			this.anInt7648 = arg1.method8246();
			this.anInt7646 = arg1.method8246();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLclient!ji;)V")
	public void method6455(@OriginalArg(1) Class6_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8246();
			if (local9 == 0) {
				return;
			}
			this.method6454(local9, arg0);
		}
	}
}
