import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class4_Sub27 extends Class4 {

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
	public int anInt3989;

	@OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
	private int anInt3996;

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
	private int anInt3986;

	@OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
	private int anInt4001;

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
	public int anInt3990;

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
	private int anInt3992;

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
	private int anInt3993;

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
	public int anInt3991;

	@OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
	private int anInt3999;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
	public int anInt3988;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class4_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt3989 = arg7;
		this.anInt3996 = arg2;
		this.anInt3986 = arg0;
		this.anInt4001 = arg1;
		this.anInt3990 = arg9;
		this.anInt3992 = arg4;
		this.anInt3993 = arg3;
		this.anInt3991 = arg6;
		this.anInt3999 = arg5;
		this.anInt3988 = arg8;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)[I")
	public int[] method3237(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return new int[] { this.anInt4001, this.anInt3991 + arg0 - this.anInt3996, this.anInt3989 + -this.anInt3993 + arg1 };
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)[I")
	public int[] method3238(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return new int[] { this.anInt3986, arg1 + this.anInt3996 - this.anInt3991, arg0 + this.anInt3993 - this.anInt3989 };
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBI)Z")
	public boolean method3239(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt3996 && arg0 <= this.anInt3992 && this.anInt3993 <= arg1 && arg1 <= this.anInt3999;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(IBI)Z")
	public boolean method3240(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt3991 <= arg0 && this.anInt3988 >= arg0 && this.anInt3989 <= arg1 && arg1 <= this.anInt3990;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(IIII)Z")
	public boolean method3241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg2 == this.anInt3986 && this.anInt3996 <= arg1 && arg1 <= this.anInt3992 && this.anInt3993 <= arg0 && arg0 <= this.anInt3999;
	}
}
