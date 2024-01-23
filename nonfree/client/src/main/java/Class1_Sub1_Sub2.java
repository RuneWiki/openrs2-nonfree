import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
	public int anInt368 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZILclient!nc;)V")
	private void method240(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 5) {
			this.anInt368 = arg1.method946();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLclient!nc;)V")
	public void method241(@OriginalArg(1) Class1_Sub9 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method895();
			if (local15 == 0) {
				return;
			}
			this.method240(local15, arg0);
		}
	}
}
