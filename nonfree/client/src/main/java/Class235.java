import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class235 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Ljava/lang/String;")
	public String aString63;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
	public int anInt7023;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Z")
	public boolean aBoolean491 = true;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILclient!bt;)V")
	private void method5453(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static26.method717(arg1.method6011());
		} else if (arg0 == 2) {
			this.anInt7023 = arg1.method6014();
		} else if (arg0 == 4) {
			this.aBoolean491 = false;
		} else if (arg0 == 5) {
			this.aString63 = arg1.method6027();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Z")
	public boolean method5455() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!bt;I)V")
	public void method5457(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6053();
			if (local3 == 0) {
				return;
			}
			this.method5453(local3, arg0);
		}
	}
}
