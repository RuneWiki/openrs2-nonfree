import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public final class Class3_Sub4_Sub6 extends Class3_Sub4 {

	@OriginalMember(owner = "client!dda", name = "y", descriptor = "I")
	public int anInt1945;

	@OriginalMember(owner = "client!dda", name = "z", descriptor = "I")
	public int anInt1946;

	@OriginalMember(owner = "client!dda", name = "C", descriptor = "Ljava/lang/String;")
	public String aString18;

	@OriginalMember(owner = "client!dda", name = "F", descriptor = "I")
	public int anInt1951;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(II)V")
	public Class3_Sub4_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong262 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)I")
	public int method1891() {
		return (int) (super.aLong262 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)J")
	public long method1892() {
		return super.aLong259 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "(I)V")
	public void method1896() {
		super.aLong259 = super.aLong259 & Long.MIN_VALUE | Static376.method6088() + 500L;
		Static321.aClass39_4.method1273(this);
	}

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "(I)I")
	public int method1897() {
		return (int) super.aLong262;
	}

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "(I)V")
	public void method1898() {
		super.aLong259 |= Long.MIN_VALUE;
		if (this.method1892() == 0L) {
			Static539.aClass39_10.method1273(this);
		}
	}
}
