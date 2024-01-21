import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
	public int anInt2835 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZLclient!m;)V")
	private void method1944(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 5) {
			this.anInt2835 = arg1.method974();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!m;I)V")
	public void method1945(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method981();
			if (local5 == 0) {
				return;
			}
			this.method1944(local5, arg0);
		}
	}
}
