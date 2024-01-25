import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
	private final int anInt1497;

	@OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
	private final int anInt1499;

	@OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
	private final int anInt1493;

	@OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
	private final int anInt1495;

	@OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
	public final int anInt1492;

	@OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
	private final int anInt1496;

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
	public final int anInt1484;

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
	public final int anInt1485;

	@OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
	public final int anInt1494;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class4_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt1497 = arg1;
		this.anInt1499 = arg0;
		this.anInt1493 = arg2;
		this.anInt1495 = arg4;
		this.anInt1492 = arg6;
		this.anInt1496 = arg3;
		this.anInt1484 = arg5;
		this.anInt1485 = arg7;
		this.anInt1494 = arg8;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZII[I)V")
	public void method1220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = this.anInt1484 + arg1 - this.anInt1497;
		arg2[2] = this.anInt1492 + arg0 - this.anInt1493;
		arg2[0] = 0;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIII)Z")
	public boolean method1221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt1499 == arg1 && arg2 >= this.anInt1497 && this.anInt1496 >= arg2 && this.anInt1493 <= arg0 && this.anInt1495 >= arg0;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZI)Z")
	public boolean method1222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt1484 <= arg1 && this.anInt1485 >= arg1 && this.anInt1492 <= arg0 && arg0 <= this.anInt1494;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BII)Z")
	public boolean method1225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt1497 <= arg1 && arg1 <= this.anInt1496 && this.anInt1493 <= arg0 && arg0 <= this.anInt1495;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II[II)V")
	public void method1226(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = arg0 + this.anInt1493 - this.anInt1492;
		arg1[0] = this.anInt1499;
		arg1[1] = this.anInt1497 + arg2 - this.anInt1484;
	}
}
