import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class59 {

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public int anInt1323 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ef;II)V")
	private void method1484(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1323 = arg0.method3104();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ef;)V")
	public void method1485(@OriginalArg(1) Class2_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3124();
			if (local5 == 0) {
				return;
			}
			this.method1484(arg0, local5);
		}
	}
}
