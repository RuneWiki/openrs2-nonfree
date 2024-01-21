import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class Class4 {

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I)V")
	public Class4(@OriginalArg(0) int arg0) {
		Static59.anInt1823 = arg0;
		Static24.aLong38 = Static1.method3();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(J)V")
	public void method874(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
	public void method877() {
	}
}
