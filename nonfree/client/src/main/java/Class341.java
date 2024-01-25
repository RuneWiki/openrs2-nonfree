import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class341 implements Interface14 {

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "Z")
	private boolean aBoolean688;

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString116;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class341(@OriginalArg(0) String arg0) {
		this.aString116 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)Lclient!gb;")
	@Override
	public Class139 method7866() {
		return Static186.aClass139_4;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)I")
	@Override
	public int method7865() {
		@Pc(8) int local8 = Static97.method1924(this.aString116);
		if (local8 >= 0 && local8 <= 100) {
			return local8;
		} else {
			this.aBoolean688 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)Z")
	public boolean method7870() {
		return this.aBoolean688;
	}
}
