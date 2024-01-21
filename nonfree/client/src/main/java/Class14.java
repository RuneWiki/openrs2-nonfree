import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class Class14 {

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
	public Class14(@OriginalArg(0) int arg0) {
		Static14.anInt545 = arg0;
		Static45.aLong37 = System.currentTimeMillis();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
	public void method1866() {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(J)V")
	public void method1871(@OriginalArg(0) long arg0) {
	}
}
