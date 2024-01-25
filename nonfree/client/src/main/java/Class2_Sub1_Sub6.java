import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "Ljava/lang/String;")
	public String aString30;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
	public int anInt3128;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
	public int anInt3130;

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
	public int anInt3131;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(II)V")
	public Class2_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong401 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public void method2574() {
		super.aLong378 |= Long.MIN_VALUE;
		if (this.method2580() == 0L) {
			Static429.aClass71_10.method1430(this);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)I")
	public int method2577() {
		return (int) super.aLong401;
	}

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V")
	public void method2578() {
		super.aLong378 = Static432.method5870() + 500L | super.aLong378 & Long.MIN_VALUE;
		Static57.aClass71_1.method1430(this);
	}

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)I")
	public int method2579() {
		return (int) (super.aLong401 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)J")
	public long method2580() {
		return super.aLong378 & Long.MAX_VALUE;
	}
}
