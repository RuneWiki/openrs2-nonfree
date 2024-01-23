import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
	public int anInt5008;

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
	public int anInt5009;

	@OriginalMember(owner = "client!tj", name = "J", descriptor = "Ljava/lang/String;")
	public String aString359;

	@OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
	public int anInt5015;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(II)V")
	public Class1_Sub2_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong184 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)V")
	public void method3805() {
		super.aLong185 = super.aLong185 & Long.MIN_VALUE | Static31.method591() + 500L;
		Static237.aClass99_10.method2973(this);
	}

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "(I)I")
	public int method3806() {
		return (int) (super.aLong184 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "(I)V")
	public void method3810() {
		super.aLong185 |= Long.MIN_VALUE;
		if (this.method3811() == 0L) {
			Static141.aClass99_6.method2973(this);
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(Z)J")
	public long method3811() {
		return super.aLong185 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!tj", name = "k", descriptor = "(I)I")
	public int method3812() {
		return (int) super.aLong184;
	}
}
