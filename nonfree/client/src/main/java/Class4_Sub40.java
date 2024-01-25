import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public final class Class4_Sub40 extends Class4 {

	@OriginalMember(owner = "client!ow", name = "r", descriptor = "I")
	public final int anInt6974;

	@OriginalMember(owner = "client!ow", name = "x", descriptor = "I")
	private final int anInt6980;

	@OriginalMember(owner = "client!ow", name = "t", descriptor = "I")
	private final int anInt6976;

	@OriginalMember(owner = "client!ow", name = "s", descriptor = "I")
	private final int anInt6975;

	@OriginalMember(owner = "client!ow", name = "v", descriptor = "I")
	private final int anInt6978;

	@OriginalMember(owner = "client!ow", name = "o", descriptor = "I")
	private final int anInt6971;

	@OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
	public final int anInt6967;

	@OriginalMember(owner = "client!ow", name = "l", descriptor = "I")
	public final int anInt6968;

	@OriginalMember(owner = "client!ow", name = "m", descriptor = "I")
	public final int anInt6969;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class4_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt6974 = arg8;
		this.anInt6980 = arg2;
		this.anInt6976 = arg3;
		this.anInt6975 = arg1;
		this.anInt6978 = arg0;
		this.anInt6971 = arg4;
		this.anInt6967 = arg6;
		this.anInt6968 = arg7;
		this.anInt6969 = arg5;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IBI)Z")
	public boolean method6132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt6969 <= arg1 && this.anInt6968 >= arg1 && arg0 >= this.anInt6967 && this.anInt6974 >= arg0;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(B[III)V")
	public void method6134(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[0] = 0;
		arg0[2] = arg1 + this.anInt6967 - this.anInt6980;
		arg0[1] = arg2 + this.anInt6969 - this.anInt6975;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIII)Z")
	public boolean method6135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anInt6978 == arg1 && arg0 >= this.anInt6975 && this.anInt6976 >= arg0 && arg2 >= this.anInt6980 && this.anInt6971 >= arg2;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(III)Z")
	public boolean method6136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt6975 <= arg1 && arg1 <= this.anInt6976 && this.anInt6980 <= arg0 && this.anInt6971 >= arg0;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "([IIII)V")
	public void method6138(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = arg1 + this.anInt6975 - this.anInt6969;
		arg0[0] = this.anInt6978;
		arg0[2] = this.anInt6980 + arg2 - this.anInt6967;
	}
}
