import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!eq", name = "B", descriptor = "I")
	public int anInt2674;

	@OriginalMember(owner = "client!eq", name = "D", descriptor = "Ljava/lang/String;")
	public String aString33;

	@OriginalMember(owner = "client!eq", name = "I", descriptor = "I")
	public int anInt2679;

	@OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
	public int anInt2680;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(IJ)V")
	public Class2_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong313 = arg1 | (long) arg0 << 56;
	}

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "(I)J")
	public long method2485() {
		return Long.MAX_VALUE & super.aLong296;
	}

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "(I)V")
	public void method2486() {
		super.aLong296 |= Long.MIN_VALUE;
		if (this.method2485() == 0L) {
			Static74.aClass279_12.method7292(this);
		}
	}

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "(I)I")
	public int method2488() {
		return (int) (super.aLong313 >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "(I)V")
	public void method2489() {
		super.aLong296 = Long.MIN_VALUE & super.aLong296 | Static99.method1701() + 500L;
		Static36.aClass279_2.method7292(this);
	}

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "(I)J")
	public long method2490() {
		return super.aLong313 & 0xFFFFFFFFFFFFFFL;
	}
}
