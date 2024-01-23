import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
	public int anInt1984 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!jj;)V")
	public void method1678(@OriginalArg(1) Class1_Sub18 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method3122();
			if (local16 == 0) {
				return;
			}
			this.method1681(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!jj;BI)V")
	private void method1681(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt1984 = arg0.method3107();
		}
	}
}
