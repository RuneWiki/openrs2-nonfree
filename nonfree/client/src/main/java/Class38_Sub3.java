import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class38_Sub3 extends Class38 {

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "I")
	private final int anInt4078;

	@OriginalMember(owner = "client!jt", name = "s", descriptor = "I")
	private final int anInt4083;

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
	private final int anInt4073;

	@OriginalMember(owner = "client!jt", name = "j", descriptor = "I")
	private final int anInt4076;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIIIII)V")
	public Class38_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4078 = arg3;
		this.anInt4083 = arg1;
		this.anInt4073 = arg0;
		this.anInt4076 = arg2;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4073 >> 12;
		@Pc(17) int local17 = this.anInt4076 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt4083 >> 12;
		@Pc(36) int local36 = this.anInt4078 * arg0 >> 12;
		Static564.method7723(local24, local17, super.anInt6087, local36, local10);
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(III)V")
	@Override
	public void method5175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4073 * arg0 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt4076 >> 12;
		@Pc(29) int local29 = this.anInt4083 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt4078 >> 12;
		Static237.method3457(local36, super.anInt6088, local10, local22, super.anInt6087, super.anInt6090, local29);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(III)V")
	@Override
	public void method5171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
