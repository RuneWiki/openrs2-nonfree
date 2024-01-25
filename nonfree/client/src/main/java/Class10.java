import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class10 {

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
	public int anInt79;

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
	public int anInt80;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
	public int anInt84;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!jc;Z)V")
	public void method102(@OriginalArg(0) Class14_Sub21 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7695(103);
			if (local3 == 0) {
				return;
			}
			this.method104(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILclient!jc;Z)V")
	private void method104(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static223.method3822(arg1.method7720());
		} else if (arg0 == 3) {
			this.anInt80 = arg1.method7717(-1978450544);
			this.anInt84 = arg1.method7695(94);
			this.anInt79 = arg1.method7695(103);
		}
	}
}
