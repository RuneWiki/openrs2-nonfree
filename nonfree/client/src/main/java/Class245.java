import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class245 {

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
	public static int anInt7064 = 0;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_43 = new Class135();

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_146 = new Class79("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "[I")
	public int[] anIntArray484;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
	public int anInt7059 = -1;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
	public int anInt7065 = -1;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!bt;II)V", line = 4)
	private void method6312(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt7059 = arg0.method4830();
		} else if (arg1 == 2) {
			this.anIntArray484 = new int[arg0.method4816()];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray484.length; local19++) {
				this.anIntArray484[local19] = arg0.method4830();
			}
		} else if (arg1 == 3) {
			this.anInt7065 = arg0.method4816();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!bt;B)V", line = 75)
	public void method6316(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4816();
			if (local5 == 0) {
				return;
			}
			this.method6312(arg0, local5);
		}
	}
}
