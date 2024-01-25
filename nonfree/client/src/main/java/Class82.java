import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class82 implements Interface14 {

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "Z")
	private boolean aBoolean132;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString27;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class82(@OriginalArg(0) String arg0) {
		this.aString27 = arg0;
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)Z")
	public boolean method1617() {
		return this.aBoolean132;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)Lclient!saa;")
	@Override
	public Class309 method3687() {
		return Static508.aClass309_5;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)I")
	@Override
	public int method3686() {
		@Pc(15) int local15 = Static482.method8272(this.aString27);
		if (local15 >= 0 && local15 <= 100) {
			return local15;
		} else {
			this.aBoolean132 = true;
			return 100;
		}
	}
}
