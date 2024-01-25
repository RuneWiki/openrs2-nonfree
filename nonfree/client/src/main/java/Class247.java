import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class247 {

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
	public int anInt6991 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!nj;IB)V")
	private void method5698(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt6991 = arg0.method4083();
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!nj;B)V")
	public void method5699(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4096();
			if (local5 == 0) {
				return;
			}
			this.method5698(arg0, local5);
		}
	}
}
