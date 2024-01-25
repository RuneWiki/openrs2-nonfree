import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class221_Sub4 extends Class221 {

	@OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
	private final int anInt8723;

	@OriginalMember(owner = "client!uba", name = "p", descriptor = "I")
	private final int anInt8724;

	@OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
	private final int anInt8719;

	@OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
	private final int anInt8726;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IIIIII)V")
	public Class221_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt8723 = arg3;
		this.anInt8724 = arg0;
		this.anInt8719 = arg2;
		this.anInt8726 = arg1;
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(III)V")
	@Override
	public void method7276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt8724 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt8719 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt8726 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt8723 >> 12;
		Static595.method8000(local31, local24, super.anInt8713, local17, local10);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)V")
	@Override
	public void method7274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
