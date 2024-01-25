import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class313 implements Interface18 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Z")
	private boolean aBoolean650;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString90;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class313(@OriginalArg(0) String arg0) {
		this.aString90 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Z")
	public boolean method7633() {
		return this.aBoolean650;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I")
	@Override
	public int method9016() {
		@Pc(15) int local15 = Static485.method6456(this.aString90);
		if (local15 >= 0 && local15 <= 100) {
			return local15;
		} else {
			this.aBoolean650 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Lclient!lj;")
	@Override
	public Class214 method9015() {
		return Static336.aClass214_4;
	}
}
