import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class122_Sub3 extends Class122 {

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
	private final int anInt5846;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
	private final int anInt5835;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
	private final int anInt5844;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
	private final int anInt5838;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class122_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5846 = arg1;
		this.anInt5835 = arg0;
		this.anInt5844 = arg2;
		this.anInt5838 = arg3;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V")
	@Override
	public void method4969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5835 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt5844 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt5846 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt5838 >> 12;
		Static279.method4783(local10, local24, local31, local17, super.anInt5903);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
	@Override
	public void method4968(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5835 >> 12;
		@Pc(17) int local17 = this.anInt5844 * arg1 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt5846 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt5838 >> 12;
		Static209.method3655(local10, super.anInt5903, local36, local17, super.anInt5901, local29, super.anInt5900);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4965(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
