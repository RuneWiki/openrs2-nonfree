import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class30_Sub4 extends Class30 {

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
	private final int anInt3284;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
	private final int anInt3278;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
	private final int anInt3277;

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
	private final int anInt3283;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
	private final int anInt3276;

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
	private final int anInt3290;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
	private final int anInt3279;

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
	private final int anInt3287;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class30_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt3284 = arg4;
		this.anInt3278 = arg7;
		this.anInt3277 = arg2;
		this.anInt3283 = arg0;
		this.anInt3276 = arg6;
		this.anInt3290 = arg3;
		this.anInt3279 = arg1;
		this.anInt3287 = arg5;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BII)V")
	@Override
	public void method2391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt3283 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt3284 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt3279 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt3287 * arg1 >> 12;
		@Pc(46) int local46 = arg0 * this.anInt3277 >> 12;
		@Pc(53) int local53 = this.anInt3276 * arg0 >> 12;
		@Pc(60) int local60 = this.anInt3278 * arg1 >> 12;
		@Pc(67) int local67 = this.anInt3290 * arg1 >> 12;
		Static9.method235(super.anInt3273, local32, local6, local39, local25, local60, local67, local53, local46);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(III)V")
	@Override
	public void method2390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
