import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class74_Sub1 extends Class74 {

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "[Lclient!sj;")
	private static final Class326[] aClass326Array1 = new Class326[32];

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
	private final int anInt2073;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
	private final int anInt2077;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
	private final int anInt2079;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	private final int anInt2076;

	static {
		@Pc(223) Class326[] local223 = Static118.method2143();
		for (@Pc(225) int local225 = 0; local225 < local223.length; local225++) {
			aClass326Array1[local223[local225].anInt8904] = local223[local225];
		}
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIII)V")
	public Class74_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2073 = arg3;
		this.anInt2077 = arg2;
		this.anInt2079 = arg0;
		this.anInt2076 = arg1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)V")
	@Override
	public void method8221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2079 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2077 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt2076 >> 12;
		@Pc(36) int local36 = this.anInt2073 * arg0 >> 12;
		Static287.method4511(local10, local36, local17, local29, super.anInt9645);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(IBI)V")
	@Override
	public void method8219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8218(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
