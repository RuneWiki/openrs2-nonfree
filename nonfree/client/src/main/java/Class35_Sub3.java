import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class35_Sub3 extends Class35 {

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
	private final int anInt5973;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
	private final int anInt5970;

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
	private final int anInt5978;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
	private final int anInt5967;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(IIIIII)V")
	public Class35_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt5973 = arg3;
		this.anInt5970 = arg2;
		this.anInt5978 = arg0;
		this.anInt5967 = arg1;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(III)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(III)V")
	@Override
	public void method5622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5978 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt5970 >> 12;
		@Pc(24) int local24 = this.anInt5967 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt5973 >> 12;
		Static46.method774(local10, local17, super.anInt6704, local24, local31);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V")
	@Override
	public void method5617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
