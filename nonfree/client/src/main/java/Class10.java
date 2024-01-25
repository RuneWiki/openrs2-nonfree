import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class10 {

	@OriginalMember(owner = "client!af", name = "e", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "I")
	public int anInt219 = 1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!un;)V")
	public void method174(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4905();
			if (local11 == 0) {
				return;
			}
			this.method175(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLclient!un;I)V")
	private void method175(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static103.method2211(arg0.method4925());
		} else if (arg1 == 2) {
			this.anInt219 = 0;
		}
	}
}
