import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ela")
public final class Class103 implements Interface20 {

	@OriginalMember(owner = "client!ela", name = "d", descriptor = "Z")
	private boolean aBoolean260;

	@OriginalMember(owner = "client!ela", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString25;

	@OriginalMember(owner = "client!ela", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class103(@OriginalArg(0) String arg0) {
		this.aString25 = arg0;
	}

	@OriginalMember(owner = "client!ela", name = "a", descriptor = "(I)I")
	@Override
	public int method8706() {
		if (this.aBoolean260) {
			return 100;
		}
		@Pc(16) int local16 = Static677.method9184(this.aString25);
		if (local16 >= 0 && local16 <= 100) {
			return local16;
		} else {
			this.aBoolean260 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!ela", name = "c", descriptor = "(I)Z")
	public boolean method2169() {
		return this.aBoolean260;
	}

	@OriginalMember(owner = "client!ela", name = "b", descriptor = "(I)Lclient!lm;")
	@Override
	public Class227 method8705() {
		return Static371.aClass227_5;
	}
}
