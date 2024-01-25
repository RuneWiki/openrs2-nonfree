import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class4_Sub36 extends Class4 {

	@OriginalMember(owner = "client!no", name = "j", descriptor = "[Lclient!ml;")
	public static final Class236[] aClass236Array1 = new Class236[5];

	@OriginalMember(owner = "client!no", name = "l", descriptor = "S")
	public short aShort90;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass236Array1.length; local4++) {
			aClass236Array1[local4] = new Class236();
		}
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	private Class4_Sub36() {
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(S)V")
	public Class4_Sub36(@OriginalArg(0) short arg0) {
		this.aShort90 = arg0;
	}
}
