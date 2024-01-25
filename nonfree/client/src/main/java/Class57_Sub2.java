import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
	private final int anInt3513;

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
	private final int anInt3516;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
	private final int anInt3510;

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
	private final int anInt3514;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIII)V")
	public Class57_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3513 = arg0;
		this.anInt3516 = arg1;
		this.anInt3510 = arg2;
		this.anInt3514 = arg3;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V")
	@Override
	public void method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(III)V")
	@Override
	public void method4807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt3513 >> 12;
		@Pc(17) int local17 = this.anInt3510 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt3516 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt3514 * arg1 >> 12;
		Static158.method2005(local17, local24, super.anInt6158, local31, local10);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
