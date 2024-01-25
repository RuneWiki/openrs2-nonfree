import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class1_Sub6_Sub16 extends Class1_Sub6 {

	@OriginalMember(owner = "client!su", name = "u", descriptor = "Ljava/lang/String;")
	public String aString85;

	@OriginalMember(owner = "client!su", name = "w", descriptor = "I")
	public int anInt8204;

	@OriginalMember(owner = "client!su", name = "x", descriptor = "I")
	public int anInt8205;

	@OriginalMember(owner = "client!su", name = "C", descriptor = "I")
	public int anInt8208;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(II)V")
	public Class1_Sub6_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong301 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!su", name = "d", descriptor = "(B)V")
	public void method6593() {
		super.aLong293 = super.aLong293 & Long.MIN_VALUE | Static413.method5668() + 500L;
		Static106.aClass125_5.method2426(this);
	}

	@OriginalMember(owner = "client!su", name = "e", descriptor = "(B)V")
	public void method6594() {
		super.aLong293 |= Long.MIN_VALUE;
		if (this.method6597() == 0L) {
			Static264.aClass125_7.method2426(this);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)I")
	public int method6595() {
		return (int) (super.aLong301 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(I)J")
	public long method6597() {
		return super.aLong293 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!su", name = "e", descriptor = "(I)I")
	public int method6599() {
		return (int) super.aLong301;
	}
}
