import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class223 implements Interface4 {

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "Z")
	private boolean aBoolean446;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString51;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class223(@OriginalArg(0) String arg0) {
		this.aString51 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)I")
	@Override
	public int method6364() {
		@Pc(14) int local14 = Static248.method4175(this.aString51);
		if (local14 >= 0 && local14 <= 100) {
			return local14;
		} else {
			this.aBoolean446 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)Z")
	public boolean method5313() {
		return this.aBoolean446;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)Lclient!qia;")
	@Override
	public Class288 method6365() {
		return Static470.aClass288_5;
	}
}
