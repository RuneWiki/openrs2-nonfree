import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class1_Sub3_Sub14 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pt", name = "G", descriptor = "I")
	public int anInt5268 = 0;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLclient!dh;)V")
	public void method4100(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method4463();
			if (local10 == 0) {
				return;
			}
			this.method4101(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!dh;I)V")
	private void method4101(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 2) {
			this.anInt5268 = arg1.method4485();
		}
	}
}
