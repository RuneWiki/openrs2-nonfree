import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public final class Class6_Sub2_Sub4 extends Class6_Sub2 {

	@OriginalMember(owner = "client!dka", name = "D", descriptor = "I")
	public int anInt2111;

	@OriginalMember(owner = "client!dka", name = "G", descriptor = "Ljava/lang/String;")
	public String aString17;

	@OriginalMember(owner = "client!dka", name = "z", descriptor = "I")
	public int anInt2113;

	@OriginalMember(owner = "client!dka", name = "u", descriptor = "I")
	public int anInt2116;

	@OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(IJ)V")
	public Class6_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong346 = (long) arg0 << 56 | arg1;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(B)J")
	public long method2033() {
		return super.aLong346 & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!dka", name = "j", descriptor = "(I)I")
	public int method2034() {
		return (int) (super.aLong346 >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!dka", name = "g", descriptor = "(I)J")
	public long method2037() {
		return Long.MAX_VALUE & super.aLong317;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(I)V")
	public void method2038() {
		super.aLong317 = Long.MIN_VALUE & super.aLong317 | Static549.method7758() + 500L;
		Static371.aClass82_11.method2076(this);
	}

	@OriginalMember(owner = "client!dka", name = "h", descriptor = "(I)V")
	public void method2040() {
		super.aLong317 |= Long.MIN_VALUE;
		if (this.method2037() == 0L) {
			Static99.aClass82_2.method2076(this);
		}
	}
}
