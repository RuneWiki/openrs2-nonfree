import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class125_Sub2 extends Class125 {

	@OriginalMember(owner = "client!oca", name = "r", descriptor = "I")
	private final int anInt7167;

	@OriginalMember(owner = "client!oca", name = "m", descriptor = "I")
	private final int anInt7168;

	@OriginalMember(owner = "client!oca", name = "n", descriptor = "I")
	private final int anInt7169;

	@OriginalMember(owner = "client!oca", name = "t", descriptor = "I")
	private final int anInt7164;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(IIIIII)V")
	public Class125_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt7167 = arg0;
		this.anInt7168 = arg2;
		this.anInt7169 = arg3;
		this.anInt7164 = arg1;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V")
	@Override
	public void method9264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZII)V")
	@Override
	public void method9263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt7167 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt7168 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt7164 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt7169 >> 12;
		Static380.method5561(super.anInt10751, local10, local17, local24, local31);
	}
}
