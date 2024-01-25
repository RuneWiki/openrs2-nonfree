import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class6_Sub11 extends Class6 {

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	private final int anInt1941;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
	private final int anInt1938;

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
	public final int anInt1945;

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
	private final int anInt1947;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
	private final int anInt1940;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
	public final int anInt1935;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
	private final int anInt1948;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
	public final int anInt1934;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
	public final int anInt1943;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class6_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt1941 = arg0;
		this.anInt1938 = arg1;
		this.anInt1945 = arg8;
		this.anInt1947 = arg2;
		this.anInt1940 = arg4;
		this.anInt1935 = arg5;
		this.anInt1948 = arg3;
		this.anInt1934 = arg7;
		this.anInt1943 = arg6;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)Z")
	public boolean method1774(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt1941 == arg2 && arg1 >= this.anInt1938 && arg1 <= this.anInt1948 && arg0 >= this.anInt1947 && arg0 <= this.anInt1940;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)Z")
	public boolean method1775(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt1935 <= arg0 && arg0 <= this.anInt1934 && this.anInt1943 <= arg1 && this.anInt1945 >= arg1;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III[I)V")
	public void method1777(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = arg1 + this.anInt1938 - this.anInt1935;
		arg2[0] = this.anInt1941;
		arg2[2] = arg0 + this.anInt1947 - this.anInt1943;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)Z")
	public boolean method1778(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt1938 && arg0 <= this.anInt1948 && this.anInt1947 <= arg1 && this.anInt1940 >= arg1;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(III[I)V")
	public void method1780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = 0;
		arg2[2] = this.anInt1943 + arg0 - this.anInt1947;
		arg2[1] = this.anInt1935 + arg1 - this.anInt1938;
	}
}
