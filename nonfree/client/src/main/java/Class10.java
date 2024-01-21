import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class Class10 {

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I)V")
	public Class10(@OriginalArg(0) int arg0) {
		Static5.anInt382 = arg0;
		Static12.aLong86 = Static85.method1534();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(J)V")
	public void method1739(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "()V")
	public void method1740() {
	}
}
