import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "Z")
	public boolean aBoolean155 = true;

	@OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
	public int anInt3360 = -1;

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
	public int anInt3365 = -1;

	@OriginalMember(owner = "client!qa", name = "bb", descriptor = "I")
	public int anInt3368 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!fj;III)V")
	private void method2586(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt3368 = Static7.method188(arg0.method2745());
		} else if (arg2 == 2) {
			this.anInt3365 = arg0.method2771();
		} else if (arg2 == 3) {
			this.anInt3365 = arg0.method2765();
			if (this.anInt3365 == 65535) {
				this.anInt3365 = -1;
			}
		} else if (arg2 == 5) {
			this.aBoolean155 = false;
		} else if (arg2 == 7) {
			this.anInt3360 = Static7.method188(arg0.method2745());
		} else if (arg2 == 8) {
			Static212.anInt4700 = arg1;
		} else if (arg2 == 9) {
			arg0.method2765();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!fj;)V")
	public void method2588(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		while (true) {
			@Pc(10) int local10 = arg1.method2771();
			if (local10 == 0) {
				return;
			}
			this.method2586(arg1, arg0, local10);
		}
	}
}
