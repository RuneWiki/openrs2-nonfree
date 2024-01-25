import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class3_Sub4_Sub2 extends Class3_Sub4 {

	@OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
	public int anInt803;

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
	public int anInt804;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
	public int anInt805;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(IJ)V")
	public Class3_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong382 = (long) arg0 << 56 | arg1;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)I")
	public int method625() {
		return (int) (super.aLong382 >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(Z)V")
	public void method627() {
		super.aLong363 = Static626.method8479() + 500L | super.aLong363 & Long.MIN_VALUE;
		Static515.aClass283_11.method7036(this);
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(Z)J")
	public long method628() {
		return super.aLong382 & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
	public void method630() {
		super.aLong363 |= Long.MIN_VALUE;
		if (this.method631() == 0L) {
			Static102.aClass283_3.method7036(this);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)J")
	public long method631() {
		return Long.MAX_VALUE & super.aLong363;
	}
}
