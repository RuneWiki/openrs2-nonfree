import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class89 {

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
	public int anInt2051 = 0;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IILclient!kh;)V")
	private void method1663(@OriginalArg(1) int arg0, @OriginalArg(2) Class11_Sub25 arg1) {
		if (arg0 == 5) {
			this.anInt2051 = arg1.method5187();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!kh;B)V")
	public void method1664(@OriginalArg(0) Class11_Sub25 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method5185();
			if (local10 == 0) {
				return;
			}
			this.method1663(local10, arg0);
		}
	}
}
