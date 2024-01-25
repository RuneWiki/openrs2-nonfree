import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class187_Sub1 extends Class187 {

	@OriginalMember(owner = "client!kaa", name = "u", descriptor = "I")
	private final int anInt4359;

	@OriginalMember(owner = "client!kaa", name = "A", descriptor = "I")
	private final int anInt4365;

	@OriginalMember(owner = "client!kaa", name = "p", descriptor = "I")
	private final int anInt4356;

	@OriginalMember(owner = "client!kaa", name = "x", descriptor = "I")
	private final int anInt4362;

	@OriginalMember(owner = "client!kaa", name = "m", descriptor = "I")
	private final int anInt4353;

	@OriginalMember(owner = "client!kaa", name = "y", descriptor = "I")
	private final int anInt4363;

	@OriginalMember(owner = "client!kaa", name = "r", descriptor = "I")
	private final int anInt4357;

	@OriginalMember(owner = "client!kaa", name = "o", descriptor = "I")
	private final int anInt4355;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class187_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4359 = arg4;
		this.anInt4365 = arg5;
		this.anInt4356 = arg2;
		this.anInt4362 = arg6;
		this.anInt4353 = arg0;
		this.anInt4363 = arg3;
		this.anInt4357 = arg1;
		this.anInt4355 = arg7;
	}

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "(III)V")
	@Override
	public void method6720(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4353 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt4357 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt4356 >> 12;
		@Pc(31) int local31 = this.anInt4363 * arg0 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt4359 >> 12;
		@Pc(45) int local45 = arg0 * this.anInt4365 >> 12;
		@Pc(52) int local52 = this.anInt4362 * arg1 >> 12;
		@Pc(63) int local63 = this.anInt4355 * arg0 >> 12;
		Static6.method117(local17, super.anInt8298, local31, local63, local45, local24, local38, local10, local52);
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(III)V")
	@Override
	public void method6716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)V")
	@Override
	public void method6715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
