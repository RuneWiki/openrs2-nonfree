import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
	private final int anInt8057;

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
	private final int anInt8054;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
	private final int anInt8051;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
	private final int anInt8055;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIIII)V")
	public Class9_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt8057 = arg3;
		this.anInt8054 = arg0;
		this.anInt8051 = arg1;
		this.anInt8055 = arg2;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt8054 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt8055 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt8051 >> 12;
		@Pc(35) int local35 = this.anInt8057 * arg1 >> 12;
		Static270.method4170(local35, local17, super.anInt8564, local10, super.anInt8565, super.anInt8563, local24);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
	@Override
	public void method7306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(IIB)V")
	@Override
	public void method7305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt8054 >> 12;
		@Pc(17) int local17 = this.anInt8055 * arg1 >> 12;
		@Pc(32) int local32 = this.anInt8051 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt8057 >> 12;
		Static450.method6498(local10, local32, local39, local17, super.anInt8565);
	}
}
