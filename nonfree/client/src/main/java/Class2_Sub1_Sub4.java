import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
	public int anInt574 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!kd;)V")
	public void method433(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1534();
			if (local15 == 0) {
				return;
			}
			this.method436(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!kd;BI)V")
	private void method436(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt574 = arg0.method1557();
		}
	}
}
