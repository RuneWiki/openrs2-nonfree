import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class130_Sub1 extends Class130 {

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
	private final int anInt7082;

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
	private final int anInt7086;

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
	private final int anInt7088;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
	private final int anInt7092;

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
	private final int anInt7089;

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
	private final int anInt7087;

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
	private final int anInt7083;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
	private final int anInt7085;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class130_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt7082 = arg0;
		this.anInt7086 = arg6;
		this.anInt7088 = arg2;
		this.anInt7092 = arg5;
		this.anInt7089 = arg3;
		this.anInt7087 = arg7;
		this.anInt7083 = arg4;
		this.anInt7085 = arg1;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)V")
	@Override
	public void method9438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	@Override
	public void method9435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt7082 * arg0 >> 12;
		@Pc(27) int local27 = arg1 * this.anInt7085 >> 12;
		@Pc(34) int local34 = arg0 * this.anInt7088 >> 12;
		@Pc(41) int local41 = arg1 * this.anInt7089 >> 12;
		@Pc(48) int local48 = this.anInt7083 * arg0 >> 12;
		@Pc(55) int local55 = this.anInt7092 * arg1 >> 12;
		@Pc(62) int local62 = this.anInt7086 * arg0 >> 12;
		@Pc(69) int local69 = arg1 * this.anInt7087 >> 12;
		Static85.method1106(local27, local55, local69, super.anInt11292, local41, local34, local48, local10, local62);
	}
}
