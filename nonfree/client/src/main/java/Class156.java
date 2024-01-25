import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class156 {

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "I")
	public int anInt4386;

	@OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
	public int anInt4387;

	@OriginalMember(owner = "client!ida", name = "i", descriptor = "I")
	public int anInt4390;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IILclient!fd;)V")
	private void method3727(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt4387 = arg1.method6535();
			this.anInt4390 = arg1.method6538();
			this.anInt4386 = arg1.method6538();
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZLclient!fd;)V")
	public void method3728(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6538();
			if (local7 == 0) {
				return;
			}
			this.method3727(local7, arg0);
		}
	}
}
