import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class52 implements Interface2 {

	@OriginalMember(owner = "client!cfa", name = "n", descriptor = "Z")
	private boolean aBoolean63;

	@OriginalMember(owner = "client!cfa", name = "m", descriptor = "Ljava/lang/String;")
	private final String aString10;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class52(@OriginalArg(0) String arg0) {
		this.aString10 = arg0;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)Z")
	public boolean method1084() {
		return this.aBoolean63;
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(B)Lclient!bl;")
	@Override
	public Class36 method6248() {
		return Static43.aClass36_5;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)I")
	@Override
	public int method6247() {
		@Pc(24) int local24 = Static226.method2758(this.aString10);
		if (local24 >= 0 && local24 <= 100) {
			return local24;
		} else {
			this.aBoolean63 = true;
			return 100;
		}
	}
}
