import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class307 implements Interface2 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "Z")
	private boolean aBoolean611;

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString96;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class307(@OriginalArg(0) String arg0) {
		this.aString96 = arg0;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)I")
	@Override
	public int method7205() {
		@Pc(13) int local13 = Static165.method5086(this.aString96);
		if (local13 >= 0 && local13 <= 100) {
			return local13;
		} else {
			this.aBoolean611 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)Z")
	public boolean method6905() {
		return this.aBoolean611;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Lclient!vm;")
	@Override
	public Class365 method7204() {
		return Static605.aClass365_5;
	}
}
