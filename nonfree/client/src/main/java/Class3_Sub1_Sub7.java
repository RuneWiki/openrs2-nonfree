import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nc", name = "kb", descriptor = "I")
	public int anInt1684 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!gb;II)V")
	private void method1134(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1684 = arg0.method459();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!gb;)V")
	public void method1135(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method446();
			if (local7 == 0) {
				return;
			}
			this.method1134(arg0, local7);
		}
	}
}
