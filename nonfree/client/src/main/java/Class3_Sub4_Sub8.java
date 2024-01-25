import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class3_Sub4_Sub8 extends Class3_Sub4 {

	@OriginalMember(owner = "client!gca", name = "w", descriptor = "I")
	public int anInt3511 = 0;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!rba;I)V")
	public void method3003(@OriginalArg(0) Class3_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5322(-71);
			if (local5 == 0) {
				return;
			}
			this.method3006(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!rba;II)V")
	private void method3006(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt3511 = arg0.method5272();
		}
	}
}
