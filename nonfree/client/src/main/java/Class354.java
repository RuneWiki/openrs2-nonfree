import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class354 implements Interface8 {

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Z")
	private boolean aBoolean696;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Ljava/lang/String;")
	private final String aString264;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class354(@OriginalArg(0) String arg0) {
		this.aString264 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lclient!cj;")
	@Override
	public Class56 method7898() {
		return Static67.aClass56_4;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Z")
	public boolean method7900() {
		return this.aBoolean696;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I")
	@Override
	public int method7897() {
		@Pc(16) int local16 = Static109.method2206(this.aString264);
		if (local16 >= 0 && local16 <= 100) {
			return local16;
		} else {
			this.aBoolean696 = true;
			return 100;
		}
	}
}
