import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class Class6 {

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
	public Class6(@OriginalArg(0) int arg0) {
		Static27.anInt1162 = arg0;
		Static55.aLong51 = System.currentTimeMillis();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
	public void method1561() {
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(J)V")
	public void method1562(@OriginalArg(0) long arg0) {
	}
}
