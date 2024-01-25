import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class6_Sub5_Sub1_Sub2 extends Class6_Sub5_Sub1 {

	@OriginalMember(owner = "client!to", name = "C", descriptor = "[Lclient!o;")
	public static final Class234[] aClass234Array1 = new Class234[5];

	@OriginalMember(owner = "client!to", name = "B", descriptor = "Ljava/lang/Object;")
	private final Object anObject19;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass234Array1.length; local4++) {
			aClass234Array1[local4] = new Class234();
		}
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!sn;Ljava/lang/Object;I)V")
	public Class6_Sub5_Sub1_Sub2(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject19 = arg1;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7751() {
		return this.anObject19;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7754() {
		return false;
	}
}
