import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class113 implements Interface17 {

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "Z")
	private boolean aBoolean306;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "Ljava/lang/String;")
	private final String aString38;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class113(@OriginalArg(0) String arg0) {
		this.aString38 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)Lclient!qfa;")
	@Override
	public Class276 method5453() {
		return Static457.aClass276_4;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)Z")
	public boolean method3006() {
		return this.aBoolean306;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)I")
	@Override
	public int method5454() {
		@Pc(8) int local8 = Static112.method1834(this.aString38);
		if (local8 >= 0 && local8 <= 100) {
			return local8;
		} else {
			this.aBoolean306 = true;
			return 100;
		}
	}
}
