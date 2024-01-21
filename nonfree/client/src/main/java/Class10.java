import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class Class10 {

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I)V")
	public Class10(@OriginalArg(0) int arg0) {
		Static7.anInt234 = arg0;
		Static24.aLong18 = System.currentTimeMillis();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
	public void method1554() {
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(J)V")
	public void method1559(@OriginalArg(0) long arg0) {
	}
}
