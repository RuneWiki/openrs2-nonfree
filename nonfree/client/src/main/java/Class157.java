import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class157 implements Interface3 {

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Z")
	private boolean aBoolean289;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString54;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class157(@OriginalArg(0) String arg0) {
		this.aString54 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Lclient!kt;")
	@Override
	public Class201 method8318() {
		return Static322.aClass201_4;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)Z")
	public boolean method3677() {
		return this.aBoolean289;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)I")
	@Override
	public int method8319() {
		@Pc(8) int local8 = Static548.method7020(this.aString54);
		if (local8 >= 0 && local8 <= 100) {
			return local8;
		} else {
			this.aBoolean289 = true;
			return 100;
		}
	}
}
