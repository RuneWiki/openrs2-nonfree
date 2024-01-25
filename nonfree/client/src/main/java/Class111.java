import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class111 {

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
	public int anInt3665;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
	public int anInt3667;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
	public int anInt3669;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
	public int anInt3672;

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
	public int anInt3673;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "Z")
	public boolean aBoolean231;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
	public int anInt3668 = 8;

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
	public int anInt3670 = 16777215;

	static {
		new Class114("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!gw;I)V")
	public void method3278(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3043();
			if (local11 == 0) {
				return;
			}
			this.method3280(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IBLclient!gw;)V")
	private void method3280(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt3668 = arg1.method3056();
		} else if (arg0 == 2) {
			this.aBoolean231 = true;
		} else if (arg0 == 3) {
			this.anInt3673 = arg1.method3058();
			this.anInt3665 = arg1.method3058();
			this.anInt3669 = arg1.method3058();
		} else if (arg0 == 4) {
			this.anInt3667 = arg1.method3043();
			return;
		} else if (arg0 == 5) {
			this.anInt3672 = arg1.method3056();
			return;
		} else if (arg0 == 6) {
			this.anInt3670 = arg1.method3039();
			return;
		}
	}
}
