import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
	public int anInt1671;

	@OriginalMember(owner = "client!kc", name = "gb", descriptor = "I")
	public int anInt1674;

	@OriginalMember(owner = "client!kc", name = "mb", descriptor = "I")
	public int anInt1677;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!fe;)V")
	public void method980(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1410();
			if (local10 == 0) {
				return;
			}
			this.method981(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!fe;)V")
	private void method981(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt1671 = arg1.method1396();
			this.anInt1674 = arg1.method1410();
			this.anInt1677 = arg1.method1410();
		}
	}
}
