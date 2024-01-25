import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class118 {

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
	public int anInt3535 = 1;

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
	public int anInt3542 = 2;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
	public int anInt3536 = -1;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
	public int anInt3543 = 64;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "Z")
	public boolean aBoolean324 = false;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
	public int anInt3538 = 64;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "Z")
	public boolean aBoolean323 = false;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILclient!iv;)V")
	public void method2922(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method2490();
			if (local9 == 0) {
				return;
			}
			this.method2923(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!iv;III)V")
	private void method2923(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt3536 = arg0.method2536();
			if (this.anInt3536 == 65535) {
				this.anInt3536 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt3538 = arg0.method2536() + 1;
			this.anInt3543 = arg0.method2536() + 1;
		} else if (arg1 == 3) {
			arg0.method2542();
		} else if (arg1 == 4) {
			this.anInt3542 = arg0.method2490();
		} else if (arg1 == 5) {
			this.anInt3535 = arg0.method2490();
		} else if (arg1 == 6) {
			this.aBoolean323 = true;
		} else if (arg1 == 7) {
			this.aBoolean324 = true;
		}
	}
}
