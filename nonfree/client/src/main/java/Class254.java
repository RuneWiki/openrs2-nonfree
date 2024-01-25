import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class254 {

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
	public int anInt7124 = 0;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BILclient!si;)V")
	private void method5626(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		if (arg0 == 5) {
			this.anInt7124 = arg1.method5500();
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!si;B)V")
	public void method5627(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5495();
			if (local13 == 0) {
				return;
			}
			this.method5626(local13, arg0);
		}
	}
}
