import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class150 {

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "I")
	public int anInt3875 = 0;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!un;)V")
	public void method3463(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method4905();
			if (local10 == 0) {
				return;
			}
			this.method3466(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IILclient!un;)V")
	private void method3466(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 5) {
			this.anInt3875 = arg1.method4936();
		}
	}
}
