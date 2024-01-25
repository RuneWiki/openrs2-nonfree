import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public final class Class5_Sub20 extends Class5 {

	@OriginalMember(owner = "client!it", name = "o", descriptor = "I")
	private final int anInt3110;

	@OriginalMember(owner = "client!it", name = "m", descriptor = "I")
	public final int anInt3108;

	@OriginalMember(owner = "client!it", name = "t", descriptor = "I")
	private final int anInt3114;

	@OriginalMember(owner = "client!it", name = "n", descriptor = "I")
	private final int anInt3109;

	@OriginalMember(owner = "client!it", name = "A", descriptor = "I")
	public final int anInt3120;

	@OriginalMember(owner = "client!it", name = "z", descriptor = "I")
	public final int anInt3119;

	@OriginalMember(owner = "client!it", name = "x", descriptor = "I")
	private final int anInt3117;

	@OriginalMember(owner = "client!it", name = "v", descriptor = "I")
	private final int anInt3116;

	@OriginalMember(owner = "client!it", name = "k", descriptor = "I")
	public final int anInt3106;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class5_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt3110 = arg3;
		this.anInt3108 = arg7;
		this.anInt3114 = arg2;
		this.anInt3109 = arg1;
		this.anInt3120 = arg6;
		this.anInt3119 = arg8;
		this.anInt3117 = arg4;
		this.anInt3116 = arg0;
		this.anInt3106 = arg5;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I[III)V")
	public void method2507(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = arg2 + this.anInt3106 - this.anInt3109;
		arg0[0] = 0;
		arg0[2] = this.anInt3120 + arg1 - this.anInt3114;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(III)Z")
	public boolean method2509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt3109 && arg0 <= this.anInt3110 && arg1 >= this.anInt3114 && arg1 <= this.anInt3117;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIB)Z")
	public boolean method2510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anInt3116 == arg2 && arg0 >= this.anInt3109 && arg0 <= this.anInt3110 && arg1 >= this.anInt3114 && this.anInt3117 >= arg1;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I[III)V")
	public void method2511(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[0] = this.anInt3116;
		arg1[1] = arg2 + this.anInt3109 - this.anInt3106;
		arg1[2] = arg0 + this.anInt3114 - this.anInt3120;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZII)Z")
	public boolean method2512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt3106 && arg0 <= this.anInt3108 && arg1 >= this.anInt3120 && arg1 <= this.anInt3119;
	}
}
