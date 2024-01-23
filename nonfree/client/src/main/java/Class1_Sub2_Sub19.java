import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "C")
	private char aChar4;

	@OriginalMember(owner = "client!tj", name = "I", descriptor = "Ljava/lang/String;")
	public String aString180;

	@OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
	public int anInt5556;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZLclient!im;)V")
	private void method4329(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static8.method3513(arg1.method2633());
		} else if (arg0 == 2) {
			this.anInt5556 = arg1.method2610();
		} else if (arg0 == 5) {
			this.aString180 = arg1.method2611();
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)Z")
	public boolean method4331() {
		return this.aChar4 == 's';
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!im;I)V")
	public void method4333(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2655();
			if (local5 == 0) {
				return;
			}
			this.method4329(local5, arg0);
		}
	}
}
