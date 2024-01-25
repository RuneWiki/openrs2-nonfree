import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class260 implements Interface23 {

	@OriginalMember(owner = "client!po", name = "h", descriptor = "Z")
	private boolean aBoolean555;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString63;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class260(@OriginalArg(0) String arg0) {
		this.aString63 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)I")
	@Override
	public int method6597() {
		@Pc(16) int local16 = Static472.method6649(this.aString63);
		if (local16 >= 0 && local16 <= 100) {
			return local16;
		} else {
			this.aBoolean555 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(B)Z")
	public boolean method5997() {
		return this.aBoolean555;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)Lclient!tj;")
	@Override
	public Class320 method6598() {
		return Static512.aClass320_5;
	}
}
