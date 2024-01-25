import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class314 {

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
	public int anInt9152;

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
	private int anInt9153;

	@OriginalMember(owner = "client!taa", name = "g", descriptor = "I")
	public int anInt9156;

	@OriginalMember(owner = "client!taa", name = "i", descriptor = "Lclient!ge;")
	public Class110 aClass110_4;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(BLclient!tn;)V")
	public void method7548(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8401();
			if (local5 == 0) {
				return;
			}
			this.method7551(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)Lclient!be;")
	public synchronized Class28 method7549() {
		@Pc(13) Class28 local13 = (Class28) this.aClass110_4.aClass112_19.method3640((long) this.anInt9153);
		if (local13 != null) {
			return local13;
		}
		local13 = Static649.method613(this.aClass110_4.aClass181_37, this.anInt9153, 0);
		if (local13 != null) {
			this.aClass110_4.aClass112_19.method3636((long) this.anInt9153, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILclient!tn;I)V")
	private void method7551(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt9153 = arg1.method8414();
		} else if (arg0 == 2) {
			this.anInt9152 = arg1.method8401();
			this.anInt9156 = arg1.method8401();
		}
	}
}
