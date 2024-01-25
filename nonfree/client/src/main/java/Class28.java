import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class28 {

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
	public int anInt874 = 2048;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	public int anInt873 = 2048;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
	public int anInt877 = 0;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	public int anInt876 = 0;

	static {
		new Class67("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!rt;I)V")
	public void method832(@OriginalArg(0) Class3_Sub27 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7548();
			if (local12 == 0) {
				return;
			}
			this.method834(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLclient!rt;I)V")
	private void method834(@OriginalArg(1) Class3_Sub27 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt877 = arg0.method7548();
		} else if (arg1 == 2) {
			this.anInt873 = arg0.method7591();
		} else if (arg1 == 3) {
			this.anInt874 = arg0.method7591();
		} else if (arg1 == 4) {
			this.anInt876 = arg0.method7604();
		}
	}
}
