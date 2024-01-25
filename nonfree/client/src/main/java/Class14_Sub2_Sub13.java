import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class14_Sub2_Sub13 extends Class14_Sub2 {

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "Ljava/lang/String;")
	public String aString132;

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "I")
	public int anInt3802;

	@OriginalMember(owner = "client!ln", name = "A", descriptor = "I")
	public int anInt3805;

	@OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
	public int anInt3808;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(II)V")
	public Class14_Sub2_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong217 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(B)I")
	public int method3534() {
		return (int) (super.aLong217 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)J")
	public long method3535() {
		return Long.MAX_VALUE & super.aLong208;
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(B)I")
	public int method3538() {
		return (int) super.aLong217;
	}

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "(B)V")
	public void method3539() {
		super.aLong208 = Long.MIN_VALUE & super.aLong208 | Static168.method3300() + 500L;
		Static189.aClass56_13.method1922(this);
	}

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "(B)V")
	public void method3540() {
		super.aLong208 |= Long.MIN_VALUE;
		if (this.method3535() == 0L) {
			Static279.aClass56_11.method1922(this);
		}
	}
}
