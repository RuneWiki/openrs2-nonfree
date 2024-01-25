import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tha")
public final class Class351 {

	@OriginalMember(owner = "client!tha", name = "d", descriptor = "I")
	public int anInt9015;

	@OriginalMember(owner = "client!tha", name = "f", descriptor = "I")
	public int anInt9017;

	@OriginalMember(owner = "client!tha", name = "h", descriptor = "I")
	public int anInt9019;

	@OriginalMember(owner = "client!tha", name = "k", descriptor = "I")
	public int anInt9021;

	@OriginalMember(owner = "client!tha", name = "g", descriptor = "I")
	public int anInt9022;

	@OriginalMember(owner = "client!tha", name = "l", descriptor = "Z")
	public boolean aBoolean603;

	@OriginalMember(owner = "client!tha", name = "e", descriptor = "I")
	public int anInt9014 = 8;

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "I")
	public int anInt9018 = 16777215;

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!wq;I)V")
	public void method7757(@OriginalArg(0) Class5_Sub36 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7291();
			if (local9 == 0) {
				return;
			}
			this.method7759(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IBLclient!wq;)V")
	private void method7759(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		if (arg0 == 1) {
			this.anInt9014 = arg1.method7333();
		} else if (arg0 == 2) {
			this.aBoolean603 = true;
		} else if (arg0 == 3) {
			this.anInt9017 = arg1.method7303();
			this.anInt9021 = arg1.method7303();
			this.anInt9022 = arg1.method7303();
		} else if (arg0 == 4) {
			this.anInt9019 = arg1.method7291();
		} else if (arg0 == 5) {
			this.anInt9015 = arg1.method7333();
		} else if (arg0 == 6) {
			this.anInt9018 = arg1.method7331();
		}
	}
}
