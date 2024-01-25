import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
	public int anInt3240 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!lk;)V")
	public void method2944(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4240();
			if (local13 == 0) {
				return;
			}
			this.method2946(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!lk;II)V")
	private void method2946(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt3240 = arg0.method4245();
		}
	}
}
