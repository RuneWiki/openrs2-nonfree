import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class13 implements Interface8 {

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "Z")
	private boolean aBoolean19;

	@OriginalMember(owner = "client!aga", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString6;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class13(@OriginalArg(0) String arg0) {
		this.aString6 = arg0;
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)Z")
	public boolean method179() {
		return this.aBoolean19;
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)I")
	@Override
	public int method8618() {
		@Pc(8) int local8 = Static320.method5029(this.aString6);
		if (local8 >= 0 && local8 <= 100) {
			return local8;
		} else {
			this.aBoolean19 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)Lclient!uw;")
	@Override
	public Class370 method8617() {
		return Static634.aClass370_5;
	}
}
