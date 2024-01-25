import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class39 {

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
	private int anInt741;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
	public int anInt742;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!br;")
	public Class29 aClass29_2;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	public int anInt743;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Lclient!ul;")
	public synchronized Class246 method609() {
		@Pc(13) Class246 local13 = (Class246) this.aClass29_2.aClass126_6.method2822((long) this.anInt741);
		if (local13 != null) {
			return local13;
		}
		local13 = Static469.method5145(this.aClass29_2.aClass178_14, this.anInt741, 0);
		if (local13 != null) {
			this.aClass29_2.aClass126_6.method2824((long) this.anInt741, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method612(@OriginalArg(0) Class7_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3981();
			if (local5 == 0) {
				return;
			}
			this.method613(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!gk;IZ)V")
	private void method613(@OriginalArg(0) Class7_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt741 = arg0.method3943();
		} else if (arg1 == 2) {
			this.anInt742 = arg0.method3981();
			this.anInt743 = arg0.method3981();
		}
	}
}
