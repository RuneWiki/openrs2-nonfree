import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
	private final int anInt10320;

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
	private final int anInt10323;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
	private final int anInt10319;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
	private final int anInt10313;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt10320 = arg1;
		this.anInt10323 = arg0;
		this.anInt10319 = arg3;
		this.anInt10313 = arg2;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt10323 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt10313 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt10320 >> 12;
		@Pc(40) int local40 = arg0 * this.anInt10319 >> 12;
		Static555.method7633(super.anInt10311, local40, local10, local24, local17);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)V")
	@Override
	public void method8593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt10323 >> 12;
		@Pc(25) int local25 = this.anInt10313 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt10320 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt10319 >> 12;
		Static494.method6858(super.anInt10310, local39, local18, super.anInt10308, local32, local25);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt10323 >> 12;
		@Pc(17) int local17 = this.anInt10313 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt10320 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt10319 >> 12;
		Static163.method2449(super.anInt10308, local32, local10, local39, super.anInt10311, local17, super.anInt10310);
	}
}
