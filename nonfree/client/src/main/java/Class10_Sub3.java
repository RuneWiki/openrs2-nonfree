import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
	private final int anInt5220;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
	private final int anInt5222;

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
	private final int anInt5221;

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
	private final int anInt5224;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIII)V")
	public Class10_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5220 = arg1;
		this.anInt5222 = arg0;
		this.anInt5221 = arg3;
		this.anInt5224 = arg2;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(III)V")
	@Override
	public void method6570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5222 >> 12;
		@Pc(17) int local17 = this.anInt5224 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt5220 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt5221 >> 12;
		Static380.method5828(local10, super.anInt7903, super.anInt7907, local32, local39, local17, super.anInt7906);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
	@Override
	public void method6568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt5222 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt5224 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt5220 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt5221 >> 12;
		Static50.method969(local17, local24, super.anInt7903, local31, local10);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
