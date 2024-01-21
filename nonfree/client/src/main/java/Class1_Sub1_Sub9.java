import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!le", name = "fb", descriptor = "I")
	public int anInt1520 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BILclient!id;)V")
	private void method1127(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0 == 2) {
			this.anInt1520 = arg1.method1842();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!id;B)V")
	public void method1128(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1837();
			if (local13 == 0) {
				return;
			}
			this.method1127(local13, arg0);
		}
	}
}
