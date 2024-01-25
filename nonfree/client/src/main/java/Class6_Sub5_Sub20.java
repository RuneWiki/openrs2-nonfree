import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class6_Sub5_Sub20 extends Class6_Sub5 {

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
	public int anInt6434 = 0;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!ji;B)V")
	private void method5406(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 2) {
			this.anInt6434 = arg1.method8220();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method5407(@OriginalArg(0) Class6_Sub8 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method8246();
			if (local16 == 0) {
				return;
			}
			this.method5406(local16, arg0);
		}
	}
}
