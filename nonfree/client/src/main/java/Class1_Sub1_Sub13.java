import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
	public int anInt5680;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
	public int anInt5686;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
	public int anInt5690;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong244 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public void method4919() {
		super.aLong234 |= Long.MIN_VALUE;
		if (this.method4923() == 0L) {
			Static300.aClass307_7.method7354(this);
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)I")
	public int method4922() {
		return (int) super.aLong244;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)J")
	public long method4923() {
		return Long.MAX_VALUE & super.aLong234;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)I")
	public int method4924() {
		return (int) (super.aLong244 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
	public void method4925() {
		super.aLong234 = Static93.method2172() + 500L | Long.MIN_VALUE & super.aLong234;
		Static89.aClass307_1.method7354(this);
	}
}
