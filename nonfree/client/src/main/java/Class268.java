import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Class268 implements Interface22 {

	@OriginalMember(owner = "client!ofa", name = "f", descriptor = "Z")
	private boolean aBoolean612;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString110;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class268(@OriginalArg(0) String arg0) {
		this.aString110 = arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(B)Z")
	public boolean method6734() {
		return this.aBoolean612;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)I")
	@Override
	public int method8879() {
		if (this.aBoolean612) {
			return 100;
		}
		@Pc(23) int local23 = Static297.method4583(this.aString110);
		if (local23 >= 0 && local23 <= 100) {
			return local23;
		} else {
			this.aBoolean612 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)Lclient!pia;")
	@Override
	public Class287 method8878() {
		return Static489.aClass287_4;
	}
}
