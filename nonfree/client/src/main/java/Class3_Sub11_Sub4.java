import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class3_Sub11_Sub4 extends Class3_Sub11 {

	@OriginalMember(owner = "client!ds", name = "y", descriptor = "Ljava/lang/String;")
	public String aString21;

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "I")
	public int anInt2394;

	@OriginalMember(owner = "client!ds", name = "G", descriptor = "I")
	public int anInt2400;

	@OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
	public int anInt2401;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IJ)V")
	public Class3_Sub11_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong311 = (long) arg0 << 56 | arg1;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)J")
	public long method2193() {
		return Long.MAX_VALUE & super.aLong310;
	}

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "(I)V")
	public void method2194() {
		super.aLong310 = Static524.method7320() + 500L | super.aLong310 & Long.MIN_VALUE;
		Static593.aClass74_13.method1840(this);
	}

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "(I)V")
	public void method2195() {
		super.aLong310 |= Long.MIN_VALUE;
		if (this.method2193() == 0L) {
			Static33.aClass74_15.method1840(this);
		}
	}

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "(I)I")
	public int method2196() {
		return (int) (super.aLong311 >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "(I)J")
	public long method2197() {
		return super.aLong311 & 0xFFFFFFFFFFFFFFL;
	}
}
