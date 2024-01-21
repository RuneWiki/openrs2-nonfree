import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class5_Sub1_Sub7 extends Class5_Sub1 {

	@OriginalMember(owner = "client!gb", name = "ib", descriptor = "I")
	public int anInt1020 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!qe;)V")
	public void method732(@OriginalArg(1) Class5_Sub11 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1546();
			if (local14 == 0) {
				return;
			}
			this.method740(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!qe;II)V")
	private void method740(@OriginalArg(0) Class5_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt1020 = arg0.method1543();
		}
	}
}
