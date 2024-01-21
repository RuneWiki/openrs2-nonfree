import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class Class24 {

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I)V")
	public Class24(@OriginalArg(0) int arg0) {
		Static57.anInt1657 = arg0;
		Static94.aLong73 = System.currentTimeMillis();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "()V")
	public void method1133() {
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(J)V")
	public void method1136(@OriginalArg(0) long arg0) {
	}
}
