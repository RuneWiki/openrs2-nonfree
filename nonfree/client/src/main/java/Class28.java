import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class28 {

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
	public int anInt1017;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
	public int anInt1022;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
	public int anInt1023;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!lf;B)V")
	public void method755(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3440();
			if (local5 == 0) {
				return;
			}
			this.method756(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILclient!lf;)V")
	private void method756(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt1023 = arg1.method3401();
			this.anInt1017 = arg1.method3440();
			this.anInt1022 = arg1.method3440();
		}
	}
}
