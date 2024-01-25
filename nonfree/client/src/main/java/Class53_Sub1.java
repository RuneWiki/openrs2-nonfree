import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "[I")
	public static final int[] anIntArray117 = new int[120];

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
	public final int anInt1566;

	static {
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 120; local8++) {
			@Pc(13) int local13 = local8 + 1;
			@Pc(26) int local26 = (int) (Math.pow(2.0D, (double) local13 / 7.0D) * 300.0D + (double) local13);
			local6 += local26;
			anIntArray117[local8] = local6 / 4;
		}
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(ILclient!in;Lclient!ti;III)V")
	public Class53_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class339 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1566 = arg5;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lclient!saa;")
	@Override
	public Class310 method9078() {
		return Static575.aClass310_18;
	}
}
