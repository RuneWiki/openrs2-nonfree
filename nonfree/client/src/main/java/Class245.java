import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class245 {

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	public int anInt7026 = 0;

	static {
		new Class306("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ge;II)V")
	private void method5879(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt7026 = arg0.method3967();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ge;B)V")
	public void method5881(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method3922();
			if (local10 == 0) {
				return;
			}
			this.method5879(arg0, local10);
		}
	}
}
