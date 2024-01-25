import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class5_Sub2_Sub4 extends Class5_Sub2 {

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
	public int anInt2740;

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
	public int anInt2749;

	@OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
	public int anInt2751;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IJ)V")
	public Class5_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong329 = (long) arg0 << 56 | arg1;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)I")
	public int method2437() {
		return (int) (super.aLong329 >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public void method2438() {
		super.aLong319 |= Long.MIN_VALUE;
		if (this.method2442() == 0L) {
			Static524.aClass150_9.method3095(this);
		}
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)V")
	public void method2440() {
		super.aLong319 = Static124.method1947() + 500L | super.aLong319 & Long.MIN_VALUE;
		Static428.aClass150_8.method3095(this);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(Z)J")
	public long method2441() {
		return super.aLong329 & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)J")
	public long method2442() {
		return super.aLong319 & Long.MAX_VALUE;
	}
}
