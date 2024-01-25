import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class27 {

	@OriginalMember(owner = "client!be", name = "g", descriptor = "I")
	public int anInt397 = 64;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "I")
	public int anInt395 = 1;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Z")
	public boolean aBoolean65 = false;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "I")
	public int anInt402 = 2;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "I")
	public int anInt403 = -1;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "I")
	public int anInt399 = 64;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!wm;III)V")
	private void method388(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt403 = arg0.method2896();
			if (this.anInt403 == 65535) {
				this.anInt403 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt399 = arg0.method2896() + 1;
			this.anInt397 = arg0.method2896() + 1;
		} else if (arg2 == 3) {
			arg0.method2917();
		} else if (arg2 == 4) {
			this.anInt402 = arg0.method2915();
		} else if (arg2 == 5) {
			this.anInt395 = arg0.method2915();
		} else if (arg2 == 6) {
			this.aBoolean66 = true;
		} else if (arg2 == 7) {
			this.aBoolean65 = true;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILclient!wm;)V")
	public void method389(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method2915();
			if (local5 == 0) {
				return;
			}
			this.method388(arg1, arg0, local5);
		}
	}
}
