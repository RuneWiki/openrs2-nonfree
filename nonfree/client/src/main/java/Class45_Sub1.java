import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
	private final int anInt1912;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
	private final int anInt1902;

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
	private final int anInt1901;

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
	private final int anInt1906;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIIII)V")
	public Class45_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1912 = arg1;
		this.anInt1902 = arg2;
		this.anInt1901 = arg3;
		this.anInt1906 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(BII)V")
	@Override
	public void method2629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BII)V")
	@Override
	public void method2628(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
	@Override
	public void method2632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 * this.anInt1912 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt1906 >> 12;
		@Pc(24) int local24 = this.anInt1901 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt1902 * arg1 >> 12;
		Static152.method2601(local17, local6, local24, local35, super.anInt3466);
	}
}
