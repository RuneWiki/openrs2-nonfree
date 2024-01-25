import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class321 implements Interface19 {

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Z")
	private boolean aBoolean793;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "Ljava/lang/String;")
	private final String aString114;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class321(@OriginalArg(0) String arg0) {
		this.aString114 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)Z")
	public boolean method7716() {
		return this.aBoolean793;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)I")
	@Override
	public int method8138() {
		@Pc(8) int local8 = Static577.method8258(this.aString114);
		if (local8 >= 0 && local8 <= 100) {
			return local8;
		} else {
			this.aBoolean793 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Lclient!ev;")
	@Override
	public Class92 method8137() {
		return Static126.aClass92_4;
	}
}
