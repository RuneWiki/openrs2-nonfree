import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class87 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	public int anInt1960;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
	public int anInt1964;

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
	public int anInt1968;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!re;B)V")
	public void method1631(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5174();
			if (local14 == 0) {
				return;
			}
			this.method1636(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLclient!re;I)V")
	private void method1636(@OriginalArg(1) Class1_Sub33 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1960 = arg0.method5177();
			this.anInt1964 = arg0.method5174();
			this.anInt1968 = arg0.method5174();
		}
	}
}
