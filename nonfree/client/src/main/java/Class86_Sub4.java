import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class86_Sub4 extends Class86 {

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
	private final int anInt11136;

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
	private final int anInt11141;

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
	private final int anInt11137;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
	private final int anInt11138;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIIIIII)V")
	public Class86_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt11136 = arg3;
		this.anInt11141 = arg1;
		this.anInt11137 = arg2;
		this.anInt11138 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(III)V")
	@Override
	public void method9265(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 * this.anInt11138 >> 12;
		@Pc(23) int local23 = this.anInt11137 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt11141 >> 12;
		@Pc(37) int local37 = this.anInt11136 * arg1 >> 12;
		Static56.method1194(local30, local23, local16, local37, super.anInt11134);
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(III)V")
	@Override
	public void method9264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt11138 >> 12;
		@Pc(21) int local21 = this.anInt11137 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt11141 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt11136 >> 12;
		Static472.method6857(local21, super.anInt11134, super.anInt11131, local28, local35, super.anInt11132, local14);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V")
	@Override
	public void method9263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt11138 * arg1 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt11137 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt11141 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt11136 >> 12;
		Static42.method925(local10, super.anInt11131, local23, local37, super.anInt11132, local30);
	}
}
