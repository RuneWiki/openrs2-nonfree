import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class43_Sub3 extends Class43 {

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
	private final int anInt3836;

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
	private final int anInt3840;

	@OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
	private final int anInt3846;

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
	private final int anInt3842;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIII)V")
	public Class43_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3836 = arg0;
		this.anInt3840 = arg2;
		this.anInt3846 = arg1;
		this.anInt3842 = arg3;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(III)V")
	@Override
	public void method5174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
	@Override
	public void method5170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3836 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt3840 >> 12;
		@Pc(24) int local24 = this.anInt3846 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt3842 >> 12;
		Static228.method4084(local24, local31, local10, super.anInt5696, local17);
	}
}
