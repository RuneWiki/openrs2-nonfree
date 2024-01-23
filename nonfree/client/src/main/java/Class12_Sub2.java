import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!li", name = "u", descriptor = "I")
	private int anInt3326;

	@OriginalMember(owner = "client!li", name = "D", descriptor = "I")
	private int anInt3334;

	@OriginalMember(owner = "client!li", name = "C", descriptor = "I")
	private int anInt3333;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "I")
	private int anInt3324;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(IIIIII)V")
	public Class12_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3326 = arg1;
		this.anInt3334 = arg0;
		this.anInt3333 = arg2;
		this.anInt3324 = arg3;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(III)V")
	@Override
	public void method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
	@Override
	public void method4663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3334 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt3333 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt3326 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt3324 >> 12;
		Static304.method4531(local17, local31, local10, local24, this.anInt5930);
	}
}
