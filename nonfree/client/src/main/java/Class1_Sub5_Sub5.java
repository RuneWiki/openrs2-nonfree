import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class1_Sub5_Sub5 extends Class1_Sub5 {

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
	public int anInt2045 = 0;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ug;Z)V")
	public void method1710(@OriginalArg(0) Class1_Sub28 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method5337();
			if (local16 == 0) {
				return;
			}
			this.method1711(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!ug;I)V")
	private void method1711(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub28 arg1) {
		if (arg0 == 2) {
			this.anInt2045 = arg1.method5335();
		}
	}
}
