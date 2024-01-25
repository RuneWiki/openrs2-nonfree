import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class1_Sub4_Sub15 extends Class1_Sub4 {

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "Ljava/lang/String;")
	public String aString31;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
	public int anInt3392;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "Z")
	public boolean aBoolean326 = true;

	static {
		new Class34("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!bg;I)V")
	private void method3093(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static29.method765(arg1.method4558());
		} else if (arg0 == 2) {
			this.anInt3392 = arg1.method4545();
		} else if (arg0 == 4) {
			this.aBoolean326 = false;
		} else if (arg0 == 5) {
			this.aString31 = arg1.method4534();
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Z")
	public boolean method3096() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!bg;)V")
	public void method3097(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method4532();
			if (local12 == 0) {
				return;
			}
			this.method3093(local12, arg0);
		}
	}
}
