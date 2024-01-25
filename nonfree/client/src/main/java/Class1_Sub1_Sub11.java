import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	public int anInt5821;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
	public int anInt5822;

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
	public int anInt5827;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong392 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)I")
	public int method4940() {
		return (int) (super.aLong392 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)I")
	public int method4941() {
		return (int) super.aLong392;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)J")
	public long method4942() {
		return super.aLong394 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V")
	public void method4945() {
		super.aLong394 = Static60.method1119() + 500L | Long.MIN_VALUE & super.aLong394;
		Static337.aClass104_8.method2420(this);
	}

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)V")
	public void method4946() {
		super.aLong394 |= Long.MIN_VALUE;
		if (this.method4942() == 0L) {
			Static366.aClass104_9.method2420(this);
		}
	}
}
