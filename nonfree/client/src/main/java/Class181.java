import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class181 {

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	public int anInt6260 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method5249(@OriginalArg(0) Class6_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8246();
			if (local9 == 0) {
				return;
			}
			this.method5252(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!ji;I)V")
	private void method5252(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 5) {
			this.anInt6260 = arg1.method8220();
		}
	}
}
