import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class311 {

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
	public int anInt8762;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
	public int anInt8764;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
	public int anInt8767;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!jr;Z)V")
	public void method6970(@OriginalArg(0) Class6_Sub12 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6019();
			if (local13 == 0) {
				return;
			}
			this.method6972(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IILclient!jr;)V")
	private void method6972(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt8767 = arg1.method6044();
			this.anInt8764 = arg1.method6019();
			this.anInt8762 = arg1.method6019();
		}
	}
}
