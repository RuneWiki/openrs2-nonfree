import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gha")
public final class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!gha", name = "n", descriptor = "I")
	private final int anInt3141;

	@OriginalMember(owner = "client!gha", name = "l", descriptor = "I")
	private final int anInt3139;

	@OriginalMember(owner = "client!gha", name = "q", descriptor = "I")
	private final int anInt3144;

	@OriginalMember(owner = "client!gha", name = "i", descriptor = "I")
	private final int anInt3136;

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(IIIIIII)V")
	public Class24_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3141 = arg1;
		this.anInt3139 = arg2;
		this.anInt3144 = arg0;
		this.anInt3136 = arg3;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(BII)V")
	@Override
	public void method8413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt3144 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt3139 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt3141 >> 12;
		@Pc(35) int local35 = this.anInt3136 * arg0 >> 12;
		Static100.method1646(local35, local21, super.anInt9951, local14, super.anInt9953, local28, super.anInt9952);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt3144 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3139 >> 12;
		@Pc(24) int local24 = this.anInt3141 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt3136 * arg1 >> 12;
		Static439.method6446(local31, local10, local24, local17, super.anInt9952);
	}
}
