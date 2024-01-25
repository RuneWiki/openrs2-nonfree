import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class351 implements Interface8 {

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "Z")
	private boolean aBoolean708;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString108;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class351(@OriginalArg(0) String arg0) {
		this.aString108 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)I")
	@Override
	public int method7616() {
		@Pc(8) int local8 = Static147.method7910(this.aString108);
		if (local8 >= 0 && local8 <= 100) {
			return local8;
		} else {
			this.aBoolean708 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)Lclient!sg;")
	@Override
	public Class329 method7617() {
		return Static545.aClass329_4;
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)Z")
	public boolean method7618() {
		return this.aBoolean708;
	}
}
