import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class65_Sub2 extends Class65 {

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "[I")
	public static final int[] anIntArray216 = new int[32];

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
	public final int anInt4127;

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
	public final int anInt4126;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray216[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!dba;Lclient!pa;IIIIIIIII)V")
	public Class65_Sub2(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt4127 = arg9;
		this.anInt4126 = arg10;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)Lclient!ib;")
	@Override
	public Class140 method7197() {
		return Static271.aClass140_14;
	}
}
