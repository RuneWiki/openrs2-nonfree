import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
	private final int anInt228;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
	public final int anInt219;

	@OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
	private final int anInt235;

	@OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
	private final int anInt231;

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
	public final int anInt225;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
	private final int anInt227;

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
	private final int anInt230;

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
	public final int anInt226;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
	public final int anInt221;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt228 = arg3;
		this.anInt219 = arg7;
		this.anInt235 = arg4;
		this.anInt231 = arg0;
		this.anInt225 = arg5;
		this.anInt227 = arg1;
		this.anInt230 = arg2;
		this.anInt226 = arg8;
		this.anInt221 = arg6;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BIII)Z")
	public boolean method272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg0 == this.anInt231 && arg2 >= this.anInt227 && arg2 <= this.anInt228 && this.anInt230 <= arg1 && this.anInt235 >= arg1;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[IIB)V")
	public void method273(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[2] = arg0 + this.anInt221 - this.anInt230;
		arg1[0] = 0;
		arg1[1] = this.anInt225 + arg2 - this.anInt227;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZI)Z")
	public boolean method274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt225 && arg0 <= this.anInt219 && arg1 >= this.anInt221 && this.anInt226 >= arg1;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBI)Z")
	public boolean method275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt227 <= arg1 && this.anInt228 >= arg1 && this.anInt230 <= arg0 && arg0 <= this.anInt235;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II[II)V")
	public void method277(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = arg2 + this.anInt230 - this.anInt221;
		arg1[1] = arg0 + this.anInt227 - this.anInt225;
		arg1[0] = this.anInt231;
	}
}
