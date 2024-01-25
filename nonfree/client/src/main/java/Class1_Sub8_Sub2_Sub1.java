import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class1_Sub8_Sub2_Sub1 extends Class1_Sub8_Sub2 {

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "[I")
	public static final int[] anIntArray30 = new int[32];

	@OriginalMember(owner = "client!bd", name = "M", descriptor = "Ljava/lang/Object;")
	private final Object anObject2;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray30[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!oga;Ljava/lang/Object;I)V")
	public Class1_Sub8_Sub2_Sub1(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject2 = arg1;
	}

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method6118() {
		return false;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method6115() {
		return this.anObject2;
	}
}
