import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class6_Sub21 extends Class6 {

	@OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
	public final int anInt3083;

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
	private final int anInt3069;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
	private final int anInt3068;

	@OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
	public final int anInt3082;

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
	private final int anInt3080;

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
	public final int anInt3076;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
	public final int anInt3077;

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
	private final int anInt3074;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
	private final int anInt3073;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class6_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt3083 = arg5;
		this.anInt3069 = arg4;
		this.anInt3068 = arg2;
		this.anInt3082 = arg7;
		this.anInt3080 = arg3;
		this.anInt3076 = arg6;
		this.anInt3077 = arg8;
		this.anInt3074 = arg0;
		this.anInt3073 = arg1;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([IIII)V")
	public void method3230(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[0] = this.anInt3074;
		arg0[1] = this.anInt3073 + arg2 - this.anInt3083;
		arg0[2] = this.anInt3068 + arg1 - this.anInt3076;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)Z")
	public boolean method3232(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt3083 && arg0 <= this.anInt3082 && arg1 >= this.anInt3076 && this.anInt3077 >= arg1;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIBI)Z")
	public boolean method3233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg2 == this.anInt3074 && arg0 >= this.anInt3073 && arg0 <= this.anInt3080 && arg1 >= this.anInt3068 && arg1 <= this.anInt3069;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BII)Z")
	public boolean method3237(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt3073 <= arg1 && this.anInt3080 >= arg1 && this.anInt3068 <= arg0 && this.anInt3069 >= arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II[II)V")
	public void method3239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = 0;
		arg2[2] = arg1 + this.anInt3076 - this.anInt3068;
		arg2[1] = arg0 + this.anInt3083 - this.anInt3073;
	}
}
