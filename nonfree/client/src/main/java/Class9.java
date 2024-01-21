import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class Class9 {

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I)V")
	public Class9(@OriginalArg(0) int arg0) {
		Static80.anInt2188 = arg0;
		Static92.aLong70 = System.currentTimeMillis();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(J)V")
	public void method1867(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "()V")
	public void method1873() {
	}
}
