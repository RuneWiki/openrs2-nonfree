import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class91 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	public int anInt3503;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
	public int anInt3507;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
	public int anInt3510;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!pg;II)V")
	private void method2825(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3503 = arg0.method2178();
			this.anInt3507 = arg0.method2142();
			this.anInt3510 = arg0.method2142();
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!pg;)V")
	public void method2827(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(20) int local20 = arg0.method2142();
			if (local20 == 0) {
				return;
			}
			this.method2825(arg0, local20);
		}
	}
}
