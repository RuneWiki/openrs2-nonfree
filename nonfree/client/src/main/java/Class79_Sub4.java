import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class79_Sub4 extends Class79 {

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	private final int anInt9208;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
	private final int anInt9209;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
	private final int anInt9204;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
	private final int anInt9203;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIIII)V")
	public Class79_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt9208 = arg1;
		this.anInt9209 = arg2;
		this.anInt9204 = arg3;
		this.anInt9203 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt9203 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt9209 >> 12;
		@Pc(32) int local32 = this.anInt9208 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt9204 >> 12;
		Static42.method1043(super.anInt9200, super.anInt9201, local39, super.anInt9202, local17, local10, local32);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt9203 >> 12;
		@Pc(21) int local21 = this.anInt9209 * arg1 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt9208 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt9204 >> 12;
		Static436.method6213(local35, super.anInt9202, local10, super.anInt9200, local28, local21);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
	@Override
	public void method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt9203 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt9209 >> 12;
		@Pc(28) int local28 = this.anInt9208 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt9204 >> 12;
		Static507.method7061(local21, local10, super.anInt9201, local28, local35);
	}
}
