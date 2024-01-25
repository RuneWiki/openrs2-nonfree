import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!db", name = "D", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	public int anInt991;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "I")
	public int anInt994;

	@OriginalMember(owner = "client!db", name = "N", descriptor = "I")
	public int anInt996;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(II)V")
	public Class5_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong235 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)I")
	public int method849() {
		return (int) super.aLong235;
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
	public void method850() {
		super.aLong234 |= Long.MIN_VALUE;
		if (this.method855() == 0L) {
			Static50.aClass212_1.method5936(this);
		}
	}

	@OriginalMember(owner = "client!db", name = "h", descriptor = "(I)I")
	public int method853() {
		return (int) (super.aLong235 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!db", name = "j", descriptor = "(I)J")
	public long method855() {
		return Long.MAX_VALUE & super.aLong234;
	}

	@OriginalMember(owner = "client!db", name = "k", descriptor = "(I)V")
	public void method856() {
		super.aLong234 = Static340.method5863() + 500L | super.aLong234 & Long.MIN_VALUE;
		Static183.aClass212_6.method5936(this);
	}
}
