import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class162 implements Interface24 {

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "Z")
	private boolean aBoolean273;

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString35;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class162(@OriginalArg(0) String arg0) {
		this.aString35 = arg0;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)I")
	@Override
	public int method7364() {
		@Pc(8) int local8 = Static304.method4151(this.aString35);
		if (local8 >= 0 && local8 <= 100) {
			return local8;
		} else {
			this.aBoolean273 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)Z")
	public boolean method3459() {
		return this.aBoolean273;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)Lclient!bja;")
	@Override
	public Class39 method7365() {
		return Static46.aClass39_4;
	}
}
