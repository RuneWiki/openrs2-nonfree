import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
	public int anInt2036;

	@OriginalMember(owner = "client!ik", name = "M", descriptor = "Lclient!ia;")
	public Class51 aClass51_654;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(II)V")
	public Class1_Sub2_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong170 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V")
	public void method1523() {
		super.aLong156 |= Long.MIN_VALUE;
		if (this.method1525() == 0L) {
			Static146.aClass116_3.method3454(this);
		}
	}

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "(I)V")
	public void method1524() {
		super.aLong156 = Long.MIN_VALUE & super.aLong156 | Static144.method2489() + 500L;
		Static144.aClass116_5.method3454(this);
	}

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "(I)J")
	public long method1525() {
		return Long.MAX_VALUE & super.aLong156;
	}

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "(I)I")
	public int method1526() {
		return (int) (super.aLong170 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)I")
	public int method1529() {
		return (int) super.aLong170;
	}
}
