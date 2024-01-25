import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rla")
public final class Class329 {

	@OriginalMember(owner = "client!rla", name = "c", descriptor = "I")
	public int anInt8625;

	@OriginalMember(owner = "client!rla", name = "i", descriptor = "C")
	public char aChar6;

	@OriginalMember(owner = "client!rla", name = "l", descriptor = "I")
	public int anInt8631;

	@OriginalMember(owner = "client!rla", name = "j", descriptor = "I")
	public int anInt8632;

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "(Lclient!ika;B)V")
	public void method7368(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2048(255);
			if (local5 == 0) {
				return;
			}
			this.method7369(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "(IILclient!ika;)V")
	private void method7369(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.aChar6 = Static309.method4582(arg1.method2022());
		} else if (arg0 == 2) {
			this.anInt8631 = arg1.method2028(-14795);
			this.anInt8625 = arg1.method2048(255);
			this.anInt8632 = arg1.method2048(255);
		}
	}
}
