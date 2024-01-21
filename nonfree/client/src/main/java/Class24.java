import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class Class24 {

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class24(@OriginalArg(0) int arg0) {
		Static12.anInt291 = arg0;
		Static101.aLong143 = System.currentTimeMillis();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(J)V")
	public void method1654(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "()V")
	public void method1656() {
	}
}
