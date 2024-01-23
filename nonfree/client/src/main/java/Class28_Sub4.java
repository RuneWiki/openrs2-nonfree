import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class28_Sub4 extends Class28 {

	@OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
	private final int anInt4162;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
	private final int anInt4156;

	@OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
	private final int anInt4158;

	@OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
	private final int anInt4159;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(IIIIII)V")
	public Class28_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4162 = arg0;
		this.anInt4156 = arg3;
		this.anInt4158 = arg2;
		this.anInt4159 = arg1;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method2853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V")
	@Override
	public void method2851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 * this.anInt4162 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt4158 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt4159 >> 12;
		@Pc(35) int local35 = this.anInt4156 * arg1 >> 12;
		Static203.method3142(local6, local35, local21, local28, super.anInt4140);
	}
}
