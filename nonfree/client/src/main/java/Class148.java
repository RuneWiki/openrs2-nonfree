import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class148 {

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
	public int anInt3991;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
	public int anInt3992;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
	public int anInt3993;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBLclient!dt;)V")
	private void method3415(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt3993 = arg1.method7951();
			this.anInt3991 = arg1.method7954();
			this.anInt3992 = arg1.method7954();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLclient!dt;)V")
	public void method3417(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7954();
			if (local5 == 0) {
				return;
			}
			this.method3415(local5, arg0);
		}
	}
}
