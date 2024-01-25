import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class131 implements Interface13 {

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "[I")
	public static final int[] anIntArray370 = new int[4096];

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "Z")
	private boolean aBoolean298;

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString35;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray370[local4] = Static340.method5035(local4);
		}
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class131(@OriginalArg(0) String arg0) {
		this.aString35 = arg0;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)Lclient!iaa;")
	@Override
	public Class153 method5812() {
		return Static211.aClass153_4;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)Z")
	public boolean method3363() {
		return this.aBoolean298;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)I")
	@Override
	public int method5811() {
		@Pc(15) int local15 = Static266.method4349(this.aString35);
		if (local15 >= 0 && local15 <= 100) {
			return local15;
		} else {
			this.aBoolean298 = true;
			return 100;
		}
	}
}
