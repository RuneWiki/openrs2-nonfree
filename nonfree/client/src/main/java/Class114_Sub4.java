import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class114_Sub4 extends Class114 {

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
	private final int anInt5089;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
	private final int anInt5083;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
	private final int anInt5081;

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
	private final int anInt5082;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IIIIIII)V")
	public Class114_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5089 = arg3;
		this.anInt5083 = arg2;
		this.anInt5081 = arg1;
		this.anInt5082 = arg0;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt5082 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt5083 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt5081 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt5089 * arg1 >> 12;
		Static147.method5721(super.anInt5076, local25, local32, local10, local39);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
	@Override
	public void method4461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(III)V")
	@Override
	public void method4466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5082 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt5083 >> 12;
		@Pc(28) int local28 = this.anInt5081 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt5089 * arg0 >> 12;
		Static159.method2619(local10, local35, super.anInt5076, super.anInt5079, local28, super.anInt5078, local21);
	}
}
