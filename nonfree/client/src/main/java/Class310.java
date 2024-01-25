import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class310 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
	public int anInt9155 = 0;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!rg;B)V")
	public void method7823(@OriginalArg(0) Class6_Sub40 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8604();
			if (local17 == 0) {
				return;
			}
			this.method7824(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILclient!rg;)V")
	private void method7824(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 5) {
			this.anInt9155 = arg1.method8571();
		}
	}
}
