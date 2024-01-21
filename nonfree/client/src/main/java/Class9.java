import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class Class9 {

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V")
	public Class9(@OriginalArg(0) int arg0) {
		Static109.anInt2826 = arg0;
		Static5.aLong5 = Static82.method1454();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "()V")
	public void method1549() {
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(J)V")
	public void method1550(@OriginalArg(0) long arg0) {
	}
}
