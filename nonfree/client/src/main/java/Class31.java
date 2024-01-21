import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class Class31 {

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
	public Class31(@OriginalArg(0) int arg0) {
		Static42.anInt1353 = arg0;
		Static102.aLong80 = Static76.method1306();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(J)V")
	public void method1178(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
	public void method1180() {
	}
}
