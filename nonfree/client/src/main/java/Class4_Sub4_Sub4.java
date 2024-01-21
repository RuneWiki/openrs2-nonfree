import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class4_Sub4_Sub4 extends Class4_Sub4 {

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
	public int anInt1030;

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
	public int anInt1034;

	@OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
	public int anInt1038;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!re;IZ)V")
	private void method696(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1030 = arg0.method1244();
			this.anInt1034 = arg0.method1223();
			this.anInt1038 = arg0.method1223();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!re;I)V")
	public void method697(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1223();
			if (local13 == 0) {
				return;
			}
			this.method696(arg0, local13);
		}
	}
}
