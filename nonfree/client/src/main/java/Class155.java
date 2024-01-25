import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class155 {

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
	public int anInt4302;

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "Z")
	public boolean aBoolean287 = true;

	static {
		new Class182("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BILclient!nn;)V")
	private void method3448(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static276.method2522(arg1.method2460());
		} else if (arg0 == 2) {
			this.anInt4302 = arg1.method2459();
		} else if (arg0 == 4) {
			this.aBoolean287 = false;
		} else if (arg0 == 5) {
			this.aString37 = arg1.method2478();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!nn;I)V")
	public void method3451(@OriginalArg(0) Class10_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2502();
			if (local9 == 0) {
				return;
			}
			this.method3448(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)Z")
	public boolean method3452() {
		return this.aChar5 == 's';
	}
}
