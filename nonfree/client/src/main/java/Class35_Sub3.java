import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class35_Sub3 extends Class35 {

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
	private int anInt4004;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
	private int anInt4001;

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
	private int anInt4003;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
	private int anInt3999;

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
	private int anInt4010;

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
	private int anInt4005;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
	private int anInt4000;

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
	private int anInt4002;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class35_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4004 = arg2;
		this.anInt4001 = arg6;
		this.anInt4003 = arg7;
		this.anInt3999 = arg5;
		this.anInt4010 = arg3;
		this.anInt4005 = arg0;
		this.anInt4000 = arg4;
		this.anInt4002 = arg1;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
	@Override
	public void method4139(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt4002 * arg1 >> 12;
		@Pc(13) int local13 = arg0 * this.anInt4004 >> 12;
		@Pc(20) int local20 = this.anInt4010 * arg1 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt4005 >> 12;
		@Pc(42) int local42 = this.anInt3999 * arg1 >> 12;
		@Pc(49) int local49 = arg0 * this.anInt4001 >> 12;
		@Pc(56) int local56 = this.anInt4003 * arg1 >> 12;
		@Pc(63) int local63 = this.anInt4000 * arg0 >> 12;
		Static156.method1491(local13, local49, local31, local63, local20, local42, local6, local56, this.anInt5399);
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)V")
	@Override
	public void method4143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
