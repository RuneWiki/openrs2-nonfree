import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 implements Interface15 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Z")
	private boolean aBoolean1;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1(@OriginalArg(0) String arg0) {
		this.aString1 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)I")
	@Override
	public int method4825() {
		@Pc(13) int local13 = Static503.method6788(this.aString1);
		if (local13 >= 0 && local13 <= 100) {
			return local13;
		} else {
			this.aBoolean1 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Lclient!wa;")
	@Override
	public Class356 method4824() {
		return Static574.aClass356_5;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)Z")
	public boolean method7() {
		return this.aBoolean1;
	}
}
