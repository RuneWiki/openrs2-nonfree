import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
	private final int anInt52;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
	public final int anInt45;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
	public final int anInt50;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
	public final int anInt54;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
	public final int anInt55;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
	private final int anInt53;

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
	private final int anInt57;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
	private final int anInt59;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	private final int anInt43;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt52 = arg2;
		this.anInt45 = arg5;
		this.anInt50 = arg6;
		this.anInt54 = arg7;
		this.anInt55 = arg8;
		this.anInt53 = arg4;
		this.anInt57 = arg0;
		this.anInt59 = arg1;
		this.anInt43 = arg3;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)Z")
	public boolean method24(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt59 && this.anInt43 >= arg1 && arg0 >= this.anInt52 && this.anInt53 >= arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)Z")
	public boolean method25(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt57 == arg1 && this.anInt59 <= arg2 && this.anInt43 >= arg2 && arg0 >= this.anInt52 && this.anInt53 >= arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[II)V")
	public void method26(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = 0;
		arg1[1] = this.anInt45 + arg2 - this.anInt59;
		arg1[2] = this.anInt50 + arg0 - this.anInt52;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI)Z")
	public boolean method29(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt45 <= arg0 && arg0 <= this.anInt54 && this.anInt50 <= arg1 && this.anInt55 >= arg1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III[I)V")
	public void method30(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = this.anInt57;
		arg2[1] = arg0 + this.anInt59 - this.anInt45;
		arg2[2] = this.anInt52 + arg1 - this.anInt50;
	}
}
