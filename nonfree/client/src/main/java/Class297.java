import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class297 {

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
	private int anInt8194;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
	private int anInt8200;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	private int anInt8187;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	private int anInt8191;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	private int anInt8198;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
	private int anInt8195;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	private int anInt8189;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
	private int anInt8192;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	private int anInt8188;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	private int anInt8196;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt8194 = arg1;
		this.anInt8200 = arg3 * arg3;
		this.anInt8187 = arg2;
		this.anInt8191 = arg0;
		this.anInt8198 = this.anInt8187 + arg8;
		this.anInt8195 = arg5 + this.anInt8191;
		this.anInt8189 = this.anInt8194 + arg7;
		this.anInt8192 = arg6 + this.anInt8194;
		this.anInt8188 = arg4 + this.anInt8191;
		this.anInt8196 = this.anInt8187 + arg9;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)Z")
	public boolean method6779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt8188 > arg0 || this.anInt8195 < arg0) {
			return false;
		} else if (arg2 < this.anInt8192 || this.anInt8189 < arg2) {
			return false;
		} else if (this.anInt8198 <= arg1 && this.anInt8196 >= arg1) {
			@Pc(62) int local62 = arg0 - this.anInt8191;
			@Pc(68) int local68 = arg1 - this.anInt8187;
			return this.anInt8200 > local62 * local62 + local68 * local68;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZIIIIIIIII)V")
	public void method6781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt8191 = arg0;
		this.anInt8200 = arg2 * arg2;
		this.anInt8187 = arg4;
		this.anInt8194 = arg8;
		this.anInt8189 = this.anInt8194 + arg7;
		this.anInt8196 = arg9 + this.anInt8187;
		this.anInt8188 = this.anInt8191 + arg6;
		this.anInt8198 = arg3 + this.anInt8187;
		this.anInt8195 = this.anInt8191 + arg5;
		this.anInt8192 = this.anInt8194 + arg1;
	}
}
