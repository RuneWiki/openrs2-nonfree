import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class134 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	public int anInt3423;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "I")
	public int anInt3425;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "I")
	public int anInt3427;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BLclient!ha;)V")
	public void method3067(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3111();
			if (local15 == 0) {
				return;
			}
			this.method3068(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IILclient!ha;)V")
	private void method3068(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt3427 = arg1.method3108();
			this.anInt3425 = arg1.method3111();
			this.anInt3423 = arg1.method3111();
		}
	}
}
