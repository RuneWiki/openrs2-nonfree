import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class187_Sub4 extends Class187 {

	@OriginalMember(owner = "client!ts", name = "x", descriptor = "I")
	private final int anInt8314;

	@OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
	private final int anInt8313;

	@OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
	private final int anInt8310;

	@OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
	private final int anInt8307;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(IIIIIII)V")
	public Class187_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt8314 = arg1;
		this.anInt8313 = arg3;
		this.anInt8310 = arg2;
		this.anInt8307 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "(III)V")
	@Override
	public void method6720(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)V")
	@Override
	public void method6715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt8307 >> 12;
		@Pc(17) int local17 = this.anInt8310 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt8314 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt8313 >> 12;
		Static563.method7367(super.anInt8298, local10, super.anInt8303, super.anInt8301, local31, local17, local24);
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(III)V")
	@Override
	public void method6716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt8307 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt8310 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt8314 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt8313 * arg1 >> 12;
		Static361.method5126(local39, local25, local32, local18, super.anInt8301);
	}
}
