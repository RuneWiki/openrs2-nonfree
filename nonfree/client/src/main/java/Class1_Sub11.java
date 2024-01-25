import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
	public final int anInt1278;

	@OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
	private final int anInt1283;

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
	public final int anInt1273;

	@OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
	private final int anInt1285;

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
	private final int anInt1276;

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
	private final int anInt1277;

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
	public final int anInt1272;

	@OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
	private final int anInt1284;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
	public final int anInt1275;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt1278 = arg7;
		this.anInt1283 = arg4;
		this.anInt1273 = arg8;
		this.anInt1285 = arg3;
		this.anInt1276 = arg2;
		this.anInt1277 = arg1;
		this.anInt1272 = arg6;
		this.anInt1284 = arg0;
		this.anInt1275 = arg5;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([IIII)V")
	public void method1019(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[1] = arg2 + this.anInt1277 - this.anInt1275;
		arg0[0] = this.anInt1284;
		arg0[2] = this.anInt1276 + arg1 - this.anInt1272;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BII)Z")
	public boolean method1020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt1275 <= arg0 && arg0 <= this.anInt1278 && this.anInt1272 <= arg1 && this.anInt1273 >= arg1;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Z")
	public boolean method1021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt1277 && arg0 <= this.anInt1285 && this.anInt1276 <= arg1 && this.anInt1283 >= arg1;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIBI)Z")
	public boolean method1022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg0 == this.anInt1284 && this.anInt1277 <= arg1 && arg1 <= this.anInt1285 && arg2 >= this.anInt1276 && arg2 <= this.anInt1283;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[III)V")
	public void method1023(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[0] = 0;
		arg1[2] = arg2 + this.anInt1272 - this.anInt1276;
		arg1[1] = arg0 + this.anInt1275 - this.anInt1277;
	}
}
