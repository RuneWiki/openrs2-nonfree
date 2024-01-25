import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class3_Sub10_Sub11 extends Class3_Sub10 {

	@OriginalMember(owner = "client!kda", name = "u", descriptor = "I")
	public int anInt5041 = 0;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IILclient!rt;)V")
	private void method4225(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 2) {
			this.anInt5041 = arg1.method7591();
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILclient!rt;)V")
	public void method4226(@OriginalArg(1) Class3_Sub27 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7548();
			if (local5 == 0) {
				return;
			}
			this.method4225(local5, arg0);
		}
	}
}
