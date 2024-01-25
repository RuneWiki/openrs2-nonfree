import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class3_Sub3_Sub4 extends Class3_Sub3 {

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
	public int anInt970;

	@OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
	public int anInt972;

	@OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
	public int anInt974;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(II)V")
	public Class3_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong248 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(B)J")
	public long method1001() {
		return super.aLong243 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)I")
	public int method1002() {
		return (int) (super.aLong248 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "(I)V")
	public void method1003() {
		super.aLong243 |= Long.MIN_VALUE;
		if (this.method1001() == 0L) {
			Static60.aClass65_1.method1686(this);
		}
	}

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "(I)I")
	public int method1005() {
		return (int) super.aLong248;
	}

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "(I)V")
	public void method1006() {
		super.aLong243 = Static354.method4966() + 500L | Long.MIN_VALUE & super.aLong243;
		Static341.aClass65_8.method1686(this);
	}
}
