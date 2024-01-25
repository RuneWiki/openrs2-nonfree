import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!an", name = "s", descriptor = "I")
	public final int anInt232;

	@OriginalMember(owner = "client!an", name = "m", descriptor = "I")
	private final int anInt226;

	@OriginalMember(owner = "client!an", name = "y", descriptor = "I")
	public final int anInt238;

	@OriginalMember(owner = "client!an", name = "q", descriptor = "I")
	private final int anInt230;

	@OriginalMember(owner = "client!an", name = "A", descriptor = "I")
	public final int anInt240;

	@OriginalMember(owner = "client!an", name = "D", descriptor = "I")
	private final int anInt242;

	@OriginalMember(owner = "client!an", name = "k", descriptor = "I")
	private final int anInt224;

	@OriginalMember(owner = "client!an", name = "v", descriptor = "I")
	private final int anInt235;

	@OriginalMember(owner = "client!an", name = "E", descriptor = "I")
	public final int anInt243;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt232 = arg5;
		this.anInt226 = arg3;
		this.anInt238 = arg6;
		this.anInt230 = arg1;
		this.anInt240 = arg7;
		this.anInt242 = arg2;
		this.anInt224 = arg0;
		this.anInt235 = arg4;
		this.anInt243 = arg8;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(III)Z")
	public boolean method199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt230 && arg1 <= this.anInt226 && arg0 >= this.anInt242 && this.anInt235 >= arg0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IBI[I)V")
	public void method200(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = this.anInt232 + arg0 - this.anInt230;
		arg2[2] = this.anInt238 + arg1 - this.anInt242;
		arg2[0] = 0;
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(III)Z")
	public boolean method201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt232 <= arg0 && arg0 <= this.anInt240 && arg1 >= this.anInt238 && arg1 <= this.anInt243;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(IBI[I)V")
	public void method202(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = arg0 + this.anInt230 - this.anInt232;
		arg2[2] = arg1 + this.anInt242 - this.anInt238;
		arg2[0] = this.anInt224;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIII)Z")
	public boolean method203(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg0 == this.anInt224 && arg1 >= this.anInt230 && arg1 <= this.anInt226 && arg2 >= this.anInt242 && arg2 <= this.anInt235;
	}
}
