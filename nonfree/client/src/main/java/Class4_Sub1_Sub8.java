import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public final class Class4_Sub1_Sub8 extends Class4_Sub1 {

	@OriginalMember(owner = "client!gs", name = "B", descriptor = "Ljava/lang/String;")
	public String aString80;

	@OriginalMember(owner = "client!gs", name = "D", descriptor = "I")
	public int anInt2403;

	@OriginalMember(owner = "client!gs", name = "G", descriptor = "I")
	public int anInt2405;

	@OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
	public int anInt2410;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(II)V")
	public Class4_Sub1_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong259 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "(I)I")
	public int method2029() {
		return (int) (super.aLong259 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "(I)V")
	public void method2031() {
		super.aLong254 |= Long.MIN_VALUE;
		if ((long) 0 == this.method2032()) {
			Static285.aClass178_9.method4767(this);
		}
	}

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "(I)J")
	public long method2032() {
		return Long.MAX_VALUE & super.aLong254;
	}

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "(I)V")
	public void method2034() {
		super.aLong254 = Static274.method4763() + 500L | Long.MIN_VALUE & super.aLong254;
		Static65.aClass178_2.method4767(this);
	}

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "(I)I")
	public int method2035() {
		return (int) super.aLong259;
	}
}
