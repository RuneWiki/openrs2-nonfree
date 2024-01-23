import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	private int anInt1233;

	@OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
	public int anInt1251;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
	private int anInt1246;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
	public int anInt1241;

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
	public int anInt1247;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	public int anInt1235;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	private int anInt1230;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
	private int anInt1249;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
	private int anInt1245;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	private int anInt1231;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class1_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt1233 = arg5;
		this.anInt1251 = arg8;
		this.anInt1246 = arg2;
		this.anInt1241 = arg7;
		this.anInt1247 = arg9;
		this.anInt1235 = arg6;
		this.anInt1230 = arg4;
		this.anInt1249 = arg3;
		this.anInt1245 = arg1;
		this.anInt1231 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)[I")
	public int[] method1049(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return new int[] { this.anInt1245, this.anInt1235 + arg0 - this.anInt1246, -this.anInt1249 + this.anInt1241 + arg1 };
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)[I")
	public int[] method1050(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return new int[] { this.anInt1231, this.anInt1246 + arg1 - this.anInt1235, arg0 + this.anInt1249 + -this.anInt1241 };
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)Z")
	public boolean method1053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg2 == this.anInt1231 && arg0 >= this.anInt1246 && this.anInt1230 >= arg0 && this.anInt1249 <= arg1 && arg1 <= this.anInt1233;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIZ)Z")
	public boolean method1056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt1246 && this.anInt1230 >= arg1 && arg0 >= this.anInt1249 && arg0 <= this.anInt1233;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBI)Z")
	public boolean method1057(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt1235 && arg0 <= this.anInt1251 && arg1 >= this.anInt1241 && arg1 <= this.anInt1247;
	}
}
