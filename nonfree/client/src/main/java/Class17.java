import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class Class17 {

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V")
	public Class17(@OriginalArg(0) int arg0) {
		Static29.anInt894 = arg0;
		Static8.aLong11 = System.currentTimeMillis();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(J)V")
	public void method1433(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()V")
	public void method1435() {
	}
}
