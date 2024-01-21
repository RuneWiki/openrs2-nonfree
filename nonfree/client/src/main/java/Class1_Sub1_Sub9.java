import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
	public int anInt2122 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!fa;I)V")
	public void method1567(@OriginalArg(0) Class1_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1234();
			if (local5 == 0) {
				return;
			}
			this.method1570(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!fa;I)V")
	private void method1570(@OriginalArg(1) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt2122 = arg0.method1280();
		}
	}
}
