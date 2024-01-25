import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class2 implements Interface21 {

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "Z")
	private boolean aBoolean3;

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString1;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2(@OriginalArg(0) String arg0) {
		this.aString1 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)I")
	@Override
	public int method7690() {
		@Pc(8) int local8 = Static22.method241(this.aString1);
		if (local8 >= 0 && local8 <= 100) {
			return local8;
		} else {
			this.aBoolean3 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)Z")
	public boolean method49() {
		return this.aBoolean3;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)Lclient!vj;")
	@Override
	public Class344 method7689() {
		return Static558.aClass344_5;
	}
}
