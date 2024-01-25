import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class155_Sub2 extends Class155 {

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
	private final int anInt5350;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
	private final int anInt5352;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
	private final int anInt5351;

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
	private final int anInt5348;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIII)V")
	public Class155_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5350 = arg0;
		this.anInt5352 = arg1;
		this.anInt5351 = arg2;
		this.anInt5348 = arg3;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)V")
	@Override
	public void method5523(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt5350 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt5351 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt5352 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt5348 >> 12;
		Static221.method5546(super.anInt6667, local39, local32, local18, super.anInt6668, local25, super.anInt6664);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
	@Override
	public void method5520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5350 >> 12;
		@Pc(17) int local17 = this.anInt5351 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt5352 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt5348 >> 12;
		Static40.method640(local10, local17, super.anInt6667, local24, local31);
	}
}
