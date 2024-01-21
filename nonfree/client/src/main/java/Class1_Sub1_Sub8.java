import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
	public int anInt1282 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!jg;B)V")
	public void method782(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method861();
			if (local13 == 0) {
				return;
			}
			this.method784(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILclient!jg;)V")
	private void method784(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 5) {
			this.anInt1282 = arg1.method878();
		}
	}
}
