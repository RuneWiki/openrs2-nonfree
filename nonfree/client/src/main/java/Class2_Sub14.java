import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
	private final int anInt1239;

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
	private final int anInt1233;

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
	public final int anInt1232;

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
	private final int anInt1235;

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
	public final int anInt1229;

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	private final int anInt1225;

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
	public final int anInt1234;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
	public final int anInt1223;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
	private final int anInt1227;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt1239 = arg2;
		this.anInt1233 = arg0;
		this.anInt1232 = arg7;
		this.anInt1235 = arg3;
		this.anInt1229 = arg8;
		this.anInt1225 = arg1;
		this.anInt1234 = arg6;
		this.anInt1223 = arg5;
		this.anInt1227 = arg4;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)Z")
	public boolean method1163(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt1223 && arg0 <= this.anInt1232 && arg1 >= this.anInt1234 && arg1 <= this.anInt1229;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "([IBII)V")
	public void method1165(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = this.anInt1225 + arg2 - this.anInt1223;
		arg0[2] = arg1 + this.anInt1239 - this.anInt1234;
		arg0[0] = this.anInt1233;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIB)Z")
	public boolean method1166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anInt1233 == arg1 && arg2 >= this.anInt1225 && this.anInt1235 >= arg2 && arg0 >= this.anInt1239 && this.anInt1227 >= arg0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II[IB)V")
	public void method1167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[2] = this.anInt1234 + arg1 - this.anInt1239;
		arg2[1] = arg0 + this.anInt1223 - this.anInt1225;
		arg2[0] = 0;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(III)Z")
	public boolean method1168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt1225 <= arg0 && this.anInt1235 >= arg0 && this.anInt1239 <= arg1 && this.anInt1227 >= arg1;
	}
}
