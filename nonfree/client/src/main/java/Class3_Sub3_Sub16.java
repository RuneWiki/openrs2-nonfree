import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class3_Sub3_Sub16 extends Class3_Sub3 {

	@OriginalMember(owner = "client!so", name = "v", descriptor = "I")
	public int anInt6394 = 0;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!nj;B)V")
	public void method5262(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method4096();
			if (local18 == 0) {
				return;
			}
			this.method5263(local18, arg0);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IILclient!nj;)V")
	private void method5263(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		if (arg0 == 2) {
			this.anInt6394 = arg1.method4083();
		}
	}
}
