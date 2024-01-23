import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class68_Sub4 extends Class68 {

	@OriginalMember(owner = "client!vk", name = "z", descriptor = "I")
	private int anInt6069;

	@OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
	private int anInt6064;

	@OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
	private int anInt6072;

	@OriginalMember(owner = "client!vk", name = "E", descriptor = "I")
	private int anInt6073;

	@OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
	private int anInt6066;

	@OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
	private int anInt6068;

	@OriginalMember(owner = "client!vk", name = "C", descriptor = "I")
	private int anInt6071;

	@OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
	private int anInt6061;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class68_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt6069 = arg5;
		this.anInt6064 = arg6;
		this.anInt6072 = arg2;
		this.anInt6073 = arg7;
		this.anInt6066 = arg4;
		this.anInt6068 = arg0;
		this.anInt6071 = arg1;
		this.anInt6061 = arg3;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V")
	@Override
	public void method4690(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6071 * arg1 >> 12;
		@Pc(23) int local23 = this.anInt6068 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt6061 >> 12;
		@Pc(37) int local37 = this.anInt6072 * arg0 >> 12;
		@Pc(44) int local44 = arg0 * this.anInt6066 >> 12;
		@Pc(51) int local51 = this.anInt6069 * arg1 >> 12;
		@Pc(58) int local58 = arg0 * this.anInt6064 >> 12;
		@Pc(65) int local65 = arg1 * this.anInt6073 >> 12;
		Static246.method4222(local10, local44, local23, local58, local51, local65, local30, this.anInt6058, local37);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4686(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
