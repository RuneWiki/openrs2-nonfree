import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class5_Sub4_Sub13 extends Class5_Sub4 {

	@OriginalMember(owner = "client!ju", name = "A", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!ju", name = "C", descriptor = "I")
	public int anInt4504;

	@OriginalMember(owner = "client!ju", name = "H", descriptor = "I")
	public int anInt4507;

	@OriginalMember(owner = "client!ju", name = "K", descriptor = "I")
	public int anInt4508;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(II)V")
	public Class5_Sub4_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong282 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
	public void method4132() {
		super.aLong273 = Static205.method3179() + 500L | Long.MIN_VALUE & super.aLong273;
		Static548.aClass80_7.method1537(this);
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)I")
	public int method4133() {
		return (int) (super.aLong282 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "(Z)J")
	public long method4138() {
		return Long.MAX_VALUE & super.aLong273;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)I")
	public int method4139() {
		return (int) super.aLong282;
	}

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "(I)V")
	public void method4140() {
		super.aLong273 |= Long.MIN_VALUE;
		if (this.method4138() == 0L) {
			Static407.aClass80_5.method1537(this);
		}
	}
}
