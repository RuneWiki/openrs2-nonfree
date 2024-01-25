import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class327 implements Interface20 {

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "Z")
	private boolean aBoolean649;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString91;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class327(@OriginalArg(0) String arg0) {
		this.aString91 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)Z")
	public boolean method7283() {
		return this.aBoolean649;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)I")
	@Override
	public int method7282() {
		@Pc(8) int local8 = Static477.method6709(this.aString91);
		if (local8 >= 0 && local8 <= 100) {
			return local8;
		} else {
			this.aBoolean649 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)Lclient!rba;")
	@Override
	public Class277 method7281() {
		return Static450.aClass277_5;
	}
}
