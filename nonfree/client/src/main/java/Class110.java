import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class110 implements Interface27 {

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Z")
	private boolean aBoolean218;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString20;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class110(@OriginalArg(0) String arg0) {
		this.aString20 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)Lclient!il;")
	@Override
	public Class171 method4357() {
		return Static246.aClass171_4;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)I")
	@Override
	public int method4358() {
		@Pc(14) int local14 = Static138.method2561(this.aString20);
		if (local14 >= 0 && local14 <= 100) {
			return local14;
		} else {
			this.aBoolean218 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)Z")
	public boolean method2748() {
		return this.aBoolean218;
	}
}
