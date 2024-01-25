import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class131 {

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	public int anInt3776;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	private int anInt3777;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
	public int anInt3779;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Lclient!dr;")
	public Class56 method3413() {
		@Pc(11) Class56 local11 = (Class56) Static138.aClass103_27.method2682((long) this.anInt3777);
		if (local11 != null) {
			return local11;
		}
		local11 = Static358.method1307(Static154.aClass180_42, this.anInt3777, 0);
		if (local11 != null) {
			Static138.aClass103_27.method2687(local11, (long) this.anInt3777);
		}
		return local11;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!ap;II)V")
	public void method3417(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(8) int local8 = arg0.method2772();
			if (local8 == 0) {
				return;
			}
			this.method3419(arg1, arg0, local8);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!ap;II)V")
	private void method3419(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt3777 = arg1.method2764();
		} else if (arg2 == 2) {
			this.anInt3779 = arg1.method2772();
			this.anInt3776 = arg1.method2772();
		}
	}
}
