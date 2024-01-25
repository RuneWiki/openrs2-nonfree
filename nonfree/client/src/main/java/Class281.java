import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pga")
public final class Class281 {

	@OriginalMember(owner = "client!pga", name = "e", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!pga", name = "h", descriptor = "I")
	public int anInt7362;

	@OriginalMember(owner = "client!pga", name = "l", descriptor = "Ljava/lang/String;")
	public String aString92;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "Z")
	public boolean aBoolean526 = true;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILclient!dt;B)V")
	private void method6169(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static363.method8911(arg1.method7960());
		} else if (arg0 == 2) {
			this.anInt7362 = arg1.method7895();
		} else if (arg0 == 4) {
			this.aBoolean526 = false;
		} else if (arg0 == 5) {
			this.aString92 = arg1.method7922();
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)Z")
	public boolean method6170() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BLclient!dt;)V")
	public void method6172(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7954();
			if (local5 == 0) {
				return;
			}
			this.method6169(local5, arg0);
		}
	}
}
