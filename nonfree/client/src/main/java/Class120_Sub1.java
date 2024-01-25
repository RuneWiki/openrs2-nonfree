import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kla")
public final class Class120_Sub1 extends Class120 {

	@OriginalMember(owner = "client!kla", name = "u", descriptor = "I")
	private final int anInt5219;

	@OriginalMember(owner = "client!kla", name = "r", descriptor = "I")
	private final int anInt5224;

	@OriginalMember(owner = "client!kla", name = "y", descriptor = "I")
	private final int anInt5217;

	@OriginalMember(owner = "client!kla", name = "s", descriptor = "I")
	private final int anInt5225;

	@OriginalMember(owner = "client!kla", name = "<init>", descriptor = "(IIIIIII)V")
	public Class120_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5219 = arg2;
		this.anInt5224 = arg0;
		this.anInt5217 = arg3;
		this.anInt5225 = arg1;
	}

	@OriginalMember(owner = "client!kla", name = "b", descriptor = "(IBI)V")
	@Override
	public void method9430(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5224 >> 12;
		@Pc(17) int local17 = this.anInt5219 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt5225 >> 12;
		@Pc(38) int local38 = this.anInt5217 * arg1 >> 12;
		Static183.method2655(local17, super.anInt10802, local38, local24, local10);
	}

	@OriginalMember(owner = "client!kla", name = "a", descriptor = "(III)V")
	@Override
	public void method9432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5224 * arg0 >> 12;
		@Pc(29) int local29 = this.anInt5219 * arg0 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt5225 >> 12;
		@Pc(43) int local43 = arg1 * this.anInt5217 >> 12;
		Static543.method7586(local36, super.anInt10799, super.anInt10803, local10, local43, local29);
	}

	@OriginalMember(owner = "client!kla", name = "a", descriptor = "(IBI)V")
	@Override
	public void method9433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 * this.anInt5224 >> 12;
		@Pc(22) int local22 = this.anInt5219 * arg0 >> 12;
		@Pc(29) int local29 = this.anInt5225 * arg1 >> 12;
		@Pc(36) int local36 = this.anInt5217 * arg1 >> 12;
		Static322.method4460(local15, super.anInt10802, super.anInt10803, local22, local36, super.anInt10799, local29);
	}
}
