import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class4_Sub6_Sub5 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ep", name = "A", descriptor = "I")
	public int anInt2865;

	@OriginalMember(owner = "client!ep", name = "B", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!ep", name = "H", descriptor = "I")
	public int anInt2871;

	@OriginalMember(owner = "client!ep", name = "I", descriptor = "I")
	public int anInt2872;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(II)V")
	public Class4_Sub6_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong295 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public void method2302() {
		super.aLong286 = Long.MIN_VALUE & super.aLong286 | Static112.method2047() + 500L;
		Static457.aClass120_9.method2669(this);
	}

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "(B)V")
	public void method2303() {
		super.aLong286 |= Long.MIN_VALUE;
		if (this.method2305() == 0L) {
			Static238.aClass120_5.method2669(this);
		}
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)I")
	public int method2304() {
		return (int) (super.aLong295 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)J")
	public long method2305() {
		return Long.MAX_VALUE & super.aLong286;
	}

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)I")
	public int method2306() {
		return (int) super.aLong295;
	}
}
