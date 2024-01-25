import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public final class Class1_Sub46 extends Class1 {

	@OriginalMember(owner = "client!uba", name = "w", descriptor = "I")
	public final int anInt8826;

	@OriginalMember(owner = "client!uba", name = "x", descriptor = "I")
	public final int anInt8827;

	@OriginalMember(owner = "client!uba", name = "m", descriptor = "I")
	private final int anInt8817;

	@OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
	private final int anInt8821;

	@OriginalMember(owner = "client!uba", name = "D", descriptor = "I")
	public final int anInt8831;

	@OriginalMember(owner = "client!uba", name = "v", descriptor = "I")
	private final int anInt8825;

	@OriginalMember(owner = "client!uba", name = "A", descriptor = "I")
	private final int anInt8829;

	@OriginalMember(owner = "client!uba", name = "s", descriptor = "I")
	public final int anInt8822;

	@OriginalMember(owner = "client!uba", name = "F", descriptor = "I")
	private final int anInt8833;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt8826 = arg6;
		this.anInt8827 = arg8;
		this.anInt8817 = arg3;
		this.anInt8821 = arg0;
		this.anInt8831 = arg7;
		this.anInt8825 = arg1;
		this.anInt8829 = arg2;
		this.anInt8822 = arg5;
		this.anInt8833 = arg4;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZII)Z")
	public boolean method7222(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt8822 <= arg0 && this.anInt8831 >= arg0 && arg1 >= this.anInt8826 && arg1 <= this.anInt8827;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "([IIII)V")
	public void method7223(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[0] = 0;
		arg0[1] = this.anInt8822 + arg1 - this.anInt8825;
		arg0[2] = this.anInt8826 + arg2 - this.anInt8829;
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "([IIII)V")
	public void method7224(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[2] = this.anInt8829 + arg1 - this.anInt8826;
		arg0[1] = this.anInt8825 + arg2 - this.anInt8822;
		arg0[0] = this.anInt8821;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIZ)Z")
	public boolean method7225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt8825 <= arg1 && this.anInt8817 >= arg1 && this.anInt8829 <= arg0 && this.anInt8833 >= arg0;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIII)Z")
	public boolean method7226(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt8821 == arg0 && this.anInt8825 <= arg2 && arg2 <= this.anInt8817 && arg1 >= this.anInt8829 && arg1 <= this.anInt8833;
	}
}
