import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
	private int anInt3986;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
	private int anInt3970;

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
	private int anInt3979;

	@OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
	private int anInt3988;

	@OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
	private int anInt3985;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
	public int anInt3968;

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
	public int anInt3980;

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
	public int anInt3987;

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
	private int anInt3976;

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
	public int anInt3983;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class1_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt3986 = arg1;
		this.anInt3970 = arg0;
		this.anInt3979 = arg3;
		this.anInt3988 = arg5;
		this.anInt3985 = arg2;
		this.anInt3968 = arg7;
		this.anInt3980 = arg6;
		this.anInt3987 = arg9;
		this.anInt3976 = arg4;
		this.anInt3983 = arg8;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)[I")
	public int[] method3139(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return new int[] { this.anInt3986, arg0 + this.anInt3980 - this.anInt3985, arg1 + -this.anInt3979 + this.anInt3968 };
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBI)Z")
	public boolean method3143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt3985 <= arg1 && this.anInt3976 >= arg1 && arg0 >= this.anInt3979 && arg0 <= this.anInt3988;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)[I")
	public int[] method3144(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return new int[] { this.anInt3970, arg0 + this.anInt3985 - this.anInt3980, this.anInt3979 + -this.anInt3968 + arg1 };
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBII)Z")
	public boolean method3146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt3970 == arg1 && this.anInt3985 <= arg2 && arg2 <= this.anInt3976 && this.anInt3979 <= arg0 && this.anInt3988 >= arg0;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(III)Z")
	public boolean method3147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt3980 && this.anInt3983 >= arg0 && this.anInt3968 <= arg1 && this.anInt3987 >= arg1;
	}
}
