import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class7_Sub4_Sub14 extends Class7_Sub4 {

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
	public int anInt5867;

	@OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
	public int anInt5868;

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "Ljava/lang/String;")
	public String aString57;

	@OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
	public int anInt5870;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(II)V")
	public Class7_Sub4_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong230 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)J")
	public long method4709() {
		return Long.MAX_VALUE & super.aLong225;
	}

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V")
	public void method4710() {
		super.aLong225 = Static158.method2342() + 500L | Long.MIN_VALUE & super.aLong225;
		Static315.aClass24_9.method298(this);
	}

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)I")
	public int method4714() {
		return (int) (super.aLong230 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)I")
	public int method4715() {
		return (int) super.aLong230;
	}

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)V")
	public void method4716() {
		super.aLong225 |= Long.MIN_VALUE;
		if (this.method4709() == (long) 0) {
			Static372.aClass24_10.method298(this);
		}
	}
}
