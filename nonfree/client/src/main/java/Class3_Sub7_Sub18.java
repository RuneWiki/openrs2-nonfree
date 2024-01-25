import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class3_Sub7_Sub18 extends Class3_Sub7 {

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
	public int anInt8798;

	@OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
	public int anInt8802;

	@OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
	public int anInt8806;

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "Ljava/lang/String;")
	public String aString82;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(II)V")
	public Class3_Sub7_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong273 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
	public void method7326() {
		super.aLong263 |= Long.MIN_VALUE;
		if (this.method7327() == 0L) {
			Static452.aClass325_9.method6862(this);
		}
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)J")
	public long method7327() {
		return Long.MAX_VALUE & super.aLong263;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I")
	public int method7328() {
		return (int) super.aLong273;
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
	public void method7329() {
		super.aLong263 = Long.MIN_VALUE & super.aLong263 | Static158.method2936() + 500L;
		Static528.aClass325_11.method6862(this);
	}

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)I")
	public int method7330() {
		return (int) (super.aLong273 >>> 32 & 0xFFL);
	}
}
