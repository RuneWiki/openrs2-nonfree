import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fha")
public final class Class109 implements Interface8 {

	@OriginalMember(owner = "client!fha", name = "f", descriptor = "Z")
	private boolean aBoolean162;

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString27;

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class109(@OriginalArg(0) String arg0) {
		this.aString27 = arg0;
	}

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(I)Z")
	public boolean method2217() {
		return this.aBoolean162;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)I")
	@Override
	public int method9105() {
		@Pc(13) int local13 = Static244.method3610(this.aString27);
		if (local13 >= 0 && local13 <= 100) {
			return local13;
		} else {
			this.aBoolean162 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)Lclient!jea;")
	@Override
	public Class173 method9104() {
		return Static268.aClass173_4;
	}
}
