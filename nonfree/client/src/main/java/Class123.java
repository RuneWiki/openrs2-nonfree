import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class123 {

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
	public int anInt3045 = 0;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!dga;I)V")
	private void method2614(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub14 arg1) {
		if (arg0 == 5) {
			this.anInt3045 = arg1.method6006();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!dga;I)V")
	public void method2616(@OriginalArg(0) Class6_Sub14 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method6041();
			if (local16 == 0) {
				return;
			}
			this.method2614(local16, arg0);
		}
	}
}
