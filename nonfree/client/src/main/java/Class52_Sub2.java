import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class52_Sub2 extends Class52 {

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	private final int anInt5444;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "I")
	private final int anInt5442;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "I")
	private final int anInt5446;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "I")
	private final int anInt5443;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIII)V")
	public Class52_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt5444 = arg2;
		this.anInt5442 = arg1;
		this.anInt5446 = arg3;
		this.anInt5443 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZII)V")
	@Override
	public void method5586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
	@Override
	public void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5443 >> 12;
		@Pc(17) int local17 = this.anInt5444 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt5442 * arg1 >> 12;
		@Pc(38) int local38 = this.anInt5446 * arg1 >> 12;
		Static527.method7222(local10, local38, local31, super.anInt6843, local17);
	}
}
