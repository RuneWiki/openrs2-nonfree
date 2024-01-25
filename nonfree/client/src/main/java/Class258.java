import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class258 implements Interface11 {

	@OriginalMember(owner = "client!oba", name = "j", descriptor = "Z")
	private boolean aBoolean550;

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString95;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class258(@OriginalArg(0) String arg0) {
		this.aString95 = arg0;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)Z")
	public boolean method6195() {
		return this.aBoolean550;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)Lclient!ud;")
	@Override
	public Class342 method9043() {
		return Static593.aClass342_4;
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)I")
	@Override
	public int method9042() {
		@Pc(14) int local14 = Static74.method1187(this.aString95);
		if (local14 >= 0 && local14 <= 100) {
			return local14;
		} else {
			this.aBoolean550 = true;
			return 100;
		}
	}
}
