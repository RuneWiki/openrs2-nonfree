import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class317 implements Interface2 {

	@OriginalMember(owner = "client!tfa", name = "g", descriptor = "Z")
	private boolean aBoolean657;

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString96;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class317(@OriginalArg(0) String arg0) {
		this.aString96 = arg0;
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)Z")
	public boolean method7057() {
		return this.aBoolean657;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)I")
	@Override
	public int method7052() {
		@Pc(10) int local10 = Static501.method7055(this.aString96);
		if (local10 >= 0 && local10 <= 100) {
			return local10;
		} else {
			this.aBoolean657 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)Lclient!mv;")
	@Override
	public Class229 method7053() {
		return Static334.aClass229_5;
	}
}
